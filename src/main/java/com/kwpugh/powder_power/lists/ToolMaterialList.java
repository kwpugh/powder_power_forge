package com.kwpugh.powder_power.lists;

import java.util.function.Supplier;

import com.kwpugh.powder_power.init.ItemInit;
import com.kwpugh.powder_power.util.ConfigPowderPower;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.util.LazyLoadedValue;

public enum ToolMaterialList implements Tier
{
	PRISMARINE(1.0f, 3.0f, 725, 3, 8, () -> {
		return Ingredient.of(ItemInit.INGOT_PRISMARINE.get());
	}),
	OBSIDIAN(1.0f, 3.0f, 825, 3, 8, () -> {
		return Ingredient.of(ItemInit.INGOT_OBSIDIAN.get());
	}),
	REDIUM(1.0f, 8.0f, 1800, 3, 15, () -> {
		return Ingredient.of(ItemInit.INGOT_REDIUM.get());
	}),
	LAPIUM(1.0f, 8.0f, 1800, 3, 15, () -> {
		return Ingredient.of(ItemInit.INGOT_LAPIUM.get());
	}),
	GEMIUM(1.0f, 9.0f, 2200, 4, 20, () -> {
		return Ingredient.of(ItemInit.GEM_GEMIUM.get());
	}),
	TRILIUM(ConfigPowderPower.trilium_attack_damage.get(), 9.0F, ConfigPowderPower.trilium_durability.get(), ConfigPowderPower.trilium_harvest_level.get(), ConfigPowderPower.trilium_enchantability.get(), () -> {
		return Ingredient.of(ItemInit.INGOT_TRILIUM.get());
	}),
	QUADRILIUM(ConfigPowderPower.quadrilium_attack_damage.get(), 10.0f, ConfigPowderPower.quadrilium_durability.get(), ConfigPowderPower.quadrilium_harvest_level.get(), ConfigPowderPower.quadrilium_enchantability.get(), () -> {
		return Ingredient.of(ItemInit.INGOT_QUADRILIUM.get());
	});
	
	private float attackDamage, efficiency;
	private int durability, harvestLevel, enchantability;
	final LazyLoadedValue<Ingredient> repairMaterial;
	
	private ToolMaterialList(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Supplier<Ingredient> repairMaterial) 
	{
		this.attackDamage = attackDamage;
		this.efficiency = efficiency;
		this.durability = durability;
		this.harvestLevel = harvestLevel;
		this.enchantability = enchantability;
		this.repairMaterial = new LazyLoadedValue<>(repairMaterial);
	}

	@Override
	public float getAttackDamageBonus() 
	{
		return this.attackDamage;
	}

	@Override
	public float getSpeed() 
	{
		return this.efficiency;
	}

	@Override
	public int getEnchantmentValue() 
	{
		return this.enchantability;
	}

	@Override
	public int getLevel()
	{
		return this.harvestLevel;
	}

	@Override
	public int getUses() 
	{
		return this.durability;
	}

	@Override
	public Ingredient getRepairIngredient() 
	{
		return this.repairMaterial.get();
	}
}
