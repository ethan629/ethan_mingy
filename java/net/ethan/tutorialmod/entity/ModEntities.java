package net.ethan.tutorialmod.entity;

import net.ethan.tutorialmod.TutorialMod;
import net.ethan.tutorialmod.entity.custom.GrimEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<GrimEntity> GRIM = Registry.register(Registry.ENTITY_TYPE, new Identifier(TutorialMod.MOD_ID, "grim"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GrimEntity::new).dimensions(EntityDimensions.fixed(1f, 2f)).build());
}
