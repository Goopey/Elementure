package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;

public class SwordtempleFloorGenSecret2Procedure {
	/*
	 * this has to be 91 because we don't want to reference negative indexes and
	 * because the index starts at 0 This index truthfully only starts at 10. Since
	 * this is a 9 by 9 grid with 81 entries that starts at 10, it ends at 91
	 */
	final static int FLOOR_SIZE = 91;
	final static int FLOOR_START = 10;
	final static int FLOOR_MID = 50;
	/*
	 * Max floor size is defined here so that every floor size has the same chances
	 * of occuring Having to put random directly inside the while makes it get
	 * recalculated every time so it is very possible to get a small number right
	 * after a big one
	 */
	final static int MAX_FLOOR_SIZE = ((int) Math.random() * 4 + 8);
	final static int MIN_FLOOR_SIZE = (MAX_FLOOR_SIZE / 2 + 1);
	// main block of code
	// minimum end room requirement
	final static int ENDROOM_NEED = 2;

	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean[] floorArray = new boolean[FLOOR_SIZE];
		boolean[] queueArray = new boolean[FLOOR_SIZE];
		floorArray[FLOOR_MID] = true;
		queueArray[FLOOR_MID] = true;
		// safety to make it so the while does not loop infinitely
		int loopCount = MAX_FLOOR_SIZE / -2;
		// places endrooms and key rooms
		boolean[] endRooms = new boolean[FLOOR_SIZE];
		int endRoomCount = 0;
		while ((roomsOccupied(floorArray) < MAX_FLOOR_SIZE) && (roomsOccupied(floorArray) + loopCount < MAX_FLOOR_SIZE)) {
			for (int i = 0; i < FLOOR_SIZE; i++) {
				if (queueArray[i]) {
					int currentRoom = i;
					queueArray[i] = false;
					/*
					 * this is here to keep track of if the new queued room places successfully
					 * other rooms.
					 */
					boolean willBeEndRoom = true;
					/*
					 * these checks are done so that we can make sure that each room still fits
					 * inside the array
					 */
					if (currentRoom > 18) {
						int nNorth = currentRoom - 9;
						int neighbors = neighbors(floorArray, nNorth);
						if (canPlaceRoom(neighbors, nNorth, floorArray, queueArray)) {
							willBeEndRoom = false;
							queueArray[nNorth] = true;
							floorArray[nNorth] = true;
						}
					}
					if (currentRoom < 82) {
						int nSouth = currentRoom + 9;
						int neighbors = neighbors(floorArray, nSouth);
						if (canPlaceRoom(neighbors, nSouth, floorArray, queueArray)) {
							willBeEndRoom = false;
							queueArray[nSouth] = true;
							floorArray[nSouth] = true;
						}
					}
					if (currentRoom % 9 != 0) {
						int nEast = currentRoom + 1;
						int neighbors = neighbors(floorArray, nEast);
						if (canPlaceRoom(neighbors, nEast, floorArray, queueArray)) {
							willBeEndRoom = false;
							queueArray[nEast] = true;
							floorArray[nEast] = true;
						}
					}
					if ((currentRoom - 1) % 9 != 0) {
						int nWest = currentRoom - 1;
						int neighbors = neighbors(floorArray, nWest);
						if (canPlaceRoom(neighbors, nWest, floorArray, queueArray)) {
							willBeEndRoom = false;
							queueArray[nWest] = true;
							floorArray[nWest] = true;
						}
					}
					if (willBeEndRoom) {
						endRooms[i] = true;
						endRoomCount++;
					}
					willBeEndRoom = true;
				}
			}
			loopCount++;
			if (loopCount % 12 == 0 && loopCount != 0) {
				queueArray[FLOOR_MID] = true;
			}
			// mesure to make sure the dungeon generates with the minimum proper features
			if ((roomsOccupied(floorArray) + loopCount + 1 >= MAX_FLOOR_SIZE)
					&& ((roomsOccupied(floorArray) < MIN_FLOOR_SIZE) || (endRoomCount < ENDROOM_NEED))) {
				for (int i = 0; i < FLOOR_SIZE; i++) {
					floorArray[i] = false;
					queueArray[i] = false;
					endRooms[i] = false;
				}
				floorArray[FLOOR_MID] = true;
				queueArray[FLOOR_MID] = true;
				loopCount = 0;
				endRoomCount = 0;
			}
		}
		// reusing it here because I can
		endRoomCount = 0;
		for (int i = FLOOR_START; i < FLOOR_SIZE; i++) {
			if (i != FLOOR_MID && endRooms[i]) {
				/*
				 * Generation starts from the center. Normally, the xPos would be 4, but because
				 * of the weird array displacement mechanics, it has to be 5.
				 */
				int xPos = ((i - 1) / 9) - 5;
				int zPos = ((i - 1) % 9) - 4;
				/*
				 * This small bit is for generating the "endrooms" or the equivalent which would
				 * be a key room or bonus room
				 */
				if (endRoomCount == 0) {
					SwordtempleEndRoomSecret2Procedure.execute(world, x + (9 * xPos), y, z + (9 * zPos));
					endRoomCount++;
				} else if (endRoomCount == 1) {
					SwordtempleEndRoomSecret3Procedure.execute(world, x + (9 * xPos), y, z + (9 * zPos));
					endRoomCount++;
				} else {
					SwordtempleSetBonusLootProcedure.execute(world, x + (9 * xPos), y + 1, z + (9 * zPos));
					SwordtempleRoomGenSecretProcedure.execute(world, x + (9 * xPos), y, z + (9 * zPos));
				}
				/*
				 * These patchers fill the holes which would be in the dungeons walls to cut
				 * access
				 */
				if (i < 82 && !floorArray[i + 9]) {
					SwordtempleWallPatcherZSecretProcedure.execute(world, x + (9 * xPos) + 4, y + 1, z + (9 * zPos));
				}
				if (i > 18 && !floorArray[i - 9]) {
					SwordtempleWallPatcherZSecretProcedure.execute(world, x + (9 * xPos) - 4, y + 1, z + (9 * zPos));
				}
				if (((i - 1) % 9 != 0) && !floorArray[i - 1]) {
					SwordtempleWallPatcherXSecretProcedure.execute(world, x + (9 * xPos), y + 1, z + (9 * zPos) - 4);
				}
				if ((i % 9 != 0) && !floorArray[i + 1]) {
					SwordtempleWallPatcherXSecretProcedure.execute(world, x + (9 * xPos), y + 1, z + (9 * zPos) + 4);
				}
			} else if (i != FLOOR_MID && floorArray[i]) {
				/*
				 * Generation starts from the center. Normally, the xPos would be 4, but because
				 * of the weird array displacement mechanics, it has to be 5.
				 */
				int xPos = ((i - 1) / 9) - 5;
				int zPos = ((i - 1) % 9) - 4;
				SwordtempleRoomGenSecretProcedure.execute(world, x + (9 * xPos), y, z + (9 * zPos));
				if (i < 82 && !floorArray[i + 9]) {
					SwordtempleWallPatcherZSecretProcedure.execute(world, x + (9 * xPos) + 4, y + 1, z + (9 * zPos));
				}
				if (i > 18 && !floorArray[i - 9]) {
					SwordtempleWallPatcherZSecretProcedure.execute(world, x + (9 * xPos) - 4, y + 1, z + (9 * zPos));
				}
				if (((i - 1) % 9 != 0) && !floorArray[i - 1]) {
					SwordtempleWallPatcherXSecretProcedure.execute(world, x + (9 * xPos), y + 1, z + (9 * zPos) - 4);
				}
				if ((i % 9 != 0) && !floorArray[i + 1]) {
					SwordtempleWallPatcherXSecretProcedure.execute(world, x + (9 * xPos), y + 1, z + (9 * zPos) + 4);
				}
			} else if (i == FLOOR_MID) {
				/*
				 * Generation starts from the center. Normally, the xPos would be 4, but because
				 * of the weird array displacement mechanics, it has to be 5.
				 */
				int xPos = ((i - 1) / 9) - 5;
				int zPos = ((i - 1) % 9) - 4;
				if (!floorArray[i + 9]) {
					SwordtempleWallPatcherZSecretProcedure.execute(world, x + (9 * xPos) + 4, y + 1, z + (9 * zPos));
				}
				if (!floorArray[i - 9]) {
					SwordtempleWallPatcherZSecretProcedure.execute(world, x + (9 * xPos) - 4, y + 1, z + (9 * zPos));
				}
				if (!floorArray[i - 1]) {
					SwordtempleWallPatcherXSecretProcedure.execute(world, x + (9 * xPos), y + 1, z + (9 * zPos) - 4);
				}
				if (!floorArray[i + 1]) {
					SwordtempleWallPatcherXSecretProcedure.execute(world, x + (9 * xPos), y + 1, z + (9 * zPos) + 4);
				}
			}
		}
	}

	public static int roomsOccupied(boolean[] floorArr) {
		int occNum = 0;
		for (int i = FLOOR_START; i < FLOOR_SIZE; i++) {
			if (floorArr[i]) {
				occNum++;
			}
		}
		return occNum;
	}

	public static int neighbors(boolean[] floorArr, int currentRoom) {
		int neiNum = 0;
		if (currentRoom < 82 && floorArr[currentRoom + 9]) {
			neiNum++;
		}
		if (currentRoom > 18 && floorArr[currentRoom - 9]) {
			neiNum++;
		}
		if (((currentRoom - 1) % 9 != 0) && floorArr[currentRoom - 1]) {
			neiNum++;
		}
		if ((currentRoom % 9 != 0) && floorArr[currentRoom + 1]) {
			neiNum++;
		}
		return neiNum;
	}

	public static boolean canPlaceRoom(int neighbors, int currentRoom, boolean[] floorArray, boolean[] queueArray) {
		if (floorArray[currentRoom]) {
			return false;
		}
		if (neighbors > 1) {
			return false;
		}
		if (roomsOccupied(floorArray) > MAX_FLOOR_SIZE) {
			return false;
		}
		if (Math.random() < 0.5 && currentRoom != FLOOR_MID) {
			return false;
		}
		return true;
	}
}
