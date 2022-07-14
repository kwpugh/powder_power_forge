package com.kwpugh.powder_power.items.crafting;

import com.kwpugh.powder_power.init.ItemInit;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class WandAlchemist extends Item
{
	public WandAlchemist(Properties properties)
	{
		super(properties);
	}

	@Override
    public boolean hasCraftingRemainingItem(ItemStack stack)
    {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stackIn)
    {	
    	ItemStack stack = stackIn.copy();
    	stack.setDamageValue(getDamage(stack) + 1);

    	if(stack.getDamageValue() >= stack.getMaxDamage())
    	{
    		stack.shrink(1);
    	}
    	
        return stack;
    }

	@Override
	public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == ItemInit.GEM_GEMIUM.get();
	}
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((Component.translatable("item.powder_power.wand_alchemist.line1").withStyle(ChatFormatting.GREEN)));
		tooltip.add((Component.translatable("item.powder_power.wand_alchemist.line2").withStyle(ChatFormatting.AQUA)));
	}
}
