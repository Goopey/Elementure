
package net.mcreator.elementure.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.entity.MycenashroomvillagerlibrarianEntity;
import net.mcreator.elementure.client.model.Modelmycena_shroom_villager_librarian;

public class MycenashroomvillagerlibrarianRenderer
		extends
			MobRenderer<MycenashroomvillagerlibrarianEntity, Modelmycena_shroom_villager_librarian<MycenashroomvillagerlibrarianEntity>> {
	public MycenashroomvillagerlibrarianRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmycena_shroom_villager_librarian(context.bakeLayer(Modelmycena_shroom_villager_librarian.LAYER_LOCATION)), 0.5f);
		this.addLayer(
				new EyesLayer<MycenashroomvillagerlibrarianEntity, Modelmycena_shroom_villager_librarian<MycenashroomvillagerlibrarianEntity>>(this) {
					@Override
					public RenderType renderType() {
						return RenderType
								.eyes(new ResourceLocation("elementure:textures/entities/mycena_shroom_villager_librarian_lightingtexturemap.png"));
					}
				});
	}

	@Override
	public ResourceLocation getTextureLocation(MycenashroomvillagerlibrarianEntity entity) {
		return new ResourceLocation("elementure:textures/entities/mycena_shroom_villager_librarian.png");
	}
}
