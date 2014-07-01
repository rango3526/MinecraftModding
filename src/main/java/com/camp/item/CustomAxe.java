package com.camp.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class CustomAxe extends ItemAxe {
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}

	protected CustomAxe(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		// TODO Auto-generated constructor stub
	}
 
}
