package net.ethan.tutorialmod.item.block;

import net.ethan.tutorialmod.TutorialMod;
import net.ethan.tutorialmod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block GARNET_BLOCK = registerBlock("garnet_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool().luminance(2)), ModItemGroup.MOD);

    public static final Block RAINBOW_OPAL_BLOCK = registerBlock("rainbow_opal_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(8f).requiresTool().luminance(4)), ModItemGroup.MOD);

    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool().luminance(2)), ModItemGroup.MOD);

    public static final Block TOPAZ_BLOCK = registerBlock("topaz_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool().luminance(2)), ModItemGroup.MOD);

    public static final Block TOURMALINE_BLOCK = registerBlock("tourmaline_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool().luminance(2)), ModItemGroup.MOD);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering mod blocks for " + TutorialMod.MOD_ID);
    }
}
