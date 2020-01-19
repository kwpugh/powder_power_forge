package com.kwpugh.powder_power.lists;

import com.kwpugh.powder_power.util.PowderPowerConfig;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;



public enum ToolMaterialList implements IItemTier
{
	redium(1.0f, 8.0f, 1800, 3, 15, ItemList.ingot_redium),
	lapium(1.0f, 8.0f, 1800, 3, 15, ItemList.ingot_lapium),
	gemium(1.0f, 9.0f, 2200, 4, 20, ItemList.gem_gemium),
	//trilium(1.0f, 9.5f, 3600, 5, 25, ItemList.ingot_trilium);
	trilium(PowderPowerConfig.trilium_attack_damage.get(), 9.0F, PowderPowerConfig.trilium_durability.get(), PowderPowerConfig.trilium_harvest_level.get(), PowderPowerConfig.trilium_enchantability.get(), ItemList.ingot_trilium);
	
	private float attackDamage, efficiency;
	private int durability, harvestLevel, enchantability;
	private Item repairMaterial;
	
	private ToolMaterialList(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Item repairMaterial) 
	{
		this.attackDamage = attackDamage;
		this.efficiency = efficiency;
		this.durability = durability;
		this.harvestLevel = harvestLevel;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial;
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
		return Ingredient.fromItems(this.repairMaterial);
	}
}
