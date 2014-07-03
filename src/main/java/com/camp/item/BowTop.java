package com.camp.item;

import com.camp.lib.StringLibrary;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BowTop extends Item {
	public BowTop(){
		this.setUnlocalizedName("BowTop");
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setMaxStackSize(64);
		this.setTextureName(StringLibrary.MODID + ":explosive_bow_top");
	}
}
