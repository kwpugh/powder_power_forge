package com.kwpugh.powder_power.util.handlers;

import com.kwpugh.powder_power.PowderPower;
import com.kwpugh.powder_power.config.ConfigPowderPower;
import com.kwpugh.powder_power.util.PlayerEquipUtil;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.monster.Phantom;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingExperienceDropEvent;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = PowderPower.modid, bus = EventBusSubscriber.Bus.FORGE )
public final class AbilityEventHandler
{
	static int miningExp = ConfigPowderPower.EXP_TOKEN_MINING_VALUE.get();
	static int killingExp = ConfigPowderPower.EXP_TOKEN_KILLING_VALUE.get();
	
	//Protects the player from various forms of damage
    @SubscribeEvent
    public static void onLivingHurtEvent(LivingAttackEvent event)
    {
        if (event.getEntity() instanceof Player player)
        {
			//Fall Damage
            if ((event.getSource() == DamageSource.FALL) &&
                PlayerEquipUtil.isPlayerGotFallProtection(player))
            {
                if (event.isCancelable()) event.setCanceled(true);
            }

            //Fire & Lava
            if ((event.getSource() == DamageSource.IN_FIRE) ||
            		(event.getSource() == DamageSource.ON_FIRE) ||
					(event.getSource() == DamageSource.HOT_FLOOR) ||
					(event.getSource() == DamageSource.LAVA))
			{
				if(PlayerEquipUtil.isPlayerGotFireProtection(player))
				{
					if (event.isCancelable()) event.setCanceled(true);
				}
			}
            
            //Drowning
            if ((event.getSource() == DamageSource.DROWN) &&
                    PlayerEquipUtil.isPlayerGotWaterBreathing(player))
            {
            	if (event.isCancelable()) event.setCanceled(true);
            }
        } 
    }

    
    //Gives greater XP when killing mobs that normally drop XP on death
    @SubscribeEvent
    public static void onKillingExpDropEvent(LivingExperienceDropEvent event)
    {
    	if (event.getAttackingPlayer() instanceof Player && event.getEntity()instanceof Mob)
    	{
    		Player player = (Player) event.getAttackingPlayer();
    		
     		if (PlayerEquipUtil.isPlayerGotExpToken(player))
    		{
    			int orgExp = event.getOriginalExperience();
    			int newExp = orgExp * killingExp;
    			event.setDroppedExperience(newExp);
    		} 
    	}
    }
   
    //Gives greater XP when mining ores that normally drop XP
    @SubscribeEvent
    public static void onMiningExpDropEvent(BlockEvent.BreakEvent event)
    {
    	Block block = event.getState().getBlock();
    	
    	if(block == Blocks.REDSTONE_ORE ||
    			block == Blocks.COAL_ORE ||
    			block == Blocks.LAPIS_ORE ||
    			block == Blocks.DIAMOND_ORE ||
    			block == Blocks.EMERALD_ORE ||
    			block == Blocks.NETHER_QUARTZ_ORE)
    	{
       		if(event.getPlayer() instanceof Player)
    		{
    			Player player = (Player) event.getPlayer();

    			if (PlayerEquipUtil.isPlayerGotExpToken(player))
    			{ 
    				if(!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, player.getMainHandItem()) != 0))
    				{
    					event.setExpToDrop(miningExp);
    				}
    				
    			}
    		}
    	}
    	
    }
    
    //Allow player to be unseen by mobs
    @SubscribeEvent
    public static void onLivingSetAttackTarget(LivingSetAttackTargetEvent event)
    {		
    	if (event.getTarget() instanceof Player && event.getEntity()instanceof Mob)
        {		
        	Player player = (Player) event.getTarget();
    		Mob attacker = (Mob) event.getEntity();
    		
    		//Phantom won't target player if in inventory
    		if (PlayerEquipUtil.isPlayerGotUnseenToken(player) && attacker instanceof Phantom)
    		{
    			attacker.setTarget(null);
    		}
    		
    		//No mobs will target if in main hand and off hand is empty
    		if(PlayerEquipUtil.isPlayerGotUnseenTokenInHand(player))
    		{
    			attacker.setTarget(null);
    		}
        }
    }
} 