package com.camp.block;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class DaedricOreManager {
 
    public static void mainRegistry() {
        initializeBlock();
        registerBlock();
    }
    
    public static Block daedricOre;
 
    public static void initializeBlock() {
    	daedricOre = new DaedricOre(Material.rock);
    }
 
    public static void registerBlock() {
    	GameRegistry.registerBlock(daedricOre, daedricOre.getUnlocalizedName());
    }
 
}