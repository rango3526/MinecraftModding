package com.camp.item;

import com.camp.lib.StringLibrary;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EnderRod extends Item {
	public EnderRod(){
		this.setUnlocalizedName("EnderRod");
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setMaxStackSize(64);
		this.setTextureName(StringLibrary.MODID + ":ender_rod");
	}
}
