package com.kwpugh.powder_power.util.handlers;

import com.kwpugh.powder_power.PowderPower;
import com.kwpugh.powder_power.init.ItemInit;
import com.kwpugh.powder_power.util.BowUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = PowderPower.modid, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BowModelEventHandler
{
    @SubscribeEvent
    public static void setModelProperties(FMLClientSetupEvent event)
    {
        BowUtils.setupBowModelProperties(ItemInit.BOW_LAPIUM.get());
        BowUtils.setupBowModelProperties(ItemInit.BOW_REDIUM.get());
        BowUtils.setupBowModelProperties(ItemInit.BOW_GEMIUM.get());
        BowUtils.setupBowModelProperties(ItemInit.BOW_TRILIUM.get());
        BowUtils.setupBowModelProperties(ItemInit.BOW_QUADRILIUM.get());
    }
}
