package net.ethan.tutorialmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent GARNET_CARROT = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.5F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 6), 1.0F).build();
    public static final FoodComponent RAINBOW_OPAL_CARROT = (new FoodComponent.Builder()).hunger(8).saturationModifier(0.8F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3600, 6), 1.0F).build();
    public static final FoodComponent SAPPHIRE_CARROT = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.5F).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2400, 3), 1.0F).build();
    public static final FoodComponent TOPAZ_CARROT = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.5F).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 2400, 5), 1.0F).build();
    public static final FoodComponent TOURMALINE_CARROT = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.5F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2400, 2), 1.0F).build();
}