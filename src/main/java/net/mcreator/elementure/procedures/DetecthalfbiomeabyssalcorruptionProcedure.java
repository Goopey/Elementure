package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DetecthalfbiomeabyssalcorruptionProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double z, Entity entity) {
		execute(null, world, x, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double z, Entity entity) {
		if (entity == null)
			return;
		double CoordsY = 0;
		CoordsY = 0;
		if (!((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ElementureModItems.ABYSSALEMBLEM.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ElementureModItems.ABYSSALMEDALION.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ElementureModItems.ABYSSALTROPHY.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ElementureModItems.ABYSSALOATHBLADE.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ElementureModItems.ABYSSALSIGIL.get())) : false))) {
			while (CoordsY < 257) {
				if ((world.getBlockState(new BlockPos(x - 0.5, CoordsY, z))).getBlock() == ElementureModBlocks.ABYSSALCORRUPTION.get()) {
					AbysspoisonProcedure.execute(entity);
					break;
				} else {
					CoordsY = CoordsY + 1;
				}
			}
		}
		if (!((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ElementureModItems.ABYSSALEMBLEM.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ElementureModItems.ABYSSALMEDALION.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ElementureModItems.ABYSSALOATHBLADE.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ElementureModItems.ABYSSALSIGIL.get())) : false))) {
			while (CoordsY < 257) {
				if ((world.getBlockState(new BlockPos(x - 0.5, CoordsY, z))).getBlock() == ElementureModBlocks.ABYSSALCORRUPTION.get()) {
					AbyssslownessProcedure.execute(entity);
					break;
				} else {
					CoordsY = CoordsY + 1;
				}
			}
		}
		if (!((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ElementureModItems.ABYSSALEMBLEM.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ElementureModItems.ABYSSALTROPHY.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ElementureModItems.ABYSSALSIGIL.get())) : false))) {
			while (CoordsY < 257) {
				if ((world.getBlockState(new BlockPos(x - 0.5, CoordsY, z))).getBlock() == ElementureModBlocks.ABYSSALCORRUPTION.get()) {
					AbyssweaknessProcedure.execute(entity);
					break;
				} else {
					CoordsY = CoordsY + 1;
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ElementureModItems.ABYSSALSIGIL.get())) : false) {
			while (CoordsY < 257) {
				if ((world.getBlockState(new BlockPos(x - 0.5, CoordsY, z))).getBlock() == ElementureModBlocks.ABYSSALCORRUPTION.get()) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 0, (false), (false)));
					break;
				} else {
					CoordsY = CoordsY + 1;
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ElementureModItems.ABYSSALOATHBLADE.get())) : false) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ElementureModItems.ABYSSALOATHBLADE.get()) {
				while (CoordsY < 257) {
					if ((world.getBlockState(new BlockPos(x - 0.5, CoordsY, z))).getBlock() == ElementureModBlocks.ABYSSALCORRUPTION.get()) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 0, (false), (false)));
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 0, (false), (false)));
						break;
					} else {
						CoordsY = CoordsY + 1;
					}
				}
			}
		}
	}
}
