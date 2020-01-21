package com.kwpugh.powder_power.lists;

import com.kwpugh.powder_power.PowderPower;
import com.kwpugh.powder_power.util.PowderPowerConfig;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public enum ArmorMaterialList implements IArmorMaterial
{
	//Armor order: helmet, leggings, chestplate, boots
	redium("armor_redium", 38, new int[] {3, 6, 8, 3}, 15, ItemList.ingot_redium, "entity.cat.purreow", 2.0f),
	lapium("armor_lapium", 38, new int[] {3, 6, 8, 3}, 15, ItemList.ingot_lapium, "entity.cat.purreow", 2.0f),
	gemium("armor_gemium", 47, new int[] {4, 7, 9, 4}, 20, ItemList.gem_gemium, "entity.elder_guardian.ambient", 2.25f),
	//trilium("armor_trilium", 56, new int[] {5, 8, 10, 5}, 25, ItemList.ingot_trilium, "entity.ender_dragon.growl", 2.5f);
	trilium("armor_trilium", PowderPowerConfig.trilium_armor_durability.get(), new int[] {PowderPowerConfig.trilium_boots_armor.get(), PowderPowerConfig.trilium_leggings_armor.get(), PowderPowerConfig.trilium_chestplate_armor.get(), PowderPowerConfig.trilium_helmet_armor.get()}, PowderPowerConfig.trilium_enchantability.get(), ItemList.ingot_trilium, "item.armor.entity.ender_dragon.growl", PowderPowerConfig.trilium_armor_toughness.get());
	
	private static final int[] max_damage_array = new int[]{13, 15, 16, 11};
	private String name, equipSound;
	private int durability, enchantability;
	private Item repairItem;
	private int[] damageReductionAmounts;
	private float toughness;
	
	private ArmorMaterialList(String name, int durability, int[] damageReductionAmounts, int enchantability, Item repairItem, String equipSound, float toughness) 
	{
		this.name = name;
		this.equipSound = equipSound;
		this.durability = durability;
		this.enchantability = enchantability;
		this.repairItem = repairItem;
		this.damageReductionAmounts = damageReductionAmounts;
		this.toughness = toughness;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slot) 
	{
		return this.damageReductionAmounts[slot.getIndex()];
	}

	@Override
	public int getDurability(EquipmentSlotType slot) 
	{
		return max_damage_array[slot.getIndex()] * this.durability;
	}

	@Override
	public int getEnchantability() 
	{
		return this.enchantability;
	}

	@Override
	public String getName() 
	{
		return PowderPower.modid + ":" + this.name;
	}

	@Override
	public Ingredient getRepairMaterial() 
	{
		return Ingredient.fromItems(this.repairItem);
	}

	@Override
	public SoundEvent getSoundEvent() 
	{
		return new SoundEvent(new ResourceLocation(equipSound));
	}

	@Override
	public float getToughness() 
	{
		return this.toughness;
	}
}
