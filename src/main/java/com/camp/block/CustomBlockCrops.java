package com.camp.block;
 
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

import com.camp.item.DaedricIngotManager;
import com.camp.item.ItemManager;
 
public class CustomBlockCrops extends BlockCrops {
     
    protected Item func_149866_i() {
        return ItemManager.customSeeds;
    }
 
    protected Item func_149865_P() {
        return DaedricIngotManager.customFood;
    }
}
