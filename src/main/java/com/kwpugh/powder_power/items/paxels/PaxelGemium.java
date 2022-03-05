package com.kwpugh.powder_power.items.paxels;

import com.kwpugh.powder_power.init.ItemInit;
import com.kwpugh.powder_power.init.TagInit;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;

public class PaxelGemium extends PaxelBase
{
	public PaxelGemium(float attackDamageIn, float attackSpeedIn, Tier tier, TagKey<Block> mineable,
			Properties builder)
	{
		super(attackDamageIn, attackSpeedIn, tier, TagInit.PAXEL_MINEABLE, builder);
	}

	@Override
	public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == ItemInit.GEM_GEMIUM.get();
	}
}