package net.ethan.tutorialmod.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    GARNET(MiningLevels.NETHERITE, 4094, 9.0f, 4.0f, 24, () -> Ingredient.ofItems(ModItems.GARNET)),
    RAINBOW_OPAL(MiningLevels.NETHERITE, 10831, 12.0f, 7.0f, 24, () -> Ingredient.ofItems(ModItems.RAINBOW_OPAL)),
    SAPPHIRE(MiningLevels.NETHERITE, 3927, 7.0f, 5.0f, 24, () -> Ingredient.ofItems(ModItems.SAPPHIRE)),
    TOPAZ(MiningLevels.NETHERITE, 1561, 8.0f, 6.0f, 24, () -> Ingredient.ofItems(ModItems.TOPAZ)),
    TOURMALINE(MiningLevels.NETHERITE, 5300, 10.0f, 3.0f, 24, () -> Ingredient.ofItems(ModItems.TOURMALINE)),;

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
