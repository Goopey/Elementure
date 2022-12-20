package net.mcreator.elementure.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class StarryplainsFloorGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsZ = 0;
		CoordsX = -118;
		CoordsZ = -118;
		for (int index0 = 0; index0 < (int) (56169); index0++) {
			if (CoordsX * CoordsX + CoordsZ * CoordsZ > 2916 && !(new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getBoolean(tag);
					return false;
				}
			}.getValue(world, new BlockPos(x + CoordsX, 0, z + CoordsZ), "netherstarUsed")) && CoordsX * CoordsX + CoordsZ * CoordsZ <= 13924
					&& !((world.getBlockState(new BlockPos(x + CoordsX, 128, z + CoordsZ))).getBlock() == ElementureModBlocks.NETHERUM.get())) {
				if (Math.random() < 0.01) {
					world.setBlock(new BlockPos(x + CoordsX, 128, z + CoordsZ), ElementureModBlocks.NETHERUMCARPETSHINY.get().defaultBlockState(), 3);
				} else {
					world.setBlock(new BlockPos(x + CoordsX, 128, z + CoordsZ), ElementureModBlocks.NETHERUMCARPET.get().defaultBlockState(), 3);
				}
				if (!((world.getBlockState(new BlockPos(x + CoordsX, 0, z + CoordsZ))).getBlock() == ElementureModBlocks.PERVADEDBEDROCK.get())) {
					world.setBlock(new BlockPos(x + CoordsX, 0, z + CoordsZ), ElementureModBlocks.PERVADEDBEDROCK.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + CoordsX, 0, z + CoordsZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putBoolean("netherstarOutsideUsed", (true));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == 118) {
				CoordsX = -118;
				CoordsZ = CoordsZ + 1;
				if (CoordsZ == 118) {
					CoordsX = -118;
					CoordsZ = -118;
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
				StarryplainsFloorGen2Procedure.execute(world, x, z);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 10);
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
				StarryplainsFloorGen3Procedure.execute(world, x, (y + 2), z);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 20);
	}
}
