package net.ethan.tutorialmod.item;

import net.ethan.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item GARNET = registerItem("garnet",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item RAINBOW_OPAL = registerItem("rainbow_opal",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item SAPPHIRE = registerItem("sapphire",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item TOPAZ = registerItem("topaz",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item TOURMALINE = registerItem("tourmaline",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);
    }


}
