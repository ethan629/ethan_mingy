package net.ethan.tutorialmod.util;

import net.ethan.tutorialmod.entity.ModEntities;
import net.ethan.tutorialmod.entity.custom.GrimEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerAttributes();
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.GRIM, GrimEntity.setAttributes());
    }

}
