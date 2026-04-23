package net.brendanmccall.bexscreatures.sound

import net.brendanmccall.bexscreatures.BexsCreatures
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.sound.SoundEvent
import net.minecraft.util.Identifier

object ModSounds {

    fun registerSounds() {
        BexsCreatures.logger.info("Registering mod sounds for ${BexsCreatures.modId}")
    }

    private fun registerSoundEvent(name: String?): SoundEvent {
        val id: Identifier? = Identifier.of(BexsCreatures.modId, name)
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id))
    }

    val DEER_IDLE: SoundEvent = registerSoundEvent("deer_idle")
    val DEER_HURT: SoundEvent = registerSoundEvent("deer_hurt")
    val DEER_DEATH: SoundEvent = registerSoundEvent("deer_death")

}
