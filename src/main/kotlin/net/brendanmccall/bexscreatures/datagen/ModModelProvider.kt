package net.brendanmccall.bexscreatures.datagen

import net.brendanmccall.bexscreatures.item.ModItems
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.client.Model
import net.minecraft.util.Identifier
import java.util.*

class ModModelProvider(output: FabricDataOutput) : FabricModelProvider(output) {

    override fun generateBlockStateModels(blockStateModelGenerator: BlockStateModelGenerator) {

    }

    override fun generateItemModels(itemModelGenerator: ItemModelGenerator) {
        // Spawn egg item
        itemModelGenerator.register(
            ModItems.deerSpawnEgg,
            Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty())
        )
    }
}
