package com.thornsio.logisticsio.creativetab;

import com.thornsio.logisticsio.Init.ModItem;
import com.thornsio.logisticsio.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by ThornsIO on 31/07/2015.
 */
public class CTIO
{
    public static final CreativeTabs LIO_TAB = new CreativeTabs(Reference.LOWERCASE_MOD_ID)
    {
        @Override
        public Item getTabIconItem() {
            return ModItem.roller;
        }
    };
}
