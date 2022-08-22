package com.kwpugh.powder_power.util;

import com.kwpugh.powder_power.PowderPower;
import com.kwpugh.powder_power.init.ItemInit;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;

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
        registry.addIngredientInfo(new ItemStack(ItemInit.HAMMER_ALCHEMIST.get()), VanillaTypes.ITEM_STACK, Component.translatable("item.powder_power.hammer_alchemist.jei.line1"));
        registry.addIngredientInfo(new ItemStack(ItemInit.WAND_ALCHEMIST.get()), VanillaTypes.ITEM_STACK, Component.translatable("item.powder_power.wand_alchemist.jei.line1"));
    }
}
