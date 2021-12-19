package com.kwpugh.powder_power.init;

import com.kwpugh.powder_power.PowderPower;
import com.kwpugh.powder_power.config.ConfigPowderPower;
import com.kwpugh.powder_power.items.armor.*;
import com.kwpugh.powder_power.items.crafting.HammerAlchemist;
import com.kwpugh.powder_power.items.crafting.MotarPestle;
import com.kwpugh.powder_power.items.crafting.WandAlchemist;
import com.kwpugh.powder_power.items.excavator.ExcavatorGemium;
import com.kwpugh.powder_power.items.excavator.ExcavatorLapium;
import com.kwpugh.powder_power.items.excavator.ExcavatorRedium;
import com.kwpugh.powder_power.items.excavator.ExcavatorTrilium;
import com.kwpugh.powder_power.items.hammers.HammerGemium;
import com.kwpugh.powder_power.items.hammers.HammerLapium;
import com.kwpugh.powder_power.items.hammers.HammerRedium;
import com.kwpugh.powder_power.items.hammers.HammerTrilium;
import com.kwpugh.powder_power.items.paxels.PaxelGemium;
import com.kwpugh.powder_power.items.paxels.PaxelLapium;
import com.kwpugh.powder_power.items.paxels.PaxelRedium;
import com.kwpugh.powder_power.items.paxels.PaxelTrilium;
import com.kwpugh.powder_power.items.tokens.*;
import com.kwpugh.powder_power.items.toolbaseclasses.BowBase;
import com.kwpugh.powder_power.items.toolbaseclasses.SwordRedium;
import com.kwpugh.powder_power.items.toolbaseclasses.TreeAxeBase;
import com.kwpugh.powder_power.lists.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit
{
	// Used for bows only
	public static final int rediumDurability = ConfigPowderPower.REDIUM_TOOL_DURABILITY.get();
	public static final int lapiumDurability = ConfigPowderPower.LAPIUM_TOOL_DURABILITY.get();
	public static final int gemiumDurability = ConfigPowderPower.GEMIUM_TOOL_DURABILITY.get();
	public static final int triliumDurability = ConfigPowderPower.TRILIUM_TOOL_DURABILITY.get();
	public static final int quadriliumDurability = ConfigPowderPower.QUADRILIUM_TOOL_DURABILITY.get();

	// Armor stats can be adjusted in config
	public static final ArmorMaterial REDIUM_ARMOR_MATERIAL = new RediumArmorMaterial();
	public static final ArmorMaterial LAPIUM_ARMOR_MATERIAL = new LapiumArmorMaterial();
	public static final ArmorMaterial GEMIUM_ARMOR_MATERIAL = new GemiumArmorMaterial();
	public static final ArmorMaterial TRILIUM_ARMOR_MATERIAL = new TriliumArmorMaterial();
	public static final ArmorMaterial QUADRILIUM_ARMOR_MATERIAL = new QuadriliumArmorMaterial();


	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PowderPower.modid);

	public static final RegistryObject<Item> HAMMER_ALCHEMIST = ITEMS.register("hammer_alchemist", () -> new HammerAlchemist(new Item.Properties().durability(1562).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> MOTAR_PESTLE = ITEMS.register("motar_pestle", () -> new MotarPestle(new Item.Properties().durability(256).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> WAND_CORE = ITEMS.register("wand_core", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> WAND_ALCHEMIST = ITEMS.register("wand_alchemist", () -> new WandAlchemist(new Item.Properties().durability(2200).tab(PowderPower.powder_power)));

	public static final RegistryObject<Item> PICKAXE_OBSIDIAN = ITEMS.register("pickaxe_obsidian", () -> new PickaxeItem(ToolMaterialTiers.OBSIDIAN, 3, -3.0f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> PICKAXE_PRISMARINE = ITEMS.register("pickaxe_prismarine", () -> new PickaxeItem(ToolMaterialTiers.PRISMARINE, 3, -3.0f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> DAGGER_PRISMARINE = ITEMS.register("dagger_prismarine", () -> new SwordItem(ToolMaterialTiers.PRISMARINE, 4, -3.0f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> HATCHET_OBSIDIAN = ITEMS.register("hatchet_obsidian", () -> new AxeItem(ToolMaterialTiers.OBSIDIAN, 6, -3.0f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> SHOVEL_OBSIDIAN = ITEMS.register("shovel_obsidian", () -> new ShovelItem(ToolMaterialTiers.OBSIDIAN, 2, -3.0f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> SHOVEL_PRISMARINE = ITEMS.register("shovel_prismarine", () -> new ShovelItem(ToolMaterialTiers.PRISMARINE, 2, -3.0f, new Item.Properties().tab(PowderPower.powder_power)));

	public static final RegistryObject<Item> INGOT_OBSIDIAN = ITEMS.register("ingot_obsidian", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> INGOT_PRISMARINE = ITEMS.register("ingot_prismarine", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> INGOT_REDIUM = ITEMS.register("ingot_redium", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> INGOT_LAPIUM = ITEMS.register("ingot_lapium", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> GEM_GEMIUM = ITEMS.register("gem_gemium", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> INGOT_TRILIUM = ITEMS.register("ingot_trilium", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> INGOT_QUADRILIUM = ITEMS.register("ingot_quadrilium", () -> new Item(new Item.Properties().fireResistant().tab(PowderPower.powder_power)));

	public static final RegistryObject<Item> POWDER_REDSTONE = ITEMS.register("powder_redstone", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> POWDER_LAPIS = ITEMS.register("powder_lapis", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> POWDER_COPPER = ITEMS.register("powder_copper", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> POWDER_IRON = ITEMS.register("powder_iron", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> POWDER_GOLD = ITEMS.register("powder_gold", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> POWDER_END_PEARL = ITEMS.register("powder_end_pearl", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> POWDER_DIAMOND = ITEMS.register("powder_diamond", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> POWDER_EMERALD = ITEMS.register("powder_emerald", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> POWDER_PRISMARINE = ITEMS.register("powder_prismarine", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> POWDER_OBSIDIAN = ITEMS.register("powder_obsidian", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> POWDER_NETHER_QUARTZ = ITEMS.register("powder_nether_quartz", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> POWDER_GHAST_TEAR = ITEMS.register("powder_ghast_tear", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> POWDER_PURPUR = ITEMS.register("powder_purpur", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> POWDER_WOOD = ITEMS.register("powder_wood", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));

	public static final RegistryObject<Item> BLEND_REDIUM = ITEMS.register("blend_redium", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> BLEND_LAPIUM = ITEMS.register("blend_lapium", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> BLEND_GEMIUM = ITEMS.register("blend_gemium", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> BLEND_TRILIUM = ITEMS.register("blend_trilium", () -> new Item(new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> BLEND_QUADRILIUM = ITEMS.register("blend_quadrilium", () -> new Item(new Item.Properties().fireResistant().tab(PowderPower.powder_power)));

	public static final RegistryObject<Item> BLOCK_REDIUM = ITEMS.register("block_redium", () -> new BlockItem(BlockInit.BLOCK_REDIUM.get(), new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> BLOCK_LAPIUM = ITEMS.register("block_lapium", () -> new BlockItem(BlockInit.BLOCK_LAPIUM.get(), new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> BLOCK_GEMIUM = ITEMS.register("block_gemium", () -> new BlockItem(BlockInit.BLOCK_GEMIUM.get(), new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> BLOCK_TRILIUM = ITEMS.register("block_trilium", () -> new BlockItem(BlockInit.BLOCK_TRILIUM.get(), new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> BLOCK_QUADRILIUM = ITEMS.register("block_quadrilium", () -> new BlockItem(BlockInit.BLOCK_QUADRILIUM.get(), new Item.Properties().tab(PowderPower.powder_power)));

	public static final RegistryObject<Item> SWORD_REDIUM = ITEMS.register("sword_redium", () -> new SwordRedium(ToolMaterialTiers.REDIUM,  6, -2.3f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> BOW_REDIUM = ITEMS.register("bow_redium", () -> new BowBase(new Item.Properties().stacksTo(1).durability(rediumDurability).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> PICKAXE_REDIUM = ITEMS.register("pickaxe_redium", () -> new PickaxeItem(ToolMaterialTiers.REDIUM, 4, -2.7f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> AXE_REDIUM = ITEMS.register("axe_redium", () -> new AxeItem(ToolMaterialTiers.REDIUM, 7, -3.0f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> SHOVEL_REDIUM = ITEMS.register("shovel_redium", () -> new ShovelItem(ToolMaterialTiers.REDIUM, 4, -3.0f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> HOE_REDIUM = ITEMS.register("hoe_redium", () -> new HoeItem(ToolMaterialTiers.REDIUM,  -1, 0.0f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> PAXEL_REDIUM = ITEMS.register("paxel_redium", () -> new PaxelRedium(7, -3.0f, ToolMaterialTiers.REDIUM, null, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> HAMMER_REDIUM = ITEMS.register("hammer_redium", () -> new HammerRedium(ToolMaterialTiers.REDIUM, 7, -3.0f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> EXCAVATOR_REDIUM = ITEMS.register("excavator_redium", () -> new ExcavatorRedium(ToolMaterialTiers.REDIUM, 4, -3.0f, new Item.Properties().tab(PowderPower.powder_power)));

	public static final RegistryObject<Item> SWORD_LAPIUM = ITEMS.register("sword_lapium", () -> new SwordItem(ToolMaterialTiers.LAPIUM, 6, -2.3f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> BOW_LAPIUM = ITEMS.register("bow_lapium", () -> new BowBase(new Item.Properties().stacksTo(1).durability(lapiumDurability).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> PICKAXE_LAPIUM = ITEMS.register("pickaxe_lapium", () -> new PickaxeItem(ToolMaterialTiers.LAPIUM, 4, -2.7f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> AXE_LAPIUM = ITEMS.register("axe_lapium", () -> new AxeItem(ToolMaterialTiers.LAPIUM, 7, -3.0f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> SHOVEL_LAPIUM = ITEMS.register("shovel_lapium", () -> new ShovelItem(ToolMaterialTiers.LAPIUM, 4, -3.0f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> HOE_LAPIUM = ITEMS.register("hoe_lapium", () -> new HoeItem(ToolMaterialTiers.LAPIUM, -1, 0.0f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> PAXEL_LAPIUM = ITEMS.register("paxel_lapium", () -> new PaxelLapium(7, -3.0f, ToolMaterialTiers.LAPIUM, null, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> HAMMER_LAPIUM = ITEMS.register("hammer_lapium", () -> new HammerLapium(ToolMaterialTiers.LAPIUM, 7, -3.0f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> EXCAVATOR_LAPIUM = ITEMS.register("excavator_lapium", () -> new ExcavatorLapium(ToolMaterialTiers.LAPIUM, 4, -3.0f, new Item.Properties().tab(PowderPower.powder_power)));

	public static final RegistryObject<Item> SWORD_GEMIUM = ITEMS.register("sword_gemium", () -> new SwordItem(ToolMaterialTiers.GEMIUM, 7, -2.2f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> BOW_GEMIUM = ITEMS.register("bow_gemium", () -> new BowBase(new Item.Properties().stacksTo(1).durability(gemiumDurability).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> PICKAXE_GEMIUM = ITEMS.register("pickaxe_gemium", () -> new PickaxeItem(ToolMaterialTiers.GEMIUM, 5, -2.6f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> AXE_GEMIUM = ITEMS.register("axe_gemium", () -> new AxeItem(ToolMaterialTiers.GEMIUM, 8, -2.7f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> SHOVEL_GEMIUM = ITEMS.register("shovel_gemium", () -> new ShovelItem(ToolMaterialTiers.GEMIUM, 5, -2.7f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> HOE_GEMIUM = ITEMS.register("hoe_gemium", () -> new HoeItem(ToolMaterialTiers.GEMIUM, -1, 0.5f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> PAXEL_GEMIUM = ITEMS.register("paxel_gemium", () -> new PaxelGemium(8, -2.7f, ToolMaterialTiers.GEMIUM, null, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> HAMMER_GEMIUM = ITEMS.register("hammer_gemium", () -> new HammerGemium(ToolMaterialTiers.GEMIUM, 7, -2.7f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> EXCAVATOR_GEMIUM = ITEMS.register("excavator_gemium", () -> new ExcavatorGemium(ToolMaterialTiers.GEMIUM, 5, -2.7f, new Item.Properties().tab(PowderPower.powder_power)));

	public static final RegistryObject<Item> SWORD_TRILIUM = ITEMS.register("sword_trilium", () -> new SwordItem(ToolMaterialTiers.TRILIUM, 8, -2.2f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> BOW_TRILIUM = ITEMS.register("bow_trilium", () -> new BowBase(new Item.Properties().stacksTo(1).durability(triliumDurability).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> PICKAXE_TRILIUM = ITEMS.register("pickaxe_trilium", () -> new PickaxeItem(ToolMaterialTiers.TRILIUM, 6, -2.5f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> AXE_TRILIUM = ITEMS.register("axe_trilium", () -> new AxeItem(ToolMaterialTiers.TRILIUM, 9, -2.6f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TREE_AXE_TRILIUM = ITEMS.register("tree_axe_trilium", () -> new TreeAxeBase(ToolMaterialTiers.TRILIUM, 9, -2.6f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> SHOVEL_TRILIUM = ITEMS.register("shovel_trilium", () -> new ShovelItem(ToolMaterialTiers.TRILIUM, 6, -2.6f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> HOE_TRILIUM = ITEMS.register("hoe_trilium", () -> new HoeItem(ToolMaterialTiers.TRILIUM, -1, 1.0f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> PAXEL_TRILIUM = ITEMS.register("paxel_trilium", () -> new PaxelTrilium(9, -2.6f, ToolMaterialTiers.TRILIUM, null, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> HAMMER_TRILIUM = ITEMS.register("hammer_trilium", () -> new HammerTrilium(ToolMaterialTiers.TRILIUM, 6, -2.6f, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> EXCAVATOR_TRILIUM = ITEMS.register("excavator_trilium", () -> new ExcavatorTrilium(ToolMaterialTiers.TRILIUM, 6, -2.6f, new Item.Properties().tab(PowderPower.powder_power)));

	public static final RegistryObject<Item> SWORD_QUADRILIUM = ITEMS.register("sword_quadrilium", () -> new SwordItem(ToolMaterialTiers.QUADRILIUM, 10, -2.1f, new Item.Properties().fireResistant().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> BOW_QUADRILIUM = ITEMS.register("bow_quadrilium", () -> new BowBase(new Item.Properties().stacksTo(1).durability(quadriliumDurability).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> PICKAXE_QUADRILIUM = ITEMS.register("pickaxe_quadrilium", () -> new PickaxeItem(ToolMaterialTiers.QUADRILIUM, 6, -2.4f, new Item.Properties().fireResistant().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> AXE_QUADRILIUM = ITEMS.register("axe_quadrilium", () -> new AxeItem(ToolMaterialTiers.QUADRILIUM, 11, -2.5f, new Item.Properties().fireResistant().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TREE_AXE_QUADRILIUM = ITEMS.register("tree_axe_quadrilium", () -> new TreeAxeBase(ToolMaterialTiers.QUADRILIUM, 11, -2.5f, new Item.Properties().fireResistant().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> SHOVEL_QUADRILIUM = ITEMS.register("shovel_quadrilium", () -> new ShovelItem(ToolMaterialTiers.QUADRILIUM, 7, -2.5f, new Item.Properties().fireResistant().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> HOE_QUADRILIUM = ITEMS.register("hoe_quadrilium", () -> new HoeItem(ToolMaterialTiers.QUADRILIUM, -1, 2.0f, new Item.Properties().fireResistant().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> PAXEL_QUADRILIUM = ITEMS.register("paxel_quadrilium", () -> new PaxelTrilium(7, -2.3f, ToolMaterialTiers.QUADRILIUM, null, new Item.Properties().fireResistant().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> HAMMER_QUADRILIUM = ITEMS.register("hammer_quadrilium", () -> new HammerTrilium(ToolMaterialTiers.QUADRILIUM, 8, -2.5f, new Item.Properties().fireResistant().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> EXCAVATOR_QUADRILIUM = ITEMS.register("excavator_quadrilium", () -> new ExcavatorTrilium(ToolMaterialTiers.QUADRILIUM, 6, -2.5f, new Item.Properties().fireResistant().tab(PowderPower.powder_power)));
	
	
	public static final RegistryObject<Item> ARMOR_REDIUM_HEAD = ITEMS.register("armor_redium_head", () -> new ArmorRedium(REDIUM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_REDIUM_BODY = ITEMS.register("armor_redium_body", () -> new ArmorRedium(REDIUM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_REDIUM_LEGGINGS = ITEMS.register("armor_redium_leggings", () -> new ArmorRedium(REDIUM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_REDIUM_BOOTS = ITEMS.register("armor_redium_boots", () -> new ArmorRedium(REDIUM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Properties().tab(PowderPower.powder_power)));

	public static final RegistryObject<Item> ARMOR_LAPIUM_HEAD = ITEMS.register("armor_lapium_head", () -> new ArmorLapium(LAPIUM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_LAPIUM_BODY = ITEMS.register("armor_lapium_body", () -> new ArmorLapium(LAPIUM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_LAPIUM_LEGGINGS = ITEMS.register("armor_lapium_leggings", () -> new ArmorLapium(LAPIUM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_LAPIUM_BOOTS = ITEMS.register("armor_lapium_boots", () -> new ArmorLapium(LAPIUM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Properties().tab(PowderPower.powder_power)));

	public static final RegistryObject<Item> ARMOR_GEMIUM_HEAD = ITEMS.register("armor_gemium_head", () -> new ArmorGemium(GEMIUM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_GEMIUM_BODY = ITEMS.register("armor_gemium_body", () -> new ArmorGemium(GEMIUM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_GEMIUM_LEGGINGS = ITEMS.register("armor_gemium_leggings", () -> new ArmorGemium(GEMIUM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_GEMIUM_BOOTS = ITEMS.register("armor_gemium_boots", () -> new ArmorGemium(GEMIUM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Properties().tab(PowderPower.powder_power)));

	public static final RegistryObject<Item> ARMOR_TRILIUM_HEAD = ITEMS.register("armor_trilium_head", () -> new ArmorTrilium(TRILIUM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_TRILUM_BODY = ITEMS.register("armor_trilium_body", () -> new ArmorTrilium(TRILIUM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_TRILIUM_LEGGINGS = ITEMS.register("armor_trilium_leggings", () -> new ArmorTrilium(TRILIUM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Properties().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_TRILIUM_BOOTS = ITEMS.register("armor_trilium_boots", () -> new ArmorTrilium(TRILIUM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Properties().tab(PowderPower.powder_power)));

	public static final RegistryObject<Item> ARMOR_QUADRILIUM_HEAD = ITEMS.register("armor_quadrilium_head", () -> new ArmorQuadrilium(QUADRILIUM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Properties().fireResistant().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_QUADRILIUM_BODY = ITEMS.register("armor_quadrilium_body", () -> new ArmorQuadrilium(QUADRILIUM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Properties().fireResistant().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_QUADRILIUM_LEGGINGS = ITEMS.register("armor_quadrilium_leggings", () -> new ArmorQuadrilium(QUADRILIUM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Properties().fireResistant().tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_QUADRILIUM_BOOTS = ITEMS.register("armor_quadrilium_boots", () -> new ArmorQuadrilium(QUADRILIUM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Properties().fireResistant().tab(PowderPower.powder_power)));

	//Redium
	public static final RegistryObject<Item> TOKEN_NIGHT_VISION = ITEMS.register("token_night_vision", () -> new TokenNightVision(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_FIRE_RESISTANCE = ITEMS.register("token_fire_resistance", () -> new TokenFireResistance(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_SPEED = ITEMS.register("token_speed", () -> new TokenSpeed(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_NO_FALL = ITEMS.register("token_no_fall", () -> new TokenNoFall(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_HEALING = ITEMS.register("token_healing", () -> new TokenHealing(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	
	//Lapium
	public static final RegistryObject<Item> TOKEN_EXP = ITEMS.register("token_exp", () -> new TokenExp(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_TRASH = ITEMS.register("token_trash", () -> new TokenTrash(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_JUMP_BOOST = ITEMS.register("token_jump_boost", () -> new TokenJumpBoost(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_HASTE = ITEMS.register("token_haste", () -> new TokenHaste(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_BREATHING = ITEMS.register("token_breathing", () -> new TokenBreathing(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	
	//Gemium
	public static final RegistryObject<Item> TOKEN_GOOD_OMEN = ITEMS.register("token_good_omen", () -> new TokenGoodOmen(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_UNSEEN = ITEMS.register("token_unseen", () -> new TokenUnseen(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_GREATER_HEALING = ITEMS.register("token_greater_healing", () -> new TokenGreaterHealing(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_SUNSHINE = ITEMS.register("token_sunshine", () -> new TokenSunshine(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_DOLPHIN = ITEMS.register("token_dolphin", () -> new TokenDolphin(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	
	//Trilium
	public static final RegistryObject<Item> TOKEN_CONDUIT_POWER = ITEMS.register("token_conduit_power", () -> new TokenConduitPower(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_RESISTANCE = ITEMS.register("token_resistance", () -> new TokenResistance(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_STRENGTH = ITEMS.register("token_strength", () -> new TokenStrength(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_ABSORPTION = ITEMS.register("token_absorption", () -> new TokenAbsorption(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_AFFLICTION = ITEMS.register("token_affliction", () -> new TokenAffliction(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	
	//Quadrilium
	public static final RegistryObject<Item> TOKEN_GREATER_RESISTANCE = ITEMS.register("token_greater_resistance", () -> new TokenGreaterResistance(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_GREATER_STRENGTH = ITEMS.register("token_greater_strength", () -> new TokenGreaterStrength(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_HEALTH = ITEMS.register("token_health", () -> new TokenHealth(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_CURING = ITEMS.register("token_curing", () -> new TokenCuring(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_GREATER_ABSORPTION = ITEMS.register("token_greater_absorption", () -> new TokenGreaterAbsorption(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	
	//Supreme Level
	public static final RegistryObject<Item> TOKEN_SUPREME_RESISTANCE = ITEMS.register("token_supreme_resistance", () -> new TokenSupremeResistance(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_SUPREME_HEALTH = ITEMS.register("token_supreme_health", () -> new TokenSupremeHealth(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_SUPREME_STRENGTH = ITEMS.register("token_supreme_strength", () -> new TokenSupremeStrength(new Item.Properties().stacksTo(1).tab(PowderPower.powder_power)));
}
