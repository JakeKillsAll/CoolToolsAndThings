package com.jakekillsall.ctat.item;

import com.jakekillsall.ctat.creativeTab.CreativeTabCTAT;
import com.jakekillsall.ctat.reference.Reference;
import net.minecraft.item.ItemSword;

public class itemMalachiteSword extends ItemSword{
    public itemMalachiteSword (ToolMaterial material){
        super(material);
        setTextureName(Reference.modid+":MalachiteSword");
        setCreativeTab(CreativeTabCTAT.CTAT_TAB);
    }
}
