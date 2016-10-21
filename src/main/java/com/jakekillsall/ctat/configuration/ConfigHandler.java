package com.jakekillsall.ctat.configuration;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{
    public static void init(File configFile)
    {
        //Create config object from given config file

        Configuration config = new Configuration(configFile);
        boolean configValue = false;
        try
        {
            //Load Config file
            config.load();

            //Read the config values
            configValue = config.get(Configuration.CATEGORY_GENERAL, "CTAT General", true, "This is a test config value").getBoolean(true);
        }
        catch (Exception e){
            //Log the Exception
        }
        finally {
            //Save config File
            config.save();
        }
    }
}
