package com.camp.item;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.common.util.EnumHelper;

import com.camp.block.DaedricOreManager;
import com.camp.lib.StringLibrary;
import com.camp.main.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
 
public class ItemManager {
     
	public static ToolMaterial rubyMat = EnumHelper.addToolMaterial("Ruby", 3, 64, 100.0F, 3, 15);
    public static void mainRegistry() {
        initializeItem();
        registerItem();
    }
     
    public static Item customItem;
    public static Item customPickaxe;
    public static Item customShovel;
    public static Item customAxe;
    public static Item customHoe;
    public static Item customHelmet;
    public static Item customChestplate;
    public static Item customLeggings;
    public static Item customBoots;
    public static ToolMaterial customToolMaterial = EnumHelper.addToolMaterial("Daedric", 3, 2000, 7.0F, 4.0F, 25);
    public static ArmorMaterial customArmorMaterial = EnumHelper.addArmorMaterial("CustomArmorMaterial", 40, new int[]{3, 7, 5, 4}, 25);
    
    public static Item customSeeds;
    //public static Item customItemCrops;
    public static Item bossSpawn;
    public static Item fireBow;
    public static Item grenade;
    public static Item diabolicEssence;
    
    
    public static Item explodeBow;
    public static Item enderRod;
    public static Item partBowString;
    public static Item fullBowString;
    public static Item bowTop;
    public static Item bowMiddle;
    public static Item bowBottom;
    public static Item diabolicStar;
          
    public static void initializeItem() {
        customItem = new SwordCustom(rubyMat);
        bossSpawn = new BossSpawn();
        diabolicEssence = new DiabolicEssence();
        enderRod = new EnderRod();
        partBowString = new PartBowString();
        fullBowString = new FullBowString();
        bowTop = new BowTop();
        bowMiddle = new BowMiddle();
        bowBottom = new BowBottom();
        diabolicStar= new DiabolicStar();
        customPickaxe = new PickaxeCustom(customToolMaterial).setUnlocalizedName("CustomPickaxe").setCreativeTab(CreativeTabs.tabTools).setTextureName("cm:custom_pickaxe");
        customShovel = new ShovelCustom(customToolMaterial).setUnlocalizedName("CustomShovel").setCreativeTab(CreativeTabs.tabTools).setTextureName("cm:custom_shovel");
        customAxe = new AxeCustom(customToolMaterial).setUnlocalizedName("CustomAxe").setCreativeTab(CreativeTabs.tabTools).setTextureName("cm:custom_axe");
        customHoe = new HoeCustom(customToolMaterial).setUnlocalizedName("CustomHoe").setCreativeTab(CreativeTabs.tabTools).setTextureName("cm:custom_hoe");
        customHelmet = new ArmorSet(customArmorMaterial, MainRegistry.proxy.addArmor("CustomHelmet"), 0).setUnlocalizedName("CustomHelmet").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":custom_helmet");
        customChestplate = new ArmorSet(customArmorMaterial, MainRegistry.proxy.addArmor("CustomChestplate"), 1).setUnlocalizedName("CustomChestplate").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":custom_chestplate");
        customLeggings = new ArmorSet(customArmorMaterial, MainRegistry.proxy.addArmor("CustomLeggings"), 2).setUnlocalizedName("CustomLeggings").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":custom_leggings");
        customBoots = new ArmorSet(customArmorMaterial, MainRegistry.proxy.addArmor("CustomBoots"), 3).setUnlocalizedName("CustomBoots").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":custom_boots");
        
        customSeeds = new ItemSeeds(DaedricOreManager.customBlockCrops, Blocks.farmland).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("CustomSeeds").setTextureName(StringLibrary.MODID + ":pepperSeeds");
        //customItemCrops = new Item().setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("CustomItemCrops").setTextureName(StringLibrary.MODID + ":custom_item_crops");
        
        fireBow = new FireBow().setUnlocalizedName("FireBow").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":fire_bow_draw");
        grenade = new ItemGrenade().setUnlocalizedName("Grenade").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":unstableDaedricOrb");
        explodeBow = new ExplodeBow().setUnlocalizedName("ExplodeBow").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":explosive_bow");
    }
          
    public static void registerItem() {
         GameRegistry.registerItem(customItem, customItem.getUnlocalizedName());
         GameRegistry.registerItem(customPickaxe, customPickaxe.getUnlocalizedName());
         GameRegistry.registerItem(customShovel, customShovel.getUnlocalizedName());
         GameRegistry.registerItem(customAxe, customAxe.getUnlocalizedName());
         GameRegistry.registerItem(customHoe, customHoe.getUnlocalizedName());
         GameRegistry.registerItem(customHelmet, customHelmet.getUnlocalizedName());
         GameRegistry.registerItem(customChestplate, customChestplate.getUnlocalizedName());
         GameRegistry.registerItem(customLeggings, customLeggings.getUnlocalizedName());
         GameRegistry.registerItem(customBoots, customBoots.getUnlocalizedName());
         GameRegistry.registerItem(customSeeds, customSeeds.getUnlocalizedName());
         //GameRegistry.registerItem(customItemCrops, customItemCrops.getUnlocalizedName());
         GameRegistry.registerItem(bossSpawn, bossSpawn.getUnlocalizedName());
         GameRegistry.registerItem(fireBow, fireBow.getUnlocalizedName());
         GameRegistry.registerItem(grenade, grenade.getUnlocalizedName());
         GameRegistry.registerItem(diabolicEssence, diabolicEssence.getUnlocalizedName());
         GameRegistry.registerItem(explodeBow, explodeBow.getUnlocalizedName());
         GameRegistry.registerItem(enderRod, enderRod.getUnlocalizedName());
         GameRegistry.registerItem(partBowString, partBowString.getUnlocalizedName());
         GameRegistry.registerItem(fullBowString, fullBowString.getUnlocalizedName());
         GameRegistry.registerItem(bowTop, bowTop.getUnlocalizedName());
         GameRegistry.registerItem(bowMiddle, bowMiddle.getUnlocalizedName());
         GameRegistry.registerItem(bowBottom, bowBottom.getUnlocalizedName());
         GameRegistry.registerItem(diabolicStar, diabolicStar.getUnlocalizedName());
    }
         
}