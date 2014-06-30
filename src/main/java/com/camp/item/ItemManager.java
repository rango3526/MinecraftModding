package com.camp.item;
 
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;
 
public class ItemManager {
     
	public static ToolMaterial rubyMat = EnumHelper.addToolMaterial("Ruby", 3, 64, 100.0F, 3, 15);
    public static void mainRegistry() {
        initializeItem();
        registerItem();
    }
     
    public static Item customItem;
          
    public static void initializeItem() {
        customItem = new CustomItem(rubyMat);
    }
          
    public static void registerItem() {
         GameRegistry.registerItem(customItem, customItem.getUnlocalizedName());
    }
         
}