package com.kwpugh.powder_power.util;

import javax.annotation.Nonnull;

import com.kwpugh.powder_power.init.ItemInit;

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
    	if(		((head.getItem() == ItemInit.ARMOR_LAPIUM_HEAD.get() && 
    			chest.getItem() == ItemInit.ARMOR_LAPIUM_BODY.get() && 
    			legs.getItem() == ItemInit.ARMOR_LAPIUM_LEGGINGS.get() && 
    			feet.getItem() == ItemInit.ARMOR_LAPIUM_BOOTS.get()) ||
    	
    			(head.getItem() == ItemInit.ARMOR_GEMIUM_HEAD.get() && 
    			chest.getItem() == ItemInit.ARMOR_GEMIUM_BODY.get() && 
    			legs.getItem() == ItemInit.ARMOR_GEMIUM_LEGGINGS.get() && 
    			feet.getItem() == ItemInit.ARMOR_GEMIUM_BOOTS.get())  ||
		    	
    			(head.getItem() == ItemInit.ARMOR_TRILIUM_HEAD.get() && 
    			chest.getItem() == ItemInit.ARMOR_TRILUM_BODY.get() && 
    			legs.getItem() == ItemInit.ARMOR_TRILIUM_LEGGINGS.get() && 
    			feet.getItem() == ItemInit.ARMOR_TRILIUM_BOOTS.get()))     )
      	{
      		return true;  		
      	}
    	
    	PlayerInventory inv2 = player.inventory;
		EnderChestInventory end_inv2 = player.getInventoryEnderChest();
		
		//Checks player enderchest
		for (int slot = 0; slot < end_inv2.getSizeInventory(); slot++)
		{
			ItemStack stack = end_inv2.getStackInSlot(slot);
			if (stack.getItem() == ItemInit.TOKEN_BREATHING.get())
			{	
				return true;
			}
		}
		
		//Checks player main inventory
		for (int slot = 0; slot < inv2.getSizeInventory(); slot++)
		{
			ItemStack stack = inv2.getStackInSlot(slot);
			if (stack.getItem() == ItemInit.TOKEN_BREATHING.get())
			{	
				return true;
			}
		}
		
		//Checks Curios slots
		if (CuriosModCheck.CURIOS.isLoaded())
	    {
			if (CuriosUtil.findItem(ItemInit.TOKEN_BREATHING.get(), player) != ItemStack.EMPTY)
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
    	if(		(head.getItem() == ItemInit.ARMOR_GEMIUM_HEAD.get() && 
    			chest.getItem() == ItemInit.ARMOR_GEMIUM_BODY.get() && 
    			legs.getItem() == ItemInit.ARMOR_GEMIUM_LEGGINGS.get() && 
    			feet.getItem() == ItemInit.ARMOR_GEMIUM_BOOTS.get()) ||
    			
    			(head.getItem() == ItemInit.ARMOR_TRILIUM_HEAD.get() && 
    			chest.getItem() == ItemInit.ARMOR_TRILUM_BODY.get() && 
    			legs.getItem() == ItemInit.ARMOR_TRILIUM_LEGGINGS.get() && 
    			feet.getItem() == ItemInit.ARMOR_TRILIUM_BOOTS.get()) ||
    			
    			(offHand.getItem() == ItemInit.TOKEN_NO_FALL.get()	)   )
	      	{
	      		return true;  		
	      	}
	      	
    		//Checks player enderchest
			for (int slot = 0; slot < end_inv2.getSizeInventory(); slot++)
			{
				ItemStack stack = end_inv2.getStackInSlot(slot);
				if (stack.getItem() == ItemInit.TOKEN_NO_FALL.get())
				{	
					return true;
				}
			}
			
			//Checks player main inventory
			for (int slot = 0; slot < inv2.getSizeInventory(); slot++)
			{
				ItemStack stack = inv2.getStackInSlot(slot);
				if (stack.getItem() == ItemInit.TOKEN_NO_FALL.get())
				{	
					return true;
				}
			}
			
			//Checks Curios slots
			if (CuriosModCheck.CURIOS.isLoaded())
		    {
				if (CuriosUtil.findItem(ItemInit.TOKEN_NO_FALL.get(), player) != ItemStack.EMPTY)
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
    	if(		((head.getItem() == ItemInit.ARMOR_REDIUM_HEAD.get() && 
    			chest.getItem() == ItemInit.ARMOR_REDIUM_BODY.get() && 
    			legs.getItem() == ItemInit.ARMOR_REDIUM_LEGGINGS.get() && 
    			feet.getItem() == ItemInit.ARMOR_REDIUM_BOOTS.get()) ||
    			
    			(head.getItem() == ItemInit.ARMOR_GEMIUM_HEAD.get() && 
    			chest.getItem() == ItemInit.ARMOR_GEMIUM_BODY.get() && 
    			legs.getItem() == ItemInit.ARMOR_GEMIUM_LEGGINGS.get() && 
    			feet.getItem() == ItemInit.ARMOR_GEMIUM_BOOTS.get()) ||
		    	
    			(head.getItem() == ItemInit.ARMOR_TRILIUM_HEAD.get() && 
    			chest.getItem() == ItemInit.ARMOR_TRILUM_BODY.get() && 
    			legs.getItem() == ItemInit.ARMOR_TRILIUM_LEGGINGS.get() && 
    			feet.getItem() == ItemInit.ARMOR_TRILIUM_BOOTS.get()))  ||
		    	
    			(offHand.getItem() == ItemInit.TOKEN_FIRE_RESISTANCE.get()) )
	      	{
	      		return true;  		
	      	}
	    	
			for (int slot = 0; slot < end_inv3.getSizeInventory(); slot++)
			{
				ItemStack stack = end_inv3.getStackInSlot(slot);
				if (stack.getItem() == ItemInit.TOKEN_FIRE_RESISTANCE.get())
				{	
					return true;
				}
			}
		
			for (int slot = 0; slot < inv3.getSizeInventory(); slot++)
			{
				ItemStack stack = inv3.getStackInSlot(slot);
				if (stack.getItem() == ItemInit.TOKEN_FIRE_RESISTANCE.get())
				{	
					return true;
				}
			}
			
			if (CuriosModCheck.CURIOS.isLoaded())
		    {
				if (CuriosUtil.findItem(ItemInit.TOKEN_FIRE_RESISTANCE.get(), player) != ItemStack.EMPTY)
				{
					return true;
			    }
		    }
      		
        return false;
    }
} 