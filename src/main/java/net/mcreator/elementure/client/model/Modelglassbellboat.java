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
public class Modelglassbellboat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelglassbellboat"), "main");
	public final ModelPart bb_main;

	public Modelglassbellboat(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 18).addBox(-12.0F, -1.0F, -25.0F, 24.0F, 9.0F, 50.0F, new CubeDeformation(0.0F)).texOffs(86, 77).addBox(-10.0F, -2.0F, -11.0F, 20.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 84)
						.addBox(-13.0F, -18.0F, 11.0F, 26.0F, 25.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-13.0F, -3.0F, -24.0F, 26.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.0F, -3.0F, -18.0F, 6.0F, 2.0F, 29.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-16.0F, -3.0F, -18.0F, 6.0F, 2.0F, 29.0F, new CubeDeformation(0.0F)).texOffs(110, 16)
						.addBox(-13.0F, -4.0F, -18.0F, 26.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(146, 88).addBox(-13.99F, -17.01F, -17.01F, 28.0F, 13.0F, 27.0F, new CubeDeformation(1.0F)).texOffs(0, 0)
						.addBox(-19.0F, -1.0F, -22.0F, 7.0F, 9.0F, 44.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(12.0F, -1.0F, -22.0F, 7.0F, 9.0F, 44.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-16.0F, 8.0F, -18.0F, 32.0F, 4.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-14.0F, 8.01F, -21.0F, 28.0F, 4.0F, 43.0F, new CubeDeformation(0.0F)).texOffs(128, 0).mirror()
						.addBox(17.0F, -2.0F, -10.0F, 12.0F, 12.0F, 52.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(128, 0).addBox(-29.0F, -2.0F, -10.0F, 12.0F, 12.0F, 52.0F, new CubeDeformation(0.0F)).texOffs(216, 0)
						.addBox(-15.0F, 7.0F, -36.0F, 6.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(216, 0).mirror().addBox(9.0F, 7.0F, -36.0F, 6.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
