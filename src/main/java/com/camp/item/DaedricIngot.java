package com.camp.item;
 
import com.camp.lib.StringLibrary;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
 
public class DaedricIngot extends Item {
 
    public DaedricIngot() {
    	this.setUnlocalizedName("DaedricIngot");
        this.setCreativeTab(CreativeTabs.tabMaterials);
        this.setMaxStackSize(64);
        this.setTextureName(StringLibrary.MODID + ":daedric_ingot");
    }    
 
}