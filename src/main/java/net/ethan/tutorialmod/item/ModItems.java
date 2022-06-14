package net.ethan.tutorialmod.item;

import net.ethan.tutorialmod.TutorialMod;
import net.ethan.tutorialmod.item.custom.ModAxeItem;
import net.ethan.tutorialmod.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
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


    // axes
    public static final Item GARNET_AXE = registerItem("garnet_axe",
            new ModAxeItem(ModToolMaterials.GARNET, 4f, 0.5f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item RAINBOW_OPAL_AXE = registerItem("rainbow_opal_axe",
            new ModAxeItem(ModToolMaterials.RAINBOW_OPAL, 4f, 0.5f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe",
            new ModAxeItem(ModToolMaterials.SAPPHIRE, 4f, 0.5f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item TOPAZ_AXE = registerItem("topaz_axe",
            new ModAxeItem(ModToolMaterials.TOPAZ, 4f, 0.5f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item TOURMALINE_AXE = registerItem("tourmaline_axe",
            new ModAxeItem(ModToolMaterials.TOURMALINE, 4f, 0.5f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));


    // pickaxes
    public static final Item GARNET_PICKAXE = registerItem("garnet_pickaxe",
            new ModPickaxeItem(ModToolMaterials.GARNET, 1, 1f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item RAINBOW_OPAL_PICKAXE = registerItem("rainbow_opal_pickaxe",
            new ModPickaxeItem(ModToolMaterials.RAINBOW_OPAL, 1, 1f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe",
            new ModPickaxeItem(ModToolMaterials.SAPPHIRE, 1, 1f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item TOPAZ_PICKAXE = registerItem("topaz_pickaxe",
            new ModPickaxeItem(ModToolMaterials.TOPAZ, 1, 1f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item TOURMALINE_PICKAXE = registerItem("tourmaline_pickaxe",
            new ModPickaxeItem(ModToolMaterials.TOURMALINE, 1, 1f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    // shovels
    public static final Item GARNET_SHOVEL = registerItem("garnet_shovel",
            new ShovelItem(ModToolMaterials.GARNET, 0.5f, 1f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item RAINBOW_OPAL_SHOVEL = registerItem("rainbow_opal_shovel",
            new ShovelItem(ModToolMaterials.RAINBOW_OPAL, 0.5f, 1f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel",
            new ShovelItem(ModToolMaterials.SAPPHIRE, 0.5f, 1f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item TOPAZ_SHOVEL = registerItem("topaz_shovel",
            new ShovelItem(ModToolMaterials.TOPAZ, 0.5f, 1f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item TOURMALINE_SHOVEL = registerItem("tourmaline_shovel",
            new ShovelItem(ModToolMaterials.TOURMALINE, 0.5f, 1f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    // hoes
    public static final Item GARNET_HOE = registerItem("garnet_hoe",
            new ShovelItem(ModToolMaterials.GARNET, 0.5f, 1f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item RAINBOW_OPAL_HOE = registerItem("rainbow_opal_hoe",
            new ShovelItem(ModToolMaterials.RAINBOW_OPAL, 0.5f, 1f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item SAPPHIRE_HOE = registerItem("sapphire_hoe",
            new ShovelItem(ModToolMaterials.SAPPHIRE, 0.5f, 1f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item TOPAZ_HOE = registerItem("topaz_hoe",
            new ShovelItem(ModToolMaterials.TOPAZ, 0.5f, 1f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item TOURMALINE_HOE = registerItem("tourmaline_hoe",
            new ShovelItem(ModToolMaterials.TOURMALINE, 0.5f, 1f,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    // armor
    public static final Item GARNET_HELMET = registerItem("garnet_helmet",
            new ArmorItem(ModArmorMaterials.GARNET, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);
    }


}
