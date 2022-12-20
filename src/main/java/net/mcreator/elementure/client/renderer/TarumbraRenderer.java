
package net.mcreator.elementure.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.elementure.procedures.TarumbraInvisibleProcedure;
import net.mcreator.elementure.entity.TarumbraEntity;
import net.mcreator.elementure.client.model.Modeltar_umbra;

public class TarumbraRenderer extends MobRenderer<TarumbraEntity, Modeltar_umbra<TarumbraEntity>> {
	public TarumbraRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltar_umbra(context.bakeLayer(Modeltar_umbra.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(TarumbraEntity entity) {
		return new ResourceLocation("elementure:textures/entities/tar_umbra_texturemap.png");
	}

	@Override
	protected boolean isBodyVisible(TarumbraEntity _ent) {
		Entity entity = _ent;
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		return !TarumbraInvisibleProcedure.execute(entity);
	}
}
