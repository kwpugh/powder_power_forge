package com.kwpugh.powder_power.util;

import com.kwpugh.powder_power.PowderPower;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.monster.Phantom;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingExperienceDropEvent;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = PowderPower.modid, bus = EventBusSubscriber.Bus.FORGE )
public final class ForgeEventSubscriber
{
	static int miningExp = ConfigPowderPower.exp_token_mining_value.get();
	static int killingExp = ConfigPowderPower.exp_token_killing_value.get();
	
	//Protects the player from various forms of damage
    @SubscribeEvent
    public static void onLivingHurtEvent(LivingAttackEvent event)
    {
        if (event.getEntityLiving() instanceof Player)
        {
            Player player = (Player) event.getEntityLiving();

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
    
//    //Increases the players block breaking speed
//    @SubscribeEvent
//    public static void breakingBlockSpeed(PlayerEvent.BreakSpeed event)
//    {
//        PlayerEntity player = event.getPlayer();
//        ItemStack stack = player.getHeldItemMainhand(); 
//        BlockPos pos = event.getPos();
//        Block block = event.getState().getBlock();
//        
//        if (player != null && !(player instanceof FakePlayer) && !player.isCreative())
//        {    
//        	if(PlayerEquipUtil.isPlayerGotHasteToken(player))
//        	{
//        		if(block == Blocks.OBSIDIAN)
//        		{
//        			event.setNewSpeed(ConfigPowderPower.haste_token_break_speed.get() * 8);
//        		}
//        		else
//        		{
//        			event.setNewSpeed(ConfigPowderPower.haste_token_break_speed.get());
//        		}	
//        	}
//        }
//    }
    
    //Gives greater XP when killing mobs that normally drop XP on death
    @SubscribeEvent
    public static void onKillingExpDropEvent(LivingExperienceDropEvent event)
    {
    	if (event.getAttackingPlayer() instanceof Player && event.getEntityLiving()instanceof Mob)
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
    public static void onMiningExpDropEvent(BreakEvent event)
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
    
//    //Gives greater XP when mining ores that normally drop XP
//    @SubscribeEvent
//    public static void onMiningExpDropEvent(BreakEvent event)
//    {
//    	if(event.getState().getBlock() instanceof OreBlock)
//    	{
//       		if(event.getPlayer() instanceof PlayerEntity)
//    		{
//    			PlayerEntity player = (PlayerEntity) event.getPlayer();
//
//    			if (PlayerEquipUtil.isPlayerGotExpToken(player))
//    			{   				
//    				event.setExpToDrop(miningExp);
//    			}
//    		}
//    	}	
//    }
    
    //Allow player to be unseen by mobs
    @SubscribeEvent
    public static void onLivingSetAttackTarget(LivingSetAttackTargetEvent event)
    {		
    	if (event.getTarget() instanceof Player && event.getEntityLiving()instanceof Mob)
        {		
        	Player player = (Player) event.getTarget();
    		Mob attacker = (Mob) event.getEntityLiving();
    		
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