package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModItems;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class FerziumarmorFullArmorEffectProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == ElementureModItems.FERZIUMARMOR_HELMET.get()) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
					.getItem() == ElementureModItems.FERZIUMARMOR_CHESTPLATE.get()) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == ElementureModItems.FERZIUMARMOR_LEGGINGS.get()) {
					if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
							.getItem() == ElementureModItems.FERZIUMARMOR_BOOTS.get()) {
						if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).fire_essence < (entity instanceof LivingEntity _entGetArmor
										? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD)
										: ItemStack.EMPTY).getOrCreateTag().getDouble("previousFireEssence")) {
							(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
									.getOrCreateTag().putDouble("fireTime",
											((entity instanceof LivingEntity _entGetArmor
													? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD)
													: ItemStack.EMPTY).getOrCreateTag().getDouble("previousFireEssence")
													- (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
															.orElse(new ElementureModVariables.PlayerVariables())).fire_essence));
						}
						(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
								.getOrCreateTag()
								.putDouble("previousFireEssence", ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ElementureModVariables.PlayerVariables())).fire_essence));
						if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
								.getOrCreateTag().getDouble("fireTime") >= 0) {
							{
								final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(9 / 2d), e -> true)
										.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (!(entityiterator == entity)
											&& !entityiterator.getType()
													.is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:protectedentities")))
											&& !entityiterator.getType().is(
													TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:familiarentities")))) {
										entityiterator.setSecondsOnFire(7);
									}
								}
							}
							(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
									.getOrCreateTag().putDouble("fireTime",
											((entity instanceof LivingEntity _entGetArmor
													? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD)
													: ItemStack.EMPTY).getOrCreateTag().getDouble("fireTime") - 1));
						}
					}
				}
			}
		}
	}
}
