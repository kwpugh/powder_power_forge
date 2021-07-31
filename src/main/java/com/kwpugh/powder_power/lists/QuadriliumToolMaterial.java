package com.kwpugh.powder_power.lists;

import com.kwpugh.powder_power.init.ItemInit;
import com.kwpugh.powder_power.config.ConfigPowderPower;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class QuadriliumToolMaterial implements Tier
{
    private int durability = ConfigPowderPower.QUADRILIUM_TOOL_DURABILITY.get();
    private double efficiency = ConfigPowderPower.QUADRILIUM_TOOL_EFFICIENCY.get();
    private double attackDamage = ConfigPowderPower.QUADRILIUM_TOOL_ATTACK.get();
    private int miningLevel = ConfigPowderPower.QUADRILIUM_TOOL_MINING_LEVEL.get();
    private int enchantability = ConfigPowderPower.QUADRILIUM_TOOL_ENCHANTABILITY.get();

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
        return Ingredient.of(ItemInit.INGOT_QUADRILIUM.get());
    }
}