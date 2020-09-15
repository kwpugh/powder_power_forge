package com.kwpugh.powder_power.util;

import net.minecraftforge.common.ForgeConfigSpec;

public class ConfigPowderPower 
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
	
	public static ForgeConfigSpec.IntValue quadrilium_attack_damage;
	public static ForgeConfigSpec.IntValue quadrilium_durability;
	public static ForgeConfigSpec.IntValue quadrilium_harvest_level;
	public static ForgeConfigSpec.IntValue quadrilium_enchantability;
	
	public static ForgeConfigSpec.IntValue quadrilium_armor_toughness;
	public static ForgeConfigSpec.IntValue quadrilium_armor_durability;	
	public static ForgeConfigSpec.IntValue quadrilium_helmet_armor;
	public static ForgeConfigSpec.IntValue quadrilium_chestplate_armor;
	public static ForgeConfigSpec.IntValue quadrilium_leggings_armor;
	public static ForgeConfigSpec.IntValue quadrilium_boots_armor;
	
	public static ForgeConfigSpec.IntValue haste_token_break_speed;
	
	public static ForgeConfigSpec.IntValue exp_token_mining_value;
	public static ForgeConfigSpec.IntValue exp_token_killing_value;
	
	public static ForgeConfigSpec.Builder server_output;
	
	
	public static void init(ForgeConfigSpec.Builder server)
	{	
		server_output = server.comment("Trilium Material Attributes");
		
		trilium_attack_damage = server
				.comment("Additional Attack Damage of the Trilium Tool Set.  Note, there are hardcoded scaling values applied internally")
				.defineInRange("trilium.material_values.trilium_attack_damage", 9, 0, 100);
		
		trilium_durability = server
				.comment("Base Durability of the Trilium Tool Set")
				.defineInRange("trilium.material_values.trilium_durability", 3600, 0, 999999);

		trilium_harvest_level = server
				.comment("Harvest Level of the Trilium Tool Set")
				.defineInRange("trilium.material_values.trilium_harvest_level", 5, 0, 7);
		
		trilium_enchantability = server
				.comment("Trilium Enchantability")
				.defineInRange("trilium.material_values.trilium_enchantability", 20, 0, 256);
		
		
		
		server_output = server.comment("Trilium Armor Configuration");
		
		trilium_armor_toughness = server
				.comment("Toughness, no decimals")
				.defineInRange("trilium.armor_values.trilium_armor_toughness", 3, 0, 16);
				
		trilium_armor_durability = server
				.comment("Durability modifier for the Trilium Armor Set.  Armor durability array:  {5, 8, 10, 5}.  Durability is calculated by modifer x armor piece array value")
				.defineInRange("trilium.armor_values.trilium_armor_durability", 56, 0, 99999999);
		
		trilium_helmet_armor = server
				.comment("Trilium Helmet Armor Value")
				.defineInRange("trilium.armor_values.trilium_helmet_armor_protection", 5, 0, 8);
		
		trilium_chestplate_armor = server
				.comment("Trilium Chestplate Armor Value")
				.defineInRange("trilium.armor_values.trilium_chestplate_armor_protection", 10, 0, 16);
		
		trilium_leggings_armor = server
				.comment("Trilium Leggings Armor Value")
				.defineInRange("trilium.armor_values.trilium_leggings_armor_protection", 8, 0, 16);
		
		trilium_boots_armor = server
				.comment("Trilium Boots Armor Value")
				.defineInRange("trilium.armor_values.trilium_boots_armor_protection", 5, 0, 8);	
		
		
		
		server_output = server.comment("Quadrilium Material Attributes");
		
		quadrilium_attack_damage = server
				.comment("Additional Attack Damage of the Quadrilium Tool Set.  Note, there are hardcoded scaling values applied internally")
				.defineInRange("quadrilium.material_values.quadrilium_attack_damage", 1, 0, 100);
		
		quadrilium_durability = server
				.comment("Base Durability of the Quadrilium Tool Set")
				.defineInRange("quadrilium.material_values.quadrilium_durability", 4200, 0, 999999);

		quadrilium_harvest_level = server
				.comment("Harvest Level of the Quadrilium Tool Set")
				.defineInRange("quadrilium.material_values.quadrilium_harvest_level", 5, 0, 7);
		
		quadrilium_enchantability = server
				.comment("Quadrilium Enchantability")
				.defineInRange("quadrilium.material_values.quadrilium_enchantability", 22, 0, 256);
		
		

		server_output = server.comment("Quadrilium Armor Configuration");
		
		quadrilium_armor_toughness = server
				.comment("Toughness, no decimals")
				.defineInRange("quadrilium.armor_values.quadrilium_armor_toughness", 4, 0, 16);
				
		quadrilium_armor_durability = server
				.comment("Durability modifier for the Quadrilium Armor Set.  Armor durability array:  {6, 9, 11, 6}.  Durability is calculated by modifer x armor piece array value")
				.defineInRange("quadrilium.armor_values.quadrilium_armor_durability", 64, 0, 99999999);
		
		quadrilium_helmet_armor = server
				.comment("Quadrilium Helmet Armor Value")
				.defineInRange("quadrilium.armor_values.quadrilium_helmet_armor_protection", 6, 0, 8);
		
		quadrilium_chestplate_armor = server
				.comment("Quadrilium Chestplate Armor Value")
				.defineInRange("quadrilium.armor_values.quadrilium_chestplate_armor_protection", 11, 0, 16);
		
		quadrilium_leggings_armor = server
				.comment("Quadrilium Leggings Armor Value")
				.defineInRange("quadrilium.armor_values.quadrilium_leggings_armor_protection", 9, 0, 16);
		
		quadrilium_boots_armor = server
				.comment("Quadrilium Boots Armor Value")
				.defineInRange("quadrilium.armor_values.quadrilium_boots_armor_protection", 6, 0, 8);	
		
		
		
		server_output = server.comment("Token Settings");
		
		haste_token_break_speed = server
				.comment("Haste Token block break speed")
				.defineInRange("token_settings.haste_token_break_speed", 30, 10, 100);	
		
		exp_token_mining_value = server
				.comment("Experience Token value for mining ores")
				.defineInRange("token_settings.exp_token_mining_value", 7, 0, 100);	
		
		exp_token_killing_value = server
				.comment("Experience Token value for killing mobs")
				.defineInRange("token_settings.exp_token_killing_value", 4, 0, 100);	
	}
}