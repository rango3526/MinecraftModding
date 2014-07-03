package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.camp.lib.StringLibrary;

public class PartBowString extends Item {
	public PartBowString(){
		this.setUnlocalizedName("PartBowString");
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setMaxStackSize(64);
		this.setTextureName(StringLibrary.MODID + ":string_p");
	}
}
