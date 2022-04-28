package tech.thatgravyboat.exampleconfig.forge;

import net.minecraftforge.fml.common.Mod;
import tech.thatgravyboat.exampleconfig.ExampleMod;
import tech.thatgravyboat.exampleconfig.config.forge.ConfigLoaderImpl;

@Mod(ExampleMod.MOD_ID)
public class ExampleModForge {
    public ExampleModForge() {
        ExampleMod.init();

        ConfigLoaderImpl.initialize();
    }
}
