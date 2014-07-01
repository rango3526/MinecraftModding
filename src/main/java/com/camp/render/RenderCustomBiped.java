package com.camp.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.camp.lib.StringLibrary;
import com.camp.model.demon_biped;
 
public class RenderCustomBiped extends RenderLiving {
 
    public RenderCustomBiped(demon_biped par1ModelBase, float par2) {
    	super(par1ModelBase, par2);
        // TODO Auto-generated constructor stub
    }
 
    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
        // TODO Auto-generated method stub
        return new ResourceLocation(StringLibrary.MODID + ":texture/entity/custom_biped.png");
    }
}