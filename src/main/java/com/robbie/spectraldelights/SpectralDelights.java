package com.robbie.spectraldelights;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class SpectralDelights implements ModInitializer {
    public final static String MOD_ID = "spectraldelights";

    public static Identifier id(String name) {
        return new Identifier(MOD_ID, name);
    }

    @Override
    public void onInitialize() {
        SpectralDelightsItems.register();
    }
}
