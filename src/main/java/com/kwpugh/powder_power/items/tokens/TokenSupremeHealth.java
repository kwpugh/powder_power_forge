package com.kwpugh.powder_power.items.tokens;

import java.util.List;

import javax.annotation.Nullable;

import com.kwpugh.powder_power.util.PlayerSpecialAbilities;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import net.minecraft.world.item.Item.Properties;

public class TokenSupremeHealth extends Item
{
	public TokenSupremeHealth(Properties properties)
	{
		super(properties);
	}

	public void inventoryTick(ItemStack stack, Level world, Entity entity, int itemSlot, boolean isSelected)
	{		
		if(entity instanceof Player && !world.isClientSide)
		{
			Player player = (Player)entity;
	
			PlayerSpecialAbilities.giveRegenffect(world, player, stack, 5, 10.0F);
		}
	}
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslatableComponent("item.powder_power.token_supreme_health.line1").withStyle(ChatFormatting.GREEN)));
	}
}
