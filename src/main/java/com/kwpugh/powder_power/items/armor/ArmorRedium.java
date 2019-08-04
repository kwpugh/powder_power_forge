package com.kwpugh.powder_power.items.armor;

import com.kwpugh.powder_power.lists.ItemList;
import com.kwpugh.powder_power.util.SpecialAbilities;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class ArmorRedium extends ArmorItem
{
	public ArmorRedium(IArmorMaterial materialIn, EquipmentSlotType slots, Properties builder)
	{
		super(materialIn, slots, builder);
	}	
	
	public void onArmorTick(final ItemStack stack, final World world, final PlayerEntity player)
	{
		if(player instanceof PlayerEntity)
		{
			ItemStack head = player.getItemStackFromSlot(EquipmentSlotType.HEAD);
			ItemStack chest = player.getItemStackFromSlot(EquipmentSlotType.CHEST);
			ItemStack legs = player.getItemStackFromSlot(EquipmentSlotType.LEGS);
		    ItemStack feet = player.getItemStackFromSlot(EquipmentSlotType.FEET);
		    
		    //Full Set
	    	if(head.getItem() == ItemList.armor_redium_head && 
	    			chest.getItem() == ItemList.armor_redium_body && 
	    			legs.getItem() == ItemList.armor_redium_leggings && 
	    			feet.getItem() == ItemList.armor_redium_boots)
	    	{
				player.removeActivePotionEffect(Effects.WITHER);
	    	}	
		    
		    //Helmet
		    if(head.getItem() == ItemList.armor_redium_head)
			{
				int newfoodlevel = 0;
				float newsatlevel = 0.0F;
				SpecialAbilities.giveRegenffect(world, player, stack, newfoodlevel, newsatlevel);			
			}
			else
			{
				//something
			}
		    
		    //Chestplate
		    if(chest.getItem() == ItemList.armor_redium_body)
			{
		 		if(player.isInWater())
		 		{
		 			//something
		 		}
			}
		   
		    //Leggings
		    if(legs.getItem() == ItemList.armor_redium_leggings)
			{
				//something
			}
			else
			{
				//something
			}
		    
		    //Boots
		    if(feet.getItem() == ItemList.armor_redium_boots)
			{
		    	//something
			}
			else
			{
				//something
			}		    	
		}
	}

	@Override
	public boolean isBookEnchantable(ItemStack stack, ItemStack book)
	{
		return true;
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == ItemList.ingot_redium;
	}
}
