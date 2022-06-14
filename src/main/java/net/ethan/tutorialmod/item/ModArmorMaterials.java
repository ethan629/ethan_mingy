package net.ethan.tutorialmod.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    GARNET("garnet", 73, new int[]{4, 7, 10, 4}, 48,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.0f, 0.2f, () -> Ingredient.ofItems(ModItems.GARNET)),
    RAINBOW_OPAL("rainbow_opal", 154, new int[]{5, 9, 12, 5}, 75,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5.0f, 0.4f, () -> Ingredient.ofItems(ModItems.RAINBOW_OPAL)),
    SAPPHIRE("sapphire", 59, new int[]{4, 8, 9, 5}, 48,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.0f, 0.2f, () -> Ingredient.ofItems(ModItems.SAPPHIRE)),
    TOPAZ("topaz", 107, new int[]{3, 7, 10, 4}, 48,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.0f, 0.2f, () -> Ingredient.ofItems(ModItems.TOPAZ)),
    TOURMALINE("tourmaline", 81, new int[]{5, 7, 7, 5}, 48,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.0f, 0.2f, () -> Ingredient.ofItems(ModItems.TOURMALINE));

    private static final int[] BASE_DURABILITY;
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    private ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy<Ingredient>(repairIngredientSupplier);
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    static {
        BASE_DURABILITY = new int[]{13, 15, 16, 11};
    }
}
