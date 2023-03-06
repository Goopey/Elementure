package net.mcreator.elementure.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelfoamfish<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("elementure", "modelfoamfish"), "main");
	public final ModelPart r_fin;
	public final ModelPart l_fin;
	public final ModelPart tailtop;
	public final ModelPart tailmid;
	public final ModelPart tailend;
	public final ModelPart bb_main;

	public Modelfoamfish(ModelPart root) {
		this.r_fin = root.getChild("r_fin");
		this.l_fin = root.getChild("l_fin");
		this.tailtop = root.getChild("tailtop");
		this.tailmid = tailtop.getChild("tailmid");
		this.tailend = tailmid.getChild("tailend");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition r_fin = partdefinition.addOrReplaceChild("r_fin", CubeListBuilder.create().texOffs(-8, 56).mirror().addBox(-4.5F, 0.0F, -3.5F, 5.0F, 0.0F, 8.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offset(-4.5F, 20.0F, -2.5F));
		PartDefinition l_fin = partdefinition.addOrReplaceChild("l_fin", CubeListBuilder.create().texOffs(-8, 56).addBox(-0.5F, 0.0F, -3.5F, 5.0F, 0.0F, 8.0F, new CubeDeformation(0.01F)), PartPose.offset(4.5F, 20.0F, -2.5F));
		PartDefinition tailtop = partdefinition.addOrReplaceChild("tailtop", CubeListBuilder.create().texOffs(36, 50).addBox(-3.5F, -3.5F, 0.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.5F, 5.0F));
		PartDefinition tailmid = tailtop.addOrReplaceChild("tailmid", CubeListBuilder.create().texOffs(42, 35).addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 7.0F));
		PartDefinition tailend = tailmid.addOrReplaceChild("tailend", CubeListBuilder.create().texOffs(15, 30).addBox(0.0F, -5.0F, 0.0F, 0.0F, 10.0F, 9.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -9.0F, -9.0F, 9.0F, 9.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(46, 0).addBox(-4.0F, -8.5F, -10.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.l_fin.zRot = Mth.sin(ageInTicks / 2.f) / 6.f;
		this.r_fin.zRot = Mth.sin(ageInTicks / 2.f) / -6.f;
		this.tailtop.yRot = (Mth.sin(ageInTicks / 2.f) + 0.33f) / 6.f;
		this.tailmid.yRot = (Mth.sin(ageInTicks / 2.f) + 0.67f) / 6.f;
		this.tailend.yRot = (Mth.sin(ageInTicks / 2.f) + 1.f) / 6.f;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		r_fin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		l_fin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tailtop.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
