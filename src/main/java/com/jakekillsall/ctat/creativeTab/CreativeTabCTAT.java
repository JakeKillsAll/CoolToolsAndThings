package com.jakekillsall.ctat.creativeTab;

import com.jakekillsall.ctat.init.ModItems;
import com.jakekillsall.ctat.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabCTAT
{
    public static final CreativeTabs CTAT_TAB = new CreativeTabs(Reference.modid) {
        @Override
        public Item getTabIconItem() {
            return ModItems.ItemMalachitePickaxe;
        }
    };

    public String getTranslatedTabLabel()
    {
        return "Cool Tools and Things";
    }
}
