package com.kwpugh.powder_power.items.tokens;
import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class TokenGreaterHealing extends Item
{

	public TokenGreaterHealing(Properties properties)
	{
		super(properties);
	}

	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand)
	{	
		ItemStack stack = player.getHeldItem(hand);
		
		if (!world.isRemote)
		{
			player.setHealth(player.getMaxHealth());
	        player.getFoodStats().setFoodLevel(20);
	        player.getFoodStats().setFoodSaturationLevel(20.0F);
	        player.extinguish();
	        player.clearActivePotions();
	        player.sendMessage((new TranslationTextComponent("item.powder_power.token_healing.line2").applyTextStyle(TextFormatting.BOLD)));
	        
	        if (!player.abilities.isCreativeMode) {
	           stack.shrink(1);
	        }
		}
        
        return new ActionResult<ItemStack>(ActionResultType.SUCCESS, stack);
	}
	
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.powder_power.token_healing.line1").applyTextStyle(TextFormatting.GREEN)));	
	}
}