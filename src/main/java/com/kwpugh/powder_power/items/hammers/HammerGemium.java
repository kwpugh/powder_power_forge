package com.kwpugh.powder_power.items.hammers;

import com.kwpugh.powder_power.init.ItemInit;
import com.kwpugh.powder_power.items.toolsclasses.HammerBase;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;

public class HammerGemium extends HammerBase
{
	public HammerGemium(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == ItemInit.GEM_GEMIUM.get();
	}
}
