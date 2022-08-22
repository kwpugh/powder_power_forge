package com.kwpugh.powder_power.util;

import com.kwpugh.powder_power.config.ConfigPowderPower;
import com.kwpugh.powder_power.init.ItemInit;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public final class PlayerEquipUtil
{	   
    @Nonnull
    //@SuppressWarnings("ConstantConditions")
    public static <T> T _null() 
    {
        return null;
    }

    public static boolean hasRediumArmor(Player player)
	{
		ItemStack head = player.getItemBySlot(EquipmentSlot.HEAD);
		ItemStack chest = player.getItemBySlot(EquipmentSlot.CHEST);
		ItemStack legs = player.getItemBySlot(EquipmentSlot.LEGS);
		ItemStack feet = player.getItemBySlot(EquipmentSlot.FEET);

		if(head.getItem() == ItemInit.ARMOR_REDIUM_HEAD.get() &&
				chest.getItem() == ItemInit.ARMOR_REDIUM_BODY.get() &&
				legs.getItem() == ItemInit.ARMOR_REDIUM_LEGGINGS.get() &&
				feet.getItem() == ItemInit.ARMOR_REDIUM_BOOTS.get())
		{
			return true;
		}

		return false;
	}

	public static boolean hasLapiumArmor(Player player)
	{
		ItemStack head = player.getItemBySlot(EquipmentSlot.HEAD);
		ItemStack chest = player.getItemBySlot(EquipmentSlot.CHEST);
		ItemStack legs = player.getItemBySlot(EquipmentSlot.LEGS);
		ItemStack feet = player.getItemBySlot(EquipmentSlot.FEET);

		if(head.getItem() == ItemInit.ARMOR_LAPIUM_HEAD.get() &&
				chest.getItem() == ItemInit.ARMOR_LAPIUM_BODY.get() &&
				legs.getItem() == ItemInit.ARMOR_LAPIUM_LEGGINGS.get() &&
				feet.getItem() == ItemInit.ARMOR_LAPIUM_BOOTS.get())
		{
			return true;
		}

		return false;
	}

	public static boolean hasGemiumArmor(Player player)
	{
		ItemStack head = player.getItemBySlot(EquipmentSlot.HEAD);
		ItemStack chest = player.getItemBySlot(EquipmentSlot.CHEST);
		ItemStack legs = player.getItemBySlot(EquipmentSlot.LEGS);
		ItemStack feet = player.getItemBySlot(EquipmentSlot.FEET);

		if(head.getItem() == ItemInit.ARMOR_GEMIUM_HEAD.get() &&
				chest.getItem() == ItemInit.ARMOR_GEMIUM_BODY.get() &&
				legs.getItem() == ItemInit.ARMOR_GEMIUM_LEGGINGS.get() &&
				feet.getItem() == ItemInit.ARMOR_GEMIUM_BOOTS.get())
		{
			return true;
		}

		return false;
	}

	public static boolean hasTriliumArmor(Player player)
	{
		ItemStack head = player.getItemBySlot(EquipmentSlot.HEAD);
		ItemStack chest = player.getItemBySlot(EquipmentSlot.CHEST);
		ItemStack legs = player.getItemBySlot(EquipmentSlot.LEGS);
		ItemStack feet = player.getItemBySlot(EquipmentSlot.FEET);

		if(head.getItem() == ItemInit.ARMOR_TRILIUM_HEAD.get() &&
				chest.getItem() == ItemInit.ARMOR_TRILUM_BODY.get() &&
				legs.getItem() == ItemInit.ARMOR_TRILIUM_LEGGINGS.get() &&
				feet.getItem() == ItemInit.ARMOR_TRILIUM_BOOTS.get())
		{
			return true;
		}

		return false;
	}

	public static boolean hasQuadriliumArmor(Player player)
	{
		ItemStack head = player.getItemBySlot(EquipmentSlot.HEAD);
		ItemStack chest = player.getItemBySlot(EquipmentSlot.CHEST);
		ItemStack legs = player.getItemBySlot(EquipmentSlot.LEGS);
		ItemStack feet = player.getItemBySlot(EquipmentSlot.FEET);

		if(head.getItem() == ItemInit.ARMOR_QUADRILIUM_HEAD.get() &&
				chest.getItem() == ItemInit.ARMOR_QUADRILIUM_BODY.get() &&
				legs.getItem() == ItemInit.ARMOR_QUADRILIUM_LEGGINGS.get() &&
				feet.getItem() == ItemInit.ARMOR_QUADRILIUM_BOOTS.get())
		{
			return true;
		}

		return false;
	}

    public static boolean isPlayerGotWaterBreathing(Player player)
    {
	    if(hasLapiumArmor(player) && ConfigPowderPower.LAPIUM_ARMOR_ENABLE_WATER_BREATHING.get())
		{
			return  true;
		}

		if(hasGemiumArmor(player) && ConfigPowderPower.GEMIUM_ARMOR_ENABLE_WATER_BREATHING.get())
		{
			return  true;
		}

		if(hasTriliumArmor(player) && ConfigPowderPower.TRILIUM_ARMOR_ENABLE_WATER_BREATHING.get())
		{
			return  true;
		}

		if(hasQuadriliumArmor(player) && ConfigPowderPower.QUADRILIUM_ARMOR_ENABLE_WATER_BREATHING.get())
		{
			return  true;
		}

    	Inventory inv2 = player.getInventory();
		
		//Checks player main inventory
		for (int slot = 0; slot < inv2.getContainerSize(); slot++)
		{
			ItemStack stack = inv2.getItem(slot);
			if (stack.getItem() == ItemInit.TOKEN_BREATHING.get())
			{	
				return true;
			}
		}
      		
        return false;
    } 
    
    public static boolean isPlayerGotFallProtection(Player player)
    {
		Inventory inv2 = player.getInventory();

		if(hasGemiumArmor(player) && ConfigPowderPower.GEMIUM_ARMOR_ENABLE_NO_FALL_DAMAGE.get())
		{
			return true;
		}

		if(hasTriliumArmor(player) && ConfigPowderPower.TRILIUM_ARMOR_ENABLE_NO_FALL_DAMAGE.get())
		{
			return true;
		}

		if(hasQuadriliumArmor(player) && ConfigPowderPower.QUADRILIUM_ARMOR_ENABLE_NO_FALL_DAMAGE.get())
		{
			return true;
		}
			
		//Checks player main inventory
		for (int slot = 0; slot < inv2.getContainerSize(); slot++)
		{
			ItemStack stack = inv2.getItem(slot);
			if (stack.getItem() == ItemInit.TOKEN_NO_FALL.get())
			{
				return true;
			}
		}

		return false;
    } 
    
    public static boolean isPlayerGotFireProtection(Player player)
    {
		Inventory inv3 = player.getInventory();

		if(PlayerEquipUtil.hasRediumArmor(player) && ConfigPowderPower.REDIUM_ARMOR_ENABLE_FIRE_PROTECT.get())
		{
			return  true;
		}

		if(PlayerEquipUtil.hasGemiumArmor(player) && ConfigPowderPower.GEMIUM_ARMOR_ENABLE_FIRE_PROTECT.get())
		{
			return  true;
		}

		if(PlayerEquipUtil.hasTriliumArmor(player) && ConfigPowderPower.TRILIUM_ARMOR_ENABLE_NO_FALL_DAMAGE.get())
		{
			return  true;
		}

    	if(PlayerEquipUtil.hasQuadriliumArmor(player) && ConfigPowderPower.QUADRILIUM_ARMOR_ENABLE_FIRE_PROTECT.get())
		{
			return  true;
		}

		//Checks player main inventory
		for (int slot = 0; slot < inv3.getContainerSize(); slot++)
		{
			ItemStack stack = inv3.getItem(slot);
			if (stack.getItem() == ItemInit.TOKEN_FIRE_RESISTANCE.get())
			{
				return true;
			}
		}
      		
        return false;
    }
    
    public static boolean isPlayerGotHasteToken(Player player)
    { 	    
		Inventory inv2 = player.getInventory();
		
		//Checks player main inventory
		for (int slot = 0; slot < inv2.getContainerSize(); slot++)
		{
			ItemStack stack = inv2.getItem(slot);
			if (stack.getItem() == ItemInit.TOKEN_HASTE.get())
			{	
				return true;
			}
		}
		
        return false;
    } 

    public static boolean isPlayerGotExpToken(Player player)
    { 	    
		Inventory inv2 = player.getInventory();
		
		//Checks player main inventory
		for (int slot = 0; slot < inv2.getContainerSize(); slot++)
		{
			ItemStack stack = inv2.getItem(slot);
			if (stack.getItem() == ItemInit.TOKEN_EXP.get())
			{	
				return true;
			}
		}
		
        return false;
    } 
    
    public static boolean isPlayerGotUnseenToken(Player player)
    { 	    
		Inventory inv2 = player.getInventory();
		
		//Checks player main inventory
		for (int slot = 0; slot < inv2.getContainerSize(); slot++)
		{
			ItemStack stack = inv2.getItem(slot);
			if (stack.getItem() == ItemInit.TOKEN_UNSEEN.get())
			{	
				return true;
			}
		}
		
        return false;
    } 
 
    public static boolean isPlayerGotUnseenTokenInHand(Player player)
    { 	    
    	ItemStack mainHand = player.getMainHandItem();
    	ItemStack offHand = player.getOffhandItem();
    	
    	if(mainHand.getItem() == ItemInit.TOKEN_UNSEEN.get() && offHand.isEmpty())
      	{
      		return true;  		
      	} 
		
        return false;
    }

	// Generalized check for itemstack in inventory
	public static boolean hasItemInInventory(Player player, Item item)
	{
		Inventory inv = player.getInventory();
		int size = inv.getContainerSize();

		//Is the item in the player inventory?
		for (int slot = 0; slot < size; slot++)
		{
			ItemStack stack = inv.getItem(slot);
			if (stack.getItem() == item)
			{
				return true;
			}
		}

		return false;
	}
} 