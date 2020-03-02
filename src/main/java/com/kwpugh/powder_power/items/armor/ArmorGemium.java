package com.kwpugh.powder_power.items.armor;

import java.util.List;

import javax.annotation.Nullable;

import com.kwpugh.powder_power.init.ItemInit;
import com.kwpugh.powder_power.util.SpecialAbilities;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ArmorGemium extends ArmorItem
{
	public ArmorGemium(IArmorMaterial materialIn, EquipmentSlotType slots, Properties builder)
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
	    	if(head.getItem() == ItemInit.ARMOR_GEMIUM_HEAD.get() && 
	    			chest.getItem() == ItemInit.ARMOR_GEMIUM_BODY.get() && 
	    			legs.getItem() == ItemInit.ARMOR_GEMIUM_LEGGINGS.get() && 
	    			feet.getItem() == ItemInit.ARMOR_GEMIUM_BOOTS.get())
	    	{
				player.removeActivePotionEffect(Effects.POISON);
				player.removeActivePotionEffect(Effects.WITHER);
	    	}	
		    
		    //Helmet
		    if(head.getItem() == ItemInit.ARMOR_GEMIUM_HEAD.get())
			{
				int newfoodlevel = 1;
				float newsatlevel = 0.3F;
				SpecialAbilities.giveRegenffect(world, player, stack, newfoodlevel, newsatlevel);			
			}
			else
			{
				//something
			}
		    
		    //Chestplate
		    if(chest.getItem() == ItemInit.ARMOR_GEMIUM_BODY.get())
			{
		    	//something
			}
		    
		    //Leggings
		    if(legs.getItem() == ItemInit.ARMOR_GEMIUM_LEGGINGS.get())
			{
		    	//something
			}
			else
			{
				//something
			}
		    
		    //Boots
		    if(feet.getItem() == ItemInit.ARMOR_GEMIUM_BOOTS.get())
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
		return repair.getItem() == ItemInit.GEM_GEMIUM.get();
	}
	
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.powder_power.armor_gemium_full.line1").applyTextStyle(TextFormatting.GREEN)));
		tooltip.add((new TranslationTextComponent("item.powder_power.armor_gemium_full.line2").applyTextStyle(TextFormatting.GREEN)));
		tooltip.add((new TranslationTextComponent("item.powder_power.armor_gemium_full.line3").applyTextStyle(TextFormatting.GREEN)));		
	}
}
