package com.camp.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityGrenade extends EntityThrowable {
	 
    public EntityGrenade(World par1World, EntityLivingBase par2EntityLivingBase) {
        super(par1World, par2EntityLivingBase);
        // TODO Auto-generated constructor stub
    }
 
    public EntityGrenade(World world) {
        super(world);
    }

	/*@Override
	protected void entityInit() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound var1) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound var1) {
		// TODO Auto-generated method stub

	}*/

	@Override
	protected void onImpact(MovingObjectPosition par1) {
		// TODO Auto-generated method stub
		if (!this.worldObj.isRemote) {
			this.worldObj.newExplosion(this, this.posX, this.posY, this.posZ, 8.0F, false, true);
	        this.setDead();
	    }
	}

}
