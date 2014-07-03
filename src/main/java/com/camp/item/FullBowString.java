package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.camp.lib.StringLibrary;

public class FullBowString extends Item {
	public FullBowString(){
		this.setUnlocalizedName("FullBowString");
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setMaxStackSize(64);
		this.setTextureName(StringLibrary.MODID + ":string_f");
	}
}
