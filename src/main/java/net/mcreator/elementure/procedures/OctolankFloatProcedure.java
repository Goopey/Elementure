package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.core.Registry;

public class OctolankFloatProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public double getSubmergedHeight(Entity _entity) {
				for (TagKey<Fluid> _fldtag : Registry.FLUID.getTagNames().toList()) {
					if (_entity.level.getFluidState(entity.blockPosition()).is(_fldtag))
						return _entity.getFluidHeight(_fldtag);
				}
				return 0;
			}
		}.getSubmergedHeight(entity) > 0.0125) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.0185, (entity.getDeltaMovement().z())));
		}
		if (Math.random() < 0.0005) {
			if (Math.random() < 0.5) {
				{
					Entity _ent = entity;
					_ent.setYRot((float) (entity.getYRot() + 0.33 + Math.random()));
					_ent.setXRot(0);
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
			} else {
				{
					Entity _ent = entity;
					_ent.setYRot((float) (entity.getYRot() - (0.33 + Math.random())));
					_ent.setXRot(0);
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
			}
		}
	}
}
