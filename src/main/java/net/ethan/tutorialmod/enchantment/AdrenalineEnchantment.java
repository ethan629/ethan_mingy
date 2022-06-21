package net.ethan.tutorialmod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class AdrenalineEnchantment extends Enchantment {
    public AdrenalineEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot... slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
        if(level == 1) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 80, 0));
        }
        if(level == 2) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 160, 0));
        }
        if(level == 3) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 1));
        }
        super.onUserDamaged(user, attacker, level);
    }

    @Override
    public int getMinPower(int level) {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }
}
