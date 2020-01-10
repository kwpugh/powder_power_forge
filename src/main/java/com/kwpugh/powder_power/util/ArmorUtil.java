package com.kwpugh.powder_power.util;

import javax.annotation.Nonnull;

import com.kwpugh.powder_power.lists.ItemList;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.EnderChestInventory;
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
				feet.getItem() == ItemList.armor_trilium_boots))   )
      	{
      		return true;  		
      	}
    	
    	PlayerInventory inv2 = player.inventory;
		EnderChestInventory end_inv2 = player.getInventoryEnderChest();
		
		//Checks player enderchest
		for (int slot = 0; slot < end_inv2.getSizeInventory(); slot++)
		{
			ItemStack stack = end_inv2.getStackInSlot(slot);
			if (stack.getItem() == ItemList.token_breathing)
			{	
				return true;
			}
		}
		
		//Checks player main inventory
		for (int slot = 0; slot < inv2.getSizeInventory(); slot++)
		{
			ItemStack stack = inv2.getStackInSlot(slot);
			if (stack.getItem() == ItemList.token_breathing)
			{	
				return true;
			}
		}
		
		//Checks Curios slots
		if (SupportMods.CURIOS.isLoaded())
	    {
			if (UtilCurios.findItem(ItemList.token_breathing, player) != ItemStack.EMPTY)
			{
				return true;
		    }
	    } 
      		
        return false;
    } 
    
    public static boolean isPlayerGotFallProtection(PlayerEntity player)
    { 
    	ItemStack head = player.getItemStackFromSlot(EquipmentSlotType.HEAD);
		ItemStack chest = player.getItemStackFromSlot(EquipmentSlotType.CHEST);
		ItemStack legs = player.getItemStackFromSlot(EquipmentSlotType.LEGS);
	    ItemStack feet = player.getItemStackFromSlot(EquipmentSlotType.FEET);
	    
	    ItemStack offHand = player.getItemStackFromSlot(EquipmentSlotType.OFFHAND);
	    
		PlayerInventory inv2 = player.inventory;
		EnderChestInventory end_inv2 = player.getInventoryEnderChest();
			
	    //Full Set or token
    	if(		(head.getItem() == ItemList.armor_gemium_head && 
    			chest.getItem() == ItemList.armor_gemium_body &&
    			legs.getItem() == ItemList.armor_gemium_leggings && 
    			feet.getItem() == ItemList.armor_gemium_boots) ||
    			
    			(head.getItem() == ItemList.armor_trilium_head && 
				chest.getItem() == ItemList.armor_trilium_body &&
				legs.getItem() == ItemList.armor_trilium_leggings && 
				feet.getItem() == ItemList.armor_trilium_boots) ||
    			
    			(offHand.getItem() == ItemList.token_no_fall	)   )
	      	{
	      		return true;  		
	      	}
	      	
    		//Checks player enderchest
			for (int slot = 0; slot < end_inv2.getSizeInventory(); slot++)
			{
				ItemStack stack = end_inv2.getStackInSlot(slot);
				if (stack.getItem() == ItemList.token_no_fall)
				{	
					return true;
				}
			}
			
			//Checks player main inventory
			for (int slot = 0; slot < inv2.getSizeInventory(); slot++)
			{
				ItemStack stack = inv2.getStackInSlot(slot);
				if (stack.getItem() == ItemList.token_no_fall)
				{	
					return true;
				}
			}
			
			//Checks Curios slots
			if (SupportMods.CURIOS.isLoaded())
		    {
				if (UtilCurios.findItem(ItemList.token_no_fall, player) != ItemStack.EMPTY)
				{
					return true;
			    }
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

	    PlayerInventory inv3 = player.inventory;
	    EnderChestInventory end_inv3 = player.getInventoryEnderChest();
	    
	    //Full armor or Token
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
	    	
			for (int slot = 0; slot < end_inv3.getSizeInventory(); slot++)
			{
				ItemStack stack = end_inv3.getStackInSlot(slot);
				if (stack.getItem() == ItemList.token_fire_resistance)
				{	
					return true;
				}
			}
		
			for (int slot = 0; slot < inv3.getSizeInventory(); slot++)
			{
				ItemStack stack = inv3.getStackInSlot(slot);
				if (stack.getItem() == ItemList.token_fire_resistance)
				{	
					return true;
				}
			}
			
			if (SupportMods.CURIOS.isLoaded())
		    {
				if (UtilCurios.findItem(ItemList.token_fire_resistance, player) != ItemStack.EMPTY)
				{
					return true;
			    }
		    }
      		
        return false;
    }
} 