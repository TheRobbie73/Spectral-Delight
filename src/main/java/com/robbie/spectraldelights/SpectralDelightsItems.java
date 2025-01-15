package com.robbie.spectraldelights;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class SpectralDelightsItems {
    // TODO: reorganise this into proper categories (baked, meat, star candies, etc.) DO THIS EARLY
    public static final Item INCANDESCENT_HOT_SAUCE;
    public static final Item THE_SOUP_THAT_KILLS_YOU;
    public static final Item PEACH_SODA;
    public static final Item PRETZEL;
    public static final Item PRETZEL_BITE;
    public static final Item JADE_JELLY_DONUT;
    public static final Item MELLOWING_MAYO;
    public static final Item UNBAKED_PRETZEL;
    public static final Item MUTTONOUS_HAM;
    public static final Item COOKED_MUTTONOUS_HAM;
    public static final Item FIERY_STAR_CANDY;
    public static final Item PRISTINE_STAR_CANDY;
    public static final Item GLISTERING_STAR_CANDY;
    public static final Item GEMSTONE_STAR_CANDY;

    public SpectralDelightsItems() {}

    public static void register(String name, Item item) {
        Registry.register(Registries.ITEM, SpectralDelights.id(name), item);
    }
    public static void register() {
        registerFood();
    }

    public static void registerFood() {
        register("incandescent_hot_sauce", INCANDESCENT_HOT_SAUCE);
        register("the_soup_that_kills_you", THE_SOUP_THAT_KILLS_YOU);
        register("peach_soda", PEACH_SODA);
        register("pretzel", PRETZEL);
        register("pretzel_bite", PRETZEL_BITE);
        register("jade_jelly_donut", JADE_JELLY_DONUT);
        register("mellowing_mayo", MELLOWING_MAYO);
        register("unbaked_pretzel", UNBAKED_PRETZEL);
        register("muttonous_ham", MUTTONOUS_HAM);
        register("cooked_muttonous_ham", COOKED_MUTTONOUS_HAM);
        register("fiery_star_candy", FIERY_STAR_CANDY);
        register("pristine_star_candy", PRISTINE_STAR_CANDY);
        register("glistering_star_candy", GLISTERING_STAR_CANDY);
        register("gemstone_star_candy", GEMSTONE_STAR_CANDY);
    }

    static {
        INCANDESCENT_HOT_SAUCE = new Item(new FabricItemSettings());
        THE_SOUP_THAT_KILLS_YOU = new Item(new FabricItemSettings());
        PEACH_SODA = new Item(new FabricItemSettings());
        PRETZEL = new Item(new FabricItemSettings());
        PRETZEL_BITE = new Item(new FabricItemSettings());
        JADE_JELLY_DONUT = new Item(new FabricItemSettings());
        MELLOWING_MAYO = new Item(new FabricItemSettings());
        UNBAKED_PRETZEL = new Item(new FabricItemSettings());
        MUTTONOUS_HAM = new Item(new FabricItemSettings());
        COOKED_MUTTONOUS_HAM = new Item(new FabricItemSettings());
        FIERY_STAR_CANDY = new Item(new FabricItemSettings());
        PRISTINE_STAR_CANDY = new Item(new FabricItemSettings());
        GLISTERING_STAR_CANDY = new Item(new FabricItemSettings());
        GEMSTONE_STAR_CANDY = new Item(new FabricItemSettings());
    }
}
