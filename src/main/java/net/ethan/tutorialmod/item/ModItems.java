package net.ethan.tutorialmod.item;


import net.ethan.tutorialmod.TutorialMod;
import net.ethan.tutorialmod.item.custom.ModAxeItem;
import net.ethan.tutorialmod.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
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

    // helmets
    public static final Item GARNET_HELMET = registerItem("garnet_helmet",
            new ArmorItem(ModArmorMaterials.GARNET, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item RAINBOW_OPAL_HELMET = registerItem("rainbow_opal_helmet",
            new ArmorItem(ModArmorMaterials.RAINBOW_OPAL, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item SAPPHIRE_HELMET = registerItem("sapphire_helmet",
            new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item TOPAZ_HELMET = registerItem("topaz_helmet",
            new ArmorItem(ModArmorMaterials.TOPAZ, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item TOURMALINE_HELMET = registerItem("tourmaline_helmet",
            new ArmorItem(ModArmorMaterials.TOURMALINE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.MOD)));


    // chestplates
    public static final Item GARNET_CHESTPLATE = registerItem("garnet_chestplate",
            new ArmorItem(ModArmorMaterials.GARNET, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item RAINBOW_OPAL_CHESTPLATE = registerItem("rainbow_opal_chestplate",
            new ArmorItem(ModArmorMaterials.RAINBOW_OPAL, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate",
            new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item TOPAZ_CHESTPLATE = registerItem("topaz_chestplate",
            new ArmorItem(ModArmorMaterials.TOPAZ, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item TOURMALINE_CHESTPLATE = registerItem("tourmaline_chestplate",
            new ArmorItem(ModArmorMaterials.TOURMALINE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.MOD)));


    // leggings
    public static final Item GARNET_LEGGINGS = registerItem("garnet_leggings",
            new ArmorItem(ModArmorMaterials.GARNET, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item RAINBOW_OPAL_LEGGINGS = registerItem("rainbow_opal_leggings",
            new ArmorItem(ModArmorMaterials.RAINBOW_OPAL, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings",
            new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item TOPAZ_LEGGINGS = registerItem("topaz_leggings",
            new ArmorItem(ModArmorMaterials.TOPAZ, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item TOURMALINE_LEGGINGS = registerItem("tourmaline_leggings",
            new ArmorItem(ModArmorMaterials.TOURMALINE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.MOD)));


    // boots
    public static final Item GARNET_BOOTS = registerItem("garnet_boots",
            new ArmorItem(ModArmorMaterials.GARNET, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item RAINBOW_OPAL_BOOTS = registerItem("rainbow_opal_boots",
            new ArmorItem(ModArmorMaterials.RAINBOW_OPAL, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item SAPPHIRE_BOOTS = registerItem("sapphire_boots",
            new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item TOPAZ_BOOTS = registerItem("topaz_boots",
            new ArmorItem(ModArmorMaterials.TOPAZ, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.MOD)));

    public static final Item TOURMALINE_BOOTS = registerItem("tourmaline_boots",
            new ArmorItem(ModArmorMaterials.TOURMALINE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.MOD)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering mod items for " + TutorialMod.MOD_ID);
    }


}
