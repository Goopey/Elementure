package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

public class MycenavillagernextProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("villagerType") == 1) {
			MycenaleatherworkerguinextProcedure.execute(entity);
		} else if (entity.getPersistentData().getDouble("villagerType") == 2) {
			MycenablacksmithguinextProcedure.execute(entity);
		} else if (entity.getPersistentData().getDouble("villagerType") == 3) {
			MycenalibrarianguinextProcedure.execute(entity);
		} else if (entity.getPersistentData().getDouble("villagerType") == 4) {
			MycenashroomvillagerpriestNextProcedure.execute(entity);
		} else if (entity.getPersistentData().getDouble("villagerType") == 5) {
			MycenashroomvillagerfarmerNextProcedure.execute(entity);
		} else if (entity.getPersistentData().getDouble("villagerType") == 6) {
			MycenafishermanGuiNextProcedure.execute(entity);
		}
	}
}
