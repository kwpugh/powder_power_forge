package com.kwpugh.powder_power.items.armor;

import java.util.List;

import javax.annotation.Nullable;

import com.kwpugh.powder_power.init.ItemInit;
import com.kwpugh.powder_power.util.PlayerSpecialAbilities;

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
	    	if(head.getItem() == ItemInit.ARMOR_TRILIUM_HEAD.get() && 
	    			chest.getItem() == ItemInit.ARMOR_TRILUM_BODY.get() && 
	    			legs.getItem() == ItemInit.ARMOR_TRILIUM_LEGGINGS.get() && 
	    			feet.getItem() == ItemInit.ARMOR_TRILIUM_BOOTS.get())
	    	{
				player.removeActivePotionEffect(Effects.POISON);
				player.removeActivePotionEffect(Effects.WITHER);
				player.removeActivePotionEffect(Effects.LEVITATION);
	    	}	
		    
		    //Helmet
		    if(head.getItem() == ItemInit.ARMOR_TRILIUM_HEAD.get())
			{
				int newfoodlevel = 1;
				float newsatlevel = 0.5F;
				PlayerSpecialAbilities.giveRegenffect(world, player, stack, newfoodlevel, newsatlevel);			
			}
			else
			{
				//something
			}
		    
		    //Chestplate
		    if(chest.getItem() == ItemInit.ARMOR_TRILUM_BODY.get())
			{
		    	//Something
			}
		    
		    //Leggings
		    if(legs.getItem() == ItemInit.ARMOR_TRILIUM_LEGGINGS.get())
			{
		    	PlayerSpecialAbilities.giveDolphinEffect(world, player, stack);
			}
			else
			{
				//something
			}
		    
		    //Boots
		    if(feet.getItem() == ItemInit.ARMOR_TRILIUM_BOOTS.get())
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
		return repair.getItem() == ItemInit.INGOT_TRILIUM.get();
	}
	
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.powder_power.armor_trilium_full.line1").mergeStyle(TextFormatting.GREEN)));	
		tooltip.add((new TranslationTextComponent("item.powder_power.armor_trilium_full.line2").mergeStyle(TextFormatting.GREEN)));	
		tooltip.add((new TranslationTextComponent("item.powder_power.armor_trilium_full.line3").mergeStyle(TextFormatting.GREEN)));	
		
	}
}
