package com.takaranoao.littleamiya.proxy;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ProxyClient extends ProxyCommon {
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        //RenderingRegistry.registerEntityRenderingHandler(EntityAmiya.class, manager -> new RenderAmiya(manager));
    }
}
