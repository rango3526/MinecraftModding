package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.camp.lib.StringLibrary;

public class DiabolicEssence extends Item {
	public DiabolicEssence(){
		this.setUnlocalizedName("DiabolicEssence");
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setMaxStackSize(64);
		this.setTextureName(StringLibrary.MODID + ":diabolicEssence");
	}
}
