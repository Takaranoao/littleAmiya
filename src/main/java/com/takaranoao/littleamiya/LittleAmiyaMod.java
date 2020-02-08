package com.takaranoao.littleamiya;

import com.takaranoao.littleamiya.proxy.ProxyCommon;
import net.minecraft.client.resources.I18n;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = LittleAmiyaMod.MODID, name = LittleAmiyaMod.NAME, version = LittleAmiyaMod.VERSION)
public class LittleAmiyaMod {
    public static final String MODID = "littleamiya";
    public static final String NAME = "Little Amiya Mod";
    public static final String VERSION = "1.0";

    public static Logger logger;
    @SidedProxy(clientSide = "com.takaranoao.littleamiya.proxy.ProxyClient", serverSide = "com.takaranoao.littleamiya.proxy.ProxyCommon")
    public static ProxyCommon proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
        logger.info( I18n.format("entity.amiya.text.1"));
        logger.info( I18n.format("entity.amiya.text.2"));
    }
}
