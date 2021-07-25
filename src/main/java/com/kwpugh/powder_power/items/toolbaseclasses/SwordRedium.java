package com.kwpugh.powder_power.items.toolbaseclasses;

import java.util.List;

import javax.annotation.Nullable;

import com.kwpugh.powder_power.init.ItemInit;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import net.minecraft.world.item.Item.Properties;

public class SwordRedium extends SwordItem
{
	public SwordRedium(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builder) 
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	@Override
    public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn)
    {
        if (!worldIn.isClientSide)
        {
        	//TBD
        }
        return new InteractionResultHolder<ItemStack>(InteractionResult.PASS, playerIn.getItemInHand(handIn));
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
	   
	@Override
	public boolean isBookEnchantable(ItemStack stack, ItemStack book)
	{
		return true;
	}
    
	@Override
	public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == ItemInit.INGOT_REDIUM.get();
	}
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslatableComponent("item.powder_power.sword_redium.line1").withStyle(ChatFormatting.GREEN)));			
	} 
}
