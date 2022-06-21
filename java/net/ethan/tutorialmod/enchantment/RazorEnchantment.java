package net.ethan.tutorialmod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class RazorEnchantment extends Enchantment {
    public RazorEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot... slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {
            if(level == 1) {
                ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE,
                        20, 1));
            }
            if(level == 2) {
                ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE,
                        20, 2));
            }

        }
        super.onTargetDamaged(user, target, level);
    }

    @Override
    public int getMinPower(int level) {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }
}
