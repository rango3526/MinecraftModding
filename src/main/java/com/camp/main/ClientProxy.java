package com.camp.main;

import net.minecraft.client.model.ModelBiped;

import com.camp.entity.CustomEntityMob;
import com.camp.entity.DevilEntity;
import com.camp.model.devil_biped;
import com.camp.render.RenderCustomBiped;
import com.camp.render.RenderDevil;

import cpw.mods.fml.client.registry.RenderingRegistry;
 
public class ClientProxy extends ServerProxy {
 
    public void registerRenderThings() {      
    	RenderingRegistry.registerEntityRenderingHandler(CustomEntityMob.class, new RenderCustomBiped(new ModelBiped(), 0));
    	RenderingRegistry.registerEntityRenderingHandler(DevilEntity.class, new RenderDevil(new devil_biped(), 0));
    }

}