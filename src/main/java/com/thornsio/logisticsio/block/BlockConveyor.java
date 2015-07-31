package com.thornsio.logisticsio.block;

import com.thornsio.logisticsio.creativetab.CTIO;
import com.thornsio.logisticsio.tileentity.TileEntityBlockConveyor;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by ThornsIO on 31/07/2015.
 */
public class BlockConveyor extends BlockContainer
{
    public BlockConveyor(Material material) {
        super(material);
        this.setHardness(2.0F);
        this.setResistance(5.0F);

        this.setCreativeTab(CTIO.LIO_TAB);
    }

    public int GetRenderType()
    {
        return -1;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2) {
        return new TileEntityBlockConveyor();
    }
}
