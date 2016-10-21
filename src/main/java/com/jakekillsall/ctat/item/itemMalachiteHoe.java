package com.jakekillsall.ctat.item;

import com.jakekillsall.ctat.creativeTab.CreativeTabCTAT;
import com.jakekillsall.ctat.reference.Reference;
import net.minecraft.item.ItemHoe;

public class itemMalachiteHoe extends ItemHoe {
    public itemMalachiteHoe (ToolMaterial material){
        super(material);
        setTextureName(Reference.modid + ":MalachiteHoe");
        setCreativeTab(CreativeTabCTAT.CTAT_TAB);
    }
}
