package com.kwpugh.powder_power.items.paxels;

import java.util.Set;

import com.kwpugh.powder_power.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;

public class PaxelTrilium extends PaxelBase
{
	public PaxelTrilium(float attackDamageIn, float attackSpeedIn, IItemTier tier, Set<Block> effectiveBlocksIn,
			Properties builder)
	{
		super(attackDamageIn, attackSpeedIn, tier, EFFECTIVE_ON, builder);	
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == ItemInit.INGOT_TRILIUM.get();
	}
}
