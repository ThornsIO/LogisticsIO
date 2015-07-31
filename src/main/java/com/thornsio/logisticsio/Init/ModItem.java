package com.thornsio.logisticsio.Init;

import com.thornsio.logisticsio.item.*;
import com.thornsio.logisticsio.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import scala.tools.nsc.doc.model.Public;

/**
 * Created by ThornsIO on 30/07/2015.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class ModItem
{
    public static final ItemIO roller = new ItemRoller();
    public static final ItemIO steelingot = new ItemIngotSteel();
    public static final ItemIO steelpate = new ItemSteelPlate();
    public static final ItemIO controlchip = new ItemControlChip();

    public static void  init()
    {
        GameRegistry.registerItem(roller, "Roller");
        GameRegistry.registerItem(steelingot, "Steel Ingot");
        GameRegistry.registerItem(steelpate, "Steel Plate");
        GameRegistry.registerItem(controlchip, "Control Chip");
    }
}
