
package net.mcreator.elementure.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.world.inventory.FishingrecordDiverscrownMenu;
import net.mcreator.elementure.procedures.TarwormlingConfirmProcedure;
import net.mcreator.elementure.procedures.RimeboidConfirmProcedure;
import net.mcreator.elementure.procedures.RedsnapperConfirmProcedure;
import net.mcreator.elementure.procedures.RaredaggerloachConfirmProcedure;
import net.mcreator.elementure.procedures.PurpletrahiraConfirmProcedure;
import net.mcreator.elementure.procedures.MountainbrumConfirmProcedure;
import net.mcreator.elementure.procedures.DaggerloachConfirmProcedure;
import net.mcreator.elementure.procedures.CormunculusjellyConfirmProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class FishingrecordDiverscrownScreen extends AbstractContainerScreen<FishingrecordDiverscrownMenu> {
	private final static HashMap<String, Object> guistate = FishingrecordDiverscrownMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public FishingrecordDiverscrownScreen(FishingrecordDiverscrownMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 171;
	}

	private static final ResourceLocation texture = new ResourceLocation("elementure:textures/screens/fishingrecord_diverscrown.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/book_fishing.png"));
		this.blit(ms, this.leftPos + -34, this.topPos + 0, 0, 0, 242, 171, 242, 171);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
		this.blit(ms, this.leftPos + -23, this.topPos + 10, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
		this.blit(ms, this.leftPos + -23, this.topPos + 32, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
		this.blit(ms, this.leftPos + -23, this.topPos + 54, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
		this.blit(ms, this.leftPos + -23, this.topPos + 76, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
		this.blit(ms, this.leftPos + -23, this.topPos + 98, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
		this.blit(ms, this.leftPos + -23, this.topPos + 120, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
		this.blit(ms, this.leftPos + -23, this.topPos + 142, 0, 0, 18, 18, 18, 18);

		if (RimeboidConfirmProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/green_checkmark.png"));
			this.blit(ms, this.leftPos + -20, this.topPos + 13, 0, 0, 12, 12, 12, 12);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/rimeboid.png"));
		this.blit(ms, this.leftPos + -4, this.topPos + 11, 0, 0, 16, 16, 16, 16);

		if (PurpletrahiraConfirmProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/green_checkmark.png"));
			this.blit(ms, this.leftPos + -20, this.topPos + 35, 0, 0, 12, 12, 12, 12);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/purple_trouish.png"));
		this.blit(ms, this.leftPos + -4, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		if (DaggerloachConfirmProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/green_checkmark.png"));
			this.blit(ms, this.leftPos + -20, this.topPos + 57, 0, 0, 12, 12, 12, 12);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/dagger_loach.png"));
		this.blit(ms, this.leftPos + -4, this.topPos + 55, 0, 0, 16, 16, 16, 16);

		if (RaredaggerloachConfirmProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/green_checkmark.png"));
			this.blit(ms, this.leftPos + -20, this.topPos + 79, 0, 0, 12, 12, 12, 12);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/rare_dagger_loach.png"));
		this.blit(ms, this.leftPos + -4, this.topPos + 77, 0, 0, 16, 16, 16, 16);

		if (MountainbrumConfirmProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/green_checkmark.png"));
			this.blit(ms, this.leftPos + -20, this.topPos + 101, 0, 0, 12, 12, 12, 12);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/mountainbrum.png"));
		this.blit(ms, this.leftPos + -4, this.topPos + 99, 0, 0, 16, 16, 16, 16);

		if (RedsnapperConfirmProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/green_checkmark.png"));
			this.blit(ms, this.leftPos + -20, this.topPos + 123, 0, 0, 12, 12, 12, 12);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/red_snapper.png"));
		this.blit(ms, this.leftPos + -4, this.topPos + 121, 0, 0, 16, 16, 16, 16);

		if (TarwormlingConfirmProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/green_checkmark.png"));
			this.blit(ms, this.leftPos + -20, this.topPos + 145, 0, 0, 12, 12, 12, 12);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/tar_wormling.png"));
		this.blit(ms, this.leftPos + -4, this.topPos + 143, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
		this.blit(ms, this.leftPos + 28, this.topPos + 10, 0, 0, 18, 18, 18, 18);

		if (CormunculusjellyConfirmProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/green_checkmark.png"));
			this.blit(ms, this.leftPos + 31, this.topPos + 13, 0, 0, 12, 12, 12, 12);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/cormunculus_jelly.png"));
		this.blit(ms, this.leftPos + 47, this.topPos + 11, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
