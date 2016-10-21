package com.jakekillsall.ctat.item;


import com.jakekillsall.ctat.creativeTab.CreativeTabCTAT;
import com.jakekillsall.ctat.reference.Reference;
import net.minecraft.item.ItemPickaxe;

public class ItemMalachitePickaxe extends ItemPickaxe {
    public ItemMalachitePickaxe(ToolMaterial material)
    {
        super(material);
        this.setUnlocalizedName("MalachitePickaxe");
        setTextureName(Reference.modid + ":MalachitePickaxe");
        setCreativeTab(CreativeTabCTAT.CTAT_TAB);
    }

}
