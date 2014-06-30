package com.camp.block;
 
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.camp.lib.StringLibrary;
 
public class DaedricOre extends Block {

	protected DaedricOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
		this.setBlockName("DaedricOre");
	    this.setCreativeTab(CreativeTabs.tabBlock);
	    this.setHardness(20);
	    this.setBlockTextureName(StringLibrary.MODID + ":daedric_ore");
	}
 
}
