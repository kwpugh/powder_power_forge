package com.kwpugh.powder_power.lists;

import com.kwpugh.powder_power.PowderPower;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public enum ArmorMaterialList implements IArmorMaterial
{
	//Armor order: helmet, leggings, chestplate, boots
	redium("armor_redium", 50, new int[] {3, 6, 8, 3}, 15, ItemList.ingot_redium, "entity.chicken.ambient", 1.0f),
	lapium("armor_lapium", 50, new int[] {3, 6, 8, 3}, 15, ItemList.ingot_lapium, "entity.cat.ambient", 1.0f),
	gemium("armor_gemium", 60, new int[] {4, 7, 9, 4}, 20, ItemList.gem_gemium, "entity.elder_guardian.ambient", 1.5f),
	trilium("armor_trilium", 70, new int[] {5, 8, 10, 5}, 25, ItemList.ingot_trilium, "entity.ender_dragon.growl", 2.0f);
	
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
