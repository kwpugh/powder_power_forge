package com.kwpugh.powder_power.util;

import javax.annotation.Nonnull;

import com.kwpugh.powder_power.init.ItemInit;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;

public final class PlayerEquipUtil
{	   
    @Nonnull
    //@SuppressWarnings("ConstantConditions")
    public static <T> T _null() 
    {
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
    			feet.getItem() == ItemInit.ARMOR_TRILIUM_BOOTS.get())  ||
    			
    			(head.getItem() == ItemInit.ARMOR_QUADRILIUM_HEAD.get() && 
    			chest.getItem() == ItemInit.ARMOR_QUADRILIUM_BODY.get() && 
    			legs.getItem() == ItemInit.ARMOR_QUADRILIUM_LEGGINGS.get() && 
    			feet.getItem() == ItemInit.ARMOR_QUADRILIUM_BOOTS.get()))     )
      	{
      		return true;  		
      	}
    	
    	PlayerInventory inv2 = player.inventory;
		
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
			
	    //Full Set or token
    	if(		(head.getItem() == ItemInit.ARMOR_GEMIUM_HEAD.get() && 
    			chest.getItem() == ItemInit.ARMOR_GEMIUM_BODY.get() && 
    			legs.getItem() == ItemInit.ARMOR_GEMIUM_LEGGINGS.get() && 
    			feet.getItem() == ItemInit.ARMOR_GEMIUM_BOOTS.get()) ||
    			
    			(head.getItem() == ItemInit.ARMOR_TRILIUM_HEAD.get() && 
    			chest.getItem() == ItemInit.ARMOR_TRILUM_BODY.get() && 
    			legs.getItem() == ItemInit.ARMOR_TRILIUM_LEGGINGS.get() && 
    			feet.getItem() == ItemInit.ARMOR_TRILIUM_BOOTS.get()) ||
    			
    			(head.getItem() == ItemInit.ARMOR_QUADRILIUM_HEAD.get() && 
    			chest.getItem() == ItemInit.ARMOR_QUADRILIUM_BODY.get() && 
    			legs.getItem() == ItemInit.ARMOR_QUADRILIUM_LEGGINGS.get() && 
    			feet.getItem() == ItemInit.ARMOR_QUADRILIUM_BOOTS.get())  ||
    			
    			(offHand.getItem() == ItemInit.TOKEN_NO_FALL.get()	)   )
	      	{
	      		return true;  		
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
    			
    			(head.getItem() == ItemInit.ARMOR_QUADRILIUM_HEAD.get() && 
    			chest.getItem() == ItemInit.ARMOR_QUADRILIUM_BODY.get() && 
    			legs.getItem() == ItemInit.ARMOR_QUADRILIUM_LEGGINGS.get() && 
    			feet.getItem() == ItemInit.ARMOR_QUADRILIUM_BOOTS.get())  ||
		    	
    			(offHand.getItem() == ItemInit.TOKEN_FIRE_RESISTANCE.get()) )
	      	{
	      		return true;  		
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
    
    public static boolean isPlayerGotHasteToken(PlayerEntity player)
    { 	    
		PlayerInventory inv2 = player.inventory;
		
		//Checks player main inventory
		for (int slot = 0; slot < inv2.getSizeInventory(); slot++)
		{
			ItemStack stack = inv2.getStackInSlot(slot);
			if (stack.getItem() == ItemInit.TOKEN_HASTE.get())
			{	
				return true;
			}
		}
		
		//Checks Curios slots
		if (CuriosModCheck.CURIOS.isLoaded())
	    {
			if (CuriosUtil.findItem(ItemInit.TOKEN_HASTE.get(), player) != ItemStack.EMPTY)
			{
				return true;
		    }
	    } 
		
        return false;
    } 

    public static boolean isPlayerGotExpToken(PlayerEntity player)
    { 	    
		PlayerInventory inv2 = player.inventory;
		
		//Checks player main inventory
		for (int slot = 0; slot < inv2.getSizeInventory(); slot++)
		{
			ItemStack stack = inv2.getStackInSlot(slot);
			if (stack.getItem() == ItemInit.TOKEN_EXP.get())
			{	
				return true;
			}
		}
		
		//Checks Curios slots
		if (CuriosModCheck.CURIOS.isLoaded())
	    {
			if (CuriosUtil.findItem(ItemInit.TOKEN_EXP.get(), player) != ItemStack.EMPTY)
			{
				return true;
		    }
	    } 
		
        return false;
    } 
    
    public static boolean isPlayerGotUnseenToken(PlayerEntity player)
    { 	    
		PlayerInventory inv2 = player.inventory;
		
		//Checks player main inventory
		for (int slot = 0; slot < inv2.getSizeInventory(); slot++)
		{
			ItemStack stack = inv2.getStackInSlot(slot);
			if (stack.getItem() == ItemInit.TOKEN_UNSEEN.get())
			{	
				return true;
			}
		}
		
		//Checks Curios slots
		if (CuriosModCheck.CURIOS.isLoaded())
	    {
			if (CuriosUtil.findItem(ItemInit.TOKEN_UNSEEN.get(), player) != ItemStack.EMPTY)
			{
				return true;
		    }
	    } 
		
        return false;
    } 
 
    public static boolean isPlayerGotUnseenTokenInHand(PlayerEntity player)
    { 	    
    	ItemStack mainHand = player.getHeldItemMainhand();
    	ItemStack offHand = player.getHeldItemOffhand();
    	
    	if(mainHand.getItem() == ItemInit.TOKEN_UNSEEN.get() && offHand.isEmpty())
      	{
      		return true;  		
      	} 
		
        return false;
    }
} 