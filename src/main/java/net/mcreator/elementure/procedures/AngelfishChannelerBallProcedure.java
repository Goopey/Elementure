package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.elementure.init.ElementureModParticleTypes;

public class AngelfishChannelerBallProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double nPoints = 0;
		double a = 0;
		double d = 0;
		double mTeta = 0;
		double mPhi = 0;
		double dTeta = 0;
		double dPhi = 0;
		double teta = 0;
		double phi = 0;
		double radius = 0;
		double n = 0;
		double ind1 = 0;
		double ind2 = 0;
		//Parameters for points
		n = 500;
		radius = 1;
		nPoints = 0;//Setup for generation
		a = (4 * Math.PI * radius * radius) / n;
		d = Math.sqrt(a);
		mTeta = Math.round(Math.PI / d);
		dTeta = Math.PI / mTeta;
		dPhi = a / dTeta;//Loop 1
		for (int index0 = 0; index0 < (int) (mTeta - 1); index0++) {
			teta = (Math.PI * (ind1 + 0.5)) / mTeta;
			mPhi = Math.round(2 * Math.PI * (Math.sin(teta) / dPhi));
			ind1 = ind1 + 1;//Loop 2
			for (int index1 = 0; index1 < (int) (mPhi - 1); index1++) {
				phi = (2 * Math.PI * ind2) / mPhi;
				world.addParticle((SimpleParticleType) (ElementureModParticleTypes.ANGELSTARPARTICLE.get()),
						(x + radius * Math.sin(teta) * Math.cos(phi)), (y + radius * Math.sin(teta) * Math.sin(phi)), (z + radius * Math.cos(teta)),
						0, 0, 0);
				ind2 = ind2 + 1;
				nPoints = nPoints + 1;
			}
		}
	}
}
