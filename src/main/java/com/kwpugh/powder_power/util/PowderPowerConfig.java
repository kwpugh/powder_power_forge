package com.kwpugh.powder_power.util;

import net.minecraftforge.common.ForgeConfigSpec;

public class PowderPowerConfig 
{
	public static ForgeConfigSpec.IntValue trilium_attack_damage;
	public static ForgeConfigSpec.IntValue trilium_durability;
	public static ForgeConfigSpec.IntValue trilium_harvest_level;
	public static ForgeConfigSpec.IntValue trilium_enchantability;
	
	public static ForgeConfigSpec.IntValue trilium_armor_toughness;
	public static ForgeConfigSpec.IntValue trilium_armor_durability;
	
	public static ForgeConfigSpec.IntValue trilium_helmet_armor;
	public static ForgeConfigSpec.IntValue trilium_chestplate_armor;
	public static ForgeConfigSpec.IntValue trilium_leggings_armor;
	public static ForgeConfigSpec.IntValue trilium_boots_armor;
	
	public static ForgeConfigSpec.Builder server_output;
	
	
	public static void init(ForgeConfigSpec.Builder server)
	{	
		server_output = server.comment("Trilium Material Attributes");
		
		trilium_attack_damage = server
				.comment("Additional Attack Damage of the Trilium Tool Set.  Note, there are hardcoded scaling values applied internally")
				.defineInRange("material_values.trilium_attack_damage", 9, 0, 100);
		
		trilium_durability = server
				.comment("Base Durability of the Trilium Tool Set")
				.defineInRange("material_values.trilium_durability", 3600, 0, 999999);

		trilium_harvest_level = server
				.comment("Harvest Level of the Trilium Tool Set")
				.defineInRange("material_values.trilium_harvest_level", 5, 0, 7);
		
		trilium_enchantability = server
				.comment("Trilium Enchantability")
				.defineInRange("material_values.trilium_enchantability", 20, 0, 256);
		
		
		
		server_output = server.comment("Trilium Armor Configuration");
		
		trilium_armor_toughness = server
				.comment("Toughness, no decimals")
				.defineInRange("armor_values.trilium_armor_toughness", 3, 0, 16);
		
		
		trilium_armor_durability = server
				.comment("Durability modifier for the Trilium Armor Set.  Armor durability array:  {5, 8, 10, 5}.  Durability is calculated by modifer x armor piece array value")
				.defineInRange("armor_values.trilium_armor_durability", 56, 0, 99999999);
		
		trilium_helmet_armor = server
				.comment("Trilium Helmet Armor Value")
				.defineInRange("armor_values.trilium_helmet_armor_protection", 5, 0, 8);
		
		trilium_chestplate_armor = server
				.comment("Trilium Chestplate Armor Value")
				.defineInRange("armor_values.trilium_chestplate_armor_protection", 10, 0, 16);
		
		trilium_leggings_armor = server
				.comment("Trilium Leggings Armor Value")
				.defineInRange("armor_values.trilium_leggings_armor_protection", 8, 0, 16);
		
		trilium_boots_armor = server
				.comment("Trilium Boots Armor Value")
				.defineInRange("armor_values.trilium_boots_armor_protection", 5, 0, 8);	
	}
}