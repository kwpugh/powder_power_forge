package com.kwpugh.powder_power.items.tokens;

import com.kwpugh.powder_power.util.PlayerSpecialAbilities;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class TokenAbsorption extends Item
{
	public TokenAbsorption(Properties properties)
	{
		super(properties);
	}

	public void inventoryTick(ItemStack stack, Level world, Entity entity, int itemSlot, boolean isSelected)
	{		
		if(entity instanceof Player && !world.isClientSide)
		{
			Player player = (Player)entity;
			PlayerSpecialAbilities.giveExtraHearts(world, player, stack);
		}
	}	
    
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((Component.translatable("item.powder_power.token_absorption.line1").withStyle(ChatFormatting.GREEN)));
		tooltip.add((Component.translatable("item.powder_power.token.general1").withStyle(ChatFormatting.AQUA)));
	}
}
