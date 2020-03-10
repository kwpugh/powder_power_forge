package com.kwpugh.powder_power.items.hammers;

import com.kwpugh.powder_power.init.ItemInit;
import com.kwpugh.powder_power.items.toolsclasses.HammerBase;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;

public class HammerTrilium extends HammerBase
{
	public HammerTrilium(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == ItemInit.INGOT_TRILIUM.get();
	}
}
