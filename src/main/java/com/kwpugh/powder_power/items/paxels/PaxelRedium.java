package com.kwpugh.powder_power.items.paxels;

import com.kwpugh.powder_power.init.ItemInit;
import com.kwpugh.powder_power.init.TagInit;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.Block;

public class PaxelRedium extends PaxelBase
{
	public PaxelRedium(float attackDamageIn, float attackSpeedIn, Tier tier, TagKey<Block> mineable,
			Properties builder)
	{
		super(attackDamageIn, attackSpeedIn, tier, TagInit.PAXEL_MINEABLE, builder);
	}

	@Override
	public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == ItemInit.INGOT_REDIUM.get();
	}
	
	@Override
	public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker)
	{
		if (!target.hasEffect(MobEffects.FIRE_RESISTANCE))
		{
			target.setSecondsOnFire(3);
		}
		return super.hurtEnemy(stack, target, attacker);
	}
}
