package com.camp.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import com.camp.model.devil_biped;

import com.camp.lib.StringLibrary;

public class RenderDevil extends RenderLiving {

	public RenderDevil(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		// TODO Auto-generated method stub
		return new ResourceLocation(StringLibrary.MODID + ":texture/entity/devil_biped_assets.png");
	}

}
