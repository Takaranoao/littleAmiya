package com.takaranoao.littleamiya.asm;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;
import javax.annotation.Nullable;
import java.util.Map;

@IFMLLoadingPlugin.Name("LittleAmiyaCoreMod")
@IFMLLoadingPlugin.MCVersion("1.12.2")
public class LittleAmiyaCoremod implements IFMLLoadingPlugin{
    public LittleAmiyaCoremod() {
        MixinBootstrap.init();
        Mixins.addConfiguration("mixins.littleamiya.json");
    }
    @Override
    public String[] getASMTransformerClass() {
        return new String[0];
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Nullable
    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {

    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
