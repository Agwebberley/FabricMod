package com.agwebberley.techaul.registry;

import com.agwebberley.techaul.Techaul;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item CIRCUIT_BOARD = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Techaul.MOD_ID, "circuit_board"), CIRCUIT_BOARD);
    }

}
