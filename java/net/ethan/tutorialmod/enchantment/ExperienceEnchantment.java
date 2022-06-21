package net.ethan.tutorialmod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;


public class ExperienceEnchantment extends Enchantment {
    public ExperienceEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot... slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (!user.world.isClient) {
            ServerWorld world = (ServerWorld) user.world;
            BlockPos position = target.getBlockPos();

            EntityType.EXPERIENCE_ORB.spawn(world, null, null, null, position, SpawnReason.TRIGGERED,
                    true, true);
        }
        super.onTargetDamaged(user, target, level);
    }

    @Override
    public int getMinPower(int level) {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }
}
