package com.kwpugh.powder_power.util;

import com.kwpugh.powder_power.PowderPower;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

/*
 * Inspired and adapted from Sinhika's code in NetherRocks
 * 
 */

@EventBusSubscriber(modid = PowderPower.modid, bus = EventBusSubscriber.Bus.FORGE )
public final class ModEventSubscriber
{
    @SubscribeEvent(receiveCanceled = true, priority= EventPriority.HIGHEST)
    public static void onLivingHurtEvent(LivingAttackEvent event)
    {
        if (event.getEntityLiving() instanceof PlayerEntity)
        {
            PlayerEntity player = (PlayerEntity) event.getEntityLiving();

            //Fall Damage
            if ((event.getSource() == DamageSource.FALL) &&
                PlayerEquipUtil.isPlayerGotFallProtection(player))
            {
                if (event.isCancelable()) event.setCanceled(true);
            } 
            
            //Fire & Lava
            if (((event.getSource() == DamageSource.IN_FIRE) ||
            		(event.getSource() == DamageSource.ON_FIRE) || 
            		(event.getSource() == DamageSource.LAVA)) && 
            		PlayerEquipUtil.isPlayerGotFireProtection(player))
            {
                if (event.isCancelable()) event.setCanceled(true);
            }
            
            //Drowning
            if ((event.getSource() == DamageSource.DROWN) &&
                    PlayerEquipUtil.isPlayerGotWaterBreathing(player))
            {
            	if (event.isCancelable()) event.setCanceled(true);
            }
        } 
    }
} 