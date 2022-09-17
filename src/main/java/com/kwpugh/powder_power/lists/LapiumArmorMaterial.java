package com.kwpugh.powder_power.lists;

import com.kwpugh.powder_power.PowderPower;
import com.kwpugh.powder_power.config.ConfigPowderPower;
import com.kwpugh.powder_power.init.ItemInit;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class LapiumArmorMaterial implements ArmorMaterial
{
    private static int lapiumDurabilityMultiplier = ConfigPowderPower.LAPIUM_ARMOR_DURABILITY_MULTIPLIER.get();
    private static int lapiumEnchantability = ConfigPowderPower.LAPIUM_ARMOR_ENCHANTABILITY.get();
    private static double lapiumToughness = ConfigPowderPower.LAPIUM_ARMOR_TOUGHNESS.get();
    private static double lapiumKnockback = ConfigPowderPower.LAPIUM_ARMOR_KNOCKBACK_RESISTANCE.get();
    private static int lapiumHead = ConfigPowderPower.LAPIUM_ARMOR_PROTECTION_HEAD.get();
    private static int lapiumBody = ConfigPowderPower.LAPIUM_ARMOR_PROTECTION_BODY.get();
    private static int lapiumLegs = ConfigPowderPower.LAPIUM_ARMOR_PROTECTION_LEGGINGS.get();
    private static int lapiumFeet = ConfigPowderPower.LAPIUM_ARMOR_PROTECTION_FEET.get();

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNT = new int[]{lapiumHead, lapiumLegs, lapiumBody, lapiumFeet};

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot)
    {
        return BASE_DURABILITY[slot.getIndex()] * lapiumDurabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot)
    {
        return PROTECTION_AMOUNT[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue()
    {
        return lapiumEnchantability;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return new SoundEvent(new ResourceLocation("item.armor.equip_netherite"));
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.of(ItemInit.INGOT_LAPIUM.get());
    }

    @Override
    public String getName()
    {
        return PowderPower.modid + ":" + "armor_lapium";
    }

    @Override
    public float getToughness()
    {
        return (float) lapiumToughness;
    }

    @Override
    public float getKnockbackResistance()
    {
        return (float) lapiumKnockback;
    }
}