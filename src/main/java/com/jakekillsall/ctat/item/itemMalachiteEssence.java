package com.jakekillsall.ctat.item;

import com.jakekillsall.ctat.creativeTab.CreativeTabCTAT;
import com.jakekillsall.ctat.reference.Reference;
import net.minecraft.item.Item;

public class itemMalachiteEssence extends Item {
    public itemMalachiteEssence()
    {
        super();
        setTextureName(Reference.modid + ":MalachiteEssence");
        setCreativeTab(CreativeTabCTAT.CTAT_TAB);
    }
}
