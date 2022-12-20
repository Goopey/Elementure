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
public class ModelBaby_Ghast<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "model_baby_ghast"), "main");
	public final ModelPart HeadBody;

	public ModelBaby_Ghast(ModelPart root) {
		this.HeadBody = root.getChild("HeadBody");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition HeadBody = partdefinition.addOrReplaceChild("HeadBody",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.mirror().addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 18.0F, 0.0F));
		PartDefinition Tentacle = HeadBody.addOrReplaceChild("Tentacle",
				CubeListBuilder.create().texOffs(6, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.5F, 4.0F, -4.0F));
		PartDefinition Tentacle6 = HeadBody.addOrReplaceChild("Tentacle6",
				CubeListBuilder.create().texOffs(4, 4).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.5F, 4.0F, 4.0F));
		PartDefinition Tentacle2 = HeadBody.addOrReplaceChild("Tentacle2",
				CubeListBuilder.create().texOffs(2, 5).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 4.0F, -4.0F));
		PartDefinition Tentacle7 = HeadBody.addOrReplaceChild("Tentacle7",
				CubeListBuilder.create().texOffs(4, 2).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 4.0F, 4.0F));
		PartDefinition Tentacle3 = HeadBody.addOrReplaceChild("Tentacle3",
				CubeListBuilder.create().texOffs(0, 5).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, -4.0F));
		PartDefinition Tentacle8 = HeadBody.addOrReplaceChild("Tentacle8",
				CubeListBuilder.create().texOffs(4, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, 4.0F));
		PartDefinition Tentacle4 = HeadBody.addOrReplaceChild("Tentacle4",
				CubeListBuilder.create().texOffs(2, 2).addBox(0.5F, 0.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 4.0F, -1.0F));
		PartDefinition Tentacle9 = HeadBody.addOrReplaceChild("Tentacle9",
				CubeListBuilder.create().texOffs(0, 2).addBox(-0.5F, 0.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.5F, 4.0F, -1.0F));
		PartDefinition Tentacle5 = HeadBody.addOrReplaceChild("Tentacle5",
				CubeListBuilder.create().texOffs(2, 0).addBox(0.5F, 0.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 4.0F, 2.0F));
		PartDefinition Tentacle10 = HeadBody.addOrReplaceChild("Tentacle10",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.5F, 4.0F, 2.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		HeadBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.HeadBody.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.HeadBody.xRot = headPitch / (180F / (float) Math.PI);
	}
}
