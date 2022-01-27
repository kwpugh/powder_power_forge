package com.kwpugh.powder_power.util;

import com.kwpugh.powder_power.PowderPower;
import com.kwpugh.powder_power.init.ItemInit;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.network.chat.TextComponent;
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
			output.enchant(Enchantments.SILK_TOUCH, 1);
			output.enchant(Enchantments.BLOCK_EFFICIENCY, 1);
			output.setHoverName(new TextComponent("Improved Obsidian Pickaxe"));
			event.setCost(10);
			event.setOutput(output);
		}
		
		if(left.getItem().equals(ItemInit.PICKAXE_PRISMARINE.get()) && right.getItem().equals(ItemInit.BLEND_LAPIUM.get()))
		{			
			ItemStack output = new ItemStack(ItemInit.PICKAXE_PRISMARINE.get());
			output.enchant(Enchantments.BLOCK_FORTUNE, 1);
			output.enchant(Enchantments.BLOCK_EFFICIENCY, 1);
			output.setHoverName(new TextComponent("Improved Prismarine Pickaxe"));
			event.setCost(10);
			event.setOutput(output);
		}
		
		if(left.getItem().equals(ItemInit.DAGGER_PRISMARINE.get()) && right.getItem().equals(ItemInit.BLEND_LAPIUM.get()))
		{			
			ItemStack output = new ItemStack(ItemInit.DAGGER_PRISMARINE.get());
			output.enchant(Enchantments.SHARPNESS, 1);
			output.enchant(Enchantments.MOB_LOOTING, 1);
			output.setHoverName(new TextComponent("Deadly Prismarine Dagger"));
			event.setCost(10);
			event.setOutput(output);
		}
		
		if(left.getItem().equals(Items.DIAMOND_SWORD) && right.getItem().equals(ItemInit.BLEND_REDIUM.get()))
		{			
			ItemStack output = new ItemStack(Items.DIAMOND_SWORD);
			output.enchant(Enchantments.FIRE_ASPECT, 1);
			output.enchant(Enchantments.SHARPNESS, 1);
			output.enchant(Enchantments.MOB_LOOTING, 1);
			output.setHoverName(new TextComponent("Deadly Diamond Sword"));
			event.setCost(20);
			event.setOutput(output);
		}
		
		if(left.getItem().equals(Items.DIAMOND_PICKAXE) && right.getItem().equals(ItemInit.BLEND_TRILIUM.get()))
		{			
			ItemStack output = new ItemStack(Items.DIAMOND_PICKAXE);
			output.enchant(Enchantments.BLOCK_FORTUNE, 2);
			output.enchant(Enchantments.BLOCK_EFFICIENCY, 2);
			output.setHoverName(new TextComponent("Improved Diamond Pickaxe"));
			event.setCost(20);
			event.setOutput(output);
		}
		
		if(left.getItem().equals(Items.NETHERITE_SWORD) && right.getItem().equals(ItemInit.BLEND_QUADRILIUM.get()))
		{			
			ItemStack output = new ItemStack(Items.NETHERITE_SWORD);
			output.enchant(Enchantments.FIRE_ASPECT, 1);
			output.enchant(Enchantments.SHARPNESS, 3);
			output.enchant(Enchantments.MOB_LOOTING, 3);
			output.enchant(Enchantments.KNOCKBACK, 1);
			output.enchant(Enchantments.BANE_OF_ARTHROPODS, 1);
			output.setHoverName(new TextComponent("Deadly Quadrilirite Sword"));
			output.getOrCreateTag().putBoolean("Unbreakable", true);
			event.setCost(30);
			event.setOutput(output);
		}
	}
}
