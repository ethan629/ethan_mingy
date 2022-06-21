package net.ethan.tutorialmod.entity.client;

import net.ethan.tutorialmod.TutorialMod;
import net.ethan.tutorialmod.entity.custom.GrimEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GrimRenderer extends GeoEntityRenderer<GrimEntity> {
    public GrimRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new GrimModel());
    }

    @Override
    public Identifier getTextureLocation(GrimEntity instance) {
        return new Identifier(TutorialMod.MOD_ID, "textures/entity/grim/grim.png");
    }
}
