package net.mcreator.elementure.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.elementure.init.ElementureModBlocks;

public class DiverscrownStoneRoomAirProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState plant1 = Blocks.AIR.defaultBlockState();
		BlockState plant2 = Blocks.AIR.defaultBlockState();
		BlockState plant3 = Blocks.AIR.defaultBlockState();
		BlockState plant4 = Blocks.AIR.defaultBlockState();
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		double xOff = 0;
		double zOff = 0;
		double yOff = 0;
		double rndSize = 0;
		double rndPlant = 0;
		double locX2 = 0;
		double locY2 = 0;
		double locZ2 = 0;
		rndPlant = Math.round(Math.random() * 15);
		if (rndPlant == 0) {
			plant1 = ElementureModBlocks.GREENRIMEVINE.get().defaultBlockState();
			plant2 = ElementureModBlocks.GREENRIMEFAN.get().defaultBlockState();
			plant3 = ElementureModBlocks.GREENRIMEBUSH.get().defaultBlockState();
			plant4 = ElementureModBlocks.GREENRIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 1) {
			plant1 = ElementureModBlocks.CYANRIMEVINE.get().defaultBlockState();
			plant2 = ElementureModBlocks.CYANRIMEFAN.get().defaultBlockState();
			plant3 = ElementureModBlocks.CYANRIMEBUSH.get().defaultBlockState();
			plant4 = ElementureModBlocks.CYANRIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 2) {
			plant1 = ElementureModBlocks.LIGHTBLUERIMEVINE.get().defaultBlockState();
			plant2 = ElementureModBlocks.LIGHTBLUERIMEFAN.get().defaultBlockState();
			plant3 = ElementureModBlocks.LIGHTBLUERIMEBUSH.get().defaultBlockState();
			plant4 = ElementureModBlocks.LIGHTBLUERIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 3) {
			plant1 = ElementureModBlocks.BLUERIMEVINE.get().defaultBlockState();
			plant2 = ElementureModBlocks.BLUERIMEFAN.get().defaultBlockState();
			plant3 = ElementureModBlocks.BLUERIMEBUSH.get().defaultBlockState();
			plant4 = ElementureModBlocks.BLUERIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 4) {
			plant1 = ElementureModBlocks.PURPLERIMEVINE.get().defaultBlockState();
			plant2 = ElementureModBlocks.PURPLERIMEFAN.get().defaultBlockState();
			plant3 = ElementureModBlocks.PURPLERIMEBUSH.get().defaultBlockState();
			plant4 = ElementureModBlocks.PURPLERIMEMOSS.get().defaultBlockState();
		}
		if (rndPlant == 5) {
			plant1 = ElementureModBlocks.MAGENTARIMEVINE.get().defaultBlockState();
			plant2 = ElementureModBlocks.MAGENTARIMEFAN.get().defaultBlockState();
			plant3 = ElementureModBlocks.MAGENTARIMEBUSH.get().defaultBlockState();
			plant4 = ElementureModBlocks.MAGENTARIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 6) {
			plant1 = ElementureModBlocks.PINKRIMEVINE.get().defaultBlockState();
			plant2 = ElementureModBlocks.PINKRIMEFAN.get().defaultBlockState();
			plant3 = ElementureModBlocks.PINKRIMEBUSH.get().defaultBlockState();
			plant4 = ElementureModBlocks.PINKRIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 7) {
			plant1 = ElementureModBlocks.BROWNRIMEVINE.get().defaultBlockState();
			plant2 = ElementureModBlocks.BROWNRIMEFAN.get().defaultBlockState();
			plant3 = ElementureModBlocks.BROWNRIMEBUSH.get().defaultBlockState();
			plant4 = ElementureModBlocks.BROWNRIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 8) {
			plant1 = ElementureModBlocks.LIGHTGRAYRIMEVINE.get().defaultBlockState();
			plant2 = ElementureModBlocks.LIGHTGRAYRIMEFAN.get().defaultBlockState();
			plant3 = ElementureModBlocks.LIGHTGRAYRIMEBUSH.get().defaultBlockState();
			plant4 = ElementureModBlocks.LIGHTGRAYRIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 9) {
			plant1 = ElementureModBlocks.ORANGERIMEVINE.get().defaultBlockState();
			plant2 = ElementureModBlocks.ORANGERIMEFAN.get().defaultBlockState();
			plant3 = ElementureModBlocks.ORANGERIMEBUSH.get().defaultBlockState();
			plant4 = ElementureModBlocks.ORANGERIMEMOSS.get().defaultBlockState();
		}
		if (rndPlant == 10) {
			plant1 = ElementureModBlocks.BLACKRIMEVINE.get().defaultBlockState();
			plant2 = ElementureModBlocks.BLACKRIMEFAN.get().defaultBlockState();
			plant3 = ElementureModBlocks.BLACKRIMEBUSH.get().defaultBlockState();
			plant4 = ElementureModBlocks.BLACKRIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 11) {
			plant1 = ElementureModBlocks.GRAYRIMEVINE.get().defaultBlockState();
			plant2 = ElementureModBlocks.GRAYRIMEFAN.get().defaultBlockState();
			plant3 = ElementureModBlocks.GRAYRIMEBUSH.get().defaultBlockState();
			plant4 = ElementureModBlocks.GRAYRIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 12) {
			plant1 = ElementureModBlocks.LIMERIMEVINE.get().defaultBlockState();
			plant2 = ElementureModBlocks.LIMERIMEFAN.get().defaultBlockState();
			plant3 = ElementureModBlocks.LIMERIMEFAN.get().defaultBlockState();
			plant4 = ElementureModBlocks.LIMERIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 13) {
			plant1 = ElementureModBlocks.YELLOWRIMEVINE.get().defaultBlockState();
			plant2 = ElementureModBlocks.YELLOWRIMEFAN.get().defaultBlockState();
			plant3 = ElementureModBlocks.YELLOWRIMEBUSH.get().defaultBlockState();
			plant4 = ElementureModBlocks.YELLOWRIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 14) {
			plant1 = ElementureModBlocks.REDRIMEVINE.get().defaultBlockState();
			plant2 = ElementureModBlocks.REDRIMEFAN.get().defaultBlockState();
			plant3 = ElementureModBlocks.REDRIMEBUSH.get().defaultBlockState();
			plant4 = ElementureModBlocks.REDRIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 15) {
			plant1 = ElementureModBlocks.WHITERIMEVINE.get().defaultBlockState();
			plant2 = ElementureModBlocks.WHITERIMEFAN.get().defaultBlockState();
			plant3 = ElementureModBlocks.WHITERIMEBUSH.get().defaultBlockState();
			plant4 = ElementureModBlocks.WHITERIMEMOSS.get().defaultBlockState();
		}
		locX = -15;
		locY = -15;
		locZ = -15;
		xOff = Math.random() * 2.5 + 1;
		yOff = Math.random() * 2.5 + 1;
		zOff = Math.random() * 2.5 + 1;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "diverscrownRoomSize") > 0) {
			rndSize = new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "diverscrownRoomSize");
		} else {
			rndSize = 10;
			rndSize = rndSize * rndSize;
		}
		for (int index0 = 0; index0 < (int) (29791); index0++) {
			if (locX * locX * xOff + locY * locY * yOff + locZ * locZ * zOff <= rndSize
					&& (world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ))).getBlock() == ElementureModBlocks.DIVERSSTONE.get()) {
				world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), Blocks.WATER.defaultBlockState(), 3);
				if (locX * locX * xOff + locY * locY * yOff + locZ * locZ * zOff >= rndSize - 20 && Math.random() < 0.1625) {
					if (Math.random() < 0.075) {
						world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.DIVERSCROWN_OMEGAN.get().defaultBlockState(),
								3);
						world.scheduleTick(new BlockPos(x + locX, y + locY, z + locZ),
								world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ)).getBlock(), 40);
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x + locX, y + locY, z + locZ);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("diverscrownOmeganRole", 5);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x + locX, y + locY, z + locZ);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("plantType", rndPlant);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					} else {
						if (locY > 2) {
							if (Math.random() < 0.05) {
								GlasslightGenProcedure.execute(world, (x + locX), (y + locY), (z + locZ));
							} else if (Math.random() < 0.05) {
								RimesaptreeGenProcedure.execute(world, (x + locX), (y + locY), (z + locZ));
							} else {
								world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), plant1, 3);
							}
						} else if (locY < -2) {
							if (Math.random() < 0.077) {
								CormunculusGenProcedure.execute(world, (x + locX), (y + locY), (z + locZ));
							} else if (Math.random() < 0.077) {
								BoulderDiversCrownGenProcedure.execute(world, (x + locX), (y + locY), (z + locZ));
							} else {
								world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), plant3, 3);
							}
						} else {
							world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), plant2, 3);
							if (world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ + 1)).canOcclude() && Math.random() < 0.5) {
								{
									Direction _dir = Direction.NORTH;
									BlockPos _pos = new BlockPos(x + locX, y + locY, z + locZ);
									BlockState _bs = world.getBlockState(_pos);
									Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
										world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
									} else {
										_property = _bs.getBlock().getStateDefinition().getProperty("axis");
										if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
											world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
									}
								}
							} else if ((world instanceof Level _lvl_isPow
									? _lvl_isPow.hasNeighborSignal(new BlockPos(x + locX, y + locY, (z + locZ) - 1))
									: false) && Math.random() < 0.5) {
								{
									Direction _dir = Direction.SOUTH;
									BlockPos _pos = new BlockPos(x + locX, y + locY, z + locZ);
									BlockState _bs = world.getBlockState(_pos);
									Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
										world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
									} else {
										_property = _bs.getBlock().getStateDefinition().getProperty("axis");
										if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
											world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
									}
								}
							} else if ((world instanceof Level _lvl_isPow
									? _lvl_isPow.hasNeighborSignal(new BlockPos(x + locX + 1, y + locY, z + locZ))
									: false) && Math.random() < 0.5) {
								{
									Direction _dir = Direction.WEST;
									BlockPos _pos = new BlockPos(x + locX, y + locY, z + locZ);
									BlockState _bs = world.getBlockState(_pos);
									Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
										world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
									} else {
										_property = _bs.getBlock().getStateDefinition().getProperty("axis");
										if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
											world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
									}
								}
							} else if ((world instanceof Level _lvl_isPow
									? _lvl_isPow.hasNeighborSignal(new BlockPos((x + locX) - 1, y + locY, z + locZ))
									: false) && Math.random() < 0.5) {
								{
									Direction _dir = Direction.EAST;
									BlockPos _pos = new BlockPos(x + locX, y + locY, z + locZ);
									BlockState _bs = world.getBlockState(_pos);
									Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
										world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
									} else {
										_property = _bs.getBlock().getStateDefinition().getProperty("axis");
										if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
											world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
									}
								}
							} else if (world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ + 1)).canOcclude()) {
								{
									Direction _dir = Direction.NORTH;
									BlockPos _pos = new BlockPos(x + locX, y + locY, z + locZ);
									BlockState _bs = world.getBlockState(_pos);
									Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
										world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
									} else {
										_property = _bs.getBlock().getStateDefinition().getProperty("axis");
										if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
											world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
									}
								}
							} else if (world instanceof Level _lvl_isPow
									? _lvl_isPow.hasNeighborSignal(new BlockPos(x + locX, y + locY, (z + locZ) - 1))
									: false) {
								{
									Direction _dir = Direction.SOUTH;
									BlockPos _pos = new BlockPos(x + locX, y + locY, z + locZ);
									BlockState _bs = world.getBlockState(_pos);
									Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
										world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
									} else {
										_property = _bs.getBlock().getStateDefinition().getProperty("axis");
										if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
											world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
									}
								}
							} else if (world instanceof Level _lvl_isPow
									? _lvl_isPow.hasNeighborSignal(new BlockPos(x + locX + 1, y + locY, z + locZ))
									: false) {
								{
									Direction _dir = Direction.WEST;
									BlockPos _pos = new BlockPos(x + locX, y + locY, z + locZ);
									BlockState _bs = world.getBlockState(_pos);
									Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
										world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
									} else {
										_property = _bs.getBlock().getStateDefinition().getProperty("axis");
										if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
											world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
									}
								}
							} else {
								{
									Direction _dir = Direction.EAST;
									BlockPos _pos = new BlockPos(x + locX, y + locY, z + locZ);
									BlockState _bs = world.getBlockState(_pos);
									Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
										world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
									} else {
										_property = _bs.getBlock().getStateDefinition().getProperty("axis");
										if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
											world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
									}
								}
							}
						}
						if (world instanceof Level _level)
							_level.updateNeighborsAt(new BlockPos(x + locX, y + locY, z + locZ),
									_level.getBlockState(new BlockPos(x + locX, y + locY, z + locZ)).getBlock());
					}
				}
			}
			locX = locX + 1;
			if (locX > 15) {
				locX = -15;
				locZ = locZ + 1;
				if (locZ > 15) {
					locX = -15;
					locY = locY + 1;
					locZ = -15;
					if (locY > 15) {
						locX = -15;
						locY = -15;
						locZ = -15;
					}
				}
			}
		}
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands()
							.performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
									new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"kill @e[type=minecraft:item,distance=0..25]");
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 10);
	}
}
