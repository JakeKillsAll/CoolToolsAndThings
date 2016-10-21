package com.jakekillsall.ctat.item;

import com.jakekillsall.ctat.creativeTab.CreativeTabCTAT;
import com.jakekillsall.ctat.reference.Reference;
import net.minecraft.item.ItemAxe;

public class itemMalachiteAxe extends ItemAxe {
    public itemMalachiteAxe(ToolMaterial material){
        super(material);
        setTextureName(Reference.modid + ":MalachiteAxe");
        setCreativeTab(CreativeTabCTAT.CTAT_TAB);
    }
}
