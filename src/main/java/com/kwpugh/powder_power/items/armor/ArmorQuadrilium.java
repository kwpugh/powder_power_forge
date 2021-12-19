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

public class ArmorQuadrilium extends ArmorItem
{
	public ArmorQuadrilium(ArmorMaterial materialIn, EquipmentSlot slots, Properties builder)
	{
		super(materialIn, slots, builder);
	}	
	
	public void onArmorTick(final ItemStack stack, final Level world, final Player player)
	{
		if(PlayerEquipUtil.hasQuadriliumArmor(player))
		{
			player.removeEffectNoUpdate(MobEffects.POISON);
			player.removeEffectNoUpdate(MobEffects.WITHER);
			player.removeEffectNoUpdate(MobEffects.LEVITATION);
			PlayerSpecialAbilities.giveRegenffect(world, player, stack, 1, 0.75F);
			PlayerSpecialAbilities.giveDolphinEffect(world, player, stack);
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
		return repair.getItem() == ItemInit.INGOT_QUADRILIUM.get();
	}
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslatableComponent("item.powder_power.armor_trilium_full.line1").withStyle(ChatFormatting.GREEN)));	
		tooltip.add((new TranslatableComponent("item.powder_power.armor_trilium_full.line2").withStyle(ChatFormatting.GREEN)));	
		tooltip.add((new TranslatableComponent("item.powder_power.armor_trilium_full.line3").withStyle(ChatFormatting.GREEN)));	
		
	}
}
