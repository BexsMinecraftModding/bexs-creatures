package net.brendanmccall.bexscreatures.entity.client

import net.brendanmccall.bexscreatures.BexsCreatures
import net.minecraft.client.render.entity.model.EntityModelLayer
import net.minecraft.util.Identifier

class ModModelLayers {

    companion object{
        val deer: EntityModelLayer = EntityModelLayer(Identifier.of(
            BexsCreatures.modId, "deer"), "main")
    }
}
