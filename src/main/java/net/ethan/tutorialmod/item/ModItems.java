package net.ethan.tutorialmod.item;

import net.ethan.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    // raw materials
    public static final Item GARNET = registerItem("garnet",
            new Item(new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item RAINBOW_OPAL = registerItem("rainbow_opal",
            new Item(new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item SAPPHIRE = registerItem("sapphire",
            new Item(new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item TOPAZ = registerItem("topaz",
            new Item(new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item TOURMALINE = registerItem("tourmaline",
            new Item(new FabricItemSettings().group(ModItemGroup.MOD)));


    // carrots
    public static final Item GARNET_CARROT = registerItem("garnet_carrot",
            new Item(new FabricItemSettings().group(ModItemGroup.MOD).food(ModFoodComponents.GARNET_CARROT)));

    public static final Item RAINBOW_OPAL_CARROT = registerItem("rainbow_opal_carrot",
            new Item(new FabricItemSettings().group(ModItemGroup.MOD).food(ModFoodComponents.RAINBOW_OPAL_CARROT)));

    public static final Item SAPPHIRE_CARROT = registerItem("sapphire_carrot",
            new Item(new FabricItemSettings().group(ModItemGroup.MOD).food(ModFoodComponents.SAPPHIRE_CARROT)));

    public static final Item TOPAZ_CARROT = registerItem("topaz_carrot",
            new Item(new FabricItemSettings().group(ModItemGroup.MOD).food(ModFoodComponents.TOPAZ_CARROT)));

    public static final Item TOURMALINE_CARROT = registerItem("tourmaline_carrot",
            new Item(new FabricItemSettings().group(ModItemGroup.MOD).food(ModFoodComponents.TOURMALINE_CARROT)));


    // swords
    public static final Item GARNET_SWORD = registerItem("garnet_sword",
            new SwordItem(ModToolMaterials.GARNET, 2, 2f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item RAINBOW_OPAL_SWORD = registerItem("rainbow_opal_sword",
            new SwordItem(ModToolMaterials.RAINBOW_OPAL, 2, 2f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword",
            new SwordItem(ModToolMaterials.SAPPHIRE, 2, 2f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item TOPAZ_SWORD = registerItem("topaz_sword",
            new SwordItem(ModToolMaterials.TOPAZ, 2, 2f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item TOURMALINE_SWORD = registerItem("tourmaline_sword",
            new SwordItem(ModToolMaterials.TOURMALINE, 2, 2f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);
    }


}
