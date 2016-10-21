package com.jakekillsall.ctat;

import com.jakekillsall.ctat.configuration.ConfigHandler;
import com.jakekillsall.ctat.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import com.jakekillsall.ctat.reference.Reference;

@Mod(modid = Reference.modid, name= Reference.name, version = Reference.versionnum)
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
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
