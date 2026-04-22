package net.brendanmccall.bexscreatures.entity

import net.brendanmccall.bexscreatures.BexsCreatures

object ModEntitySpawns {

    fun registerEntitySpawns() {
        BexsCreatures.logger.info("Registering mod entity spawns for ${BexsCreatures.modId}")

        //registerDeerSpawns
    }

    /*object registerDeerSpawns {
        fun registerDeerSpawn(){
            SpawnRestriction.register(
                ModEntities.deer,
                SpawnLocationTypes.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
                DeerEntity::canSpawn
            )

            BiomeModifications.addSpawn(
                BiomeSelectors.includeByKey(BiomeKeys.FOREST, BiomeKeys.DARK_FOREST, BiomeKeys.BIRCH_FOREST),
                SpawnGroup.CREATURE,
                ModEntities.deer,
                10,
                1,
                3
            )
        }
    }*/
}
