package net.mcreator.elementure.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelsunlight_egg<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelsunlight_egg"), "main");
	public final ModelPart main_body;
	public final ModelPart egg_body;
	public final ModelPart light_crown;
	public final ModelPart sunlight_crown;
	public final ModelPart sunlight_crown_mid;
	public final ModelPart sunlight_crown_bottom;

	public Modelsunlight_egg(ModelPart root) {
		this.main_body = root.getChild("main_body");
		this.egg_body = main_body.getChild("egg_body");
		this.light_crown = egg_body.getChild("light_crown");
		this.sunlight_crown = main_body.getChild("sunlight_crown");
		this.sunlight_crown_mid = sunlight_crown.getChild("sunlight_crown_mid");
		this.sunlight_crown_bottom = sunlight_crown.getChild("sunlight_crown_bottom");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition main_body = partdefinition.addOrReplaceChild("main_body", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition egg_body = main_body.addOrReplaceChild("egg_body",
				CubeListBuilder.create().texOffs(0, 7).addBox(-1.5F, 3.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0F, 0.25F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
						.addBox(-1.5F, -1.25F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 11).addBox(-1.99F, -0.25F, -1.01F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-0.99F, -0.25F, -2.01F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 8).addBox(-1.0F, -1.75F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.0F, 0.0F));
		PartDefinition light_crown = egg_body.addOrReplaceChild("light_crown", CubeListBuilder.create().texOffs(104, 116).addBox(-6.0F, -5.0F, 4.0F, 12.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition sunlight_crown = main_body.addOrReplaceChild("sunlight_crown", CubeListBuilder.create().texOffs(0, 112).addBox(-8.0F, 0.0F, -8.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 68)
				.addBox(-8.0F, 0.0F, 0.0F, 16.0F, 17.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(96, 0).addBox(0.0F, 0.0F, -8.0F, 0.0F, 17.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -20.0F, 0.0F));
		PartDefinition sunlight_crown_mid = sunlight_crown.addOrReplaceChild("sunlight_crown_mid", CubeListBuilder.create().texOffs(88, 95).addBox(-5.0F, 0.0F, -5.0F, 10.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition sunlight_crown_bottom = sunlight_crown.addOrReplaceChild("sunlight_crown_bottom", CubeListBuilder.create().texOffs(104, 64).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.sunlight_crown_bottom.yRot = ageInTicks / 10.0f;
		this.sunlight_crown_mid.yRot = ageInTicks / -10.0f;
		this.sunlight_crown.yRot = ageInTicks / 20.f;
		this.light_crown.setPos(0.0F, (0.0F + (float) (Math.sin(ageInTicks / 4) / 8)), 0.0F);
		this.egg_body.setPos(0.0F, (-1.0F + (float) (Math.cos(ageInTicks / 6) / 8)), 0.0F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		main_body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
