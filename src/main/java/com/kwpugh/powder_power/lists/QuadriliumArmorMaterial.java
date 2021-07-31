package com.kwpugh.powder_power.lists;

import com.kwpugh.powder_power.PowderPower;
import com.kwpugh.powder_power.config.ConfigPowderPower;
import com.kwpugh.powder_power.init.ItemInit;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class QuadriliumArmorMaterial implements ArmorMaterial
{
    private static int durabilityMultiplier = ConfigPowderPower.QUADRILIUM_ARMOR_DURABILITY_MULTIPLIER.get();
    private static int enchantability = ConfigPowderPower.QUADRILIUM_ARMOR_ENCHANTABILITY.get();
    private static double toughness = ConfigPowderPower.QUADRILIUM_ARMOR_TOUGHNESS.get();
    private static double knochback = ConfigPowderPower.QUADRILIUM_ARMOR_KNOCKBACK_RESISTANCE.get();

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNT = new int[]{6, 9, 11, 6};

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot)
    {
        return BASE_DURABILITY[slot.getIndex()] * durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot)
    {
        return PROTECTION_AMOUNT[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue()
    {
        return enchantability;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return new SoundEvent(new ResourceLocation("item.armor.equip_netherite"));
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
        return (float) toughness;
    }

    @Override
    public float getKnockbackResistance()
    {
        return (float) knochback;
    }
}