package com.camp.block;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.camp.lib.StringLibrary;

import cpw.mods.fml.common.registry.GameRegistry;

public class DaedricOreManager {
 
    public static void mainRegistry() {
        initializeBlock();
        registerBlock();
    }
    
    public static Block daedricOre;
    public static Block customBlockCrops;
 
    public static void initializeBlock() {
    	daedricOre = new DaedricOre(Material.rock);
    	customBlockCrops = new CustomBlockCrops().setCreativeTab(CreativeTabs.tabBlock).setBlockName("CustomBlockCrops").setBlockTextureName(StringLibrary.MODID + ":pepperPlant");
    }
 
    public static void registerBlock() {
    	GameRegistry.registerBlock(daedricOre, daedricOre.getUnlocalizedName());
    	GameRegistry.registerBlock(customBlockCrops, customBlockCrops.getUnlocalizedName());
    }
 
}