package com.jakekillsall.ctat.item;

import com.jakekillsall.ctat.creativeTab.CreativeTabCTAT;
import com.jakekillsall.ctat.reference.Reference;
import net.minecraft.item.Item;

public class itemLargeMalachiteEssence extends Item {
    public itemLargeMalachiteEssence(){
        super();
        setTextureName(Reference.modid + ":LargeMalachiteEssence");
        setCreativeTab(CreativeTabCTAT.CTAT_TAB);
    }
}
