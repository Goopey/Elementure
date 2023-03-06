package net.mcreator.elementure.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.world.inventory.GlasslightbrewerGUIMenu;
import net.mcreator.elementure.procedures.GlasslightbrewerGUINode8ConditionProcedure;
import net.mcreator.elementure.procedures.GlasslightbrewerGUINode7ConditionProcedure;
import net.mcreator.elementure.procedures.GlasslightbrewerGUINode6ConditionProcedure;
import net.mcreator.elementure.procedures.GlasslightbrewerGUINode5ConditionProcedure;
import net.mcreator.elementure.procedures.GlasslightbrewerGUINode4ConditionProcedure;
import net.mcreator.elementure.procedures.GlasslightbrewerGUINode3ConditionProcedure;
import net.mcreator.elementure.procedures.GlasslightbrewerGUINode2ConditonProcedure;
import net.mcreator.elementure.procedures.GlasslightbrewerGUINode1ConditionProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class GlasslightbrewerGUIScreen extends AbstractContainerScreen<GlasslightbrewerGUIMenu> {
	private final static HashMap<String, Object> guistate = GlasslightbrewerGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public GlasslightbrewerGUIScreen(GlasslightbrewerGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 126;
	}

	private static final ResourceLocation texture = new ResourceLocation("elementure:textures/screens/glasslightbrewer_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/inventory_slot_small_texture.png"));
		this.blit(ms, this.leftPos + 129, this.topPos + 11, 0, 0, 24, 24, 24, 24);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/jar.png"));
		this.blit(ms, this.leftPos + 25, this.topPos + 15, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/rime_essence_symbol.png"));
		this.blit(ms, this.leftPos + 43, this.topPos + 15, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/diverscrown_meter_empty.png"));
		this.blit(ms, this.leftPos + 81, this.topPos + 14, 0, 0, 44, 18, 44, 18);

		if (GlasslightbrewerGUINode1ConditionProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/diverscrown_meter_1.png"));
			this.blit(ms, this.leftPos + 81, this.topPos + 14, 0, 0, 44, 18, 44, 18);
		}
		if (GlasslightbrewerGUINode2ConditonProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/diverscrown_meter_2.png"));
			this.blit(ms, this.leftPos + 81, this.topPos + 14, 0, 0, 44, 18, 44, 18);
		}
		if (GlasslightbrewerGUINode3ConditionProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/diverscrown_meter_3.png"));
			this.blit(ms, this.leftPos + 81, this.topPos + 14, 0, 0, 44, 18, 44, 18);
		}
		if (GlasslightbrewerGUINode4ConditionProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/diverscrown_meter_4.png"));
			this.blit(ms, this.leftPos + 81, this.topPos + 14, 0, 0, 44, 18, 44, 18);
		}
		if (GlasslightbrewerGUINode5ConditionProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/diverscrown_meter_5.png"));
			this.blit(ms, this.leftPos + 81, this.topPos + 14, 0, 0, 44, 18, 44, 18);
		}
		if (GlasslightbrewerGUINode6ConditionProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/diverscrown_meter_6.png"));
			this.blit(ms, this.leftPos + 81, this.topPos + 14, 0, 0, 44, 18, 44, 18);
		}
		if (GlasslightbrewerGUINode7ConditionProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/diverscrown_meter_7.png"));
			this.blit(ms, this.leftPos + 81, this.topPos + 14, 0, 0, 44, 18, 44, 18);
		}
		if (GlasslightbrewerGUINode8ConditionProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/diverscrown_meter_full.png"));
			this.blit(ms, this.leftPos + 81, this.topPos + 14, 0, 0, 44, 18, 44, 18);
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
	}
}
