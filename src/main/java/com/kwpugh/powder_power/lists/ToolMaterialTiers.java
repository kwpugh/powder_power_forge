package com.kwpugh.powder_power.lists;

import com.kwpugh.powder_power.PowderPower;
import com.kwpugh.powder_power.config.ConfigPowderPower;
import com.kwpugh.powder_power.init.ItemInit;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ToolMaterialTiers
{
    private static int obsidianDurability = ConfigPowderPower.OBSIDIAN_TOOL_DURABILITY.get();
    private static double obsidianEfficiency = ConfigPowderPower.OBSIDIAN_TOOL_EFFICIENCY.get();
    private static double obsidianAttackDamage = ConfigPowderPower.OBSIDIAN_TOOL_ATTACK.get();
    private static int obsidianMiningLevel = 3;
    private static int obsidianEnchantability = ConfigPowderPower.OBSIDIAN_TOOL_ENCHANTABILITY.get();

    private static int prismarineDurability = ConfigPowderPower.PRISMARINE_TOOL_DURABILITY.get();
    private static double prismarineEfficiency = ConfigPowderPower.PRISMARINE_TOOL_EFFICIENCY.get();
    private static double prismarineAttackDamage = ConfigPowderPower.PRISMARINE_TOOL_ATTACK.get();
    private static int prismarineMiningLevel = 3;
    private static int prismarineEnchantability = ConfigPowderPower.PRISMARINE_TOOL_ENCHANTABILITY.get();

    private static int rediumDurability = ConfigPowderPower.REDIUM_TOOL_DURABILITY.get();
    private static double rediumEfficiency = ConfigPowderPower.REDIUM_TOOL_EFFICIENCY.get();
    private static double rediumAttackDamage = ConfigPowderPower.REDIUM_TOOL_ATTACK.get();
    private static int rediumMiningLevel = 3;
    private static int rediumEnchantability = ConfigPowderPower.REDIUM_TOOL_ENCHANTABILITY.get();

    private static int lapiumDurability = ConfigPowderPower.LAPIUM_TOOL_DURABILITY.get();
    private static double lapiumEfficiency = ConfigPowderPower.LAPIUM_TOOL_EFFICIENCY.get();
    private static double lapiumAttackDamage = ConfigPowderPower.LAPIUM_TOOL_ATTACK.get();
    private static int lapiumMiningLevel = 3;
    private static int lapiumEnchantability = ConfigPowderPower.LAPIUM_TOOL_ENCHANTABILITY.get();

    private static int gemiumDurability = ConfigPowderPower.GEMIUM_TOOL_DURABILITY.get();
    private static double gemiumEfficiency = ConfigPowderPower.GEMIUM_TOOL_EFFICIENCY.get();
    private static double gemiumAttackDamage = ConfigPowderPower.GEMIUM_TOOL_ATTACK.get();
    private static int gemiumMiningLevel = 4;
    private static int gemiumEnchantability = ConfigPowderPower.GEMIUM_TOOL_ENCHANTABILITY.get();

    private static int triliumDurability = ConfigPowderPower.TRILIUM_TOOL_DURABILITY.get();
    private static double triliumEfficiency = ConfigPowderPower.TRILIUM_TOOL_EFFICIENCY.get();
    private static double triliumAttackDamage = ConfigPowderPower.TRILIUM_TOOL_ATTACK.get();
    private static int triliumMiningLevel = 4;
    private static int triliumEnchantability = ConfigPowderPower.TRILIUM_TOOL_ENCHANTABILITY.get();

    private static int quadriliumDurability = ConfigPowderPower.QUADRILIUM_TOOL_DURABILITY.get();
    private static double quadriliumEfficiency = ConfigPowderPower.QUADRILIUM_TOOL_EFFICIENCY.get();
    private static double quadriliumAttackDamage = ConfigPowderPower.QUADRILIUM_TOOL_ATTACK.get();
    private static int quadriliumMiningLevel = 4;
    private static int quadriliumEnchantability = ConfigPowderPower.QUADRILIUM_TOOL_ENCHANTABILITY.get();


    public static final Tier OBSIDIAN = new ForgeTier(obsidianMiningLevel,
            obsidianDurability,
            (float) obsidianEfficiency,
            (float) obsidianAttackDamage,
            obsidianEnchantability,
            BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ItemInit.INGOT_OBSIDIAN.get()));

    public static final Tier PRISMARINE = new ForgeTier(prismarineMiningLevel,
            prismarineDurability,
            (float) prismarineEfficiency,
            (float) prismarineAttackDamage,
            prismarineEnchantability,
            BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ItemInit.INGOT_PRISMARINE.get()));

    public static final Tier REDIUM = new ForgeTier(rediumMiningLevel,
            rediumDurability,
            (float) rediumEfficiency,
            (float) rediumAttackDamage,
            rediumEnchantability,
            BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ItemInit.INGOT_REDIUM.get()));

    public static final Tier LAPIUM = new ForgeTier(lapiumMiningLevel,
            lapiumDurability,
            (float) lapiumEfficiency,
            (float) lapiumAttackDamage,
            lapiumEnchantability,
            BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ItemInit.INGOT_LAPIUM.get()));

    public static final Tier GEMIUM = new ForgeTier(gemiumMiningLevel,
            gemiumDurability,
            (float) gemiumEfficiency,
            (float) gemiumAttackDamage,
            gemiumEnchantability,
            Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ItemInit.GEM_GEMIUM.get()));

    public static final Tier TRILIUM = new ForgeTier(triliumMiningLevel,
            triliumDurability,
            (float) triliumEfficiency,
            (float) triliumAttackDamage,
            triliumEnchantability,
            Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ItemInit.INGOT_TRILIUM.get()));

    public static final Tier QUADRILIUM = new ForgeTier(quadriliumMiningLevel,
            quadriliumDurability,
            (float) quadriliumEfficiency,
            (float) quadriliumAttackDamage,
            quadriliumEnchantability,
            Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ItemInit.INGOT_QUADRILIUM.get()));



    public static void register()
    {
        TierSortingRegistry.registerTier(OBSIDIAN, new ResourceLocation(PowderPower.modid, "obsidian"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));
        TierSortingRegistry.registerTier(PRISMARINE, new ResourceLocation(PowderPower.modid, "prismarine"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));
        TierSortingRegistry.registerTier(REDIUM, new ResourceLocation(PowderPower.modid, "redium"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));
        TierSortingRegistry.registerTier(LAPIUM, new ResourceLocation(PowderPower.modid, "lapium"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));
        TierSortingRegistry.registerTier(GEMIUM, new ResourceLocation(PowderPower.modid, "gemium"), List.of(Tiers.NETHERITE), List.of());
        TierSortingRegistry.registerTier(TRILIUM, new ResourceLocation(PowderPower.modid, "trilium"), List.of(Tiers.NETHERITE), List.of());
        TierSortingRegistry.registerTier(QUADRILIUM, new ResourceLocation(PowderPower.modid, "quadrilium"), List.of(Tiers.NETHERITE), List.of());
    }
}
