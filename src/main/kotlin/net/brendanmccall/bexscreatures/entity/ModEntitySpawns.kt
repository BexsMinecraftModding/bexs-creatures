package net.brendanmccall.bexscreatures.entity

import net.brendanmccall.bexscreatures.BexsCreatures
import net.brendanmccall.bexscreatures.entity.custom.DeerEntity
import net.fabricmc.fabric.api.biome.v1.BiomeModifications
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors
import net.minecraft.entity.SpawnGroup
import net.minecraft.entity.SpawnLocationTypes
import net.minecraft.entity.SpawnRestriction
import net.minecraft.world.Heightmap
import net.minecraft.world.biome.BiomeKeys

object ModEntitySpawns {

    fun registerModEntitySpawns() {
        BexsCreatures.logger.info("Registering mod entity spawns for ${BexsCreatures.modId}")

        registerDeerSpawns()
    }

    fun registerDeerSpawns() {
        SpawnRestriction.register(
            ModEntities.deer,
            SpawnLocationTypes.ON_GROUND,
            Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
            DeerEntity::canSpawn
        )

        BiomeModifications.addSpawn(
            BiomeSelectors.includeByKey(
                BiomeKeys.MEADOW, BiomeKeys.GROVE, BiomeKeys.SNOWY_SLOPES, BiomeKeys.WINDSWEPT_HILLS,
                BiomeKeys.WINDSWEPT_GRAVELLY_HILLS, BiomeKeys.WINDSWEPT_FOREST, BiomeKeys.FOREST,
                BiomeKeys.FLOWER_FOREST, BiomeKeys.TAIGA, BiomeKeys.OLD_GROWTH_PINE_TAIGA,
                BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA, BiomeKeys.SNOWY_TAIGA, BiomeKeys.BIRCH_FOREST,
                BiomeKeys.OLD_GROWTH_BIRCH_FOREST, BiomeKeys.DARK_FOREST, BiomeKeys.JUNGLE, BiomeKeys.SPARSE_JUNGLE,
                BiomeKeys.BAMBOO_JUNGLE, BiomeKeys.PLAINS, BiomeKeys.SUNFLOWER_PLAINS, BiomeKeys.SNOWY_PLAINS,
                BiomeKeys.SAVANNA, BiomeKeys.SAVANNA_PLATEAU, BiomeKeys.WINDSWEPT_SAVANNA, BiomeKeys.WOODED_BADLANDS),
            SpawnGroup.CREATURE,
            ModEntities.deer,
            12, // Spawn weight (higher = more frequent)
            4,  // Minimum group size
            4   // Maximum group size
        )
    }
}
