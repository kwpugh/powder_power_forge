package com.kwpugh.powder_power.lists;

import com.kwpugh.powder_power.init.ItemInit;
import com.kwpugh.powder_power.config.ConfigPowderPower;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class GemiumToolMaterial implements Tier
{
    private int durability = ConfigPowderPower.GEMIUM_TOOL_DURABILITY.get();
    private double efficiency = ConfigPowderPower.GEMIUM_TOOL_EFFICIENCY.get();
    private double attackDamage = ConfigPowderPower.GEMIUM_TOOL_ATTACK.get();
    private int miningLevel = ConfigPowderPower.GEMIUM_TOOL_MINING_LEVEL.get();
    private int enchantability = ConfigPowderPower.GEMIUM_TOOL_ENCHANTABILITY.get();

    @Override
    public int getUses()
    {
        return durability;
    }

    @Override
    public float getSpeed()
    {
        return (float) efficiency;
    }

    @Override
    public float getAttackDamageBonus()
    {
        return (float) attackDamage;
    }

    @Override
    public int getLevel()
    {
        return miningLevel;
    }

    @Override
    public int getEnchantmentValue()
    {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.of(ItemInit.GEM_GEMIUM.get());
    }
}