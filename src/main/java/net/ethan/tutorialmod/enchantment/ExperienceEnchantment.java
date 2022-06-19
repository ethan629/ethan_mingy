package net.ethan.tutorialmod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import java.util.Random;

public class ExperienceEnchantment extends Enchantment {
    public ExperienceEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot... slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(!user.world.isClient) {
            ServerWorld world = (ServerWorld)user.world;
            BlockPos position = target.getBlockPos();

            if(level == 1) {
                Random rand = new Random();
                int num = rand.nextInt(3);
                if(num == 0) {
                    EntityType.EXPERIENCE_ORB.spawn(world, null, null, null, position, SpawnReason.TRIGGERED,
                            true, true);
                }
            }

            if(level == 2) {
                EntityType.EXPERIENCE_ORB.spawn(world, null, null, null, position, SpawnReason.TRIGGERED,
                        true, true);
            }
        }
        super.onTargetDamaged(user, target, level);
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }
}
