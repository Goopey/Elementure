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

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelbubble_o_blue<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelbubble_o_blue"), "main");
	public final ModelPart leg1;
	public final ModelPart leg2;
	public final ModelPart leg3;
	public final ModelPart leg4;
	public final ModelPart bb_main;

	public Modelbubble_o_blue(ModelPart root) {
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(12, 41).mirror().addBox(-1.5F, -0.99F, -1.5F, 3.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-6.5F, 26.0F, 6.5F));
		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(0, 41).addBox(-1.5F, -0.99F, -1.5F, 3.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.5F, 26.0F, -6.5F));
		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-1.5F, -0.99F, -1.5F, 3.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(6.5F, 26.0F, -6.5F));
		PartDefinition leg4 = partdefinition.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(12, 41).addBox(-1.5F, -0.99F, -1.5F, 3.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(6.5F, 26.0F, 6.5F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(64, 46).addBox(-8.0F, -21.99F, -8.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(56, 0).addBox(-9.0F, -20.0F, -9.0F, 18.0F, 17.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -3.0F, -8.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-7.0F, -1.0F, -7.0F, 14.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, 1.0F, -6.0F, 12.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(37, 36).addBox(-5.0F, 4.0F, -5.0F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-5.0F, -16.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.leg1.xRot = (float) (Math.sin((ageInTicks) / 8) / 16);
		this.leg1.zRot = (float) (Math.sin((ageInTicks + 1) / 12) / 16);
		this.leg2.xRot = (float) (Math.sin((ageInTicks + 2) / 8) / 16);
		this.leg2.zRot = (float) (Math.sin((ageInTicks + 3) / 8) / 16);
		this.leg3.xRot = (float) (Math.sin((ageInTicks + 4) / 8) / 16);
		this.leg3.zRot = (float) (Math.sin((ageInTicks + 5) / 12) / 16);
		this.leg4.xRot = (float) (Math.sin((ageInTicks + 6) / 12) / 16);
		this.leg4.zRot = (float) (Math.sin((ageInTicks + 7) / 8) / 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
