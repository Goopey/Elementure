package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.item.RustyswordItem;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;

public class RustyswordSwingProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		String attackType = "";
		if (WeaponArtIsDelayedProcedure.execute(entity)) {
			attackType = "bash";
			if (itemstack.getItem() instanceof RustyswordItem)
				itemstack.getOrCreateTag().putString("geckoAnim", ("animation.weaponartitem." + attackType));
			if (entity instanceof Player) {
				var animation = SetupAnimationsProcedure.animationData.get((Player) entity);
				if (animation != null && !animation.isActive()) {
					animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("elementure", attackType))));
				}
			}
			{
				ItemStack _setval = itemstack;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.hitbox_item = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = attackType;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.hitbox_type = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 4;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.hitbox_delay = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 1;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.hitbox_size = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 1;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.hitbox_distance = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 1;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.hitbox_damage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
