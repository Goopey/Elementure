package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

public class MycenavillagerbackProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("villagerType") == 1) {
			MycenaleatherworkerguibackProcedure.execute(entity);
		} else if (entity.getPersistentData().getDouble("villagerType") == 2) {
			MycenablacksmithguibackProcedure.execute(entity);
		} else if (entity.getPersistentData().getDouble("villagerType") == 3) {
			MycenalibrarianguibackProcedure.execute(entity);
		} else if (entity.getPersistentData().getDouble("villagerType") == 4) {
			MycenashroomvillagerpriestBackProcedure.execute(entity);
		} else if (entity.getPersistentData().getDouble("villagerType") == 5) {
			MycenashroomvillagerfarmerBackProcedure.execute(entity);
		} else if (entity.getPersistentData().getDouble("villagerType") == 6) {
			MycenafishermanGuiBackProcedure.execute(entity);
		}
	}
}
