package com.kwpugh.powder_power.lists;

import com.kwpugh.powder_power.PowderPower;
import com.kwpugh.powder_power.config.ConfigPowderPower;
import com.kwpugh.powder_power.init.ItemInit;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class TriliumArmorMaterial implements ArmorMaterial
{
    private static int triliumDurabilityMultiplier = ConfigPowderPower.TRILIUM_ARMOR_DURABILITY_MULTIPLIER.get();
    private static int triliumEnchantability = ConfigPowderPower.TRILIUM_ARMOR_ENCHANTABILITY.get();
    private static double triliumToughness = ConfigPowderPower.TRILIUM_ARMOR_TOUGHNESS.get();
    private static double triliumKnockback = ConfigPowderPower.TRILIUM_ARMOR_KNOCKBACK_RESISTANCE.get();
    private static int triliumHead = ConfigPowderPower.TRILIUM_ARMOR_PROTECTION_HEAD.get();
    private static int triliumBody = ConfigPowderPower.TRILIUM_ARMOR_PROTECTION_BODY.get();
    private static int triliumLegs = ConfigPowderPower.TRILIUM_ARMOR_PROTECTION_LEGGINGS.get();
    private static int triliumFeet = ConfigPowderPower.TRILIUM_ARMOR_PROTECTION_FEET.get();

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNT = new int[]{triliumHead, triliumLegs, triliumBody, triliumFeet};

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot)
    {
        return BASE_DURABILITY[slot.getIndex()] * triliumDurabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot)
    {
        return PROTECTION_AMOUNT[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue()
    {
        return triliumEnchantability;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return SoundEvents.ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.of(ItemInit.INGOT_TRILIUM.get());
    }

    @Override
    public String getName()
    {
        return PowderPower.modid + ":" + "armor_trilium";
    }

    @Override
    public float getToughness()
    {
        return (float) triliumToughness;
    }

    @Override
    public float getKnockbackResistance()
    {
        return (float) triliumKnockback;
    }
}