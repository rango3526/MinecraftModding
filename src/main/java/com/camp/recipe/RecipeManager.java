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
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.bossSpawn),  "xyx", "yzy", "xyx", 'y', Items.diamond, 'x', Blocks.obsidian, 'z', ItemManager.diabolicEssence);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.fireBow), "xy ", "x z", "xy", 'x', Items.string, 'y', Items.blaze_rod, 'z', ItemManager.bossSpawn);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.grenade), "yxy", "xzx", "yxy", 'x', Items.gunpowder, 'y', DaedricIngotManager.customItem, 'z', ItemManager.diabolicEssence);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.diabolicEssence), "xyu", "yzy", "wyx", 'x', DaedricIngotManager.customItem, 'y', DaedricIngotManager.customFood, 'z', Items.lava_bucket, 'w', Items.blaze_rod, 'u', Blocks.obsidian);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.enderRod), "xxx", "xyx", "xxx", 'x', Items.blaze_rod, 'y', Items.ender_eye);
        GameRegistry.addShapedRecipe(new ItemStack(DaedricOreManager.daedricBlock), "xxx", "xxx", "xxx", 'x', DaedricIngotManager.customItem);
        GameRegistry.addShapedRecipe(new ItemStack(DaedricOreManager.compressedTNT), "xxx", "xxx", "xxx", 'x', Blocks.tnt);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.partBowString), "xyx", "xzx", "xyx", 'x', Items.string, 'y', Blocks.gold_block, 'z', DaedricOreManager.daedricBlock);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.fullBowString), " yx", "yzy", "xy ", 'x', ItemManager.partBowString, 'y', Blocks.redstone_block, 'z', ItemManager.enderRod);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.explodeBow), " xw", "y w", " zw", 'x', ItemManager.bowTop, 'y', ItemManager.bowMiddle, 'z', ItemManager.bowBottom, 'w', ItemManager.fullBowString);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.bowBottom), "x  ", "yz ", "  w", 'x', Items.flint_and_steel, 'y', Blocks.iron_block, 'z', Blocks.obsidian, 'w', DaedricOreManager.daedricBlock);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.bowMiddle), "xyx", "zwz", "xyx", 'x', Blocks.obsidian, 'y', ItemManager.enderRod, 'z', Blocks.diamond_block, 'w', ItemManager.diabolicStar);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.bowTop), " xy", "xyz", "xyz", 'x', DaedricOreManager.compressedTNT, 'y', ItemManager.enderRod, 'z', Blocks.obsidian);
        
        
    }    
  
 
    public static void addSmeltingRecipes() {    
    	GameRegistry.addSmelting(new ItemStack(DaedricOreManager.daedricOre), new ItemStack(DaedricIngotManager.customItem), 10F);
    	//GameRegistry.addSmelting(new ItemStack(ItemManager.bossSpawn), new ItemStack(ItemManager.));
    }
    
}
 