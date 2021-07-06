package com.agwebberley.techaul;

import com.agwebberley.techaul.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Techaul implements ModInitializer {

    public static final String MOD_ID = "techaul";
    @Override
    public void onInitialize() {

        ModItems.registerItems();

    }
}
