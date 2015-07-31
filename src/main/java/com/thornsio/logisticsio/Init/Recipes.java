package com.thornsio.logisticsio.Init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by ThornsIO on 31/07/2015.
 */
public class Recipes
{
    public static void init()
    {
        // Steel Items
        GameRegistry.addRecipe(new ItemStack(ModItem.roller)," s ","s s"," s ",'s', new ItemStack(ModItem.steelingot));
        GameRegistry.addRecipe(new ItemStack(ModItem.steelpate, 3),"   ","   ","sss",'s', new ItemStack(ModItem.steelingot));

        // Chips

        GameRegistry.addRecipe(new ItemStack(ModItem.controlchip),"dsd","grg","dsd",'s', new ItemStack(ModItem.steelingot), 'd', new ItemStack(Items.diamond), 'g', new ItemStack(Items.gold_ingot), 'r', new ItemStack(Items.redstone));

        // Blocks

        GameRegistry.addRecipe(new ItemStack(ModBlock.test),"ppp","rrr","scs",'s', new ItemStack(ModItem.steelingot), 'p', new ItemStack(ModItem.steelpate), 'r', new ItemStack(ModItem.roller), 'c', new ItemStack(ModItem.controlchip));
    }
}
