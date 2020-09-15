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
public class JEIInfoPages implements IModPlugin
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
		registry.addIngredientInfo(new ItemStack(ItemInit.HAMMER_ALCHEMIST.get()), VanillaTypes.ITEM, "item.powder_power.hammer_alchemist.jei.line1",
				" ",
				"item.powder_power.hammer_alchemist.jei.line2",
				" ",
				"item.powder_power.hammer_alchemist.jei.line3");
		
		registry.addIngredientInfo(new ItemStack(ItemInit.WAND_ALCHEMIST.get()), VanillaTypes.ITEM, "item.powder_power.wand_alchemist.jei.line1", 
				" ",
				"item.powder_power.wand_alchemist.jei.line2",
				"item.powder_power.wand_alchemist.jei.line3",
				"item.powder_power.wand_alchemist.jei.line4",
				"item.powder_power.wand_alchemist.jei.line5",
				"item.powder_power.wand_alchemist.jei.line6",
				"item.powder_power.wand_alchemist.jei.line7",
				"item.powder_power.wand_alchemist.jei.line8",
				"item.powder_power.wand_alchemist.jei.line9",
				"item.powder_power.wand_alchemist.jei.line10",
				"item.powder_power.wand_alchemist.jei.line11",
				"item.powder_power.wand_alchemist.jei.line12");
	}
}
