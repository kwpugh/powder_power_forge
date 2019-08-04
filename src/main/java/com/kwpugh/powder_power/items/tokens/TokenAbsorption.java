package com.kwpugh.powder_power.items.tokens;

import java.util.List;

import com.kwpugh.powder_power.util.SpecialAbilities;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class TokenAbsorption extends Item
{
	public TokenAbsorption(Properties properties)
	{
		super(properties);
	}

	public void inventoryTick(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected)
	{		
		if(entity instanceof PlayerEntity && !world.isRemote)
		{
			PlayerEntity player = (PlayerEntity)entity;
			SpecialAbilities.giveExtraHearts(world, player, stack);
		}
	}	

	@Override
	public void addInformation(ItemStack stack, World world, List<ITextComponent> list, ITooltipFlag flag)
	{
		super.addInformation(stack, world, list, flag);				
		list.add(new StringTextComponent(TextFormatting.BLUE + "Provides player with extra absorption hearts"));
		list.add(new StringTextComponent(TextFormatting.GREEN + "Works while in player inventory"));
	} 
}
