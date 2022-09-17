package com.kwpugh.powder_power.lists;

import com.kwpugh.powder_power.PowderPower;
import com.kwpugh.powder_power.config.ConfigPowderPower;
import com.kwpugh.powder_power.init.ItemInit;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class RediumArmorMaterial implements ArmorMaterial
{
    private static int rediumDurabilityMultiplier = ConfigPowderPower.REDIUM_ARMOR_DURABILITY_MULTIPLIER.get();
    private static int rediumEnchantability = ConfigPowderPower.REDIUM_ARMOR_ENCHANTABILITY.get();
    private static double rediumToughness = ConfigPowderPower.REDIUM_ARMOR_TOUGHNESS.get();
    private static double rediumKnockback = ConfigPowderPower.REDIUM_ARMOR_KNOCKBACK_RESISTANCE.get();
    private static int rediumHead = ConfigPowderPower.REDIUM_ARMOR_PROTECTION_HEAD.get();
    private static int rediumBody = ConfigPowderPower.REDIUM_ARMOR_PROTECTION_BODY.get();
    private static int rediumLegs = ConfigPowderPower.REDIUM_ARMOR_PROTECTION_LEGGINGS.get();
    private static int rediumFeet = ConfigPowderPower.REDIUM_ARMOR_PROTECTION_FEET.get();

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNT = new int[]{rediumHead, rediumLegs, rediumBody, rediumFeet};

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot)
    {
        return BASE_DURABILITY[slot.getIndex()] * rediumDurabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot)
    {
        return PROTECTION_AMOUNT[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue()
    {
        return rediumEnchantability;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return new SoundEvent(new ResourceLocation("item.armor.equip_netherite"));
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.of(ItemInit.INGOT_REDIUM.get());
    }

    @Override
    public String getName()
    {
        return PowderPower.modid + ":" + "armor_redium";
    }

    @Override
    public float getToughness()
    {
        return (float) rediumToughness;
    }

    @Override
    public float getKnockbackResistance()
    {
        return (float) rediumKnockback;
    }
}