package com.kwpugh.powder_power.lists;

import com.kwpugh.powder_power.PowderPower;
import com.kwpugh.powder_power.init.ItemInit;
import com.kwpugh.powder_power.util.ConfigPowderPower;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public enum ArmorMaterialList implements ArmorMaterial
{
	//Armor order: helmet, leggings, chestplate, boots
	REDIUM("armor_redium", 38, new int[] {3, 6, 8, 3}, 15, ItemInit.INGOT_REDIUM.get(), "item.armor.equip_netherite", 2.0f, 0.0f),
	LAPIUM("armor_lapium", 38, new int[] {3, 6, 8, 3}, 15, ItemInit.INGOT_LAPIUM.get(), "item.armor.equip_netherite", 2.0f, 0.0f),
	GEMIUM("armor_gemium", 47, new int[] {4, 7, 9, 4}, 20, ItemInit.GEM_GEMIUM.get(), "item.armor.equip_netherite", 2.25f, 0.0f),
	TRILIUM("armor_trilium", ConfigPowderPower.trilium_armor_durability.get(), new int[] {ConfigPowderPower.trilium_boots_armor.get(), ConfigPowderPower.trilium_leggings_armor.get(), ConfigPowderPower.trilium_chestplate_armor.get(), ConfigPowderPower.trilium_helmet_armor.get()}, ConfigPowderPower.trilium_enchantability.get(), ItemInit.INGOT_TRILIUM.get(), "item.armor.equip_netherite", ConfigPowderPower.trilium_armor_toughness.get(), 0.1F),
	QUADRILIUM("armor_quadrilium", ConfigPowderPower.quadrilium_armor_durability.get(), new int[] {ConfigPowderPower.quadrilium_boots_armor.get(), ConfigPowderPower.quadrilium_leggings_armor.get(), ConfigPowderPower.quadrilium_chestplate_armor.get(), ConfigPowderPower.quadrilium_helmet_armor.get()}, ConfigPowderPower.quadrilium_enchantability.get(), ItemInit.INGOT_QUADRILIUM.get(), "item.armor.equip_netherite", ConfigPowderPower.quadrilium_armor_toughness.get(), 0.2F);
	
	private static final int[] max_damage_array = new int[]{13, 15, 16, 11};
	private String name, equipSound;
	private int durability, enchantability;
	private Item repairItem;
	private int[] damageReductionAmounts;
	private float toughness;
	private final float knockbackResistance;
	
	private ArmorMaterialList(String name, int durability, int[] damageReductionAmounts, int enchantability, Item repairItem, String equipSound, float toughness, float knockbackResistance) 
	{
		this.name = name;
		this.equipSound = equipSound;
		this.durability = durability;
		this.enchantability = enchantability;
		this.repairItem = repairItem;
		this.damageReductionAmounts = damageReductionAmounts;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlot slot) 
	{
		return this.damageReductionAmounts[slot.getIndex()];
	}

	@Override
	public int getDurabilityForSlot(EquipmentSlot slot) 
	{
		return max_damage_array[slot.getIndex()] * this.durability;
	}

	@Override
	public int getEnchantmentValue() 
	{
		return this.enchantability;
	}

	@Override
	public String getName() 
	{
		return PowderPower.modid + ":" + this.name;
	}

	@Override
	public Ingredient getRepairIngredient() 
	{
		return Ingredient.of(this.repairItem);
	}

	@Override
	public SoundEvent getEquipSound() 
	{
		return new SoundEvent(new ResourceLocation(equipSound));
	}

	@Override
	public float getToughness() 
	{
		return this.toughness;
	}

	@Override
	 public float getKnockbackResistance()
	{
		return this.knockbackResistance;
	}
}
