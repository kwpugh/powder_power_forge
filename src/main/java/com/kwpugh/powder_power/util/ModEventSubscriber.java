package com.kwpugh.powder_power.util;

import com.kwpugh.powder_power.PowderPower;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.monster.PhantomEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = PowderPower.modid, bus = EventBusSubscriber.Bus.FORGE )
public final class ModEventSubscriber
{
    @SubscribeEvent
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
    
    @SubscribeEvent
    public static void breakingBlockSpeed(PlayerEvent.BreakSpeed event)
    {
        PlayerEntity player = event.getPlayer();
        ItemStack stack = player.getHeldItemMainhand(); 
        BlockPos pos = event.getPos();
        Block block = event.getState().getBlock();
        
        if (player != null && !(player instanceof FakePlayer) && !player.isCreative())
        {    
        	if(PlayerEquipUtil.isPlayerGotHasteToken(player))
        	{
        		if(net.minecraftforge.common.ForgeHooks.canToolHarvestBlock(event.getPlayer().world, pos, stack))
        		{
        			if(block == Blocks.OBSIDIAN)
        			{
        				event.setNewSpeed(PowderPowerConfig.haste_token_break_speed.get() * 8);
        			}
        			else
        			{
        				event.setNewSpeed(PowderPowerConfig.haste_token_break_speed.get());
        			}	
        		}
        	}
        }
    }
    
    @SubscribeEvent
    public static void onLivingSetAttackTarget(LivingSetAttackTargetEvent event)
    {		
    	if (event.getTarget() instanceof PlayerEntity && event.getEntityLiving()instanceof MobEntity)
        {		
        	PlayerEntity player = (PlayerEntity) event.getTarget();
    		MobEntity attacker = (MobEntity) event.getEntityLiving();
    		
    		//Phantom won't target player if in inventory
    		if (PlayerEquipUtil.isPlayerGotUnseenToken(player) && attacker instanceof PhantomEntity)
    		{
    			attacker.setAttackTarget(null);
    		}
    		
    		//No mobs will target if in main hand and off hand is empty
    		if(PlayerEquipUtil.isPlayerGotUnseenTokenInHand(player))
    		{
    			attacker.setAttackTarget(null);
    		}
        }
    }
} 