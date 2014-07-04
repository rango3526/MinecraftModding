package com.camp.main;

import net.minecraft.client.renderer.entity.RenderSnowball;

import com.camp.entity.CustomEntityMob;
import com.camp.entity.DevilEntity;
import com.camp.entity.CustomEntityGrenade;
import com.camp.item.ItemManager;
import com.camp.model.demon_biped;
import com.camp.model.devil_biped;
import com.camp.render.CustomBipedRender;
import com.camp.render.RenderDevil;

import cpw.mods.fml.client.registry.RenderingRegistry;
 
public class ClientProxy extends ServerProxy {
 
    public void registerRenderThings() {      
    	RenderingRegistry.registerEntityRenderingHandler(CustomEntityMob.class, new CustomBipedRender(new demon_biped(), 0));
    	RenderingRegistry.registerEntityRenderingHandler(DevilEntity.class, new RenderDevil(new devil_biped(), 0));
    	RenderingRegistry.registerEntityRenderingHandler(CustomEntityGrenade.class, new RenderSnowball(ItemManager.grenade));
    }
    
    public int addArmor(String armor) {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }

}