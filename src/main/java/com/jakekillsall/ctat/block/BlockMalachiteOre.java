package com.jakekillsall.ctat.block;

import com.jakekillsall.ctat.creativeTab.CreativeTabCTAT;
import com.jakekillsall.ctat.init.ModItems;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockMalachiteOre extends BlockCTAT{

    public BlockMalachiteOre(){
        super();
        this.setBlockName("MalachiteOre");
        setHardness(5f);
        setResistance(6f);
        setHarvestLevel("pickaxe",2);
        setCreativeTab(CreativeTabCTAT.CTAT_TAB);
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return ModItems.MalachiteEssence;
    }
    /**
     * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
     */
    public int quantityDroppedWithBonus(int p_149679_1_, Random p_149679_2_)
    {
        return this.quantityDropped(p_149679_2_) + p_149679_2_.nextInt(p_149679_1_ + 1);
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random p_149745_1_)
    {
        return 4 + p_149745_1_.nextInt(2);
    }

    /**
     public int quantityDroppedWithBonus(int p_149679_1_, Random p_149679_2_)
     {
     return this.quantityDropped(p_149679_2_) + p_149679_2_.nextInt(p_149679_1_ + 1);
     }
     public int quantityDropped(Random p_149745_1_)
     {
     return 4 + p_149745_1_.nextInt(2);
     }
     */
}
