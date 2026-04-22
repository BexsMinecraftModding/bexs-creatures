package net.brendanmccall.bexscreatures.item

import net.brendanmccall.bexscreatures.BexsCreatures
import net.brendanmccall.bexscreatures.entity.ModEntities
import net.minecraft.item.Item
import net.minecraft.item.SpawnEggItem
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ModItems {

    fun registerModItems() {
        BexsCreatures.logger.info("Registering mod items for ${BexsCreatures.modId}")
    }

    private fun registerItem(name: String, item: Item): Item {
        return Registry.register(Registries.ITEM,
            Identifier.of(BexsCreatures.modId, name), item)
    }

    val deerSpawnEgg: Item = registerItem("deer_spawn_egg",
        SpawnEggItem(
            ModEntities.deer,
            0x9F7444, 0xC1C1C1, Item.Settings()
        )
    )
}
