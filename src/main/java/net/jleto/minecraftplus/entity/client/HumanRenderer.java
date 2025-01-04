package net.jleto.minecraftplus.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.jleto.minecraftplus.MinecraftPlus;
import net.jleto.minecraftplus.entity.custom.HumanEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class HumanRenderer extends MobRenderer<HumanEntity, HumanModel<HumanEntity>> {
    public HumanRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new HumanModel<>(pContext.bakeLayer(ModModelLayers.HUMAN_LAYER)), .5f);
    }

    @Override
    public ResourceLocation getTextureLocation(HumanEntity pEntity) {
        return new ResourceLocation(MinecraftPlus.MODID, "textures/entity/human.png");
    }

    @Override
    public void render(HumanEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
