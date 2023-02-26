
package net.mcreator.elementure.client.gui;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.world.inventory.MemorymatrixGuiMenu;
import net.mcreator.elementure.network.MemorymatrixGuiButtonMessage;
import net.mcreator.elementure.ElementureMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MemorymatrixGuiScreen extends AbstractContainerScreen<MemorymatrixGuiMenu> {
	private final static HashMap<String, Object> guistate = MemorymatrixGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public MemorymatrixGuiScreen(MemorymatrixGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 144;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("elementure:textures/screens/memorymatrix_gui.png");

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
		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/memory_matrix_gui_background.png"));
		this.blit(ms, this.leftPos + 38, this.topPos + 75, 0, 0, 64, 64, 64, 64);
		RenderSystem.setShaderTexture(0, new ResourceLocation("elementure:textures/screens/memory_matrix_gui_deco.png"));
		this.blit(ms, this.leftPos + 38, this.topPos + 75, 0, 0, 64, 64, 64, 64);
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
		this.font.draw(poseStack, "" + (new Object() {
			public String getValue(BlockPos pos, String tag) {
				BlockEntity BlockEntity = world.getBlockEntity(pos);
				if (BlockEntity != null)
					return BlockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "memorial_name_" + ((new Object() {
			public double getValue(BlockPos pos, String tag) {
				BlockEntity BlockEntity = world.getBlockEntity(pos);
				if (BlockEntity != null)
					return BlockEntity.getPersistentData().getDouble(tag);
				return 0;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "teleport_num"))))), 40, 23, -12829636);
		this.font.draw(poseStack, "" + ((int) new Object() {
			public double getValue(BlockPos pos, String tag) {
				BlockEntity BlockEntity = world.getBlockEntity(pos);
				if (BlockEntity != null)
					return BlockEntity.getPersistentData().getDouble(tag);
				return 0;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "teleport_num") + 1) + "", 27, 23, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 109, this.topPos + 41, 30, 20, Component.literal(">"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new MemorymatrixGuiButtonMessage(0, x, y, z));
				MemorymatrixGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 3, this.topPos + 41, 30, 20, Component.literal("<"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new MemorymatrixGuiButtonMessage(1, x, y, z));
				MemorymatrixGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 54, this.topPos + 41, 35, 20, Component.literal("Go"), e -> {
			if (true) {
				ElementureMod.PACKET_HANDLER.sendToServer(new MemorymatrixGuiButtonMessage(2, x, y, z));
				MemorymatrixGuiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
	}
}
