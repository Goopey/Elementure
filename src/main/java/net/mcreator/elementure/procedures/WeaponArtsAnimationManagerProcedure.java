package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.elementure.network.ElementureModVariables;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;

public class WeaponArtsAnimationManagerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ItemStack mainHandItem = ItemStack.EMPTY;
		String weaponArtAnimation = "";
		mainHandItem = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
		if (mainHandItem.is(ItemTags.create(new ResourceLocation("elementure:weaponartitems"))) && WeaponArtIsDelayedProcedure.execute(entity)) {
			weaponArtAnimation = mainHandItem.getOrCreateTag().getString("weaponArtName");
			mainHandItem.getOrCreateTag().putString("geckoAnim", "animation.weaponartitem." + weaponArtAnimation);
			if (entity instanceof Player) {
				var animation = SetupAnimationsProcedure.animationData.get((Player) entity);
				if (animation != null && !animation.isActive()) {
					animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("elementure", weaponArtAnimation))));
				}
			} //------stats stuff-----
			{
				String _setval = mainHandItem.getOrCreateTag().getString("weaponArtName");
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.hitbox_type = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				ItemStack _setval = mainHandItem;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.hitbox_item = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			WeaponArtStatsMaster1Procedure.execute(entity);
		}
	}
}
