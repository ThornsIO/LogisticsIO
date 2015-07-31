package com.thornsio.logisticsio;

import com.thornsio.logisticsio.Init.ModBlock;
import com.thornsio.logisticsio.Init.ModItem;
import com.thornsio.logisticsio.Init.Recipes;
import com.thornsio.logisticsio.block.BlockConveyor;
import com.thornsio.logisticsio.handler.ConfigurationHandler;
import com.thornsio.logisticsio.proxy.IProxy;
import com.thornsio.logisticsio.proxy.commonProxy;
import com.thornsio.logisticsio.reference.Reference;
import com.thornsio.logisticsio.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by ThornsIO on 30/07/2015.
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LogisticsIO
{
    @Mod.Instance(Reference.MOD_ID)
    public static LogisticsIO instance;

    public static Block blockConveyor;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;
    public static commonProxy commonProxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItem.init();
        ModBlock.init();

        //Renderers
        commonProxy.registerRenderThings();

        //temp
        blockConveyor = new BlockConveyor(Material.iron).setBlockName("conveyor").setBlockTextureName("");
        GameRegistry.registerBlock(blockConveyor, "conveyor");



        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        Recipes.init();
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}
