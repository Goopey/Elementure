package net.mcreator.elementure.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.world.inventory.FishingrecordDungeonwaterMenu;
import net.mcreator.elementure.procedures.GrayskullfishConfirmProcedure;
import net.mcreator.elementure.procedures.GoldenchubConfirmProcedure;
import net.mcreator.elementure.procedures.DeactivateSlotProcedure;
import net.mcreator.elementure.procedures.ClodConfirmProcedure;
import net.mcreator.elementure.network.FishingrecordDungeonwaterButtonMessage;
import net.mcreator.elementure.ElementureMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class FishingrecordDungeonwaterScreen extends AbstractContainerScreen<FishingrecordDungeonwaterMenu> {
	private final static HashMap<String, Object> guistate = FishingrecordDungeonwaterMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_next_page;

	public FishingrecordDungeonwaterScreen(FishingrecordDungeonwaterMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 171;
	}

	private static final ResourceLocation texture = new ResourceLocation("elementure:textures/screens/fishingrecord_dungeonwater.png");

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
		this.blit(ms, this.leftPos + -33, this.topPos + 0, 0, 0, 242, 171, 242, 171);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
		this.blit(ms, this.leftPos + -23, this.topPos + 10, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
		this.blit(ms, this.leftPos + -23, this.topPos + 32, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
		this.blit(ms, this.leftPos + -23, this.topPos + 54, 0, 0, 18, 18, 18, 18);

		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
			this.blit(ms, this.leftPos + -23, this.topPos + 76, 0, 0, 18, 18, 18, 18);
		}
		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
			this.blit(ms, this.leftPos + -23, this.topPos + 98, 0, 0, 18, 18, 18, 18);
		}
		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
			this.blit(ms, this.leftPos + -23, this.topPos + 120, 0, 0, 18, 18, 18, 18);
		}
		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
			this.blit(ms, this.leftPos + -23, this.topPos + 142, 0, 0, 18, 18, 18, 18);
		}
		if (GoldenchubConfirmProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/green_checkmark.png"));
			this.blit(ms, this.leftPos + -20, this.topPos + 13, 0, 0, 12, 12, 12, 12);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/golden_chub.png"));
		this.blit(ms, this.leftPos + -4, this.topPos + 11, 0, 0, 16, 16, 16, 16);

		if (GrayskullfishConfirmProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/green_checkmark.png"));
			this.blit(ms, this.leftPos + -20, this.topPos + 35, 0, 0, 12, 12, 12, 12);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/grayskull_chub.png"));
		this.blit(ms, this.leftPos + -4, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		if (ClodConfirmProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/green_checkmark.png"));
			this.blit(ms, this.leftPos + -20, this.topPos + 57, 0, 0, 12, 12, 12, 12);
		}
		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
			this.blit(ms, this.leftPos + 28, this.topPos + 10, 0, 0, 18, 18, 18, 18);
		}
		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
			this.blit(ms, this.leftPos + 28, this.topPos + 32, 0, 0, 18, 18, 18, 18);
		}
		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
			this.blit(ms, this.leftPos + 28, this.topPos + 54, 0, 0, 18, 18, 18, 18);
		}
		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
			this.blit(ms, this.leftPos + 28, this.topPos + 76, 0, 0, 18, 18, 18, 18);
		}
		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
			this.blit(ms, this.leftPos + 28, this.topPos + 98, 0, 0, 18, 18, 18, 18);
		}
		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
			this.blit(ms, this.leftPos + 28, this.topPos + 120, 0, 0, 18, 18, 18, 18);
		}
		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
			this.blit(ms, this.leftPos + 28, this.topPos + 142, 0, 0, 18, 18, 18, 18);
		}
		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
			this.blit(ms, this.leftPos + 84, this.topPos + 10, 0, 0, 18, 18, 18, 18);
		}
		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
			this.blit(ms, this.leftPos + 84, this.topPos + 32, 0, 0, 18, 18, 18, 18);
		}
		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
			this.blit(ms, this.leftPos + 84, this.topPos + 54, 0, 0, 18, 18, 18, 18);
		}
		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
			this.blit(ms, this.leftPos + 84, this.topPos + 76, 0, 0, 18, 18, 18, 18);
		}
		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
			this.blit(ms, this.leftPos + 84, this.topPos + 98, 0, 0, 18, 18, 18, 18);
		}
		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
			this.blit(ms, this.leftPos + 84, this.topPos + 120, 0, 0, 18, 18, 18, 18);
		}
		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
			this.blit(ms, this.leftPos + 137, this.topPos + 10, 0, 0, 18, 18, 18, 18);
		}
		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
			this.blit(ms, this.leftPos + 137, this.topPos + 32, 0, 0, 18, 18, 18, 18);
		}
		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
			this.blit(ms, this.leftPos + 137, this.topPos + 54, 0, 0, 18, 18, 18, 18);
		}
		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
			this.blit(ms, this.leftPos + 137, this.topPos + 76, 0, 0, 18, 18, 18, 18);
		}
		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
			this.blit(ms, this.leftPos + 137, this.topPos + 98, 0, 0, 18, 18, 18, 18);
		}
		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_texture.png"));
			this.blit(ms, this.leftPos + 137, this.topPos + 120, 0, 0, 18, 18, 18, 18);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/clod.png"));
		this.blit(ms, this.leftPos + -4, this.topPos + 55, 0, 0, 16, 16, 16, 16);

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
		button_next_page = new Button(this.leftPos + 127, this.topPos + 140, 70, 20, Component.translatable("gui.elementure.fishingrecord_dungeonwater.button_next_page"), e -> {
			if (DeactivateSlotProcedure.execute()) {
				ElementureMod.PACKET_HANDLER.sendToServer(new FishingrecordDungeonwaterButtonMessage(0, x, y, z));
				FishingrecordDungeonwaterButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (DeactivateSlotProcedure.execute())
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:button_next_page", button_next_page);
		this.addRenderableWidget(button_next_page);
	}
}
