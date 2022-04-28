package tech.thatgravyboat.exampleconfig.fabric;


import net.fabricmc.api.ModInitializer;
import tech.thatgravyboat.exampleconfig.ExampleMod;
import tech.thatgravyboat.exampleconfig.config.fabric.ConfigLoaderImpl;

import java.io.IOException;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ExampleMod.init();

        try {
            ConfigLoaderImpl.initialize();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
