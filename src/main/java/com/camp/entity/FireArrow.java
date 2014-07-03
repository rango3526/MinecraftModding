package com.camp.entity;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class FireArrow extends EntityArrow implements IProjectile {

	public FireArrow(World par1World, EntityLivingBase par2EntityLivingBase, float par3) {
		super(par1World, par2EntityLivingBase, par3);
		this.setFire(10);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void onUpdate() {
        super.onUpdate();
        if(this.isBurning()) {
            this.worldObj.setBlock((int) this.posX, (int) this.posY, (int) this.posZ, Blocks.fire);
        }
    }

}
