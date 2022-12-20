package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.elementure.network.ElementureModVariables;

public class ThebeginningofeverythingUpdateTickProcedure {
	public static void execute(LevelAccessor world) {
		if (ElementureModVariables.WorldVariables.get(world).COGTest1Time > 0) {
			ElementureModVariables.WorldVariables.get(world).COGTest1Time = ElementureModVariables.WorldVariables.get(world).COGTest1Time - 1;
			ElementureModVariables.WorldVariables.get(world).syncData(world);
		}
		if (ElementureModVariables.WorldVariables.get(world).COGStep1 == true) {
			ElementureModVariables.WorldVariables.get(world).COGStep2Time = ElementureModVariables.WorldVariables.get(world).COGStep2Time - 1;
			ElementureModVariables.WorldVariables.get(world).syncData(world);
		}
		if (ElementureModVariables.WorldVariables.get(world).COGStep2Time > 0) {
			ElementureModVariables.WorldVariables.get(world).COGStep2Time = ElementureModVariables.WorldVariables.get(world).COGTest1Time - 1;
			ElementureModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
