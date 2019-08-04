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

public class ArmorTrilium extends ArmorItem
{
	public ArmorTrilium(IArmorMaterial materialIn, EquipmentSlotType slots, Properties builder)
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
	    	if(head.getItem() == ItemList.armor_trilium_head && 
	    			chest.getItem() == ItemList.armor_trilium_body && 
	    			legs.getItem() == ItemList.armor_trilium_leggings && 
	    			feet.getItem() == ItemList.armor_trilium_boots)
	    	{
				player.removeActivePotionEffect(Effects.POISON);
				player.removeActivePotionEffect(Effects.WITHER);
	    	}	
		    
		    //Helmet
		    if(head.getItem() == ItemList.armor_lapium_head)
			{
				int newfoodlevel = 1;
				float newsatlevel = 0.5F;
				SpecialAbilities.giveRegenffect(world, player, stack, newfoodlevel, newsatlevel);			
			}
			else
			{
				//something
			}
		    
		    //Chestplate
		    if(chest.getItem() == ItemList.armor_lapium_body)
			{
		 		if(player.isInWater())
		 		{
		 			//SpecialAbilities.giveBreathing(world, player, chest);
		 		}
			}
		    
		    //Leggings - No Fall Damage moved to ArmorUtil as event
		    if(legs.getItem() == ItemList.armor_lapium_leggings)
			{
		    	//something
			}
			else
			{
				//something
			}
		    
		    //Boots
		    if(feet.getItem() == ItemList.armor_lapium_boots)
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
		return repair.getItem() == ItemList.ingot_lapium;
	}
}
