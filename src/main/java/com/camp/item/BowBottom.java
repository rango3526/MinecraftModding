package com.camp.item;

import com.camp.lib.StringLibrary;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BowBottom extends Item {
	public BowBottom(){
		this.setUnlocalizedName("BowBottom");
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setMaxStackSize(64);
		this.setTextureName(StringLibrary.MODID + ":explosive_bow_bottom");
	}
}
