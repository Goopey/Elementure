
package net.mcreator.elementure.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.elementure.procedures.ForgottenwatchertransparentProcedure;
import net.mcreator.elementure.procedures.ForgottenwatchershakeProcedure;
import net.mcreator.elementure.entity.Forgottenwatcher1Entity;
import net.mcreator.elementure.client.model.Modelforgotten_watcher_1;

public class Forgottenwatcher1Renderer extends MobRenderer<Forgottenwatcher1Entity, Modelforgotten_watcher_1<Forgottenwatcher1Entity>> {
	public Forgottenwatcher1Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelforgotten_watcher_1(context.bakeLayer(Modelforgotten_watcher_1.LAYER_LOCATION)), 0f);
		this.addLayer(new EyesLayer<Forgottenwatcher1Entity, Modelforgotten_watcher_1<Forgottenwatcher1Entity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("elementure:textures/entities/forgotten_watcher_1_lightingtexturemap.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(Forgottenwatcher1Entity entity) {
		return new ResourceLocation("elementure:textures/entities/forgotten_watcher_1_texturemap.png");
	}

	@Override
	protected boolean isBodyVisible(Forgottenwatcher1Entity _ent) {
		Entity entity = _ent;
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		return !ForgottenwatchertransparentProcedure.execute(world, entity);
	}

	@Override
	protected boolean isShaking(Forgottenwatcher1Entity _ent) {
		Entity entity = _ent;
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		return ForgottenwatchershakeProcedure.execute(world, entity);
	}
}
