package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.elementure.init.ElementureModBlocks;

public class IvorytowerGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager()
					.getOrCreate(new ResourceLocation("elementure", "windyshores_ivorytower_1"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x - 6, y - 32, z - 6), new BlockPos(x - 6, y - 32, z - 6),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager()
					.getOrCreate(new ResourceLocation("elementure", "windyshores_ivorytower_2"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x - 6, y, z - 6), new BlockPos(x - 6, y, z - 6),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
		world.setBlock(new BlockPos(x, y + 28, z), ElementureModBlocks.IVORYSPAWNER.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 23, z), ElementureModBlocks.IVORYSPAWNER.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 18, z), ElementureModBlocks.IVORYSPAWNER.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 13, z), ElementureModBlocks.IVORYSPAWNER.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 8, z), ElementureModBlocks.IVORYSPAWNER.get().defaultBlockState(), 3);
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 6), z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
							_level.getServer(), null).withSuppressedOutput(),
					"setblock ~ ~ ~ minecraft:chest{LootTable:\"elementure:chests/ivorytower_loot\"}");
	}
}
