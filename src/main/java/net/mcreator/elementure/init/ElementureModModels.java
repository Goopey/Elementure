
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementure.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.elementure.client.model.Modelzehandprojectile;
import net.mcreator.elementure.client.model.Modelxp_vest;
import net.mcreator.elementure.client.model.Modelwindyshorescloud;
import net.mcreator.elementure.client.model.Modelweaklightningandesiteelemental;
import net.mcreator.elementure.client.model.Modelweakdioriteelemental;
import net.mcreator.elementure.client.model.Modelwaterbullet;
import net.mcreator.elementure.client.model.Modelwaterblastskillprojectile;
import net.mcreator.elementure.client.model.Modelvengefulspiritskillblast;
import net.mcreator.elementure.client.model.Modelumbrasyl_segment;
import net.mcreator.elementure.client.model.Modelumbrasyl;
import net.mcreator.elementure.client.model.Modeltwistedspearrings;
import net.mcreator.elementure.client.model.Modeltwisted_knight;
import net.mcreator.elementure.client.model.Modeltinyclayman;
import net.mcreator.elementure.client.model.Modelthe_nine;
import net.mcreator.elementure.client.model.Modeltarworm_link;
import net.mcreator.elementure.client.model.Modeltarworm;
import net.mcreator.elementure.client.model.Modeltar_umbra;
import net.mcreator.elementure.client.model.Modeltar_spirit;
import net.mcreator.elementure.client.model.Modeltall_kassem;
import net.mcreator.elementure.client.model.Modelsword_temple_armor;
import net.mcreator.elementure.client.model.Modelsunlight_egg;
import net.mcreator.elementure.client.model.Modelstoneprojectileearthflask;
import net.mcreator.elementure.client.model.Modelstone_pellet;
import net.mcreator.elementure.client.model.Modelstatue_wraith;
import net.mcreator.elementure.client.model.Modelstatue_protector;
import net.mcreator.elementure.client.model.Modelstaticsprite;
import net.mcreator.elementure.client.model.Modelstarryvillagersmith;
import net.mcreator.elementure.client.model.Modelstarryvillagergatherer;
import net.mcreator.elementure.client.model.Modelstarryvillagerfighter;
import net.mcreator.elementure.client.model.Modelstarryvillager;
import net.mcreator.elementure.client.model.Modelstarguardian;
import net.mcreator.elementure.client.model.Modelspirit;
import net.mcreator.elementure.client.model.Modelspiderling;
import net.mcreator.elementure.client.model.ModelspiderMatriarch;
import net.mcreator.elementure.client.model.Modelspectre_knight;
import net.mcreator.elementure.client.model.Modelsoul_skull_familiar;
import net.mcreator.elementure.client.model.Modelsoul_obleck;
import net.mcreator.elementure.client.model.Modelsny;
import net.mcreator.elementure.client.model.Modelsmallgraniteelemental;
import net.mcreator.elementure.client.model.ModelslumberingSoldier;
import net.mcreator.elementure.client.model.ModelskeletalHost;
import net.mcreator.elementure.client.model.ModelskeletalHeadHost;
import net.mcreator.elementure.client.model.Modelsirenqueen;
import net.mcreator.elementure.client.model.Modelsirenling;
import net.mcreator.elementure.client.model.Modelshurifang;
import net.mcreator.elementure.client.model.Modelshattered_obsidian_charger;
import net.mcreator.elementure.client.model.Modelshadow_candle;
import net.mcreator.elementure.client.model.Modelscrap_guardian_small;
import net.mcreator.elementure.client.model.Modelscrap_guardian;
import net.mcreator.elementure.client.model.Modelruingranitelemental;
import net.mcreator.elementure.client.model.ModelrocketWormBody;
import net.mcreator.elementure.client.model.ModelrimeBoid;
import net.mcreator.elementure.client.model.Modelpumpkin_mimic;
import net.mcreator.elementure.client.model.Modelpowerstrikeskillprojectile;
import net.mcreator.elementure.client.model.Modelperineal_botfly;
import net.mcreator.elementure.client.model.Modelpapys_crown;
import net.mcreator.elementure.client.model.Modelostrachainlink;
import net.mcreator.elementure.client.model.Modelostrachain;
import net.mcreator.elementure.client.model.Modeloctolank;
import net.mcreator.elementure.client.model.Modeloceansgraceprojectile;
import net.mcreator.elementure.client.model.Modelobleck_turret;
import net.mcreator.elementure.client.model.Modelobleck_minion;
import net.mcreator.elementure.client.model.Modelobleck_lord_eldritch;
import net.mcreator.elementure.client.model.Modelobleck_lord;
import net.mcreator.elementure.client.model.Modelobleck_cleric;
import net.mcreator.elementure.client.model.Modelobleck;
import net.mcreator.elementure.client.model.ModelnightmareSpike;
import net.mcreator.elementure.client.model.ModelnightmareMass;
import net.mcreator.elementure.client.model.ModelnightmareArbalest;
import net.mcreator.elementure.client.model.Modelnetherum_titan;
import net.mcreator.elementure.client.model.Modelnetherum_leaper;
import net.mcreator.elementure.client.model.Modelnether_quartz_charger;
import net.mcreator.elementure.client.model.Modelmycenan_monocle;
import net.mcreator.elementure.client.model.Modelmycena_truffloon;
import net.mcreator.elementure.client.model.Modelmycena_truffling;
import net.mcreator.elementure.client.model.Modelmycena_sporeling;
import net.mcreator.elementure.client.model.Modelmycena_shroomlord;
import net.mcreator.elementure.client.model.Modelmycena_shroomling;
import net.mcreator.elementure.client.model.Modelmycena_shroomal;
import net.mcreator.elementure.client.model.Modelmycena_shroom_villager_priest;
import net.mcreator.elementure.client.model.Modelmycena_shroom_villager_nitwit;
import net.mcreator.elementure.client.model.Modelmycena_shroom_villager_librarian;
import net.mcreator.elementure.client.model.Modelmycena_shroom_villager_leatherworker;
import net.mcreator.elementure.client.model.Modelmycena_shroom_villager_fisherman;
import net.mcreator.elementure.client.model.Modelmycena_shroom_villager_farmer;
import net.mcreator.elementure.client.model.Modelmycena_shroom_villager_elder;
import net.mcreator.elementure.client.model.Modelmycena_shroom_villager_blacksmith;
import net.mcreator.elementure.client.model.Modelmycena_shroom_infected_guard;
import net.mcreator.elementure.client.model.Modelmycena_shroom_guard;
import net.mcreator.elementure.client.model.Modelmycena_roamer;
import net.mcreator.elementure.client.model.Modelmycena_fumoon_sporeling;
import net.mcreator.elementure.client.model.Modelmycena_fumoon_spore;
import net.mcreator.elementure.client.model.Modelmycena_fumoon_shroomlord;
import net.mcreator.elementure.client.model.Modelmycena_fumoon_shroomling;
import net.mcreator.elementure.client.model.Modelmycena_fumoon;
import net.mcreator.elementure.client.model.Modelmotherorb;
import net.mcreator.elementure.client.model.Modelminoskull_flail;
import net.mcreator.elementure.client.model.Modelminoskull;
import net.mcreator.elementure.client.model.Modelmind_obleck;
import net.mcreator.elementure.client.model.Modellousy_sword;
import net.mcreator.elementure.client.model.Modellightningblastskillprojectile;
import net.mcreator.elementure.client.model.Modellightningandesiteknight;
import net.mcreator.elementure.client.model.Modellargejellyfloat;
import net.mcreator.elementure.client.model.Modellarge_crystal_hopper;
import net.mcreator.elementure.client.model.Modelkings_knight;
import net.mcreator.elementure.client.model.Modelkassemcrown;
import net.mcreator.elementure.client.model.Modelkassem_cloak;
import net.mcreator.elementure.client.model.Modelkassem;
import net.mcreator.elementure.client.model.Modeljellyfloat;
import net.mcreator.elementure.client.model.Modelivory_shade;
import net.mcreator.elementure.client.model.Modelironknighthelmet;
import net.mcreator.elementure.client.model.Modelironknight;
import net.mcreator.elementure.client.model.Modelinfinityblastskillprojectile;
import net.mcreator.elementure.client.model.Modelhidden_runes_familiar;
import net.mcreator.elementure.client.model.Modelheat_seeker;
import net.mcreator.elementure.client.model.ModelheadlessDiscardedSkeleton;
import net.mcreator.elementure.client.model.ModelheadHost;
import net.mcreator.elementure.client.model.Modelharpoon_bullet;
import net.mcreator.elementure.client.model.Modelgreedy_knight;
import net.mcreator.elementure.client.model.Modelgnoblin;
import net.mcreator.elementure.client.model.Modelglassbellboat;
import net.mcreator.elementure.client.model.Modelghost_warrior;
import net.mcreator.elementure.client.model.Modelforgotten_watcher_2;
import net.mcreator.elementure.client.model.Modelforgotten_watcher_1;
import net.mcreator.elementure.client.model.Modelforce_obleck;
import net.mcreator.elementure.client.model.Modelfoamfish;
import net.mcreator.elementure.client.model.Modelfluff_whale;
import net.mcreator.elementure.client.model.Modelfirebolt;
import net.mcreator.elementure.client.model.Modelfireblastskillprojectile;
import net.mcreator.elementure.client.model.Modelfang_bomb;
import net.mcreator.elementure.client.model.Modelenergyblastskillprojectile;
import net.mcreator.elementure.client.model.Modelempty;
import net.mcreator.elementure.client.model.ModelechoFruit;
import net.mcreator.elementure.client.model.Modelearthblast;
import net.mcreator.elementure.client.model.Modeldragonite_leggings_scalemail;
import net.mcreator.elementure.client.model.Modeldragonite_helmet_scalemail;
import net.mcreator.elementure.client.model.Modeldragonite_chest_scalemail;
import net.mcreator.elementure.client.model.Modeldragonite_boots_scalemail;
import net.mcreator.elementure.client.model.Modeldragonite;
import net.mcreator.elementure.client.model.Modeldragonewt;
import net.mcreator.elementure.client.model.Modeldizmite;
import net.mcreator.elementure.client.model.ModeldiscardedSkeleton;
import net.mcreator.elementure.client.model.Modeldioriteelemental;
import net.mcreator.elementure.client.model.Modeldeaths_witness;
import net.mcreator.elementure.client.model.Modeldarklurker;
import net.mcreator.elementure.client.model.Modelcustom_bobber;
import net.mcreator.elementure.client.model.Modelcthulhupet;
import net.mcreator.elementure.client.model.Modelcrystal_hopper;
import net.mcreator.elementure.client.model.Modelcrystal_creeper;
import net.mcreator.elementure.client.model.Modelcruel_knight;
import net.mcreator.elementure.client.model.Modelcosmic_slime;
import net.mcreator.elementure.client.model.Modelcoal_puck;
import net.mcreator.elementure.client.model.Modelchromaticwheel;
import net.mcreator.elementure.client.model.Modelcaustic_vial;
import net.mcreator.elementure.client.model.Modelcaustic_knight;
import net.mcreator.elementure.client.model.Modelcandle_knight;
import net.mcreator.elementure.client.model.Modelbuzy_bee;
import net.mcreator.elementure.client.model.Modelbutterfly_bud;
import net.mcreator.elementure.client.model.Modelbubble_o_blue;
import net.mcreator.elementure.client.model.Modelbubble;
import net.mcreator.elementure.client.model.Modelbright_candle;
import net.mcreator.elementure.client.model.Modelbluejelly;
import net.mcreator.elementure.client.model.Modelblue_blaze;
import net.mcreator.elementure.client.model.Modelblackstone_grimace;
import net.mcreator.elementure.client.model.Modelbigligniteelemental;
import net.mcreator.elementure.client.model.Modelbiggraniteelemental;
import net.mcreator.elementure.client.model.Modelbigdioriteelemental;
import net.mcreator.elementure.client.model.Modelbig_kassem;
import net.mcreator.elementure.client.model.Modelascended_aspid;
import net.mcreator.elementure.client.model.Modelarmored_turtle;
import net.mcreator.elementure.client.model.Modelarchkassemcrown;
import net.mcreator.elementure.client.model.Modelarchkassem_cloak;
import net.mcreator.elementure.client.model.Modelarch_kassem;
import net.mcreator.elementure.client.model.Modelarachneel;
import net.mcreator.elementure.client.model.Modelairblastskill;
import net.mcreator.elementure.client.model.ModelBaby_Ghast;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ElementureModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelfirebolt.LAYER_LOCATION, Modelfirebolt::createBodyLayer);
		event.registerLayerDefinition(Modellargejellyfloat.LAYER_LOCATION, Modellargejellyfloat::createBodyLayer);
		event.registerLayerDefinition(Modelminoskull.LAYER_LOCATION, Modelminoskull::createBodyLayer);
		event.registerLayerDefinition(Modelstarryvillager.LAYER_LOCATION, Modelstarryvillager::createBodyLayer);
		event.registerLayerDefinition(Modelinfinityblastskillprojectile.LAYER_LOCATION, Modelinfinityblastskillprojectile::createBodyLayer);
		event.registerLayerDefinition(Modelobleck_lord_eldritch.LAYER_LOCATION, Modelobleck_lord_eldritch::createBodyLayer);
		event.registerLayerDefinition(ModelheadlessDiscardedSkeleton.LAYER_LOCATION, ModelheadlessDiscardedSkeleton::createBodyLayer);
		event.registerLayerDefinition(Modeldragonite_boots_scalemail.LAYER_LOCATION, Modeldragonite_boots_scalemail::createBodyLayer);
		event.registerLayerDefinition(Modelmycena_fumoon_spore.LAYER_LOCATION, Modelmycena_fumoon_spore::createBodyLayer);
		event.registerLayerDefinition(Modelmind_obleck.LAYER_LOCATION, Modelmind_obleck::createBodyLayer);
		event.registerLayerDefinition(Modelcoal_puck.LAYER_LOCATION, Modelcoal_puck::createBodyLayer);
		event.registerLayerDefinition(Modelmycena_shroom_villager_fisherman.LAYER_LOCATION, Modelmycena_shroom_villager_fisherman::createBodyLayer);
		event.registerLayerDefinition(Modelstatue_protector.LAYER_LOCATION, Modelstatue_protector::createBodyLayer);
		event.registerLayerDefinition(Modelumbrasyl_segment.LAYER_LOCATION, Modelumbrasyl_segment::createBodyLayer);
		event.registerLayerDefinition(Modeltar_spirit.LAYER_LOCATION, Modeltar_spirit::createBodyLayer);
		event.registerLayerDefinition(Modelmycena_fumoon_shroomling.LAYER_LOCATION, Modelmycena_fumoon_shroomling::createBodyLayer);
		event.registerLayerDefinition(Modelmycena_shroom_villager_librarian.LAYER_LOCATION, Modelmycena_shroom_villager_librarian::createBodyLayer);
		event.registerLayerDefinition(Modelkings_knight.LAYER_LOCATION, Modelkings_knight::createBodyLayer);
		event.registerLayerDefinition(Modelcthulhupet.LAYER_LOCATION, Modelcthulhupet::createBodyLayer);
		event.registerLayerDefinition(Modelspirit.LAYER_LOCATION, Modelspirit::createBodyLayer);
		event.registerLayerDefinition(Modelmycena_fumoon.LAYER_LOCATION, Modelmycena_fumoon::createBodyLayer);
		event.registerLayerDefinition(Modelstarguardian.LAYER_LOCATION, Modelstarguardian::createBodyLayer);
		event.registerLayerDefinition(Modelmycena_shroom_villager_blacksmith.LAYER_LOCATION, Modelmycena_shroom_villager_blacksmith::createBodyLayer);
		event.registerLayerDefinition(Modelfoamfish.LAYER_LOCATION, Modelfoamfish::createBodyLayer);
		event.registerLayerDefinition(Modelkassem_cloak.LAYER_LOCATION, Modelkassem_cloak::createBodyLayer);
		event.registerLayerDefinition(Modelmycena_shroom_villager_farmer.LAYER_LOCATION, Modelmycena_shroom_villager_farmer::createBodyLayer);
		event.registerLayerDefinition(Modelarachneel.LAYER_LOCATION, Modelarachneel::createBodyLayer);
		event.registerLayerDefinition(Modelweaklightningandesiteelemental.LAYER_LOCATION, Modelweaklightningandesiteelemental::createBodyLayer);
		event.registerLayerDefinition(Modelxp_vest.LAYER_LOCATION, Modelxp_vest::createBodyLayer);
		event.registerLayerDefinition(Modelthe_nine.LAYER_LOCATION, Modelthe_nine::createBodyLayer);
		event.registerLayerDefinition(ModelslumberingSoldier.LAYER_LOCATION, ModelslumberingSoldier::createBodyLayer);
		event.registerLayerDefinition(Modelmycena_shroomlord.LAYER_LOCATION, Modelmycena_shroomlord::createBodyLayer);
		event.registerLayerDefinition(Modelobleck.LAYER_LOCATION, Modelobleck::createBodyLayer);
		event.registerLayerDefinition(Modelnether_quartz_charger.LAYER_LOCATION, Modelnether_quartz_charger::createBodyLayer);
		event.registerLayerDefinition(Modelharpoon_bullet.LAYER_LOCATION, Modelharpoon_bullet::createBodyLayer);
		event.registerLayerDefinition(ModelskeletalHeadHost.LAYER_LOCATION, ModelskeletalHeadHost::createBodyLayer);
		event.registerLayerDefinition(Modelstarryvillagersmith.LAYER_LOCATION, Modelstarryvillagersmith::createBodyLayer);
		event.registerLayerDefinition(Modelstatue_wraith.LAYER_LOCATION, Modelstatue_wraith::createBodyLayer);
		event.registerLayerDefinition(Modelempty.LAYER_LOCATION, Modelempty::createBodyLayer);
		event.registerLayerDefinition(Modelarch_kassem.LAYER_LOCATION, Modelarch_kassem::createBodyLayer);
		event.registerLayerDefinition(Modellightningandesiteknight.LAYER_LOCATION, Modellightningandesiteknight::createBodyLayer);
		event.registerLayerDefinition(Modelmycena_fumoon_shroomlord.LAYER_LOCATION, Modelmycena_fumoon_shroomlord::createBodyLayer);
		event.registerLayerDefinition(Modelsword_temple_armor.LAYER_LOCATION, Modelsword_temple_armor::createBodyLayer);
		event.registerLayerDefinition(Modelarchkassem_cloak.LAYER_LOCATION, Modelarchkassem_cloak::createBodyLayer);
		event.registerLayerDefinition(Modelobleck_cleric.LAYER_LOCATION, Modelobleck_cleric::createBodyLayer);
		event.registerLayerDefinition(Modelmycena_shroom_villager_leatherworker.LAYER_LOCATION,
				Modelmycena_shroom_villager_leatherworker::createBodyLayer);
		event.registerLayerDefinition(Modeltinyclayman.LAYER_LOCATION, Modeltinyclayman::createBodyLayer);
		event.registerLayerDefinition(ModelechoFruit.LAYER_LOCATION, ModelechoFruit::createBodyLayer);
		event.registerLayerDefinition(Modelforgotten_watcher_2.LAYER_LOCATION, Modelforgotten_watcher_2::createBodyLayer);
		event.registerLayerDefinition(Modelstone_pellet.LAYER_LOCATION, Modelstone_pellet::createBodyLayer);
		event.registerLayerDefinition(Modelwaterbullet.LAYER_LOCATION, Modelwaterbullet::createBodyLayer);
		event.registerLayerDefinition(Modelblue_blaze.LAYER_LOCATION, Modelblue_blaze::createBodyLayer);
		event.registerLayerDefinition(Modelblackstone_grimace.LAYER_LOCATION, Modelblackstone_grimace::createBodyLayer);
		event.registerLayerDefinition(Modelruingranitelemental.LAYER_LOCATION, Modelruingranitelemental::createBodyLayer);
		event.registerLayerDefinition(Modelwindyshorescloud.LAYER_LOCATION, Modelwindyshorescloud::createBodyLayer);
		event.registerLayerDefinition(Modelbubble_o_blue.LAYER_LOCATION, Modelbubble_o_blue::createBodyLayer);
		event.registerLayerDefinition(Modelstoneprojectileearthflask.LAYER_LOCATION, Modelstoneprojectileearthflask::createBodyLayer);
		event.registerLayerDefinition(Modelmycena_sporeling.LAYER_LOCATION, Modelmycena_sporeling::createBodyLayer);
		event.registerLayerDefinition(ModelnightmareSpike.LAYER_LOCATION, ModelnightmareSpike::createBodyLayer);
		event.registerLayerDefinition(Modelearthblast.LAYER_LOCATION, Modelearthblast::createBodyLayer);
		event.registerLayerDefinition(Modelgreedy_knight.LAYER_LOCATION, Modelgreedy_knight::createBodyLayer);
		event.registerLayerDefinition(Modelenergyblastskillprojectile.LAYER_LOCATION, Modelenergyblastskillprojectile::createBodyLayer);
		event.registerLayerDefinition(Modelstaticsprite.LAYER_LOCATION, Modelstaticsprite::createBodyLayer);
		event.registerLayerDefinition(Modelsunlight_egg.LAYER_LOCATION, Modelsunlight_egg::createBodyLayer);
		event.registerLayerDefinition(Modeltarworm_link.LAYER_LOCATION, Modeltarworm_link::createBodyLayer);
		event.registerLayerDefinition(Modelspiderling.LAYER_LOCATION, Modelspiderling::createBodyLayer);
		event.registerLayerDefinition(Modeldizmite.LAYER_LOCATION, Modeldizmite::createBodyLayer);
		event.registerLayerDefinition(Modelbubble.LAYER_LOCATION, Modelbubble::createBodyLayer);
		event.registerLayerDefinition(Modeloctolank.LAYER_LOCATION, Modeloctolank::createBodyLayer);
		event.registerLayerDefinition(ModelheadHost.LAYER_LOCATION, ModelheadHost::createBodyLayer);
		event.registerLayerDefinition(Modelmotherorb.LAYER_LOCATION, Modelmotherorb::createBodyLayer);
		event.registerLayerDefinition(Modelsoul_obleck.LAYER_LOCATION, Modelsoul_obleck::createBodyLayer);
		event.registerLayerDefinition(Modeldarklurker.LAYER_LOCATION, Modeldarklurker::createBodyLayer);
		event.registerLayerDefinition(ModelnightmareMass.LAYER_LOCATION, ModelnightmareMass::createBodyLayer);
		event.registerLayerDefinition(Modelpowerstrikeskillprojectile.LAYER_LOCATION, Modelpowerstrikeskillprojectile::createBodyLayer);
		event.registerLayerDefinition(Modelostrachain.LAYER_LOCATION, Modelostrachain::createBodyLayer);
		event.registerLayerDefinition(Modelcrystal_creeper.LAYER_LOCATION, Modelcrystal_creeper::createBodyLayer);
		event.registerLayerDefinition(Modelbigligniteelemental.LAYER_LOCATION, Modelbigligniteelemental::createBodyLayer);
		event.registerLayerDefinition(Modelmycenan_monocle.LAYER_LOCATION, Modelmycenan_monocle::createBodyLayer);
		event.registerLayerDefinition(Modelforgotten_watcher_1.LAYER_LOCATION, Modelforgotten_watcher_1::createBodyLayer);
		event.registerLayerDefinition(Modelsoul_skull_familiar.LAYER_LOCATION, Modelsoul_skull_familiar::createBodyLayer);
		event.registerLayerDefinition(Modelsirenqueen.LAYER_LOCATION, Modelsirenqueen::createBodyLayer);
		event.registerLayerDefinition(Modelnetherum_titan.LAYER_LOCATION, Modelnetherum_titan::createBodyLayer);
		event.registerLayerDefinition(Modelshurifang.LAYER_LOCATION, Modelshurifang::createBodyLayer);
		event.registerLayerDefinition(Modelcandle_knight.LAYER_LOCATION, Modelcandle_knight::createBodyLayer);
		event.registerLayerDefinition(Modelascended_aspid.LAYER_LOCATION, Modelascended_aspid::createBodyLayer);
		event.registerLayerDefinition(ModelnightmareArbalest.LAYER_LOCATION, ModelnightmareArbalest::createBodyLayer);
		event.registerLayerDefinition(ModelrocketWormBody.LAYER_LOCATION, ModelrocketWormBody::createBodyLayer);
		event.registerLayerDefinition(Modelscrap_guardian_small.LAYER_LOCATION, Modelscrap_guardian_small::createBodyLayer);
		event.registerLayerDefinition(Modeltar_umbra.LAYER_LOCATION, Modeltar_umbra::createBodyLayer);
		event.registerLayerDefinition(Modelostrachainlink.LAYER_LOCATION, Modelostrachainlink::createBodyLayer);
		event.registerLayerDefinition(Modeltwistedspearrings.LAYER_LOCATION, Modeltwistedspearrings::createBodyLayer);
		event.registerLayerDefinition(Modeldragonite_leggings_scalemail.LAYER_LOCATION, Modeldragonite_leggings_scalemail::createBodyLayer);
		event.registerLayerDefinition(Modelbutterfly_bud.LAYER_LOCATION, Modelbutterfly_bud::createBodyLayer);
		event.registerLayerDefinition(Modelkassemcrown.LAYER_LOCATION, Modelkassemcrown::createBodyLayer);
		event.registerLayerDefinition(Modeldragonite.LAYER_LOCATION, Modeldragonite::createBodyLayer);
		event.registerLayerDefinition(Modelsny.LAYER_LOCATION, Modelsny::createBodyLayer);
		event.registerLayerDefinition(Modelairblastskill.LAYER_LOCATION, Modelairblastskill::createBodyLayer);
		event.registerLayerDefinition(Modelbiggraniteelemental.LAYER_LOCATION, Modelbiggraniteelemental::createBodyLayer);
		event.registerLayerDefinition(Modelmycena_shroom_villager_elder.LAYER_LOCATION, Modelmycena_shroom_villager_elder::createBodyLayer);
		event.registerLayerDefinition(Modelobleck_turret.LAYER_LOCATION, Modelobleck_turret::createBodyLayer);
		event.registerLayerDefinition(Modeldioriteelemental.LAYER_LOCATION, Modeldioriteelemental::createBodyLayer);
		event.registerLayerDefinition(Modelpapys_crown.LAYER_LOCATION, Modelpapys_crown::createBodyLayer);
		event.registerLayerDefinition(Modelchromaticwheel.LAYER_LOCATION, Modelchromaticwheel::createBodyLayer);
		event.registerLayerDefinition(Modeldeaths_witness.LAYER_LOCATION, Modeldeaths_witness::createBodyLayer);
		event.registerLayerDefinition(Modelmycena_fumoon_sporeling.LAYER_LOCATION, Modelmycena_fumoon_sporeling::createBodyLayer);
		event.registerLayerDefinition(Modelmycena_truffloon.LAYER_LOCATION, Modelmycena_truffloon::createBodyLayer);
		event.registerLayerDefinition(ModelBaby_Ghast.LAYER_LOCATION, ModelBaby_Ghast::createBodyLayer);
		event.registerLayerDefinition(Modelobleck_lord.LAYER_LOCATION, Modelobleck_lord::createBodyLayer);
		event.registerLayerDefinition(Modelshadow_candle.LAYER_LOCATION, Modelshadow_candle::createBodyLayer);
		event.registerLayerDefinition(Modelfang_bomb.LAYER_LOCATION, Modelfang_bomb::createBodyLayer);
		event.registerLayerDefinition(Modelscrap_guardian.LAYER_LOCATION, Modelscrap_guardian::createBodyLayer);
		event.registerLayerDefinition(Modelgnoblin.LAYER_LOCATION, Modelgnoblin::createBodyLayer);
		event.registerLayerDefinition(Modellousy_sword.LAYER_LOCATION, Modellousy_sword::createBodyLayer);
		event.registerLayerDefinition(Modelmycena_shroom_villager_nitwit.LAYER_LOCATION, Modelmycena_shroom_villager_nitwit::createBodyLayer);
		event.registerLayerDefinition(Modeljellyfloat.LAYER_LOCATION, Modeljellyfloat::createBodyLayer);
		event.registerLayerDefinition(ModelspiderMatriarch.LAYER_LOCATION, ModelspiderMatriarch::createBodyLayer);
		event.registerLayerDefinition(Modelfluff_whale.LAYER_LOCATION, Modelfluff_whale::createBodyLayer);
		event.registerLayerDefinition(Modelbright_candle.LAYER_LOCATION, Modelbright_candle::createBodyLayer);
		event.registerLayerDefinition(Modellightningblastskillprojectile.LAYER_LOCATION, Modellightningblastskillprojectile::createBodyLayer);
		event.registerLayerDefinition(Modeltall_kassem.LAYER_LOCATION, Modeltall_kassem::createBodyLayer);
		event.registerLayerDefinition(Modelironknighthelmet.LAYER_LOCATION, Modelironknighthelmet::createBodyLayer);
		event.registerLayerDefinition(Modelarmored_turtle.LAYER_LOCATION, Modelarmored_turtle::createBodyLayer);
		event.registerLayerDefinition(Modelcaustic_knight.LAYER_LOCATION, Modelcaustic_knight::createBodyLayer);
		event.registerLayerDefinition(Modelcosmic_slime.LAYER_LOCATION, Modelcosmic_slime::createBodyLayer);
		event.registerLayerDefinition(Modelmycena_shroom_infected_guard.LAYER_LOCATION, Modelmycena_shroom_infected_guard::createBodyLayer);
		event.registerLayerDefinition(Modelspectre_knight.LAYER_LOCATION, Modelspectre_knight::createBodyLayer);
		event.registerLayerDefinition(Modelstarryvillagergatherer.LAYER_LOCATION, Modelstarryvillagergatherer::createBodyLayer);
		event.registerLayerDefinition(Modelmycena_truffling.LAYER_LOCATION, Modelmycena_truffling::createBodyLayer);
		event.registerLayerDefinition(Modeltwisted_knight.LAYER_LOCATION, Modeltwisted_knight::createBodyLayer);
		event.registerLayerDefinition(Modelumbrasyl.LAYER_LOCATION, Modelumbrasyl::createBodyLayer);
		event.registerLayerDefinition(Modelmycena_roamer.LAYER_LOCATION, Modelmycena_roamer::createBodyLayer);
		event.registerLayerDefinition(Modellarge_crystal_hopper.LAYER_LOCATION, Modellarge_crystal_hopper::createBodyLayer);
		event.registerLayerDefinition(Modelfireblastskillprojectile.LAYER_LOCATION, Modelfireblastskillprojectile::createBodyLayer);
		event.registerLayerDefinition(Modelzehandprojectile.LAYER_LOCATION, Modelzehandprojectile::createBodyLayer);
		event.registerLayerDefinition(ModeldiscardedSkeleton.LAYER_LOCATION, ModeldiscardedSkeleton::createBodyLayer);
		event.registerLayerDefinition(Modelshattered_obsidian_charger.LAYER_LOCATION, Modelshattered_obsidian_charger::createBodyLayer);
		event.registerLayerDefinition(Modelforce_obleck.LAYER_LOCATION, Modelforce_obleck::createBodyLayer);
		event.registerLayerDefinition(Modelghost_warrior.LAYER_LOCATION, Modelghost_warrior::createBodyLayer);
		event.registerLayerDefinition(Modelcrystal_hopper.LAYER_LOCATION, Modelcrystal_hopper::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_bobber.LAYER_LOCATION, Modelcustom_bobber::createBodyLayer);
		event.registerLayerDefinition(Modelmycena_shroomling.LAYER_LOCATION, Modelmycena_shroomling::createBodyLayer);
		event.registerLayerDefinition(Modelwaterblastskillprojectile.LAYER_LOCATION, Modelwaterblastskillprojectile::createBodyLayer);
		event.registerLayerDefinition(Modelpumpkin_mimic.LAYER_LOCATION, Modelpumpkin_mimic::createBodyLayer);
		event.registerLayerDefinition(Modeldragonite_helmet_scalemail.LAYER_LOCATION, Modeldragonite_helmet_scalemail::createBodyLayer);
		event.registerLayerDefinition(Modelcruel_knight.LAYER_LOCATION, Modelcruel_knight::createBodyLayer);
		event.registerLayerDefinition(Modelbuzy_bee.LAYER_LOCATION, Modelbuzy_bee::createBodyLayer);
		event.registerLayerDefinition(ModelrimeBoid.LAYER_LOCATION, ModelrimeBoid::createBodyLayer);
		event.registerLayerDefinition(Modelsirenling.LAYER_LOCATION, Modelsirenling::createBodyLayer);
		event.registerLayerDefinition(Modeldragonewt.LAYER_LOCATION, Modeldragonewt::createBodyLayer);
		event.registerLayerDefinition(Modelmycena_shroom_guard.LAYER_LOCATION, Modelmycena_shroom_guard::createBodyLayer);
		event.registerLayerDefinition(Modelsmallgraniteelemental.LAYER_LOCATION, Modelsmallgraniteelemental::createBodyLayer);
		event.registerLayerDefinition(ModelskeletalHost.LAYER_LOCATION, ModelskeletalHost::createBodyLayer);
		event.registerLayerDefinition(Modelglassbellboat.LAYER_LOCATION, Modelglassbellboat::createBodyLayer);
		event.registerLayerDefinition(Modelbig_kassem.LAYER_LOCATION, Modelbig_kassem::createBodyLayer);
		event.registerLayerDefinition(Modelmycena_shroomal.LAYER_LOCATION, Modelmycena_shroomal::createBodyLayer);
		event.registerLayerDefinition(Modelkassem.LAYER_LOCATION, Modelkassem::createBodyLayer);
		event.registerLayerDefinition(Modelminoskull_flail.LAYER_LOCATION, Modelminoskull_flail::createBodyLayer);
		event.registerLayerDefinition(Modeltarworm.LAYER_LOCATION, Modeltarworm::createBodyLayer);
		event.registerLayerDefinition(Modelobleck_minion.LAYER_LOCATION, Modelobleck_minion::createBodyLayer);
		event.registerLayerDefinition(Modelheat_seeker.LAYER_LOCATION, Modelheat_seeker::createBodyLayer);
		event.registerLayerDefinition(Modelbluejelly.LAYER_LOCATION, Modelbluejelly::createBodyLayer);
		event.registerLayerDefinition(Modelperineal_botfly.LAYER_LOCATION, Modelperineal_botfly::createBodyLayer);
		event.registerLayerDefinition(Modeldragonite_chest_scalemail.LAYER_LOCATION, Modeldragonite_chest_scalemail::createBodyLayer);
		event.registerLayerDefinition(Modelstarryvillagerfighter.LAYER_LOCATION, Modelstarryvillagerfighter::createBodyLayer);
		event.registerLayerDefinition(Modelvengefulspiritskillblast.LAYER_LOCATION, Modelvengefulspiritskillblast::createBodyLayer);
		event.registerLayerDefinition(Modelhidden_runes_familiar.LAYER_LOCATION, Modelhidden_runes_familiar::createBodyLayer);
		event.registerLayerDefinition(Modelironknight.LAYER_LOCATION, Modelironknight::createBodyLayer);
		event.registerLayerDefinition(Modelnetherum_leaper.LAYER_LOCATION, Modelnetherum_leaper::createBodyLayer);
		event.registerLayerDefinition(Modelmycena_shroom_villager_priest.LAYER_LOCATION, Modelmycena_shroom_villager_priest::createBodyLayer);
		event.registerLayerDefinition(Modelivory_shade.LAYER_LOCATION, Modelivory_shade::createBodyLayer);
		event.registerLayerDefinition(Modeloceansgraceprojectile.LAYER_LOCATION, Modeloceansgraceprojectile::createBodyLayer);
		event.registerLayerDefinition(Modelweakdioriteelemental.LAYER_LOCATION, Modelweakdioriteelemental::createBodyLayer);
		event.registerLayerDefinition(Modelcaustic_vial.LAYER_LOCATION, Modelcaustic_vial::createBodyLayer);
		event.registerLayerDefinition(Modelarchkassemcrown.LAYER_LOCATION, Modelarchkassemcrown::createBodyLayer);
		event.registerLayerDefinition(Modelbigdioriteelemental.LAYER_LOCATION, Modelbigdioriteelemental::createBodyLayer);
	}
}
