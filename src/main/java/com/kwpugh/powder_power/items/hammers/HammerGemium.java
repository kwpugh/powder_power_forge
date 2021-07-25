package com.kwpugh.powder_power.items.hammers;

import com.kwpugh.powder_power.init.ItemInit;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;

import net.minecraft.world.item.Item.Properties;

public class HammerGemium extends HammerBase
{
	public HammerGemium(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	@Override
	public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == ItemInit.GEM_GEMIUM.get();
	}
}
