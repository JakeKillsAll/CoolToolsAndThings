package com.jakekillsall.ctat.item;

import com.jakekillsall.ctat.creativeTab.CreativeTabCTAT;
import com.jakekillsall.ctat.reference.Reference;
import net.minecraft.item.ItemSpade;

import javax.tools.Tool;

public class itemMalachiteShovel extends ItemSpade {
    public itemMalachiteShovel (ToolMaterial material){
        super(material);
        setTextureName(Reference.modid + ":MalachiteShovel");
        setCreativeTab(CreativeTabCTAT.CTAT_TAB);
    }
}
