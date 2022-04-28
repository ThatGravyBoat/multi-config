package tech.thatgravyboat.exampleconfig;

import tech.thatgravyboat.exampleconfig.config.ConfigLoader;
import tech.thatgravyboat.exampleconfig.config.PropertyType;
import tech.thatgravyboat.exampleconfig.config.annotations.Category;
import tech.thatgravyboat.exampleconfig.config.annotations.Config;
import tech.thatgravyboat.exampleconfig.config.annotations.Property;

public class ExampleMod {

    public static final String MOD_ID = "exampleconfig";

    public static final ConfigFile CONFIG = new ConfigFile();
    
    public static void init() {
        ConfigLoader.registerConfig(CONFIG);
    }

    @Config("example-config")
    public static class ConfigFile {

        @Property(
            type = PropertyType.INT,
            description = "Int Config Value description!",
            min = -4,
            max = 10
        )
        public int intConfigValue = 0;

        @Property(
            type = PropertyType.CATEGORY,
            description = "Category description!"
        )
        public InnerConfigCategory innerCategory = new InnerConfigCategory();
    }

    @Category("This is an inner config!")
    public static class InnerConfigCategory {

        @Property(
            type = PropertyType.BOOLEAN,
            description = "This is a boolean in an inner category."
        )
        public boolean testEnabled = false;
    }
}
