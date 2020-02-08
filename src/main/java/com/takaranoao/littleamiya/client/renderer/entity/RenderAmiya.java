package com.takaranoao.littleamiya.client.renderer.entity;

import com.takaranoao.littleamiya.client.model.ModelAmiya;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.util.ResourceLocation;

public class RenderAmiya extends RenderLiving<EntityRabbit> {

    private static final ResourceLocation DONKEY = new ResourceLocation("textures/entity/horse/donkey.png");
    private double scale;

    public RenderAmiya(RenderManager p_i47196_1_) {
        super(p_i47196_1_, new ModelAmiya(), 0.75F);
        this.scale = 0.75;
    }

    protected void preRenderCallback(EntityRabbit entitylivingbaseIn, float partialTickTime) {
        GlStateManager.scale(this.scale, this.scale, this.scale);
        super.preRenderCallback(entitylivingbaseIn, partialTickTime);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityRabbit entity) {
        return DONKEY;
    }
}
