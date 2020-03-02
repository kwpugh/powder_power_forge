package com.kwpugh.powder_power.util;

import com.kwpugh.powder_power.PowderPower;
import com.kwpugh.powder_power.init.ItemInit;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

@JeiPlugin
public class JEIDescriptions implements IModPlugin
{
	static ResourceLocation plugin = new ResourceLocation(PowderPower.modid, "plugin");

	@Override
	public ResourceLocation getPluginUid()
	{
		return plugin;
	}

	@Override
	public void registerRecipes(IRecipeRegistration registry)
	{
		registry.addIngredientInfo(new ItemStack(ItemInit.HAMMER_ALCHEMIST.get()), VanillaTypes.ITEM, "item.powder_power.hammer_alchemist.line3",
				" ",
				"item.powder_power.hammer_alchemist.line4",
				" ",
				"item.powder_power.hammer_alchemist.line5");
		
		registry.addIngredientInfo(new ItemStack(ItemInit.WAND_ALCHEMIST.get()), VanillaTypes.ITEM, "item.powder_power.wand_alchemist.line3", 
				" ",
				"item.powder_power.wand_alchemist.line4",
				"item.powder_power.wand_alchemist.line5",
				"item.powder_power.wand_alchemist.line6",
				"item.powder_power.wand_alchemist.line7",
				"item.powder_power.wand_alchemist.line8",
				"item.powder_power.wand_alchemist.line9",
				"item.powder_power.wand_alchemist.line10",
				"item.powder_power.wand_alchemist.line11",
				"item.powder_power.wand_alchemist.line12",
				"item.powder_power.wand_alchemist.line13");
	}
}
