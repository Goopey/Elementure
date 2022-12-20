package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;

public class MycenafumoonmushroomExplodeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < (int) (3); index0++) {
			MycenashroomcloudProcedure.execute(world, x, y, z);
		}
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 2, Explosion.BlockInteraction.BREAK);
	}
}
