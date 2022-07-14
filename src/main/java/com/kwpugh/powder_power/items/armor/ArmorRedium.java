package com.kwpugh.powder_power.items.armor;

import com.kwpugh.powder_power.config.ConfigPowderPower;
import com.kwpugh.powder_power.init.ItemInit;
import com.kwpugh.powder_power.util.PlayerEquipUtil;
import com.kwpugh.powder_power.util.PlayerSpecialAbilities;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class ArmorRedium extends ArmorItem
{
	public ArmorRedium(ArmorMaterial materialIn, EquipmentSlot slots, Properties builder)
	{
		super(materialIn, slots, builder);
	}	
	
	public void onArmorTick(final ItemStack stack, final Level world, final Player player)
	{
		if(PlayerEquipUtil.hasRediumArmor(player))
		{
			if(ConfigPowderPower.REDIUM_ARMOR_ENABLE_WITHER_PROTECT.get())
			{
				player.removeEffectNoUpdate(MobEffects.WITHER);
			}

			if(ConfigPowderPower.REDIUM_ARMOR_ENABLE_HEALTH_REGEN.get())
			{
				PlayerSpecialAbilities.giveRegenffect(world, player, stack, 0, 0.1F);
			}
		}
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

		if(ConfigPowderPower.REDIUM_ARMOR_ENABLE_FIRE_PROTECT.get() ||
				ConfigPowderPower.REDIUM_ARMOR_ENABLE_FIRE_PROTECT.get() ||
				ConfigPowderPower.REDIUM_ARMOR_ENABLE_WITHER_PROTECT.get())
		{
			tooltip.add((Component.translatable("item.powder_power.armor_redium_full.line1").withStyle(ChatFormatting.GOLD)));
		}

		if(ConfigPowderPower.REDIUM_ARMOR_ENABLE_FIRE_PROTECT.get())
		{
			tooltip.add((Component.translatable("item.powder_power.armor_redium_full.line2").withStyle(ChatFormatting.GREEN)));
		}

		if(ConfigPowderPower.REDIUM_ARMOR_ENABLE_WITHER_PROTECT.get())
		{
			tooltip.add((Component.translatable("item.powder_power.armor_redium_full.line3").withStyle(ChatFormatting.GREEN)));
		}

		if(ConfigPowderPower.REDIUM_ARMOR_ENABLE_HEALTH_REGEN.get())
		{
			tooltip.add((Component.translatable("item.powder_power.armor_redium_full.line4").withStyle(ChatFormatting.GREEN)));
		}
	}
}
