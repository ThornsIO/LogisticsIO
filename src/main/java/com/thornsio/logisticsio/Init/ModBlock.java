package com.thornsio.logisticsio.Init;


import com.thornsio.logisticsio.block.BlockConveyor;
import com.thornsio.logisticsio.block.BlockIO;
import com.thornsio.logisticsio.block.BlockTest;
import com.thornsio.logisticsio.reference.Reference;
import com.thornsio.logisticsio.tileentity.TileEntityBlockConveyor;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by ThornsIO on 31/07/2015.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)


public class ModBlock
{
    public static final BlockIO test = new BlockTest();


    public static void init()
    {
        GameRegistry.registerBlock(test, "test");
    }
}
