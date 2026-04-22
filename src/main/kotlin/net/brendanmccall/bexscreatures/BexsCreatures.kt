package net.brendanmccall.bexscreatures

import net.brendanmccall.bexscreatures.entity.ModEntities
import net.brendanmccall.bexscreatures.item.ModItemGroups
import net.brendanmccall.bexscreatures.item.ModItems
import net.fabricmc.api.EnvType
import net.fabricmc.api.ModInitializer
import net.fabricmc.loader.api.FabricLoader
import org.slf4j.LoggerFactory

object BexsCreatures : ModInitializer {

	val modId = "bexscreatures"
    val logger = LoggerFactory.getLogger(modId)

	override fun onInitialize() {
		logger.info("Loading Bex's Creatures...")

		// Only render on the client
		if (FabricLoader.getInstance().environmentType == EnvType.CLIENT) {
			BexsCreaturesClient.onInitializeClient()
		}

		// Registries
		ModItemGroups.registerModItemGroups()
		ModItems.registerModItems()
		ModEntities.registerModEntities()
	}
}
