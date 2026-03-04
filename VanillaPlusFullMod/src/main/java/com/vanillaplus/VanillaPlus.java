package com.vanillaplus;

import com.vanillaplus.item.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(VanillaPlus.MODID)
public class VanillaPlus {
    public static final String MODID = "vanillaplus";

    public VanillaPlus() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(bus);
    }
}
