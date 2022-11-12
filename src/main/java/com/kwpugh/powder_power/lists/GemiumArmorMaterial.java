package com.kwpugh.powder_power.lists;

import com.kwpugh.powder_power.PowderPower;
import com.kwpugh.powder_power.config.ConfigPowderPower;
import com.kwpugh.powder_power.init.ItemInit;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class GemiumArmorMaterial implements ArmorMaterial
{
    private static int gemiumDurabilityMultiplier = ConfigPowderPower.GEMIUM_ARMOR_DURABILITY_MULTIPLIER.get();
    private static int gemiumEnchantability = ConfigPowderPower.GEMIUM_ARMOR_ENCHANTABILITY.get();
    private static double gemiumToughness = ConfigPowderPower.GEMIUM_ARMOR_TOUGHNESS.get();
    private static double gemiumKnockback = ConfigPowderPower.GEMIUM_ARMOR_KNOCKBACK_RESISTANCE.get();
    private static int gemiumHead = ConfigPowderPower.GEMIUM_ARMOR_PROTECTION_HEAD.get();
    private static int gemiumBody = ConfigPowderPower.GEMIUM_ARMOR_PROTECTION_BODY.get();
    private static int gemiumLegs = ConfigPowderPower.GEMIUM_ARMOR_PROTECTION_LEGGINGS.get();
    private static int gemiumFeet = ConfigPowderPower.GEMIUM_ARMOR_PROTECTION_FEET.get();

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNT = new int[]{gemiumHead, gemiumLegs, gemiumBody, gemiumFeet};

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot)
    {
        return BASE_DURABILITY[slot.getIndex()] * gemiumDurabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot)
    {
        return PROTECTION_AMOUNT[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue()
    {
        return gemiumEnchantability;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return SoundEvents.ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.of(ItemInit.GEM_GEMIUM.get());
    }

    @Override
    public String getName()
    {
        return PowderPower.modid + ":" + "armor_gemium";
    }

    @Override
    public float getToughness()
    {
        return (float) gemiumToughness;
    }

    @Override
    public float getKnockbackResistance()
    {
        return (float) gemiumKnockback;
    }
}