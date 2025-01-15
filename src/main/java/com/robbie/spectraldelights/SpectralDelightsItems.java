package com.robbie.spectraldelights;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class SpectralDelightsItems {
    // TODO: reorganise this into proper categories (baked, meat, star candies, etc.)

    public static final Item ONION_BREAD                = new Item(new FabricItemSettings());
    public static final Item JADE_JELLY_DONUT           = new Item(new FabricItemSettings());
    public static final Item CRAWFISH_FRIED_RICE        = new Item(new FabricItemSettings());
    public static final Item MUTTONOUS_HAM              = new Item(new FabricItemSettings());
    public static final Item COOKED_MUTTONOUS_HAM       = new Item(new FabricItemSettings());
    public static final Item MOONGLAZED_MUTTONOUS_HAM   = new Item(new FabricItemSettings());
    public static final Item MUTTONOUS_PORKCHOP         = new Item(new FabricItemSettings());
    public static final Item MUTTONOUS_HAM_POTATO_SOUP  = new Item(new FabricItemSettings());
    public static final Item UNDERSEA_BUBBLE_TEA        = new Item(new FabricItemSettings());
    public static final Item THE_SOUP_THAT_KILLS_YOU    = new Item(new FabricItemSettings());

    // kindling foods (pls see google doc)
    public static final Item TOUGH_KINDLING_MEAT        = new Item(new FabricItemSettings());
    public static final Item KINDLING_MEAT              = new Item(new FabricItemSettings());
    public static final Item KINDLING_TENDER            = new Item(new FabricItemSettings());
    public static final Item COOKED_KINDLING_TENDER     = new Item(new FabricItemSettings());
    public static final Item KINDLING_NUGGET            = new Item(new FabricItemSettings());
    public static final Item COOKED_KINDLING_NUGGET     = new Item(new FabricItemSettings());
    public static final Item KINDLING_NUGGETS_FRIES     = new Item(new FabricItemSettings());
    public static final Item KINDLING_TENDERS_FRIES     = new Item(new FabricItemSettings());
    public static final Item ROTISSERIE_KINDLING        = new Item(new FabricItemSettings());
    public static final Item KINDLING_LEG               = new Item(new FabricItemSettings());
    public static final Item KINDLING_BREAST            = new Item(new FabricItemSettings());
    public static final Item KINDLING_THIGH             = new Item(new FabricItemSettings());
    public static final Item KINDLING_WING              = new Item(new FabricItemSettings());

    // deeper down delicacies
    public static final Item ERASU_MAZU                 = new Item(new FabricItemSettings());
    public static final Item LIZARD_BURGER              = new Item(new FabricItemSettings());
    public static final Item FALSEHYDRA_STEW            = new Item(new FabricItemSettings());
    public static final Item BLAZING_ONION              = new Item(new FabricItemSettings());
    public static final Item MELLOWING_MAYO             = new Item(new FabricItemSettings());
    public static final Item INCANDESCENT_HOT_SAUCE     = new Item(new FabricItemSettings());
    public static final Item FIERY_POPPING_CANDY        = new Item(new FabricItemSettings());
    public static final Item SPARKLING_SODA             = new Item(new FabricItemSettings());
    public static final Item TOPAZ_SPARKLING_SODA       = new Item(new FabricItemSettings());
    public static final Item AMETHYST_SPARKLING_SODA    = new Item(new FabricItemSettings());
    public static final Item CITRINE_SPARKLING_SODA     = new Item(new FabricItemSettings());
    public static final Item ONYX_SPARKLING_SODA        = new Item(new FabricItemSettings());
    public static final Item MOONSTONE_SPARKLING_SODA   = new Item(new FabricItemSettings());
    public static final Item ERASER_STIRFRY             = new Item(new FabricItemSettings());
    public static final Item PEACH_SODA                 = new Item(new FabricItemSettings());
    public static final Item JARAMEL_APPLE              = new Item(new FabricItemSettings());

    // foods (again?)
    public static final Item MILKY_JADE_PIE             = new Item(new FabricItemSettings());
    public static final Item SALTY_JADE_PIE             = new Item(new FabricItemSettings());
    public static final Item UNBAKED_PRETZEL            = new Item(new FabricItemSettings());
    public static final Item JEJABEAN_CHILI             = new Item(new FabricItemSettings());
    public static final Item SOMBROWNIE                 = new Item(new FabricItemSettings());
    public static final Item ETERNAL_SOMBROWNIE         = new Item(new FabricItemSettings());
    public static final Item PRETZEL                    = new Item(new FabricItemSettings());
    public static final Item PRETZEL_BITE               = new Item(new FabricItemSettings());

    // crop fusion
    public static final Item VITRETIMILLO_SEEDS         = new Item(new FabricItemSettings());
    public static final Item DRAGON_SHALLOT_SEEDS       = new Item(new FabricItemSettings());
    public static final Item TERRASTELLIC_LETTUCE_SEEDS = new Item(new FabricItemSettings());
    public static final Item VOIDTATO_SEEDS             = new Item(new FabricItemSettings());
    public static final Item GLASS_EGGPLANT_SEEDS       = new Item(new FabricItemSettings());

    // unnamed cookbook
    public static final Item GUKBAP                     = new Item(new FabricItemSettings());
    public static final Item SUKHOE                     = new Item(new FabricItemSettings());
    public static final Item RICE_CAKE                  = new Item(new FabricItemSettings());
    public static final Item LIZARD_BULGOLGI            = new Item(new FabricItemSettings());
    public static final Item MAKGEOLLI                  = new Item(new FabricItemSettings());

    // other
    public static final Item JEJABEAN_POD               = new Item(new FabricItemSettings());
    public static final Item JEJABEANS                  = new Item(new FabricItemSettings());
    public static final Item JEJABEAN_TRIMMING          = new Item(new FabricItemSettings());
    public static final Item CRYSTAL_TRUFFLE            = new Item(new FabricItemSettings());

    public static final Item FIERY_STAR_CANDY           = new Item(new FabricItemSettings());
    public static final Item PRISTINE_STAR_CANDY        = new Item(new FabricItemSettings());
    public static final Item GLISTERING_STAR_CANDY      = new Item(new FabricItemSettings());
    public static final Item GEMSTONE_STAR_CANDY        = new Item(new FabricItemSettings());

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
}
