package com.kwpugh.powder_power.util;

import javax.annotation.Nonnull;

import com.kwpugh.powder_power.lists.ItemList;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;

/*
 * Inspired and adapted from Sinhika's code in NetherRocks
 * 
 */

public final class ArmorUtil
{
    @Nonnull
    @SuppressWarnings("ConstantConditions")
    public static <T> T _null() {
        return null;
    }
    
    public static boolean isPlayerGotWaterBreathing(PlayerEntity player)
    { 
    	ItemStack head = player.getItemStackFromSlot(EquipmentSlotType.HEAD);
		ItemStack chest = player.getItemStackFromSlot(EquipmentSlotType.CHEST);
		ItemStack legs = player.getItemStackFromSlot(EquipmentSlotType.LEGS);
	    ItemStack feet = player.getItemStackFromSlot(EquipmentSlotType.FEET);
	    
	    ItemStack offHand = player.getItemStackFromSlot(EquipmentSlotType.OFFHAND);
	    
	    //Full Set
    	if(		((head.getItem() == ItemList.armor_lapium_head && 
    			chest.getItem() == ItemList.armor_lapium_body &&
    			legs.getItem() == ItemList.armor_lapium_leggings && 
    			feet.getItem() == ItemList.armor_lapium_boots) ||
    	
		    	(head.getItem() == ItemList.armor_gemium_head && 
				chest.getItem() == ItemList.armor_gemium_body &&
				legs.getItem() == ItemList.armor_gemium_leggings && 
				feet.getItem() == ItemList.armor_gemium_boots) ||
		    	
		    	(head.getItem() == ItemList.armor_trilium_head && 
				chest.getItem() == ItemList.armor_trilium_body &&
				legs.getItem() == ItemList.armor_trilium_leggings && 
				feet.getItem() == ItemList.armor_trilium_boots))  ||
		    	
		    	(offHand.getItem() == ItemList.token_breathing)  )
      	{
      		return true;  		
      	}
      		
        return false;
    } 
    
    public static boolean isPlayerGotFallProtection(PlayerEntity player)
    { 
    	ItemStack head = player.getItemStackFromSlot(EquipmentSlotType.HEAD);
		ItemStack chest = player.getItemStackFromSlot(EquipmentSlotType.CHEST);
		ItemStack legs = player.getItemStackFromSlot(EquipmentSlotType.LEGS);
	    ItemStack feet = player.getItemStackFromSlot(EquipmentSlotType.FEET);
	    
	    //Full Set or token
    	if(		(head.getItem() == ItemList.armor_gemium_head && 
    			chest.getItem() == ItemList.armor_gemium_body &&
    			legs.getItem() == ItemList.armor_gemium_leggings && 
    			feet.getItem() == ItemList.armor_gemium_boots) ||
    			
    			(head.getItem() == ItemList.armor_trilium_head && 
				chest.getItem() == ItemList.armor_trilium_body &&
				legs.getItem() == ItemList.armor_trilium_leggings && 
				feet.getItem() == ItemList.armor_trilium_boots)  )
      	{
      		return true;  		
      	}
      		
        return false;
    } 
    
    public static boolean isPlayerGotFireProtection(PlayerEntity player)
    {
    	ItemStack head = player.getItemStackFromSlot(EquipmentSlotType.HEAD);
		ItemStack chest = player.getItemStackFromSlot(EquipmentSlotType.CHEST);
		ItemStack legs = player.getItemStackFromSlot(EquipmentSlotType.LEGS);
	    ItemStack feet = player.getItemStackFromSlot(EquipmentSlotType.FEET);
	    
	    ItemStack offHand = player.getItemStackFromSlot(EquipmentSlotType.OFFHAND);
    	
	    //Full Set or token
    	if(		((head.getItem() == ItemList.armor_redium_head && 
    			chest.getItem() == ItemList.armor_redium_body &&
    			legs.getItem() == ItemList.armor_redium_leggings && 
    			feet.getItem() == ItemList.armor_redium_boots) ||
    			
		    	(head.getItem() == ItemList.armor_gemium_head && 
				chest.getItem() == ItemList.armor_gemium_body &&
				legs.getItem() == ItemList.armor_gemium_leggings && 
				feet.getItem() == ItemList.armor_gemium_boots) ||
		    	
		    	(head.getItem() == ItemList.armor_trilium_head && 
				chest.getItem() == ItemList.armor_trilium_body &&
				legs.getItem() == ItemList.armor_trilium_leggings && 
				feet.getItem() == ItemList.armor_trilium_boots))  ||
		    	
    			(offHand.getItem() == ItemList.token_fire_resistance) )
      	{
      		return true;  		
      	}
      		
        return false;
    } 
} 