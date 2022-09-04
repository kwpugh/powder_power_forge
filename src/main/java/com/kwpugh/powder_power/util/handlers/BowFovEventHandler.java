package com.kwpugh.powder_power.util.handlers;

import com.kwpugh.powder_power.PowderPower;
import com.kwpugh.powder_power.config.ConfigPowderPower;
import com.kwpugh.powder_power.items.toolbaseclasses.BowBase;
import com.kwpugh.powder_power.util.BowUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ComputeFovModifierEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid= PowderPower.modid, bus=EventBusSubscriber.Bus.FORGE, value=Dist.CLIENT)
public class BowFovEventHandler
{
    static double zoom = ConfigPowderPower.BOW_ZOOM.get();

    @SubscribeEvent
    public static void onFovEvent(ComputeFovModifierEvent event)
    {
        BowUtils.setupBowFov(event, p -> p instanceof BowBase, (float) zoom);
    }
}
