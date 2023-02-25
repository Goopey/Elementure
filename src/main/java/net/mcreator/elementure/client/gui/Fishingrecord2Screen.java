
package net.mcreator.elementure.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.world.inventory.Fishingrecord2Menu;
import net.mcreator.elementure.procedures.DeactivateSlotProcedure;
import net.mcreator.elementure.network.Fishingrecord2ButtonMessage;
import net.mcreator.elementure.ElementureMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Fishingrecord2Screen extends AbstractContainerScreen<Fishingrecord2Menu> {
	private final static HashMap<String, Object> guistate = Fishingrecord2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Fishingrecord2Screen(Fishingrecord2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 149;
	}

	private static final ResourceLocation texture = new ResourceLocation("elementure:textures/screens/fishingrecord_2.png");

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
		this.blit(ms, this.leftPos + -31, this.topPos + -12, 0, 0, 242, 171, 242, 171);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/dagger_loach.png"));
		this.blit(ms, this.leftPos + -21, this.topPos + 0, 0, 0, 16, 16, 16, 16);

		if (DeactivateSlotProcedure.execute()) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/crumster.png"));
			this.blit(ms, this.leftPos + 86, this.topPos + 0, 0, 0, 16, 16, 16, 16);
		}
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
		this.addRenderableWidget(new Button(this.leftPos + -5, this.topPos + -2, 85, 20, Component.literal("Diver's Crown"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new Fishingrecord2ButtonMessage(0, x, y, z));
				Fishingrecord2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + -5, this.topPos + 122, 46, 20, Component.literal("Back"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new Fishingrecord2ButtonMessage(1, x, y, z));
				Fishingrecord2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 117, this.topPos + 122, 46, 20, Component.literal("Next"), e -> {
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (DeactivateSlotProcedure.execute())
					super.render(ms, gx, gy, ticks);
			}
		});
	}
}
