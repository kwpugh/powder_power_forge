package com.kwpugh.powder_power.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ConfigPowderPower 
{
	public static ForgeConfigSpec.IntValue PRISMARINE_TOOL_DURABILITY;
	public static ForgeConfigSpec.DoubleValue PRISMARINE_TOOL_EFFICIENCY;
	public static ForgeConfigSpec.DoubleValue PRISMARINE_TOOL_ATTACK;
	public static ForgeConfigSpec.IntValue PRISMARINE_TOOL_ENCHANTABILITY;

	public static ForgeConfigSpec.IntValue OBSIDIAN_TOOL_DURABILITY;
	public static ForgeConfigSpec.DoubleValue OBSIDIAN_TOOL_EFFICIENCY;
	public static ForgeConfigSpec.DoubleValue OBSIDIAN_TOOL_ATTACK;
	public static ForgeConfigSpec.IntValue OBSIDIAN_TOOL_ENCHANTABILITY;

	public static ForgeConfigSpec.IntValue REDIUM_TOOL_DURABILITY;
	public static ForgeConfigSpec.DoubleValue REDIUM_TOOL_EFFICIENCY;
	public static ForgeConfigSpec.DoubleValue REDIUM_TOOL_ATTACK;
	public static ForgeConfigSpec.IntValue REDIUM_TOOL_ENCHANTABILITY;

	public static ForgeConfigSpec.IntValue LAPIUM_TOOL_DURABILITY;
	public static ForgeConfigSpec.DoubleValue LAPIUM_TOOL_EFFICIENCY;
	public static ForgeConfigSpec.DoubleValue LAPIUM_TOOL_ATTACK;
	public static ForgeConfigSpec.IntValue LAPIUM_TOOL_ENCHANTABILITY;

	public static ForgeConfigSpec.IntValue GEMIUM_TOOL_DURABILITY;
	public static ForgeConfigSpec.DoubleValue GEMIUM_TOOL_EFFICIENCY;
	public static ForgeConfigSpec.DoubleValue GEMIUM_TOOL_ATTACK;
	public static ForgeConfigSpec.IntValue GEMIUM_TOOL_ENCHANTABILITY;

	public static ForgeConfigSpec.IntValue TRILIUM_TOOL_DURABILITY;
	public static ForgeConfigSpec.DoubleValue TRILIUM_TOOL_EFFICIENCY;
	public static ForgeConfigSpec.DoubleValue TRILIUM_TOOL_ATTACK;
	public static ForgeConfigSpec.IntValue TRILIUM_TOOL_ENCHANTABILITY;

	public static ForgeConfigSpec.IntValue QUADRILIUM_TOOL_DURABILITY;
	public static ForgeConfigSpec.DoubleValue QUADRILIUM_TOOL_EFFICIENCY;
	public static ForgeConfigSpec.DoubleValue QUADRILIUM_TOOL_ATTACK;
	public static ForgeConfigSpec.IntValue QUADRILIUM_TOOL_ENCHANTABILITY;

	public static ForgeConfigSpec.IntValue REDIUM_ARMOR_DURABILITY_MULTIPLIER;
	public static ForgeConfigSpec.IntValue REDIUM_ARMOR_ENCHANTABILITY;
	public static ForgeConfigSpec.DoubleValue REDIUM_ARMOR_TOUGHNESS;
	public static ForgeConfigSpec.DoubleValue REDIUM_ARMOR_KNOCKBACK_RESISTANCE;

	public static ForgeConfigSpec.IntValue LAPIUM_ARMOR_DURABILITY_MULTIPLIER;
	public static ForgeConfigSpec.IntValue LAPIUM_ARMOR_ENCHANTABILITY;
	public static ForgeConfigSpec.DoubleValue LAPIUM_ARMOR_TOUGHNESS;
	public static ForgeConfigSpec.DoubleValue LAPIUM_ARMOR_KNOCKBACK_RESISTANCE;

	public static ForgeConfigSpec.IntValue GEMIUM_ARMOR_DURABILITY_MULTIPLIER;
	public static ForgeConfigSpec.IntValue GEMIUM_ARMOR_ENCHANTABILITY;
	public static ForgeConfigSpec.DoubleValue GEMIUM_ARMOR_TOUGHNESS;
	public static ForgeConfigSpec.DoubleValue GEMIUM_ARMOR_KNOCKBACK_RESISTANCE;

	public static ForgeConfigSpec.IntValue TRILIUM_ARMOR_DURABILITY_MULTIPLIER;
	public static ForgeConfigSpec.IntValue TRILIUM_ARMOR_ENCHANTABILITY;
	public static ForgeConfigSpec.DoubleValue TRILIUM_ARMOR_TOUGHNESS;
	public static ForgeConfigSpec.DoubleValue TRILIUM_ARMOR_KNOCKBACK_RESISTANCE;

	public static ForgeConfigSpec.IntValue QUADRILIUM_ARMOR_DURABILITY_MULTIPLIER;
	public static ForgeConfigSpec.IntValue QUADRILIUM_ARMOR_ENCHANTABILITY;
	public static ForgeConfigSpec.DoubleValue QUADRILIUM_ARMOR_TOUGHNESS;
	public static ForgeConfigSpec.DoubleValue QUADRILIUM_ARMOR_KNOCKBACK_RESISTANCE;

	public static ForgeConfigSpec.IntValue HASTE_TOKEN_BREAK_SPEED;
	public static ForgeConfigSpec.IntValue EXP_TOKEN_MINING_VALUE;
	public static ForgeConfigSpec.IntValue EXP_TOKEN_KILLING_VALUE;

	
	public static void init(ForgeConfigSpec.Builder SERVER)
	{
		SERVER.comment("Prismarine Tool Material").push("prismarine_tool_material");

		PRISMARINE_TOOL_DURABILITY = SERVER.comment("Prismarine Tool Durability [1-3000, default: 725]").defineInRange("prismarineToolDurability", 725, 1, 3000);
		PRISMARINE_TOOL_EFFICIENCY = SERVER.comment("Prismarine Tool efficiency [1.0-7.0, default: 3.0]").defineInRange("prismarineToolEfficiency", 3.0, 0.0, 7.0);
		PRISMARINE_TOOL_ATTACK = SERVER.comment("Prismarine attack damage [1-40, default: 1.0]").defineInRange("prismarineAttackDamage", 1.0, 0.0, 40.0);
		PRISMARINE_TOOL_ENCHANTABILITY = SERVER.comment("Prismarine tool enchantability [1-30, default: 8]").defineInRange("prismarineEnchantability", 8, 1, 30);

		SERVER.pop();


		SERVER.comment("Obsidian Tool Material").push("obsidian_tool_material");

		OBSIDIAN_TOOL_DURABILITY = SERVER.comment("Obsidian Tool Durability [1-3000, default: 825]").defineInRange("obsidianToolDurability", 825, 1, 3000);
		OBSIDIAN_TOOL_EFFICIENCY = SERVER.comment("Obsidian Tool efficiency [1.0-7.0, default: 3.0]").defineInRange("obsidianToolEfficiency", 3.0, 0.0, 7.0);
		OBSIDIAN_TOOL_ATTACK = SERVER.comment("Obsidian attack damage [1-40, default: 1.0]").defineInRange("obsidianAttackDamage", 1.0, 0.0, 40.0);
		OBSIDIAN_TOOL_ENCHANTABILITY = SERVER.comment("Obsidian tool enchantability [1-30, default: 8]").defineInRange("obsidianEnchantability", 8, 1, 30);

		SERVER.pop();


		SERVER.comment("Redium Tool Material").push("redium_tool_material");

		REDIUM_TOOL_DURABILITY = SERVER.comment("Redium Tool Durability [1-3000, default: 1800]").defineInRange("rediumToolDurability", 1800, 1, 3000);
		REDIUM_TOOL_EFFICIENCY = SERVER.comment("Redium Tool efficiency [1.0-10.0, default: 8.0]").defineInRange("rediumToolEfficiency", 8.0, 0.0, 10.0);
		REDIUM_TOOL_ATTACK = SERVER.comment("Redium attack damage [1-40, default: 1.0]").defineInRange("rediumAttackDamage", 1.0, 0.0, 40.0);
		REDIUM_TOOL_ENCHANTABILITY = SERVER.comment("Redium tool enchantability [1-30, default: 15]").defineInRange("rediumEnchantability", 15, 1, 30);

		SERVER.pop();


		SERVER.comment("Lapium Tool Material").push("lapium_tool_material");

		LAPIUM_TOOL_DURABILITY = SERVER.comment("Lapium Tool Durability [1-3000, default: 1800]").defineInRange("lapiumToolDurability", 1800, 1, 3000);
		LAPIUM_TOOL_EFFICIENCY = SERVER.comment("Lapium Tool efficiency [1.0-10.0, default: 8.0]").defineInRange("lapiumToolEfficiency", 8.0, 0.0, 10.0);
		LAPIUM_TOOL_ATTACK = SERVER.comment("Lapium attack damage [1-40, default: 1.0]").defineInRange("lapiumAttackDamage", 1.0, 0.0, 40.0);
		LAPIUM_TOOL_ENCHANTABILITY = SERVER.comment("Lapium tool enchantability [1-30, default: 15]").defineInRange("lapiumEnchantability", 15, 1, 30);

		SERVER.pop();


		SERVER.comment("Gemium Tool Material").push("gemium_tool_material");

		GEMIUM_TOOL_DURABILITY = SERVER.comment("Gemium Tool Durability [1-3000, default: 2200]").defineInRange("gemiumToolDurability", 2200, 1, 3000);
		GEMIUM_TOOL_EFFICIENCY = SERVER.comment("Gemium Tool efficiency [1.0-10.0, default: 9.0]").defineInRange("gemiumToolEfficiency", 9.0, 0.0, 10.0);
		GEMIUM_TOOL_ATTACK = SERVER.comment("Gemium attack damage [1-40, default: 1.0]").defineInRange("gemiumAttackDamage", 1.0, 0.0, 40.0);
		GEMIUM_TOOL_ENCHANTABILITY = SERVER.comment("Gemium tool enchantability [1-30, default: 20]").defineInRange("gemiumEnchantability", 20, 1, 30);

		SERVER.pop();


		SERVER.comment("Trilium Tool Material").push("trilium_tool_material");

		TRILIUM_TOOL_DURABILITY = SERVER.comment("Trilium Tool Durability [1-5000, default: 3600]").defineInRange("triliumToolDurability", 3600, 1, 5000);
		TRILIUM_TOOL_EFFICIENCY = SERVER.comment("Trilium Tool efficiency [1.0-10.0, default: 9.0]").defineInRange("triliumToolEfficiency", 9.0, 0.0, 10.0);
		TRILIUM_TOOL_ATTACK = SERVER.comment("Trilium attack damage [1-40, default: 1.0]").defineInRange("triliumAttackDamage", 1.0, 0.0, 40.0);
		TRILIUM_TOOL_ENCHANTABILITY = SERVER.comment("Trilium tool enchantability [1-30, default: 20]").defineInRange("triliumEnchantability", 20, 1, 30);

		SERVER.pop();


		SERVER.comment("Quadrilium Tool Material").push("quadrilium_tool_material");

		QUADRILIUM_TOOL_DURABILITY = SERVER.comment("Quadrilium Tool Durability [1-5000, default: 4200]").defineInRange("quadriliumToolDurability", 4200, 1, 5000);
		QUADRILIUM_TOOL_EFFICIENCY = SERVER.comment("Quadrilium Tool efficiency [1.0-10.0, default: 9.0]").defineInRange("quadriliumToolEfficiency", 9.0, 0.0, 10.0);
		QUADRILIUM_TOOL_ATTACK = SERVER.comment("Quadrilium attack damage [1-40, default: 1.0]").defineInRange("quadriliumAttackDamage", 1.0, 0.0, 40.0);
		QUADRILIUM_TOOL_ENCHANTABILITY = SERVER.comment("Quadrilium tool enchantability [1-30, default: 25]").defineInRange("quadriliumEnchantability", 25, 1, 30);

		SERVER.pop();


		SERVER.comment("Redium Armor Material").push("redium_armor_material");

		REDIUM_ARMOR_DURABILITY_MULTIPLIER = SERVER.comment("Redium armor durability multiplier [1-50, default: 38]").defineInRange("rediumArmorDurabilityMultiplier", 38, 1, 50);
		REDIUM_ARMOR_ENCHANTABILITY = SERVER.comment("Redium armor enchantability [1-31, default: 15]").defineInRange("rediumArmorEnchantability", 15, 1, 31);
		REDIUM_ARMOR_TOUGHNESS = SERVER.comment("Redium armor toughness [0.0-4.0, default: 2.0]").defineInRange("rediumArmorToughness", 2.0, 0.0, 4.0);
		REDIUM_ARMOR_KNOCKBACK_RESISTANCE = SERVER.comment("Redium armor knockback resistance [0.0-4.0, default: 0.0]").defineInRange("rediumArmorKnockbackResistance", 0.0, 0.0, 4.0);

		SERVER.pop();


		SERVER.comment("Lapium Armor Material").push("lapium_armor_material");

		LAPIUM_ARMOR_DURABILITY_MULTIPLIER = SERVER.comment("Lapium armor durability multiplier [1-50, default: 38]").defineInRange("lapiumArmorDurabilityMultiplier", 38, 1, 50);
		LAPIUM_ARMOR_ENCHANTABILITY = SERVER.comment("Lapium armor enchantability [1-31, default: 15]").defineInRange("lapiumArmorEnchantability", 15, 1, 31);
		LAPIUM_ARMOR_TOUGHNESS = SERVER.comment("Lapium armor toughness [0.0-4.0, default: 2.0]").defineInRange("lapiumArmorToughness", 2.0, 0.0, 4.0);
		LAPIUM_ARMOR_KNOCKBACK_RESISTANCE = SERVER.comment("Lapium armor knockback resistance [0.0-4.0, default: 0.0]").defineInRange("lapiumArmorKnockbackResistance", 0.0, 0.0, 4.0);

		SERVER.pop();


		SERVER.comment("Gemium Armor Material").push("gemium_armor_material");

		GEMIUM_ARMOR_DURABILITY_MULTIPLIER = SERVER.comment("Gemium armor durability multiplier [1-50, default: 47]").defineInRange("gemiumArmorDurabilityMultiplier", 47, 1, 50);
		GEMIUM_ARMOR_ENCHANTABILITY = SERVER.comment("Gemium armor enchantability [1-31, default: 20]").defineInRange("gemiumArmorEnchantability", 20, 1, 31);
		GEMIUM_ARMOR_TOUGHNESS = SERVER.comment("Gemium armor toughness [0.0-4.0, default: 2.25]").defineInRange("gemiumArmorToughness", 2.25, 0.0, 4.0);
		GEMIUM_ARMOR_KNOCKBACK_RESISTANCE = SERVER.comment("Gemium armor knockback resistance [0.0-4.0, default: 0.0]").defineInRange("gemiumArmorKnockbackResistance", 0.0, 0.0, 4.0);

		SERVER.pop();


		SERVER.comment("Trilium Armor Material").push("trilium_armor_material");

		TRILIUM_ARMOR_DURABILITY_MULTIPLIER = SERVER.comment("Trilium armor durability multiplier [1-75, default: 56]").defineInRange("triliumArmorDurabilityMultiplier", 56, 1, 75);
		TRILIUM_ARMOR_ENCHANTABILITY = SERVER.comment("Trilium armor enchantability [1-31, default: 25]").defineInRange("triliumArmorEnchantability", 25, 1, 31);
		TRILIUM_ARMOR_TOUGHNESS = SERVER.comment("Trilium armor toughness [0.0-4.0, default: 3.0]").defineInRange("triliumArmorToughness", 3.0, 0.0, 4.0);
		TRILIUM_ARMOR_KNOCKBACK_RESISTANCE = SERVER.comment("Trilium armor knockback resistance [0.0-4.0, default: 0.1]").defineInRange("triliumArmorKnockbackResistance", 0.1, 0.0, 4.0);

		SERVER.pop();


		SERVER.comment("Quadrilium Armor Material").push("quadrilium_armor_material");

		QUADRILIUM_ARMOR_DURABILITY_MULTIPLIER = SERVER.comment("Quadrilium armor durability multiplier [1-75, default: 64]").defineInRange("quadriliumArmorDurabilityMultiplier", 64, 1, 75);
		QUADRILIUM_ARMOR_ENCHANTABILITY = SERVER.comment("Quadrilium armor enchantability [1-31, default: 30]").defineInRange("quadriliumArmorEnchantability", 30, 1, 31);
		QUADRILIUM_ARMOR_TOUGHNESS = SERVER.comment("Quadrilium armor toughness [0.0-4.0, default: 4.0]").defineInRange("quadriliumArmorToughness", 4.0, 0.0, 4.0);
		QUADRILIUM_ARMOR_KNOCKBACK_RESISTANCE = SERVER.comment("Quadrilium armor knockback resistance [0.0-4.0, default: 0.2]").defineInRange("quadriliumArmorKnockbackResistance", 0.2, 0.0, 4.0);

		SERVER.pop();


		SERVER.comment("Token Settings").push("token_settings");

		EXP_TOKEN_MINING_VALUE = SERVER.comment("Experience Token value for mining ores").defineInRange("token_settings.exp_token_mining_value", 7, 0, 100);
		EXP_TOKEN_KILLING_VALUE = SERVER.comment("Experience Token value for killing mobs").defineInRange("token_settings.exp_token_killing_value", 4, 0, 100);

		SERVER.pop();
	}
}