package com.kwpugh.powder_power.lists;

import com.kwpugh.powder_power.PowderPower;
import com.kwpugh.powder_power.config.ConfigPowderPower;
import com.kwpugh.powder_power.init.ItemInit;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class QuadriliumArmorMaterial implements ArmorMaterial
{
    private static int quadriliumDurabilityMultiplier = ConfigPowderPower.QUADRILIUM_ARMOR_DURABILITY_MULTIPLIER.get();
    private static int quadriliumEnchantability = ConfigPowderPower.QUADRILIUM_ARMOR_ENCHANTABILITY.get();
    private static double quadriliumToughness = ConfigPowderPower.QUADRILIUM_ARMOR_TOUGHNESS.get();
    private static double quadriliumKnockback = ConfigPowderPower.QUADRILIUM_ARMOR_KNOCKBACK_RESISTANCE.get();
    private static int quadriliumHead = ConfigPowderPower.QUADRILIUM_ARMOR_PROTECTION_HEAD.get();
    private static int quadriliumBody = ConfigPowderPower.QUADRILIUM_ARMOR_PROTECTION_BODY.get();
    private static int quadriliumLegs = ConfigPowderPower.QUADRILIUM_ARMOR_PROTECTION_LEGGINGS.get();
    private static int quadriliumFeet = ConfigPowderPower.QUADRILIUM_ARMOR_PROTECTION_FEET.get();

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNT = new int[]{quadriliumHead, quadriliumLegs, quadriliumBody, quadriliumFeet};

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot)
    {
        return BASE_DURABILITY[slot.getIndex()] * quadriliumDurabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot)
    {
        return PROTECTION_AMOUNT[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue()
    {
        return quadriliumEnchantability;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return SoundEvents.ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.of(ItemInit.INGOT_QUADRILIUM.get());
    }

    @Override
    public String getName()
    {
        return PowderPower.modid + ":" + "armor_quadrilium";
    }

    @Override
    public float getToughness()
    {
        return (float) quadriliumToughness;
    }

    @Override
    public float getKnockbackResistance()
    {
        return (float) quadriliumKnockback;
    }
}