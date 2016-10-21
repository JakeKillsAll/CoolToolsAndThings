package com.jakekillsall.ctat.init;

import com.jakekillsall.ctat.block.BlockMalachiteOre;
import com.jakekillsall.ctat.creativeTab.CreativeTabCTAT;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static final BlockMalachiteOre malachiteOre = new BlockMalachiteOre();

    public static void init(){

        GameRegistry.registerBlock(malachiteOre, "MalachiteOre");
    }
}
