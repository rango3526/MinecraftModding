package com.camp.recipe;
 
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.camp.block.DaedricOreManager;
import com.camp.item.DaedricIngotManager;
import com.camp.item.ItemManager;

import cpw.mods.fml.common.registry.GameRegistry;
 
public class RecipeManager{
 
    public static void mainRegistry(){
        addCraftingRecipes();
        addSmeltingRecipes();
 
    }//end mainRegistry
  
 
    public static void addCraftingRecipes() {
 
        //Shapeless Recipes
 
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 64), Blocks.dirt);
 
        //Shaped Recipes
        
        GameRegistry.addShapedRecipe(new ItemStack(Items.carrot), "xyx", "y y", "xyx", 'x', Blocks.stone, 'y', Blocks.gravel);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.customItem), " x ", " x ", " y ", 'x', DaedricIngotManager.customItem, 'y', Items.blaze_rod );
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.customPickaxe), "xxx", " y ", " y ", 'x', DaedricIngotManager.customItem, 'y', Items.blaze_rod );
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.customAxe), "xx ", "xy ", " y ", 'x', DaedricIngotManager.customItem, 'y', Items.blaze_rod );
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.customShovel), " x ", " y ", " y ", 'x', DaedricIngotManager.customItem, 'y', Items.blaze_rod );
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.customHoe), "xx ", " y ", " y ", 'x', DaedricIngotManager.customItem, 'y', Items.blaze_rod );
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.customSeeds, 6), "   ", " x ", "   ", 'x', DaedricIngotManager.customFood);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.customHelmet),  "xxx", "x x", "   ", 'x', DaedricIngotManager.customItem);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.customChestplate),  "x x", "xxx", "xxx", 'x', DaedricIngotManager.customItem);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.customLeggings),  "xxx", "x x", "x x", 'x', DaedricIngotManager.customItem);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.customBoots),  "x x", "x x", "   ", 'x', DaedricIngotManager.customItem);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.bossSpawn),  "xyu", "yzy", "wyx", 'y', DaedricIngotManager.customFood, 'x', DaedricIngotManager.customItem, 'z', Blocks.diamond_block, 'w', Items.blaze_rod, 'u', Blocks.obsidian);
    }//end addCraftingRecipes    
  
 
    public static void addSmeltingRecipes() {    
    	GameRegistry.addSmelting(new ItemStack(DaedricOreManager.daedricOre), new ItemStack(DaedricIngotManager.customItem), 10F);
    } //end addSmeltingRecipes
    
}
 