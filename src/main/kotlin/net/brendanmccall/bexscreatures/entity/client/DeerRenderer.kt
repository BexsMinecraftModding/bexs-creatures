package net.brendanmccall.bexscreatures.entity.client

import net.brendanmccall.bexscreatures.BexsCreatures
import net.brendanmccall.bexscreatures.entity.custom.DeerEntity
import net.minecraft.client.render.VertexConsumerProvider
import net.minecraft.client.render.entity.EntityRendererFactory
import net.minecraft.client.render.entity.MobEntityRenderer
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.util.Identifier

class DeerRenderer(context: EntityRendererFactory.Context) :
    MobEntityRenderer<DeerEntity, DeerModel<DeerEntity>>(
        context,
        DeerModel(context.getPart(ModModelLayers.deer)),
        0.5f
    ) {

    companion object {
        private val texture = Identifier.of(BexsCreatures.modId, "textures/entity/deer.png")
    }

    override fun getTexture(entity: DeerEntity): Identifier {
        return texture
    }

    override fun render(
        mobEntity: DeerEntity,
        f: Float,
        g: Float,
        matrixStack: MatrixStack,
        vertexConsumerProvider: VertexConsumerProvider,
        i: Int
    ) {
        if (mobEntity.isBaby) {
            matrixStack.scale(0.95f, 0.95f, 0.95f)
        } else {
            matrixStack.scale(1.35f, 1.35f, 1.35f)
        }
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i)
    }
}
