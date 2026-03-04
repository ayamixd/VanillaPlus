package com.vanillaplus.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleTypes;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class ClientAnimationHandler {

    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.level != null && mc.player != null && mc.level.getGameTime() % 40 == 0) {
            mc.level.addParticle(
                ParticleTypes.CLOUD,
                mc.player.getX(),
                mc.player.getY(),
                mc.player.getZ(),
                0, 0.01, 0
            );
        }
    }
}
