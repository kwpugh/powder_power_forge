package com.kwpugh.powder_power.items.tokens;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class TokenCuring extends Item
{
	public TokenCuring(Properties properties)
	{
		super(properties);
	}

	public void inventoryTick(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected)
	{		
		if(entity instanceof PlayerEntity)
		{	
			((PlayerEntity) entity).removeActivePotionEffect(Effects.BLINDNESS);
			((PlayerEntity) entity).removeActivePotionEffect(Effects.SLOWNESS);
			((PlayerEntity) entity).removeActivePotionEffect(Effects.MINING_FATIGUE);
			((PlayerEntity) entity).removeActivePotionEffect(Effects.INSTANT_DAMAGE);
			((PlayerEntity) entity).removeActivePotionEffect(Effects.NAUSEA);
			((PlayerEntity) entity).removeActivePotionEffect(Effects.HUNGER);
			((PlayerEntity) entity).removeActivePotionEffect(Effects.POISON);
			((PlayerEntity) entity).removeActivePotionEffect(Effects.WITHER);
			((PlayerEntity) entity).removeActivePotionEffect(Effects.LEVITATION);
			((PlayerEntity) entity).removeActivePotionEffect(Effects.UNLUCK);
			((PlayerEntity) entity).removeActivePotionEffect(Effects.WEAKNESS);		
		}
	}
	
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.powder_power.token_curing.line1").mergeStyle(TextFormatting.GREEN)));
		tooltip.add((new TranslationTextComponent("item.powder_power.token.general1").mergeStyle(TextFormatting.AQUA)));	
	}
}
