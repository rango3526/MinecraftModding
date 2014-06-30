package com.camp.item;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.camp.lib.StringLibrary;

import cpw.mods.fml.common.registry.GameRegistry;
 
public class DaedricIngotManager {
     
    public static void mainRegistry() {
        initializeItem();
        registerItem();
    }
     
    public static Item customItem;
    public static Item customFood;
    
    public static void initializeItem() {
        customItem = new DaedricIngot();
        customFood = new CustomFood(2, 0.6F, false).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("CustomFood").setTextureName(StringLibrary.MODID + ":custom_food");
    }
          
    public static void registerItem() {
         GameRegistry.registerItem(customItem, customItem.getUnlocalizedName());
         GameRegistry.registerItem(customFood, customFood.getUnlocalizedName());
    }  
    
         
}