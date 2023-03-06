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
public class Modelsoul_skull_familiar<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelsoul_skull_familiar"), "main");
	public final ModelPart main_skull;
	public final ModelPart skull_r1;
	public final ModelPart flames;

	public Modelsoul_skull_familiar(ModelPart root) {
		this.main_skull = root.getChild("main_skull");
		this.skull_r1 = main_skull.getChild("skull_r1");
		this.flames = main_skull.getChild("flames");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition main_skull = partdefinition.addOrReplaceChild("main_skull", CubeListBuilder.create(), PartPose.offset(0.0F, 14.0F, 0.0F));
		PartDefinition skull_r1 = main_skull.addOrReplaceChild("skull_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -3.75F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition flames = main_skull.addOrReplaceChild("flames",
				CubeListBuilder.create().texOffs(6, 24).addBox(-1.5F, -1.5F, -0.75F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 28).addBox(-1.5F, -1.5F, 1.75F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(1.25F, -1.5F, -1.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 21).addBox(-1.25F, -1.5F, -1.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 0.25F, 0.7418F, 0.0F, 0.0F));
		PartDefinition soul_r1 = flames.addOrReplaceChild("soul_r1", CubeListBuilder.create().texOffs(16, 24).addBox(-2.0F, -2.0F, -0.6F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -0.4363F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.main_skull.zRot = (float) (Math.sin(ageInTicks / 6) / 12);
		this.skull_r1.zRot = (float) (Math.sin(ageInTicks / 6) / 9);
		this.flames.xRot = (float) (Math.cos(ageInTicks / 8) / 10 + 0.687F);
		this.main_skull.setPos(0.0F, (14.0F + (float) (Math.sin(ageInTicks / 6) / 8)), 0.0F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		main_skull.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
