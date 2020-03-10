package com.kwpugh.powder_power.items.excavator;

import com.kwpugh.powder_power.init.ItemInit;
import com.kwpugh.powder_power.items.tools.ExcavatorBase;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;

public class ExcavatorGemium extends ExcavatorBase
{
	public ExcavatorGemium(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}
    
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == ItemInit.GEM_GEMIUM.get();
	}
}