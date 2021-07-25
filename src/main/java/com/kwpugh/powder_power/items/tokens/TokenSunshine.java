package com.kwpugh.powder_power.items.tokens;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import net.minecraft.world.item.Item.Properties;

public class TokenSunshine extends Item
{
	public TokenSunshine(Properties properties)
	{
		super(properties);
	}

	public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand)
	{
		ItemStack stack = player.getItemInHand(hand);

        ItemStack equippedMain = player.getMainHandItem();
    	
        if(equippedMain == stack)   //Only works in the main hand
        {
			if (!world.isClientSide)
			{
				if(world.getLevelData().isRaining())
				{
					world.getLevelData().setRaining(false); //used to be setRainTime(1)
				}
			}
        }
        return new InteractionResultHolder<ItemStack>(InteractionResult.SUCCESS, stack);
	}
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslatableComponent("item.powder_power.token_sunshine.line1").withStyle(ChatFormatting.GREEN)));
		tooltip.add((new TranslatableComponent("item.powder_power.token.general3").withStyle(ChatFormatting.AQUA)));	
	}

}