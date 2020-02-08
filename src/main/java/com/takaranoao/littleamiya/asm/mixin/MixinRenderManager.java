package com.takaranoao.littleamiya.asm.mixin;

import com.takaranoao.littleamiya.client.renderer.entity.RenderAmiya;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityRabbit;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RenderManager.class)
public class MixinRenderManager {
    public Render<EntityRabbit> RenderAmiya;

    @Inject(method = "getEntityRenderObject", at = @At(value = "RETURN"), cancellable = true)
    public void getEntityRenderObject(Entity entityIn, CallbackInfoReturnable<Render> cir) {

        if (entityIn instanceof EntityRabbit) {
            if (entityIn.hasCustomName() && (
                    "amiya".equals(entityIn.getCustomNameTag())
                            || I18n.format("entity.amiya.text.1").equals(entityIn.getCustomNameTag())
                            || I18n.format("entity.amiya.text.2").equals(entityIn.getCustomNameTag()))) {
                if (RenderAmiya == null) {
                    this.RenderAmiya = new RenderAmiya((RenderManager) (Object) this);
                }
                cir.getReturnValue();
                cir.setReturnValue(this.RenderAmiya);
            }
        }

    }

}
