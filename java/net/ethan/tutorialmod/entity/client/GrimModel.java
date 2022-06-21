package net.ethan.tutorialmod.entity.client;

import net.ethan.tutorialmod.TutorialMod;
import net.ethan.tutorialmod.entity.custom.GrimEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class GrimModel extends AnimatedGeoModel<GrimEntity> {
    @Override
    public Identifier getModelLocation(GrimEntity object) {
        return new Identifier(TutorialMod.MOD_ID, "geo/grim.geo.json");
    }

    @Override
    public Identifier getTextureLocation(GrimEntity object) {
        return new Identifier(TutorialMod.MOD_ID, "textures/entity/grim/grim.png");
    }

    @Override
    public Identifier getAnimationFileLocation(GrimEntity animatable) {
        return new Identifier(TutorialMod.MOD_ID, "animations/grim.animation.json");
    }

    @Override
    public void setLivingAnimations(GrimEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");
        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}
