package com.jakekillsall.ctat.init;

import com.jakekillsall.ctat.oregenerator.MalachiteGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class OreGenerators {
    public static MalachiteGenerator malachiteGenerator = new MalachiteGenerator();

    public static void init(){
        GameRegistry.registerWorldGenerator(malachiteGenerator, 1);
    }
}
