package net.brendanmccall.bexscreatures.entity.client

import net.brendanmccall.bexscreatures.BexsCreatures
import net.minecraft.client.render.entity.model.EntityModelLayer
import net.minecraft.util.Identifier

class ModModelLayers {

    companion object{
        val DEER: EntityModelLayer = EntityModelLayer(Identifier.of(
            BexsCreatures.MOD_ID, "deer"), "main")
    }
}
