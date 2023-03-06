package net.mcreator.elementure.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.entity.GlassbellboatEntityEntity;

import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Comparator;

public class GlassbellboatPickupProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(9 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof GlassbellboatEntityEntity) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = (new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(0, entityiterator));
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = (new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(1, entityiterator));
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(ElementureModItems.GLASSBELLBOAT.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (!entityiterator.level.isClientSide())
						entityiterator.discard();
					break;
				}
			}
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
