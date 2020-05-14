package com.kwpugh.powder_power.lists;

import java.util.function.Supplier;

import com.kwpugh.powder_power.init.ItemInit;
import com.kwpugh.powder_power.util.PowderPowerConfig;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ToolMaterialList implements IItemTier
{
	PRISMARINE(1.0f, 3.0f, 725, 3, 8, () -> {
		return Ingredient.fromItems(ItemInit.INGOT_PRISMARINE.get());
	}),
	OBSIDIAN(1.0f, 3.0f, 825, 3, 8, () -> {
		return Ingredient.fromItems(ItemInit.INGOT_OBSIDIAN.get());
	}),
	REDIUM(1.0f, 8.0f, 1800, 3, 15, () -> {
		return Ingredient.fromItems(ItemInit.INGOT_REDIUM.get());
	}),
	LAPIUM(1.0f, 8.0f, 1800, 3, 15, () -> {
		return Ingredient.fromItems(ItemInit.INGOT_LAPIUM.get());
	}),
	GEMIUM(1.0f, 9.0f, 2200, 4, 20, () -> {
		return Ingredient.fromItems(ItemInit.GEM_GEMIUM.get());
	}),
	TRILIUM(PowderPowerConfig.trilium_attack_damage.get(), 9.0F, PowderPowerConfig.trilium_durability.get(), PowderPowerConfig.trilium_harvest_level.get(), PowderPowerConfig.trilium_enchantability.get(), () -> {
		return Ingredient.fromItems(ItemInit.INGOT_TRILIUM.get());
	});
	
	private float attackDamage, efficiency;
	private int durability, harvestLevel, enchantability;
	final LazyValue<Ingredient> repairMaterial;
	
	private ToolMaterialList(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Supplier<Ingredient> repairMaterial) 
	{
		this.attackDamage = attackDamage;
		this.efficiency = efficiency;
		this.durability = durability;
		this.harvestLevel = harvestLevel;
		this.enchantability = enchantability;
		this.repairMaterial = new LazyValue<>(repairMaterial);
	}

	@Override
	public float getAttackDamage() 
	{
		return this.attackDamage;
	}

	@Override
	public float getEfficiency() 
	{
		return this.efficiency;
	}

	@Override
	public int getEnchantability() 
	{
		return this.enchantability;
	}

	@Override
	public int getHarvestLevel()
	{
		return this.harvestLevel;
	}

	@Override
	public int getMaxUses() 
	{
		return this.durability;
	}

	@Override
	public Ingredient getRepairMaterial() 
	{
		return this.repairMaterial.getValue();
	}
}
