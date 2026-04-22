package net.brendanmccall.bexscreatures.datagen

import net.brendanmccall.bexscreatures.BexsCreatures
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.RegistryWrapper
import java.util.concurrent.CompletableFuture

class ModEnglishLangProvider(
    private val dataGenerator: FabricDataOutput,
    registryFuture: CompletableFuture<RegistryWrapper.WrapperLookup>)
    : FabricLanguageProvider(dataGenerator, registryFuture) {

    override fun generateTranslations(
        registryLookup: RegistryWrapper.WrapperLookup?,
        translationBuilder: TranslationBuilder?
    ) {
        // Creative mode tab
        translationBuilder?.add("itemgroup.${BexsCreatures.modId}", "Bex's Creatures")
        // Spawn egg
        translationBuilder?.add("item.${BexsCreatures.modId}.deer_spawn_egg", "Deer Spawn Egg")

        // Load the language file
        val existingFilePath = dataGenerator.modContainer
            .findPath("assets/${BexsCreatures.modId}/lang/en_us.existing.json")

        if (existingFilePath.isPresent) {
            try {
                translationBuilder?.add(existingFilePath.get())
            } catch (e: Exception) {
                BexsCreatures.logger.warn("Failed to add existing language file: ${e.message}")
            }
        } else {
            BexsCreatures.logger.info("No existing language file found. Skipping.")
        }
    }
}
