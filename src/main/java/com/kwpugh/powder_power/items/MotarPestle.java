package com.kwpugh.powder_power.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MotarPestle extends Item
{
	public MotarPestle(Properties properties)
	{
		super(properties);
	}

    @Override
    public ItemStack getContainerItem(ItemStack stackIn)
    {	
    	ItemStack stack = stackIn.copy();
    	stack.setDamage(getDamage(stack) + 1);

    	if(stack.getDamage() >= stack.getMaxDamage())
    	{
    		stack.shrink(1);
    	}
    	
        return stack;
    }	
    
    @Override
    public boolean hasContainerItem(ItemStack stack)
    {
        return true;
    }
    
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.powder_power.motar_pestle.line1").applyTextStyle(TextFormatting.GREEN)));
		tooltip.add((new TranslationTextComponent("item.powder_power.motar_pestle.line2").applyTextStyle(TextFormatting.AQUA)));
	}
}
