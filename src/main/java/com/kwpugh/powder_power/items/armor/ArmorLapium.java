package com.kwpugh.powder_power.items.armor;

import com.kwpugh.powder_power.init.ItemInit;
import com.kwpugh.powder_power.util.PlayerEquipUtil;
import com.kwpugh.powder_power.util.PlayerSpecialAbilities;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
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

public class ArmorLapium extends ArmorItem
{
	public ArmorLapium(ArmorMaterial materialIn, EquipmentSlot slots, Properties builder)
	{
		super(materialIn, slots, builder);
	}	
	
	public void onArmorTick(final ItemStack stack, final Level world, final Player player)
	{
		if(PlayerEquipUtil.hasLapiumArmor(player))
		{
			player.removeEffectNoUpdate(MobEffects.POISON);
			PlayerSpecialAbilities.giveRegenffect(world, player, stack, 0, 0.1F);
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
		return repair.getItem() == ItemInit.INGOT_LAPIUM.get();
	}
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslatableComponent("item.powder_power.armor_lapium_full.line1").withStyle(ChatFormatting.GREEN)));	
	}
}
