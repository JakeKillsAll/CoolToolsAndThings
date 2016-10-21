package com.jakekillsall.ctat.item;

import com.jakekillsall.ctat.creativeTab.CreativeTabCTAT;
import com.jakekillsall.ctat.reference.Reference;
import net.minecraft.item.Item;

public class itemMalachitePlate extends Item {
    public itemMalachitePlate (){
        super();
        setTextureName(Reference.modid + ":MalachitePlate");
        setCreativeTab(CreativeTabCTAT.CTAT_TAB);
    }
}
