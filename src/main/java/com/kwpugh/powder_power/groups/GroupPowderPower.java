package com.kwpugh.powder_power.groups;

import com.kwpugh.powder_power.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class GroupPowderPower extends CreativeModeTab
{
	public GroupPowderPower() 
	{
		super("powder_power");
	}

	@Override
	public ItemStack makeIcon() 
	{
		return new ItemStack(ItemInit.BLEND_TRILIUM.get());
	}	
}
