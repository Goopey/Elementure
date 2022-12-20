
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.ShatteredobsidianchargerEntity;
import net.mcreator.elementure.client.model.Modelshattered_obsidian_charger;

public class ShatteredobsidianchargerRenderer
		extends
			MobRenderer<ShatteredobsidianchargerEntity, Modelshattered_obsidian_charger<ShatteredobsidianchargerEntity>> {
	public ShatteredobsidianchargerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshattered_obsidian_charger(context.bakeLayer(Modelshattered_obsidian_charger.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<ShatteredobsidianchargerEntity, Modelshattered_obsidian_charger<ShatteredobsidianchargerEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/shattered_obsidian_charger_lighting_texturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ShatteredobsidianchargerEntity entity) {
		return new ResourceLocation("elementure:textures/entities/shattered_obsidian_charger_texturemap.png");
	}
}
