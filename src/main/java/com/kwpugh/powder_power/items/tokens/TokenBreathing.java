package com.kwpugh.powder_power.items.tokens;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class TokenBreathing extends Item
{
	public TokenBreathing(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public void addInformation(ItemStack stack, World world, List<ITextComponent> list, ITooltipFlag flag)
	{
		super.addInformation(stack, world, list, flag);				
		list.add(new StringTextComponent(TextFormatting.BLUE + "Provides player with water breathing"));
		list.add(new StringTextComponent(TextFormatting.GREEN + "Works while in player's off hand"));
	} 
}
