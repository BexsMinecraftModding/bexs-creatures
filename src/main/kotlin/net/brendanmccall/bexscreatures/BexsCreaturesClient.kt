package net.brendanmccall.bexscreatures

import net.brendanmccall.bexscreatures.entity.ModEntities
import net.brendanmccall.bexscreatures.entity.client.DeerModel
import net.brendanmccall.bexscreatures.entity.client.DeerRenderer
import net.brendanmccall.bexscreatures.entity.client.ModModelLayers
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry

object BexsCreaturesClient : ClientModInitializer {

    override fun onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.DEER) { DeerModel.getTexturedModelData() }
        EntityRendererRegistry.register(ModEntities.DEER) { context -> DeerRenderer(context) }
    }
}
