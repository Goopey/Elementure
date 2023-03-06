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
public class Modeldizmite<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modeldizmite"), "main");
	public final ModelPart main_body;

	public Modeldizmite(ModelPart root) {
		this.main_body = root.getChild("main_body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition main_body = partdefinition.addOrReplaceChild("main_body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.5F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 0).addBox(-3.0F, -6.0F, -4.75F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition side_spike_right_r1 = main_body.addOrReplaceChild("side_spike_right_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -2.5F, 0.0F, 1.4835F, -0.2618F, -0.1309F));
		PartDefinition side_spike_left_r1 = main_body.addOrReplaceChild("side_spike_left_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -2.5F, 0.0F, 1.4835F, 0.2618F, 0.1309F));
		PartDefinition back_ear_right = main_body.addOrReplaceChild("back_ear_right",
				CubeListBuilder.create().texOffs(2, 26).mirror().addBox(-0.5F, -1.75F, 3.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 26).mirror().addBox(-0.5F, -0.25F, 5.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(13, 16).mirror().addBox(-0.5F, 1.25F, 3.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(17, 19).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 5.0F, 8.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-4.0F, -6.0F, 1.5F, -0.3054F, -0.3491F, 0.2618F));
		PartDefinition spike_right_side_r1 = back_ear_right.addOrReplaceChild("spike_right_side_r1", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-1.0F, -1.75F, -1.25F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.1745F, 0.0873F));
		PartDefinition back_ear_left = main_body.addOrReplaceChild("back_ear_left",
				CubeListBuilder.create().texOffs(17, 19).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(2, 26).addBox(-0.5F, -1.75F, 3.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(2, 26)
						.addBox(-0.5F, -0.25F, 5.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(13, 16).addBox(-0.5F, 1.25F, 3.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -6.0F, 1.5F, -0.3054F, 0.3491F, -0.2618F));
		PartDefinition spike_left_side_r1 = back_ear_left.addOrReplaceChild("spike_left_side_r1", CubeListBuilder.create().texOffs(0, 24).addBox(0.0F, -1.75F, -1.25F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, -0.1745F, -0.0873F));
		PartDefinition ear_top_right = main_body.addOrReplaceChild("ear_top_right", CubeListBuilder.create().texOffs(2, 26).mirror().addBox(-0.1061F, -1.125F, -1.7079F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 17)
				.mirror().addBox(-0.605F, -0.875F, -1.925F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2239F, -5.625F, -3.1121F, 1.5363F, -1.1039F, -2.7004F));
		PartDefinition ear_top_mid = main_body.addOrReplaceChild("ear_top_mid", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-1.0F, 0.5F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(3, 27).mirror()
				.addBox(-0.5F, 0.25F, -1.75F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -8.5F, 3.5F, 0.3054F, 0.0F, 0.0F));
		PartDefinition ear_top_right2 = main_body.addOrReplaceChild("ear_top_right2",
				CubeListBuilder.create().texOffs(0, 17).addBox(-1.125F, -0.375F, -2.125F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(2, 26).addBox(-0.875F, -0.625F, -1.875F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7839F, -5.625F, -3.1121F, 1.5502F, 1.2826F, 2.689F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		main_body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
