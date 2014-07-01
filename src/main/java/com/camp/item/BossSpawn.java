package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.camp.entity.DevilEntity;
import com.camp.lib.StringLibrary;

public class BossSpawn extends Item {
	public BossSpawn(){
		this.setUnlocalizedName("BossSpawn");
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setMaxStackSize(64);
		this.setTextureName(StringLibrary.MODID + ":boss_spawn_texture");
	}

	public boolean onItemUse(ItemStack item, EntityPlayer player, World par1world, int x, int y, int z, int side, float xOffset, float yOffset, float zOffSet)
	{
		if (!par1world.isRemote) {
			DevilEntity ent = new DevilEntity(par1world); //change to whatever entity you're trying to spawn
			ent.setLocationAndAngles(x, y + 1, z, MathHelper.wrapAngleTo180_float(par1world.rand.nextFloat() * 360.0F), 0.0F);
			//ent.initCreature();
			par1world.spawnEntityInWorld(ent);
			ent.setLocationAndAngles(x, y+1, z, zOffSet, zOffSet);
		}
		return true;
	}

}

