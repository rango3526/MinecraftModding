package com.camp.item;

import com.camp.lib.StringLibrary;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DiabolicStar extends Item {
	public DiabolicStar(){
		this.setUnlocalizedName("DiabolicStar");
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setMaxStackSize(64);
		this.setTextureName(StringLibrary.MODID + ":diabolic_star");
	}
}
