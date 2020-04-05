package com.kwpugh.powder_power.util;

import com.kwpugh.powder_power.PowderPower;
import com.kwpugh.powder_power.init.ItemInit;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = PowderPower.modid, bus = EventBusSubscriber.Bus.FORGE )
public class AnvilEventHandler
{
	@SubscribeEvent
	public static void upgradeSomeTools(AnvilUpdateEvent event)
	{
		ItemStack left = event.getLeft();
		ItemStack right = event.getRight();
		
		if(left.isEmpty() || right.isEmpty())
		{
			return;
		}

		if(left.getItem().equals(ItemInit.PICKAXE_OBSIDIAN.get()) && right.getItem().equals(ItemInit.BLEND_LAPIUM.get()))
		{			
			ItemStack output = new ItemStack(ItemInit.PICKAXE_OBSIDIAN.get());
			output.addEnchantment(Enchantments.SILK_TOUCH, 1);
			output.addEnchantment(Enchantments.EFFICIENCY, 3);
			output.setDisplayName(new StringTextComponent("Improved Obsidian Pickaxe"));
			event.setCost(10);
			event.setOutput(output);
		}
		
		if(left.getItem().equals(ItemInit.PICKAXE_PRISMARINE.get()) && right.getItem().equals(ItemInit.BLEND_LAPIUM.get()))
		{			
			ItemStack output = new ItemStack(ItemInit.PICKAXE_PRISMARINE.get());
			output.addEnchantment(Enchantments.FORTUNE, 3);
			output.addEnchantment(Enchantments.EFFICIENCY, 3);
			output.setDisplayName(new StringTextComponent("Improved Prismarine Pickaxe"));
			event.setCost(10);
			event.setOutput(output);
		}
		
		if(left.getItem().equals(ItemInit.DAGGER_PRISMARINE.get()) && right.getItem().equals(ItemInit.BLEND_LAPIUM.get()))
		{			
			ItemStack output = new ItemStack(ItemInit.DAGGER_PRISMARINE.get());
			output.addEnchantment(Enchantments.SHARPNESS, 3);
			output.addEnchantment(Enchantments.LOOTING, 3);
			output.setDisplayName(new StringTextComponent("Improved Prismarine Dagger"));
			event.setCost(10);
			event.setOutput(output);
		}
	}
}
