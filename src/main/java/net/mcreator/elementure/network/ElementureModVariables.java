package net.mcreator.elementure.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.ElementureMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElementureModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		ElementureMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new,
				SavedDataSyncMessage::handler);
		ElementureMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new,
				PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			clone.cursemode = original.cursemode;
			clone.relic_inventory_core = original.relic_inventory_core;
			clone.relic_inventory_familiar = original.relic_inventory_familiar;
			clone.relic_inventory_bag = original.relic_inventory_bag;
			clone.relic_inventory_blood = original.relic_inventory_blood;
			clone.relic_inventory_artifact_1 = original.relic_inventory_artifact_1;
			clone.relic_inventory_artifact_2 = original.relic_inventory_artifact_2;
			clone.relic_inventory_relic_1 = original.relic_inventory_relic_1;
			clone.relic_inventory_relic_2 = original.relic_inventory_relic_2;
			clone.relic_inventory_relic_3 = original.relic_inventory_relic_3;
			clone.relic_inventory_relic_4 = original.relic_inventory_relic_4;
			clone.relic_inventory_relic_5 = original.relic_inventory_relic_5;
			clone.relic_inventory_relic_6 = original.relic_inventory_relic_6;
			clone.relic_inventory_core_num = original.relic_inventory_core_num;
			clone.relic_inventory_familiar_num = original.relic_inventory_familiar_num;
			clone.relic_inventory_bag_num = original.relic_inventory_bag_num;
			clone.relic_inventory_blood_num = original.relic_inventory_blood_num;
			clone.relic_inventory_artifact_1_num = original.relic_inventory_artifact_1_num;
			clone.relic_inventory_artifact_2_num = original.relic_inventory_artifact_2_num;
			clone.relic_inventory_relic_1_num = original.relic_inventory_relic_1_num;
			clone.relic_inventory_relic_2_num = original.relic_inventory_relic_2_num;
			clone.relic_inventory_relic_3_num = original.relic_inventory_relic_3_num;
			clone.relic_inventory_relic_4_num = original.relic_inventory_relic_4_num;
			clone.relic_inventory_relic_5_num = original.relic_inventory_relic_5_num;
			clone.relic_inventory_relic_6_num = original.relic_inventory_relic_6_num;
			clone.has_spawned = original.has_spawned;
			clone.sanity = original.sanity;
			clone.isInsane = original.isInsane;
			if (!event.isWasDeath()) {
				clone.fire_essence = original.fire_essence;
				clone.water_essence = original.water_essence;
				clone.air_essence = original.air_essence;
				clone.earth_essence = original.earth_essence;
				clone.lightning_essence = original.lightning_essence;
				clone.void_essence = original.void_essence;
				clone.soul_essence = original.soul_essence;
				clone.light_essence = original.light_essence;
				clone.dark_essence = original.dark_essence;
				clone.time_NE_essence = original.time_NE_essence;
				clone.energy_essence = original.energy_essence;
				clone.force_essence = original.force_essence;
				clone.mind_essence = original.mind_essence;
				clone.infinity_essence = original.infinity_essence;
				clone.renderRelic1 = original.renderRelic1;
				clone.bag_opened_from_relic_inventory = original.bag_opened_from_relic_inventory;
				clone.fishingWait = original.fishingWait;
				clone.chosenFish = original.chosenFish;
				clone.fishingEratic = original.fishingEratic;
				clone.fishSpeed = original.fishSpeed;
				clone.bobberSpeed = original.bobberSpeed;
				clone.fishPos = original.fishPos;
				clone.bobberPos = original.bobberPos;
				clone.bobberAbility = original.bobberAbility;
				clone.reelingTimer = original.reelingTimer;
				clone.bobberReeling = original.bobberReeling;
				clone.bobberStun = original.bobberStun;
				clone.bobberStunTimer = original.bobberStunTimer;
				clone.bobberButtonDown = original.bobberButtonDown;
				clone.fishingBuffer = original.fishingBuffer;
				clone.firstfishlaunch = original.firstfishlaunch;
				clone.fishAbilityPos = original.fishAbilityPos;
				clone.fishAbilityTimer = original.fishAbilityTimer;
				clone.firstabilitylaunch = original.firstabilitylaunch;
				clone.musicName = original.musicName;
				clone.musictimer = original.musictimer;
				clone.musicplaying = original.musicplaying;
				clone.zonename = original.zonename;
				clone.zonenamelingering = original.zonenamelingering;
				clone.newzonetime = original.newzonetime;
				clone.fishBiome = original.fishBiome;
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getPlayer().level);
				SavedData worlddata = WorldVariables.get(event.getPlayer().level);
				if (mapdata != null)
					ElementureMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					ElementureMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getPlayer().level);
				if (worlddata != null)
					ElementureMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "elementure_worldvars";
		public boolean Firestaractivation = false;
		public boolean Absorptionstaractivation = false;
		public boolean Hastestaractivation = false;
		public boolean Healthstaractivation = false;
		public boolean Jumpstaractivation = false;
		public boolean Luckystaractivation = false;
		public boolean Resistancestaractivation = false;
		public boolean Speedstaractivation = false;
		public boolean Strenghtstaractivation = false;
		public boolean Visionstaractivation = false;
		public boolean Saturationstaractivation = false;
		public boolean Waterstaractivation = false;
		public double Skillcharge = 0;
		public double ElementalStrain = 1000;
		public boolean COGStep1 = false;
		public double COGTest1Time = 120000;
		public boolean COGStep2 = false;
		public double COGStep2Time = 480000;
		public double cursecharge = 12000;
		public double dbumRApple = 0;
		public double dbumGApple = 0;
		public boolean isAbyssalSingularityAlive = false;
		public boolean elementalOreObtained = false;
		public boolean delaconcordefound = false;

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			Firestaractivation = nbt.getBoolean("Firestaractivation");
			Absorptionstaractivation = nbt.getBoolean("Absorptionstaractivation");
			Hastestaractivation = nbt.getBoolean("Hastestaractivation");
			Healthstaractivation = nbt.getBoolean("Healthstaractivation");
			Jumpstaractivation = nbt.getBoolean("Jumpstaractivation");
			Luckystaractivation = nbt.getBoolean("Luckystaractivation");
			Resistancestaractivation = nbt.getBoolean("Resistancestaractivation");
			Speedstaractivation = nbt.getBoolean("Speedstaractivation");
			Strenghtstaractivation = nbt.getBoolean("Strenghtstaractivation");
			Visionstaractivation = nbt.getBoolean("Visionstaractivation");
			Saturationstaractivation = nbt.getBoolean("Saturationstaractivation");
			Waterstaractivation = nbt.getBoolean("Waterstaractivation");
			Skillcharge = nbt.getDouble("Skillcharge");
			ElementalStrain = nbt.getDouble("ElementalStrain");
			COGStep1 = nbt.getBoolean("COGStep1");
			COGTest1Time = nbt.getDouble("COGTest1Time");
			COGStep2 = nbt.getBoolean("COGStep2");
			COGStep2Time = nbt.getDouble("COGStep2Time");
			cursecharge = nbt.getDouble("cursecharge");
			dbumRApple = nbt.getDouble("dbumRApple");
			dbumGApple = nbt.getDouble("dbumGApple");
			isAbyssalSingularityAlive = nbt.getBoolean("isAbyssalSingularityAlive");
			elementalOreObtained = nbt.getBoolean("elementalOreObtained");
			delaconcordefound = nbt.getBoolean("delaconcordefound");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("Firestaractivation", Firestaractivation);
			nbt.putBoolean("Absorptionstaractivation", Absorptionstaractivation);
			nbt.putBoolean("Hastestaractivation", Hastestaractivation);
			nbt.putBoolean("Healthstaractivation", Healthstaractivation);
			nbt.putBoolean("Jumpstaractivation", Jumpstaractivation);
			nbt.putBoolean("Luckystaractivation", Luckystaractivation);
			nbt.putBoolean("Resistancestaractivation", Resistancestaractivation);
			nbt.putBoolean("Speedstaractivation", Speedstaractivation);
			nbt.putBoolean("Strenghtstaractivation", Strenghtstaractivation);
			nbt.putBoolean("Visionstaractivation", Visionstaractivation);
			nbt.putBoolean("Saturationstaractivation", Saturationstaractivation);
			nbt.putBoolean("Waterstaractivation", Waterstaractivation);
			nbt.putDouble("Skillcharge", Skillcharge);
			nbt.putDouble("ElementalStrain", ElementalStrain);
			nbt.putBoolean("COGStep1", COGStep1);
			nbt.putDouble("COGTest1Time", COGTest1Time);
			nbt.putBoolean("COGStep2", COGStep2);
			nbt.putDouble("COGStep2Time", COGStep2Time);
			nbt.putDouble("cursecharge", cursecharge);
			nbt.putDouble("dbumRApple", dbumRApple);
			nbt.putDouble("dbumGApple", dbumGApple);
			nbt.putBoolean("isAbyssalSingularityAlive", isAbyssalSingularityAlive);
			nbt.putBoolean("elementalOreObtained", elementalOreObtained);
			nbt.putBoolean("delaconcordefound", delaconcordefound);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				ElementureMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "elementure_mapvars";
		public boolean isPitlandsDiverPlaced = false;
		public boolean setSpawn = false;
		public boolean isHalloween = false;
		public boolean isChristmas = false;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			isPitlandsDiverPlaced = nbt.getBoolean("isPitlandsDiverPlaced");
			setSpawn = nbt.getBoolean("setSpawn");
			isHalloween = nbt.getBoolean("isHalloween");
			isChristmas = nbt.getBoolean("isChristmas");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("isPitlandsDiverPlaced", isPitlandsDiverPlaced);
			nbt.putBoolean("setSpawn", setSpawn);
			nbt.putBoolean("isHalloween", isHalloween);
			nbt.putBoolean("isChristmas", isChristmas);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				ElementureMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e),
						MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		public int type;
		public SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			if (this.data instanceof MapVariables _mapvars)
				_mapvars.read(buffer.readNbt());
			else if (this.data instanceof WorldVariables _worldvars)
				_worldvars.read(buffer.readNbt());
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("elementure", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public boolean cursemode = false;
		public ItemStack relic_inventory_core = ItemStack.EMPTY;
		public ItemStack relic_inventory_familiar = ItemStack.EMPTY;
		public ItemStack relic_inventory_bag = ItemStack.EMPTY;
		public ItemStack relic_inventory_blood = ItemStack.EMPTY;
		public ItemStack relic_inventory_artifact_1 = ItemStack.EMPTY;
		public ItemStack relic_inventory_artifact_2 = ItemStack.EMPTY;
		public ItemStack relic_inventory_relic_1 = ItemStack.EMPTY;
		public ItemStack relic_inventory_relic_2 = ItemStack.EMPTY;
		public ItemStack relic_inventory_relic_3 = ItemStack.EMPTY;
		public ItemStack relic_inventory_relic_4 = ItemStack.EMPTY;
		public ItemStack relic_inventory_relic_5 = ItemStack.EMPTY;
		public ItemStack relic_inventory_relic_6 = ItemStack.EMPTY;
		public double fire_essence = 0;
		public double water_essence = 0;
		public double air_essence = 0;
		public double earth_essence = 0;
		public double lightning_essence = 0;
		public double void_essence = 0;
		public double soul_essence = 0;
		public double light_essence = 0;
		public double dark_essence = 0;
		public double time_NE_essence = 0;
		public double energy_essence = 0;
		public double force_essence = 0;
		public double mind_essence = 0;
		public double infinity_essence = 0;
		public boolean renderRelic1 = true;
		public double relic_inventory_core_num = 0;
		public double relic_inventory_familiar_num = 0;
		public double relic_inventory_bag_num = 0;
		public double relic_inventory_blood_num = 0;
		public double relic_inventory_artifact_1_num = 0;
		public double relic_inventory_artifact_2_num = 0;
		public double relic_inventory_relic_1_num = 0;
		public double relic_inventory_relic_2_num = 0;
		public double relic_inventory_relic_3_num = 0;
		public double relic_inventory_relic_4_num = 0;
		public double relic_inventory_relic_5_num = 0;
		public double relic_inventory_relic_6_num = 0;
		public boolean bag_opened_from_relic_inventory = false;
		public boolean has_spawned = false;
		public double fishingWait = 0.0;
		public String chosenFish = "";
		public double fishingEratic = 0;
		public double fishSpeed = 0;
		public double bobberSpeed = 0.0;
		public double fishPos = 0;
		public double bobberPos = 0.0;
		public boolean bobberAbility = false;
		public double reelingTimer = 30.0;
		public boolean bobberReeling = false;
		public boolean bobberStun = false;
		public double bobberStunTimer = 0;
		public boolean bobberButtonDown = false;
		public double fishingBuffer = 0;
		public boolean firstfishlaunch = true;
		public double fishAbilityPos = 0;
		public double fishAbilityTimer = 0;
		public boolean firstabilitylaunch = false;
		public String musicName = "";
		public double musictimer = 0;
		public boolean musicplaying = false;
		public double sanity = 500.0;
		public String zonename = "";
		public String zonenamelingering = "";
		public double newzonetime = 0;
		public String fishBiome = "\"\"";
		public boolean isInsane = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				ElementureMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("cursemode", cursemode);
			nbt.put("relic_inventory_core", relic_inventory_core.save(new CompoundTag()));
			nbt.put("relic_inventory_familiar", relic_inventory_familiar.save(new CompoundTag()));
			nbt.put("relic_inventory_bag", relic_inventory_bag.save(new CompoundTag()));
			nbt.put("relic_inventory_blood", relic_inventory_blood.save(new CompoundTag()));
			nbt.put("relic_inventory_artifact_1", relic_inventory_artifact_1.save(new CompoundTag()));
			nbt.put("relic_inventory_artifact_2", relic_inventory_artifact_2.save(new CompoundTag()));
			nbt.put("relic_inventory_relic_1", relic_inventory_relic_1.save(new CompoundTag()));
			nbt.put("relic_inventory_relic_2", relic_inventory_relic_2.save(new CompoundTag()));
			nbt.put("relic_inventory_relic_3", relic_inventory_relic_3.save(new CompoundTag()));
			nbt.put("relic_inventory_relic_4", relic_inventory_relic_4.save(new CompoundTag()));
			nbt.put("relic_inventory_relic_5", relic_inventory_relic_5.save(new CompoundTag()));
			nbt.put("relic_inventory_relic_6", relic_inventory_relic_6.save(new CompoundTag()));
			nbt.putDouble("fire_essence", fire_essence);
			nbt.putDouble("water_essence", water_essence);
			nbt.putDouble("air_essence", air_essence);
			nbt.putDouble("earth_essence", earth_essence);
			nbt.putDouble("lightning_essence", lightning_essence);
			nbt.putDouble("void_essence", void_essence);
			nbt.putDouble("soul_essence", soul_essence);
			nbt.putDouble("light_essence", light_essence);
			nbt.putDouble("dark_essence", dark_essence);
			nbt.putDouble("time_NE_essence", time_NE_essence);
			nbt.putDouble("energy_essence", energy_essence);
			nbt.putDouble("force_essence", force_essence);
			nbt.putDouble("mind_essence", mind_essence);
			nbt.putDouble("infinity_essence", infinity_essence);
			nbt.putBoolean("renderRelic1", renderRelic1);
			nbt.putDouble("relic_inventory_core_num", relic_inventory_core_num);
			nbt.putDouble("relic_inventory_familiar_num", relic_inventory_familiar_num);
			nbt.putDouble("relic_inventory_bag_num", relic_inventory_bag_num);
			nbt.putDouble("relic_inventory_blood_num", relic_inventory_blood_num);
			nbt.putDouble("relic_inventory_artifact_1_num", relic_inventory_artifact_1_num);
			nbt.putDouble("relic_inventory_artifact_2_num", relic_inventory_artifact_2_num);
			nbt.putDouble("relic_inventory_relic_1_num", relic_inventory_relic_1_num);
			nbt.putDouble("relic_inventory_relic_2_num", relic_inventory_relic_2_num);
			nbt.putDouble("relic_inventory_relic_3_num", relic_inventory_relic_3_num);
			nbt.putDouble("relic_inventory_relic_4_num", relic_inventory_relic_4_num);
			nbt.putDouble("relic_inventory_relic_5_num", relic_inventory_relic_5_num);
			nbt.putDouble("relic_inventory_relic_6_num", relic_inventory_relic_6_num);
			nbt.putBoolean("bag_opened_from_relic_inventory", bag_opened_from_relic_inventory);
			nbt.putBoolean("has_spawned", has_spawned);
			nbt.putDouble("fishingWait", fishingWait);
			nbt.putString("chosenFish", chosenFish);
			nbt.putDouble("fishingEratic", fishingEratic);
			nbt.putDouble("fishSpeed", fishSpeed);
			nbt.putDouble("bobberSpeed", bobberSpeed);
			nbt.putDouble("fishPos", fishPos);
			nbt.putDouble("bobberPos", bobberPos);
			nbt.putBoolean("bobberAbility", bobberAbility);
			nbt.putDouble("reelingTimer", reelingTimer);
			nbt.putBoolean("bobberReeling", bobberReeling);
			nbt.putBoolean("bobberStun", bobberStun);
			nbt.putDouble("bobberStunTimer", bobberStunTimer);
			nbt.putBoolean("bobberButtonDown", bobberButtonDown);
			nbt.putDouble("fishingBuffer", fishingBuffer);
			nbt.putBoolean("firstfishlaunch", firstfishlaunch);
			nbt.putDouble("fishAbilityPos", fishAbilityPos);
			nbt.putDouble("fishAbilityTimer", fishAbilityTimer);
			nbt.putBoolean("firstabilitylaunch", firstabilitylaunch);
			nbt.putString("musicName", musicName);
			nbt.putDouble("musictimer", musictimer);
			nbt.putBoolean("musicplaying", musicplaying);
			nbt.putDouble("sanity", sanity);
			nbt.putString("zonename", zonename);
			nbt.putString("zonenamelingering", zonenamelingering);
			nbt.putDouble("newzonetime", newzonetime);
			nbt.putString("fishBiome", fishBiome);
			nbt.putBoolean("isInsane", isInsane);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			cursemode = nbt.getBoolean("cursemode");
			relic_inventory_core = ItemStack.of(nbt.getCompound("relic_inventory_core"));
			relic_inventory_familiar = ItemStack.of(nbt.getCompound("relic_inventory_familiar"));
			relic_inventory_bag = ItemStack.of(nbt.getCompound("relic_inventory_bag"));
			relic_inventory_blood = ItemStack.of(nbt.getCompound("relic_inventory_blood"));
			relic_inventory_artifact_1 = ItemStack.of(nbt.getCompound("relic_inventory_artifact_1"));
			relic_inventory_artifact_2 = ItemStack.of(nbt.getCompound("relic_inventory_artifact_2"));
			relic_inventory_relic_1 = ItemStack.of(nbt.getCompound("relic_inventory_relic_1"));
			relic_inventory_relic_2 = ItemStack.of(nbt.getCompound("relic_inventory_relic_2"));
			relic_inventory_relic_3 = ItemStack.of(nbt.getCompound("relic_inventory_relic_3"));
			relic_inventory_relic_4 = ItemStack.of(nbt.getCompound("relic_inventory_relic_4"));
			relic_inventory_relic_5 = ItemStack.of(nbt.getCompound("relic_inventory_relic_5"));
			relic_inventory_relic_6 = ItemStack.of(nbt.getCompound("relic_inventory_relic_6"));
			fire_essence = nbt.getDouble("fire_essence");
			water_essence = nbt.getDouble("water_essence");
			air_essence = nbt.getDouble("air_essence");
			earth_essence = nbt.getDouble("earth_essence");
			lightning_essence = nbt.getDouble("lightning_essence");
			void_essence = nbt.getDouble("void_essence");
			soul_essence = nbt.getDouble("soul_essence");
			light_essence = nbt.getDouble("light_essence");
			dark_essence = nbt.getDouble("dark_essence");
			time_NE_essence = nbt.getDouble("time_NE_essence");
			energy_essence = nbt.getDouble("energy_essence");
			force_essence = nbt.getDouble("force_essence");
			mind_essence = nbt.getDouble("mind_essence");
			infinity_essence = nbt.getDouble("infinity_essence");
			renderRelic1 = nbt.getBoolean("renderRelic1");
			relic_inventory_core_num = nbt.getDouble("relic_inventory_core_num");
			relic_inventory_familiar_num = nbt.getDouble("relic_inventory_familiar_num");
			relic_inventory_bag_num = nbt.getDouble("relic_inventory_bag_num");
			relic_inventory_blood_num = nbt.getDouble("relic_inventory_blood_num");
			relic_inventory_artifact_1_num = nbt.getDouble("relic_inventory_artifact_1_num");
			relic_inventory_artifact_2_num = nbt.getDouble("relic_inventory_artifact_2_num");
			relic_inventory_relic_1_num = nbt.getDouble("relic_inventory_relic_1_num");
			relic_inventory_relic_2_num = nbt.getDouble("relic_inventory_relic_2_num");
			relic_inventory_relic_3_num = nbt.getDouble("relic_inventory_relic_3_num");
			relic_inventory_relic_4_num = nbt.getDouble("relic_inventory_relic_4_num");
			relic_inventory_relic_5_num = nbt.getDouble("relic_inventory_relic_5_num");
			relic_inventory_relic_6_num = nbt.getDouble("relic_inventory_relic_6_num");
			bag_opened_from_relic_inventory = nbt.getBoolean("bag_opened_from_relic_inventory");
			has_spawned = nbt.getBoolean("has_spawned");
			fishingWait = nbt.getDouble("fishingWait");
			chosenFish = nbt.getString("chosenFish");
			fishingEratic = nbt.getDouble("fishingEratic");
			fishSpeed = nbt.getDouble("fishSpeed");
			bobberSpeed = nbt.getDouble("bobberSpeed");
			fishPos = nbt.getDouble("fishPos");
			bobberPos = nbt.getDouble("bobberPos");
			bobberAbility = nbt.getBoolean("bobberAbility");
			reelingTimer = nbt.getDouble("reelingTimer");
			bobberReeling = nbt.getBoolean("bobberReeling");
			bobberStun = nbt.getBoolean("bobberStun");
			bobberStunTimer = nbt.getDouble("bobberStunTimer");
			bobberButtonDown = nbt.getBoolean("bobberButtonDown");
			fishingBuffer = nbt.getDouble("fishingBuffer");
			firstfishlaunch = nbt.getBoolean("firstfishlaunch");
			fishAbilityPos = nbt.getDouble("fishAbilityPos");
			fishAbilityTimer = nbt.getDouble("fishAbilityTimer");
			firstabilitylaunch = nbt.getBoolean("firstabilitylaunch");
			musicName = nbt.getString("musicName");
			musictimer = nbt.getDouble("musictimer");
			musicplaying = nbt.getBoolean("musicplaying");
			sanity = nbt.getDouble("sanity");
			zonename = nbt.getString("zonename");
			zonenamelingering = nbt.getString("zonenamelingering");
			newzonetime = nbt.getDouble("newzonetime");
			fishBiome = nbt.getString("fishBiome");
			isInsane = nbt.getBoolean("isInsane");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PlayerVariables()));
					variables.cursemode = message.data.cursemode;
					variables.relic_inventory_core = message.data.relic_inventory_core;
					variables.relic_inventory_familiar = message.data.relic_inventory_familiar;
					variables.relic_inventory_bag = message.data.relic_inventory_bag;
					variables.relic_inventory_blood = message.data.relic_inventory_blood;
					variables.relic_inventory_artifact_1 = message.data.relic_inventory_artifact_1;
					variables.relic_inventory_artifact_2 = message.data.relic_inventory_artifact_2;
					variables.relic_inventory_relic_1 = message.data.relic_inventory_relic_1;
					variables.relic_inventory_relic_2 = message.data.relic_inventory_relic_2;
					variables.relic_inventory_relic_3 = message.data.relic_inventory_relic_3;
					variables.relic_inventory_relic_4 = message.data.relic_inventory_relic_4;
					variables.relic_inventory_relic_5 = message.data.relic_inventory_relic_5;
					variables.relic_inventory_relic_6 = message.data.relic_inventory_relic_6;
					variables.fire_essence = message.data.fire_essence;
					variables.water_essence = message.data.water_essence;
					variables.air_essence = message.data.air_essence;
					variables.earth_essence = message.data.earth_essence;
					variables.lightning_essence = message.data.lightning_essence;
					variables.void_essence = message.data.void_essence;
					variables.soul_essence = message.data.soul_essence;
					variables.light_essence = message.data.light_essence;
					variables.dark_essence = message.data.dark_essence;
					variables.time_NE_essence = message.data.time_NE_essence;
					variables.energy_essence = message.data.energy_essence;
					variables.force_essence = message.data.force_essence;
					variables.mind_essence = message.data.mind_essence;
					variables.infinity_essence = message.data.infinity_essence;
					variables.renderRelic1 = message.data.renderRelic1;
					variables.relic_inventory_core_num = message.data.relic_inventory_core_num;
					variables.relic_inventory_familiar_num = message.data.relic_inventory_familiar_num;
					variables.relic_inventory_bag_num = message.data.relic_inventory_bag_num;
					variables.relic_inventory_blood_num = message.data.relic_inventory_blood_num;
					variables.relic_inventory_artifact_1_num = message.data.relic_inventory_artifact_1_num;
					variables.relic_inventory_artifact_2_num = message.data.relic_inventory_artifact_2_num;
					variables.relic_inventory_relic_1_num = message.data.relic_inventory_relic_1_num;
					variables.relic_inventory_relic_2_num = message.data.relic_inventory_relic_2_num;
					variables.relic_inventory_relic_3_num = message.data.relic_inventory_relic_3_num;
					variables.relic_inventory_relic_4_num = message.data.relic_inventory_relic_4_num;
					variables.relic_inventory_relic_5_num = message.data.relic_inventory_relic_5_num;
					variables.relic_inventory_relic_6_num = message.data.relic_inventory_relic_6_num;
					variables.bag_opened_from_relic_inventory = message.data.bag_opened_from_relic_inventory;
					variables.has_spawned = message.data.has_spawned;
					variables.fishingWait = message.data.fishingWait;
					variables.chosenFish = message.data.chosenFish;
					variables.fishingEratic = message.data.fishingEratic;
					variables.fishSpeed = message.data.fishSpeed;
					variables.bobberSpeed = message.data.bobberSpeed;
					variables.fishPos = message.data.fishPos;
					variables.bobberPos = message.data.bobberPos;
					variables.bobberAbility = message.data.bobberAbility;
					variables.reelingTimer = message.data.reelingTimer;
					variables.bobberReeling = message.data.bobberReeling;
					variables.bobberStun = message.data.bobberStun;
					variables.bobberStunTimer = message.data.bobberStunTimer;
					variables.bobberButtonDown = message.data.bobberButtonDown;
					variables.fishingBuffer = message.data.fishingBuffer;
					variables.firstfishlaunch = message.data.firstfishlaunch;
					variables.fishAbilityPos = message.data.fishAbilityPos;
					variables.fishAbilityTimer = message.data.fishAbilityTimer;
					variables.firstabilitylaunch = message.data.firstabilitylaunch;
					variables.musicName = message.data.musicName;
					variables.musictimer = message.data.musictimer;
					variables.musicplaying = message.data.musicplaying;
					variables.sanity = message.data.sanity;
					variables.zonename = message.data.zonename;
					variables.zonenamelingering = message.data.zonenamelingering;
					variables.newzonetime = message.data.newzonetime;
					variables.fishBiome = message.data.fishBiome;
					variables.isInsane = message.data.isInsane;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
