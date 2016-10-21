package com.jakekillsall.ctat.handler;


import com.jakekillsall.ctat.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{
    public static Configuration config;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        //Create config object from given config file
        if (config == null)
        {
            config = new Configuration(configFile);
            loadConfiguration();
        }

    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.modid))
        {
            //resync configs
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        testValue = config.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example value");
    }
}
