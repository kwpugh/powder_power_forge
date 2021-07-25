package com.kwpugh.powder_power.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import net.minecraft.world.item.Item.Properties;

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
    	stack.setDamageValue(getDamage(stack) + 1);

    	if(stack.getDamageValue() >= stack.getMaxDamage())
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
    
	@Override
	public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == Items.OAK_SLAB;
	}
    
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslatableComponent("item.powder_power.motar_pestle.line1").withStyle(ChatFormatting.GREEN)));
		tooltip.add((new TranslatableComponent("item.powder_power.motar_pestle.line2").withStyle(ChatFormatting.AQUA)));
	}
}
