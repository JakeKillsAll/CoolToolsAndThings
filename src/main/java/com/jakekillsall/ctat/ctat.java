package com.jakekillsall.ctat;

import com.jakekillsall.ctat.handler.ConfigHandler;
import com.jakekillsall.ctat.init.ModBlocks;
import com.jakekillsall.ctat.init.ModItems;
import com.jakekillsall.ctat.init.OreGenerators;
import com.jakekillsall.ctat.proxy.IProxy;
import com.jakekillsall.ctat.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import com.jakekillsall.ctat.reference.Reference;
import sun.rmi.runtime.Log;

@Mod(modid = Reference.modid, name= Reference.name, version = Reference.versionnum, guiFactory = Reference.guiFactory)
public class ctat
{
    @Mod.Instance(Reference.modid)
    public static ctat instance;

    @SidedProxy(clientSide = Reference.proxyClient, serverSide = Reference.proxyServer, modId = Reference.modid)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());
        LogHelper.info("Pre Initialization Complete!");
        //initialize items
        ModItems.init();
        //initializes blocks
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete!");
        //Generates ores in world
        OreGenerators.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}
