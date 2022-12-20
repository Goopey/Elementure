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
public class Modeldragonite_leggings_scalemail<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("elementure", "modeldragonite_leggings_scalemail"), "main");
	public final ModelPart leg_top;
	public final ModelPart l_leg;
	public final ModelPart r_leg;

	public Modeldragonite_leggings_scalemail(ModelPart root) {
		this.leg_top = root.getChild("leg_top");
		this.l_leg = root.getChild("l_leg");
		this.r_leg = root.getChild("r_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition leg_top = partdefinition.addOrReplaceChild("leg_top",
				CubeListBuilder.create().texOffs(16, 87).addBox(-4.0F, 7.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.22F)),
				PartPose.offset(0.01F, 12.0F, -0.01F));
		PartDefinition b_spike_1 = leg_top.addOrReplaceChild("b_spike_1",
				CubeListBuilder.create().texOffs(0, 75).addBox(-1.0F, -2.5F, -0.67F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.22F)),
				PartPose.offsetAndRotation(-0.01F, 8.0F, 2.01F, -0.3491F, 0.0F, 0.0F));
		PartDefinition b_spike_2 = leg_top.addOrReplaceChild(
				"b_spike_2", CubeListBuilder.create().texOffs(0, 76).mirror()
						.addBox(-1.33F, -3.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.22F)).mirror(false),
				PartPose.offsetAndRotation(-2.01F, 9.0F, 2.01F, -0.6109F, -0.4363F, 0.0F));
		PartDefinition b_spike_3 = leg_top.addOrReplaceChild("b_spike_3",
				CubeListBuilder.create().texOffs(0, 76).addBox(-1.67F, -3.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.22F)),
				PartPose.offsetAndRotation(2.99F, 9.0F, 2.01F, -0.6109F, 0.4363F, 0.0F));
		PartDefinition l_leg = partdefinition.addOrReplaceChild("l_leg", CubeListBuilder.create().texOffs(0, 83).mirror()
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition r_leg = partdefinition.addOrReplaceChild("r_leg",
				CubeListBuilder.create().texOffs(0, 83).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 96);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		leg_top.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		l_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
