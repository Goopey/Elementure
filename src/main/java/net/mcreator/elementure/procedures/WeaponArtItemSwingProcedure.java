package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.HitResult;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.item.WeaponArtItemItem;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;

public class WeaponArtItemSwingProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getType() == HitResult.Type.BLOCK)) {
			if (itemstack.getItem() instanceof WeaponArtItemItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "animation.weaponartitem.bash");
			if (entity instanceof Player) {
				var animation = SetupAnimationsProcedure.animationData.get((Player) entity);
				if (animation != null && !animation.isActive()) {
					animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("elementure", "bash"))));
				}
			}
			{
				String _setval = "bash";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.hitbox_type = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 3;
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
		}
	}
}
