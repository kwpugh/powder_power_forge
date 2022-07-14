package com.kwpugh.powder_power.items.tokens;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
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

public class TokenCuring extends Item
{
	public TokenCuring(Properties properties)
	{
		super(properties);
	}

	public void inventoryTick(ItemStack stack, Level world, Entity entity, int itemSlot, boolean isSelected)
	{		
		if(entity instanceof Player)
		{	
			((Player) entity).removeEffectNoUpdate(MobEffects.BLINDNESS);
			((Player) entity).removeEffectNoUpdate(MobEffects.MOVEMENT_SLOWDOWN);
			((Player) entity).removeEffectNoUpdate(MobEffects.DIG_SLOWDOWN);
			((Player) entity).removeEffectNoUpdate(MobEffects.HARM);
			((Player) entity).removeEffectNoUpdate(MobEffects.CONFUSION);
			((Player) entity).removeEffectNoUpdate(MobEffects.HUNGER);
			((Player) entity).removeEffectNoUpdate(MobEffects.POISON);
			((Player) entity).removeEffectNoUpdate(MobEffects.WITHER);
			((Player) entity).removeEffectNoUpdate(MobEffects.LEVITATION);
			((Player) entity).removeEffectNoUpdate(MobEffects.UNLUCK);
			((Player) entity).removeEffectNoUpdate(MobEffects.WEAKNESS);		
		}
	}
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((Component.translatable("item.powder_power.token_curing.line1").withStyle(ChatFormatting.GREEN)));
		tooltip.add((Component.translatable("item.powder_power.token.general1").withStyle(ChatFormatting.AQUA)));
	}
}
