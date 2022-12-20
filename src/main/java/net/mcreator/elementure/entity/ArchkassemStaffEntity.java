
package net.mcreator.elementure.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.elementure.procedures.ArchkassemstaffWeakExplosionProcedure;
import net.mcreator.elementure.procedures.ArchkassemstaffParticlesProcedure;
import net.mcreator.elementure.procedures.ArchkassemstaffExplodeProcedure;
import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModEntities;

import java.util.Random;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class ArchkassemStaffEntity extends AbstractArrow implements ItemSupplier {
	public ArchkassemStaffEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(ElementureModEntities.ARCHKASSEM_STAFF.get(), world);
	}

	public ArchkassemStaffEntity(EntityType<? extends ArchkassemStaffEntity> type, Level world) {
		super(type, world);
	}

	public ArchkassemStaffEntity(EntityType<? extends ArchkassemStaffEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public ArchkassemStaffEntity(EntityType<? extends ArchkassemStaffEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(ElementureModItems.FIREBALLPROP.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		ArchkassemstaffWeakExplosionProcedure.execute(this.level, entityHitResult.getEntity());
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		ArchkassemstaffExplodeProcedure.execute(this.level, this.getOwner());
	}

	@Override
	public void tick() {
		super.tick();
		ArchkassemstaffParticlesProcedure.execute(this.level, this.getOwner());
		if (this.inGround)
			this.discard();
	}

	public static ArchkassemStaffEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		ArchkassemStaffEntity entityarrow = new ArchkassemStaffEntity(ElementureModEntities.ARCHKASSEM_STAFF.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		entityarrow.setSecondsOnFire(100);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.large_blast_far")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static ArchkassemStaffEntity shoot(LivingEntity entity, LivingEntity target) {
		ArchkassemStaffEntity entityarrow = new ArchkassemStaffEntity(ElementureModEntities.ARCHKASSEM_STAFF.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(3.9999999999999996);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(false);
		entityarrow.setSecondsOnFire(100);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.large_blast_far")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
