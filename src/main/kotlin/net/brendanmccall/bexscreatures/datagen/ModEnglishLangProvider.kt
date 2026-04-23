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
        translationBuilder?.add("itemgroup.${BexsCreatures.MOD_ID}", "Bex's Creatures")
        // Spawn egg
        translationBuilder?.add("item.${BexsCreatures.MOD_ID}.deer_spawn_egg", "Deer Spawn Egg")

        // Load the language file
        val existingFilePath = dataGenerator.modContainer
            .findPath("assets/${BexsCreatures.MOD_ID}/lang/en_us.existing.json")

        if (existingFilePath.isPresent) {
            try {
                translationBuilder?.add(existingFilePath.get())
            } catch (e: Exception) {
                BexsCreatures.LOGGER.warn("Failed to add existing language file: ${e.message}")
            }
        } else {
            BexsCreatures.LOGGER.info("No existing language file found. Skipping.")
        }
    }
}
