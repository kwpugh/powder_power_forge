package com.kwpugh.powder_power.items.tokens;

import com.kwpugh.powder_power.util.EnableUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
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

public class TokenSupremeResistance extends Item
{
	public TokenSupremeResistance(Properties properties)
	{
		super(properties);
	}

	public void inventoryTick(ItemStack stack, Level world, Entity entity, int itemSlot, boolean isSelected)
	{		
		if(entity instanceof Player && !world.isClientSide && EnableUtil.isEnabled(stack))
		{
			Player player = (Player)entity;
	
			if (player.tickCount % 180 == 0)
			{
				player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 2, false, false));
			} 
		}
	}	

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand)
	{
		ItemStack stack = player.getItemInHand(hand);
		
		if(!world.isClientSide && player.isShiftKeyDown())
		{
			EnableUtil.changeEnabled(player, hand);
			player.displayClientMessage((Component.translatable("item.powder_power.token_resistance.line2", EnableUtil.isEnabled(stack)).withStyle(ChatFormatting.BOLD)), true);
			return new InteractionResultHolder<ItemStack>(InteractionResult.SUCCESS, player.getItemInHand(hand));
		}
		return super.use(world, player, hand);
	} 
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((Component.translatable("item.powder_power.token_resistance.line1").withStyle(ChatFormatting.GREEN)));
		tooltip.add((Component.translatable("item.powder_power.token_resistance.line2", EnableUtil.isEnabled(stack)).withStyle(ChatFormatting.RED)));
		tooltip.add((Component.translatable("item.powder_power.token.general2").withStyle(ChatFormatting.AQUA)));
	}
}