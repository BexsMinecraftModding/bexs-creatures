package net.brendanmccall.bexscreatures

import net.brendanmccall.bexscreatures.datagen.ModEnglishLangProvider
import net.brendanmccall.bexscreatures.datagen.ModModelProvider
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator

object BexsCreaturesDataGenerator : DataGeneratorEntrypoint {

	override fun onInitializeDataGenerator(fabricDataGenerator: FabricDataGenerator) {
		val pack = fabricDataGenerator.createPack()

		pack.addProvider(::ModEnglishLangProvider)
		pack.addProvider(::ModModelProvider)
	}
}
