package com.jakekillsall.ctat.init;

import com.jakekillsall.ctat.item.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

    /**Materials*/
    public static Item.ToolMaterial Malachite = EnumHelper.addToolMaterial("Malachite", 3, 2048, 15.0F, 6.0F, 12);
    /**public static ToolMaterial sample = EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability)*/

    /** General Items */
    public static Item MalachiteEssence = new itemMalachiteEssence().setUnlocalizedName("MalachiteEssence");
    public static Item LargeMalachiteEssence = new itemLargeMalachiteEssence().setUnlocalizedName("LargeMalachiteEssence");
    public static Item MalachitePlate = new itemMalachitePlate().setUnlocalizedName("MalachitePlate");

    /**Malachite Tools*/
    public static Item ItemMalachitePickaxe = new ItemMalachitePickaxe(Malachite).setUnlocalizedName("MalachitePickaxe");
    public static Item MalachiteAxe = new itemMalachiteAxe(Malachite).setUnlocalizedName("MalachiteAxe");
    public static Item MalachiteSword = new itemMalachiteSword(Malachite).setFull3D().setUnlocalizedName("MalachiteSword");
    public static Item MalachiteShovel = new itemMalachiteShovel(Malachite).setUnlocalizedName("MalachiteShovel");
    public static Item MalachiteHoe = new itemMalachiteHoe(Malachite).setUnlocalizedName("MalachiteHoe");

    public static void init()
    {
        //Registers Malachite Tools
        GameRegistry.registerItem(ItemMalachitePickaxe, "MalachitePickaxe");
        GameRegistry.registerItem(MalachiteAxe, "MalachiteAxe");
        GameRegistry.registerItem(MalachiteSword, "MalachiteSword");
        GameRegistry.registerItem(MalachiteShovel, "MalachiteShovel");
        GameRegistry.registerItem(MalachiteHoe, "MalachiteHoe");
        GameRegistry.registerItem(MalachiteEssence, "MalachiteEssence");
        GameRegistry.registerItem(LargeMalachiteEssence, "LargeMalachiteEssence");
        GameRegistry.registerItem(MalachitePlate, "MalachitePlate");

        //Registers General Items
        GameRegistry.registerItem(MalachiteEssence, "MalachiteEssence");
        GameRegistry.registerItem(LargeMalachiteEssence, "LargeMalachiteEssence");
        GameRegistry.registerItem(MalachitePlate,"MalachitePlate");

        //Registers Malachite Tools Recipes
        GameRegistry.addRecipe(new ItemStack(ItemMalachitePickaxe,1), new Object[]{ "XXX"," S "," S ", 'X', MalachitePlate, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(MalachiteAxe, 1), new Object[] {" XX", " SX", " S ", 'X', MalachitePlate, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(MalachiteAxe, 1), new Object[] {"XX ", "XS ", " S ", 'X', MalachitePlate, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(MalachiteSword, 1), new Object[] {" X "," X "," S ", 'X', MalachitePlate, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(MalachiteShovel, 1), new Object[] {" X "," S "," S ", 'X',MalachitePlate, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(MalachiteHoe, 1), new Object[] {"XX ", " S ", " S ", 'X', MalachitePlate, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(MalachiteHoe, 1), new Object[] {" XX", " S ", " S ", 'X', MalachitePlate, 'S', Items.stick});

        //Registers general crafting recipes
        GameRegistry.addRecipe(new ItemStack(LargeMalachiteEssence,1), new Object[] {"XXX", "XXX", "XXX", 'X', MalachiteEssence});

        //Registers general smelting recipes
        GameRegistry.addSmelting(new ItemStack(LargeMalachiteEssence),new ItemStack(MalachitePlate),8.0f);
    }
}
