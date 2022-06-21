package net.ethan.tutorialmod;

import net.ethan.tutorialmod.entity.ModEntities;
import net.ethan.tutorialmod.entity.client.GrimRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class TutorialClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.GRIM, GrimRenderer::new);
    }
}
