package net.ethan.tutorialmod.item;

import net.ethan.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MOD = FabricItemGroupBuilder.build(new Identifier(TutorialMod.MOD_ID, "mod"),
            () -> new ItemStack(ModItems.RAINBOW_OPAL_SWORD));
}
