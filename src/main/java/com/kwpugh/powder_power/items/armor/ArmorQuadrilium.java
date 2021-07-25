package com.kwpugh.powder_power.items.armor;


import java.util.List;

import javax.annotation.Nullable;

import com.kwpugh.powder_power.init.ItemInit;
import com.kwpugh.powder_power.util.PlayerSpecialAbilities;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import net.minecraft.world.item.Item.Properties;

public class ArmorQuadrilium extends ArmorItem
{
	public ArmorQuadrilium(ArmorMaterial materialIn, EquipmentSlot slots, Properties builder)
	{
		super(materialIn, slots, builder);
	}	
	
	public void onArmorTick(final ItemStack stack, final Level world, final Player player)
	{
		if(player instanceof Player)
		{
			ItemStack head = player.getItemBySlot(EquipmentSlot.HEAD);
			ItemStack chest = player.getItemBySlot(EquipmentSlot.CHEST);
			ItemStack legs = player.getItemBySlot(EquipmentSlot.LEGS);
		    ItemStack feet = player.getItemBySlot(EquipmentSlot.FEET);
		    
		    //Full Set
	    	if(head.getItem() == ItemInit.ARMOR_QUADRILIUM_HEAD.get() && 
	    			chest.getItem() == ItemInit.ARMOR_QUADRILIUM_BODY.get() && 
	    			legs.getItem() == ItemInit.ARMOR_QUADRILIUM_LEGGINGS.get() && 
	    			feet.getItem() == ItemInit.ARMOR_QUADRILIUM_BOOTS.get())
	    	{
				player.removeEffectNoUpdate(MobEffects.POISON);
				player.removeEffectNoUpdate(MobEffects.WITHER);
				player.removeEffectNoUpdate(MobEffects.LEVITATION);
	    	}	
		    
		    //Helmet
		    if(head.getItem() == ItemInit.ARMOR_QUADRILIUM_HEAD.get())
			{
				int newfoodlevel = 1;
				float newsatlevel = 0.75F;
				PlayerSpecialAbilities.giveRegenffect(world, player, stack, newfoodlevel, newsatlevel);			
			}
			else
			{
				//something
			}
		    
		    //Chestplate
		    if(chest.getItem() == ItemInit.ARMOR_QUADRILIUM_BODY.get())
			{
		    	//Something
			}
		    
		    //Leggings
		    if(legs.getItem() == ItemInit.ARMOR_QUADRILIUM_LEGGINGS.get())
			{
		    	PlayerSpecialAbilities.giveDolphinEffect(world, player, stack);
			}
			else
			{
				//something
			}
		    
		    //Boots
		    if(feet.getItem() == ItemInit.ARMOR_QUADRILIUM_BOOTS.get())
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
	public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == ItemInit.INGOT_QUADRILIUM.get();
	}
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslatableComponent("item.powder_power.armor_trilium_full.line1").withStyle(ChatFormatting.GREEN)));	
		tooltip.add((new TranslatableComponent("item.powder_power.armor_trilium_full.line2").withStyle(ChatFormatting.GREEN)));	
		tooltip.add((new TranslatableComponent("item.powder_power.armor_trilium_full.line3").withStyle(ChatFormatting.GREEN)));	
		
	}
}
