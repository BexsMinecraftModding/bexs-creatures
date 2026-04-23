package net.brendanmccall.bexscreatures.item

import net.brendanmccall.bexscreatures.BexsCreatures
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier

object ModItemGroups {

    fun registerModItemGroups() {
        BexsCreatures.LOGGER.info("Registering mod item groups for ${BexsCreatures.MOD_ID}")
    }

    val bexsCreaturesGroup: ItemGroup = Registry.register(
        Registries.ITEM_GROUP,
        Identifier.of(BexsCreatures.MOD_ID, BexsCreatures.MOD_ID),
        FabricItemGroup.builder()
            .displayName(Text.translatable("itemgroup.${BexsCreatures.MOD_ID}"))
            .icon { ItemStack(ModItems.deerSpawnEgg) }
            .entries { _, entries ->
                // Adding items to creative mode group
                entries.add(ModItems.deerSpawnEgg)
            }
            .build()
    )
}
