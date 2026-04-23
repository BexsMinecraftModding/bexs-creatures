package net.brendanmccall.bexscreatures.entity

import net.brendanmccall.bexscreatures.BexsCreatures
import net.brendanmccall.bexscreatures.entity.custom.DeerEntity
import net.fabricmc.fabric.api.`object`.builder.v1.entity.FabricDefaultAttributeRegistry
import net.minecraft.entity.EntityType
import net.minecraft.entity.SpawnGroup
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ModEntities {

    fun registerModEntities() {
        BexsCreatures.LOGGER.info("Registering mod entities for ${BexsCreatures.MOD_ID}")

        FabricDefaultAttributeRegistry.register(DEER, DeerEntity.createDeerAttributes())
    }

    val DEER: EntityType<DeerEntity> = Registry.register(
        Registries.ENTITY_TYPE,
        Identifier.of(BexsCreatures.MOD_ID, "deer"),
        EntityType.Builder.create(::DeerEntity, SpawnGroup.CREATURE)
            .dimensions(0.8f, 2.0f).build())
}
