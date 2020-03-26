package com.kwpugh.powder_power.init;

import com.kwpugh.powder_power.PowderPower;
import com.kwpugh.powder_power.items.HammerAlchemist;
import com.kwpugh.powder_power.items.MotarPestle;
import com.kwpugh.powder_power.items.WandAlchemist;
import com.kwpugh.powder_power.items.armor.ArmorGemium;
import com.kwpugh.powder_power.items.armor.ArmorLapium;
import com.kwpugh.powder_power.items.armor.ArmorRedium;
import com.kwpugh.powder_power.items.armor.ArmorTrilium;
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
import com.kwpugh.powder_power.items.tokens.TokenAbsorption;
import com.kwpugh.powder_power.items.tokens.TokenAffliction;
import com.kwpugh.powder_power.items.tokens.TokenBreathing;
import com.kwpugh.powder_power.items.tokens.TokenConduitPower;
import com.kwpugh.powder_power.items.tokens.TokenCuring;
import com.kwpugh.powder_power.items.tokens.TokenDolphin;
import com.kwpugh.powder_power.items.tokens.TokenDragon;
import com.kwpugh.powder_power.items.tokens.TokenFireResistance;
import com.kwpugh.powder_power.items.tokens.TokenGoodOmen;
import com.kwpugh.powder_power.items.tokens.TokenHaste;
import com.kwpugh.powder_power.items.tokens.TokenHealing;
import com.kwpugh.powder_power.items.tokens.TokenHealth;
import com.kwpugh.powder_power.items.tokens.TokenJumpBoost;
import com.kwpugh.powder_power.items.tokens.TokenNightVision;
import com.kwpugh.powder_power.items.tokens.TokenNoFall;
import com.kwpugh.powder_power.items.tokens.TokenResistance;
import com.kwpugh.powder_power.items.tokens.TokenSpeed;
import com.kwpugh.powder_power.items.tokens.TokenStrength;
import com.kwpugh.powder_power.items.tokens.TokenSunshine;
import com.kwpugh.powder_power.items.tokens.TokenTrash;
import com.kwpugh.powder_power.items.toolsclasses.BowBase;
import com.kwpugh.powder_power.items.toolsclasses.SwordRedium;
import com.kwpugh.powder_power.items.toolsclasses.TreeAxeCustom;
import com.kwpugh.powder_power.lists.ArmorMaterialList;
import com.kwpugh.powder_power.lists.ToolMaterialList;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit
{
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, PowderPower.modid);
	
	public static final RegistryObject<Item> HAMMER_ALCHEMIST = ITEMS.register("hammer_alchemist", () -> new HammerAlchemist(new Item.Properties().maxDamage(128).group(PowderPower.powder_power)));
	public static final RegistryObject<Item> MOTAR_PESTLE = ITEMS.register("motar_pestle", () -> new MotarPestle(new Item.Properties().maxDamage(256).group(PowderPower.powder_power)));
	public static final RegistryObject<Item> WAND_CORE = ITEMS.register("wand_core", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> WAND_ALCHEMIST = ITEMS.register("wand_alchemist", () -> new WandAlchemist(new Item.Properties().maxDamage(128).group(PowderPower.powder_power)));
	
	public static final RegistryObject<Item> PICKAXE_OBSIDIAN = ITEMS.register("pickaxe_obsidian", () -> new PickaxeItem(ToolMaterialList.OBSIDIAN, 3, -3.0f, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> PICKAXE_PRISMARINE = ITEMS.register("pickaxe_prismarine", () -> new PickaxeItem(ToolMaterialList.PRISMARINE, 3, -3.0f, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> DAGGER_PRISMARINE = ITEMS.register("dagger_prismarine", () -> new SwordItem(ToolMaterialList.PRISMARINE, 4, -2.5f, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> HATCHET_OBSIDIAN = ITEMS.register("hatchet_obsidian", () -> new AxeItem(ToolMaterialList.OBSIDIAN, 6, -2.1f, new Item.Properties().group(PowderPower.powder_power)));
	
	public static final RegistryObject<Item> INGOT_OBSIDIAN = ITEMS.register("ingot_obsidian", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> INGOT_PRISMARINE = ITEMS.register("ingot_prismarine", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> INGOT_REDIUM = ITEMS.register("ingot_redium", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> INGOT_LAPIUM = ITEMS.register("ingot_lapium", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> GEM_GEMIUM = ITEMS.register("gem_gemium", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> INGOT_TRILIUM = ITEMS.register("ingot_trilium", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));
	
	public static final RegistryObject<Item> POWDER_REDSTONE = ITEMS.register("powder_redstone", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> POWDER_LAPIS = ITEMS.register("powder_lapis", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));	
	public static final RegistryObject<Item> POWDER_IRON = ITEMS.register("powder_iron", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> POWDER_GOLD = ITEMS.register("powder_gold", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> POWDER_END_PEARL = ITEMS.register("powder_end_pearl", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> POWDER_DIAMOND = ITEMS.register("powder_diamond", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> POWDER_EMERALD = ITEMS.register("powder_emerald", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> POWDER_PRISMARINE = ITEMS.register("powder_prismarine", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> POWDER_OBSIDIAN = ITEMS.register("powder_obsidian", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> POWDER_NETHER_QUARTZ = ITEMS.register("powder_nether_quartz", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> POWDER_GHAST_TEAR = ITEMS.register("powder_ghast_tear", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));	
	public static final RegistryObject<Item> POWDER_PURPUR = ITEMS.register("powder_purpur", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> POWDER_WOOD = ITEMS.register("powder_wood", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));
	
	public static final RegistryObject<Item> BLEND_REDIUM = ITEMS.register("blend_redium", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));	
	public static final RegistryObject<Item> BLEND_LAPIUM = ITEMS.register("blend_lapium", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> BLEND_GEMIUM = ITEMS.register("blend_gemium", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> BLEND_TRILIUM = ITEMS.register("blend_trilium", () -> new Item(new Item.Properties().group(PowderPower.powder_power)));
	
	public static final RegistryObject<Item> BLOCK_REDIUM = ITEMS.register("block_redium", () -> new BlockItem(BlockInit.BLOCK_REDIUM.get(), new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> BLOCK_LAPIUM = ITEMS.register("block_lapium", () -> new BlockItem(BlockInit.BLOCK_LAPIUM.get(), new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> BLOCK_GEMIUM = ITEMS.register("block_gemium", () -> new BlockItem(BlockInit.BLOCK_GEMIUM.get(), new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> BLOCK_TRILIUM = ITEMS.register("block_trilium", () -> new BlockItem(BlockInit.BLOCK_TRILIUM.get(), new Item.Properties().group(PowderPower.powder_power)));
	
	public static final RegistryObject<Item> SWORD_REDIUM = ITEMS.register("sword_redium", () -> new SwordRedium(ToolMaterialList.REDIUM,  6, -2.3f, new Item.Properties().group(PowderPower.powder_power)));	
	public static final RegistryObject<Item> BOW_REDIUM = ITEMS.register("bow_redium", () -> new BowBase(new Item.Properties().maxStackSize(1).maxDamage(2000).group(PowderPower.powder_power)));
	public static final RegistryObject<Item> PICKAXE_REDIUM = ITEMS.register("pickaxe_redium", () -> new PickaxeItem(ToolMaterialList.REDIUM, 3, -2.7f, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> AXE_REDIUM = ITEMS.register("axe_redium", () -> new AxeItem(ToolMaterialList.REDIUM, 7, -3.0f, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> SHOVEL_REDIUM = ITEMS.register("shovel_redium", () -> new ShovelItem(ToolMaterialList.REDIUM, 4, -3.0f, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> HOE_REDIUM = ITEMS.register("hoe_redium", () -> new HoeItem(ToolMaterialList.REDIUM,  1.0f, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> PAXEL_REDIUM = ITEMS.register("paxel_redium", () -> new PaxelRedium(7, -3.0f, ToolMaterialList.REDIUM, null, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> HAMMER_REDIUM = ITEMS.register("hammer_redium", () -> new HammerRedium(ToolMaterialList.REDIUM, 7, -3.0f, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> EXCAVATOR_REDIUM = ITEMS.register("excavator_redium", () -> new ExcavatorRedium(ToolMaterialList.REDIUM, 4, -3.0f, new Item.Properties().group(PowderPower.powder_power)));

	public static final RegistryObject<Item> SWORD_LAPIUM = ITEMS.register("sword_lapium", () -> new SwordItem(ToolMaterialList.LAPIUM, 6, -2.3f, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> BOW_LAPIUM = ITEMS.register("bow_lapium", () -> new BowBase(new Item.Properties().maxStackSize(1).maxDamage(2000).group(PowderPower.powder_power)));
	public static final RegistryObject<Item> PICKAXE_LAPIUM = ITEMS.register("pickaxe_lapium", () -> new PickaxeItem(ToolMaterialList.LAPIUM, 3, -2.7f, new Item.Properties().group(PowderPower.powder_power)));	
	public static final RegistryObject<Item> AXE_LAPIUM = ITEMS.register("axe_lapium", () -> new AxeItem(ToolMaterialList.LAPIUM, 7, -3.0f, new Item.Properties().group(PowderPower.powder_power)));	
	public static final RegistryObject<Item> SHOVEL_LAPIUM = ITEMS.register("shovel_lapium", () -> new ShovelItem(ToolMaterialList.LAPIUM, 4, -3.0f, new Item.Properties().group(PowderPower.powder_power)));	
	public static final RegistryObject<Item> HOE_LAPIUM = ITEMS.register("hoe_lapium", () -> new HoeItem(ToolMaterialList.LAPIUM, 1.0f, new Item.Properties().group(PowderPower.powder_power)));	
	public static final RegistryObject<Item> PAXEL_LAPIUM = ITEMS.register("paxel_lapium", () -> new PaxelLapium(7, -3.0f, ToolMaterialList.LAPIUM, null, new Item.Properties().group(PowderPower.powder_power)));	
	public static final RegistryObject<Item> HAMMER_LAPIUM = ITEMS.register("hammer_lapium", () -> new HammerLapium(ToolMaterialList.LAPIUM, 7, -3.0f, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> EXCAVATOR_LAPIUM = ITEMS.register("excavator_lapium", () -> new ExcavatorLapium(ToolMaterialList.LAPIUM, 4, -3.0f, new Item.Properties().group(PowderPower.powder_power)));

	public static final RegistryObject<Item> SWORD_GEMIUM = ITEMS.register("sword_gemium", () -> new SwordItem(ToolMaterialList.GEMIUM, 7, -2.2f, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> BOW_GEMIUM = ITEMS.register("bow_gemium", () -> new BowBase(new Item.Properties().maxStackSize(1).maxDamage(4000).group(PowderPower.powder_power)));
	public static final RegistryObject<Item> PICKAXE_GEMIUM = ITEMS.register("pickaxe_gemium", () -> new PickaxeItem(ToolMaterialList.GEMIUM, 3, -2.6f, new Item.Properties().group(PowderPower.powder_power)));	
	public static final RegistryObject<Item> AXE_GEMIUM = ITEMS.register("axe_gemium", () -> new AxeItem(ToolMaterialList.GEMIUM, 7, -2.7f, new Item.Properties().group(PowderPower.powder_power)));	
	public static final RegistryObject<Item> SHOVEL_GEMIUM = ITEMS.register("shovel_gemium", () -> new ShovelItem(ToolMaterialList.GEMIUM, 4, -3.0f, new Item.Properties().group(PowderPower.powder_power)));	
	public static final RegistryObject<Item> HOE_GEMIUM = ITEMS.register("hoe_gemium", () -> new HoeItem(ToolMaterialList.GEMIUM, 1.5f, new Item.Properties().group(PowderPower.powder_power)));	
	public static final RegistryObject<Item> PAXEL_GEMIUM = ITEMS.register("paxel_gemium", () -> new PaxelGemium(7, -2.7f, ToolMaterialList.GEMIUM, null, new Item.Properties().group(PowderPower.powder_power)));	
	public static final RegistryObject<Item> HAMMER_GEMIUM = ITEMS.register("hammer_gemium", () -> new HammerGemium(ToolMaterialList.GEMIUM, 7, -2.7f, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> EXCAVATOR_GEMIUM = ITEMS.register("excavator_gemium", () -> new ExcavatorGemium(ToolMaterialList.GEMIUM, 5, -2.7f, new Item.Properties().group(PowderPower.powder_power)));
	
	public static final RegistryObject<Item> SWORD_TRILIUM = ITEMS.register("sword_trilium", () -> new SwordItem(ToolMaterialList.TRILIUM, 7, -2.2f, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> BOW_TRILIUM = ITEMS.register("bow_trilium", () -> new BowBase(new Item.Properties().maxStackSize(1).maxDamage(4000).group(PowderPower.powder_power)));
	public static final RegistryObject<Item> PICKAXE_TRILIUM = ITEMS.register("pickaxe_trilium", () -> new PickaxeItem(ToolMaterialList.TRILIUM, 3, -2.6f, new Item.Properties().group(PowderPower.powder_power)));	
	public static final RegistryObject<Item> AXE_TRILIUM = ITEMS.register("axe_trilium", () -> new AxeItem(ToolMaterialList.TRILIUM, 7, -2.7f, new Item.Properties().group(PowderPower.powder_power)));	
	public static final RegistryObject<Item> TREE_AXE_TRILIUM = ITEMS.register("tree_axe_trilium", () -> new TreeAxeCustom(ToolMaterialList.TRILIUM, 7, -2.7f, new Item.Properties().group(PowderPower.powder_power)));	
	public static final RegistryObject<Item> SHOVEL_TRILIUM = ITEMS.register("shovel_trilium", () -> new ShovelItem(ToolMaterialList.TRILIUM, 4, -3.0f, new Item.Properties().group(PowderPower.powder_power)));	
	public static final RegistryObject<Item> HOE_TRILIUM = ITEMS.register("hoe_trilium", () -> new HoeItem(ToolMaterialList.TRILIUM, 1.5f, new Item.Properties().group(PowderPower.powder_power)));	
	public static final RegistryObject<Item> PAXEL_TRILIUM = ITEMS.register("paxel_trilium", () -> new PaxelTrilium(7, -2.7f, ToolMaterialList.TRILIUM, null, new Item.Properties().group(PowderPower.powder_power)));	
	public static final RegistryObject<Item> HAMMER_TRILIUM = ITEMS.register("hammer_trilium", () -> new HammerTrilium(ToolMaterialList.TRILIUM, 7, -2.7f, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> EXCAVATOR_TRILIUM = ITEMS.register("excavator_trilium", () -> new ExcavatorTrilium(ToolMaterialList.TRILIUM, 5, -2.7f, new Item.Properties().group(PowderPower.powder_power)));	

	public static final RegistryObject<Item> ARMOR_REDIUM_HEAD = ITEMS.register("armor_redium_head", () -> new ArmorRedium(ArmorMaterialList.REDIUM, EquipmentSlotType.HEAD, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_REDIUM_BODY = ITEMS.register("armor_redium_body", () -> new ArmorRedium(ArmorMaterialList.REDIUM, EquipmentSlotType.CHEST, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_REDIUM_LEGGINGS = ITEMS.register("armor_redium_leggings", () -> new ArmorRedium(ArmorMaterialList.REDIUM, EquipmentSlotType.LEGS, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_REDIUM_BOOTS = ITEMS.register("armor_redium_boots", () -> new ArmorRedium(ArmorMaterialList.REDIUM, EquipmentSlotType.FEET, new Item.Properties().group(PowderPower.powder_power)));

	public static final RegistryObject<Item> ARMOR_LAPIUM_HEAD = ITEMS.register("armor_lapium_head", () -> new ArmorLapium(ArmorMaterialList.LAPIUM, EquipmentSlotType.HEAD, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_LAPIUM_BODY = ITEMS.register("armor_lapium_body", () -> new ArmorLapium(ArmorMaterialList.LAPIUM, EquipmentSlotType.CHEST, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_LAPIUM_LEGGINGS = ITEMS.register("armor_lapium_leggings", () -> new ArmorLapium(ArmorMaterialList.LAPIUM, EquipmentSlotType.LEGS, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_LAPIUM_BOOTS = ITEMS.register("armor_lapium_boots", () -> new ArmorLapium(ArmorMaterialList.LAPIUM, EquipmentSlotType.FEET, new Item.Properties().group(PowderPower.powder_power)));

	public static final RegistryObject<Item> ARMOR_GEMIUM_HEAD = ITEMS.register("armor_gemium_head", () -> new ArmorGemium(ArmorMaterialList.GEMIUM, EquipmentSlotType.HEAD, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_GEMIUM_BODY = ITEMS.register("armor_gemium_body", () -> new ArmorGemium(ArmorMaterialList.GEMIUM, EquipmentSlotType.CHEST, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_GEMIUM_LEGGINGS = ITEMS.register("armor_gemium_leggings", () -> new ArmorGemium(ArmorMaterialList.GEMIUM, EquipmentSlotType.LEGS, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_GEMIUM_BOOTS = ITEMS.register("armor_gemium_boots", () -> new ArmorGemium(ArmorMaterialList.GEMIUM, EquipmentSlotType.FEET, new Item.Properties().group(PowderPower.powder_power)));

	public static final RegistryObject<Item> ARMOR_TRILIUM_HEAD = ITEMS.register("armor_trilium_head", () -> new ArmorTrilium(ArmorMaterialList.TRILIUM, EquipmentSlotType.HEAD, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_TRILUM_BODY = ITEMS.register("armor_trilium_body", () -> new ArmorTrilium(ArmorMaterialList.TRILIUM, EquipmentSlotType.CHEST, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_TRILIUM_LEGGINGS = ITEMS.register("armor_trilium_leggings", () -> new ArmorTrilium(ArmorMaterialList.TRILIUM, EquipmentSlotType.LEGS, new Item.Properties().group(PowderPower.powder_power)));
	public static final RegistryObject<Item> ARMOR_TRILIUM_BOOTS = ITEMS.register("armor_trilium_boots", () -> new ArmorTrilium(ArmorMaterialList.TRILIUM, EquipmentSlotType.FEET, new Item.Properties().group(PowderPower.powder_power)));

	
	public static final RegistryObject<Item> TOKEN_NIGHT_VISION = ITEMS.register("token_night_vision", () -> new TokenNightVision(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_FIRE_RESISTANCE = ITEMS.register("token_fire_resistance", () -> new TokenFireResistance(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_SPEED = ITEMS.register("token_speed", () -> new TokenSpeed(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_NO_FALL = ITEMS.register("token_no_fall", () -> new TokenNoFall(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_HEALING = ITEMS.register("token_healing", () -> new TokenHealing(new Item.Properties().maxDamage(1).group(PowderPower.powder_power)));
	
	public static final RegistryObject<Item> TOKEN_TRASH = ITEMS.register("token_trash", () -> new TokenTrash(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_JUMP_BOOST = ITEMS.register("token_jump_boost", () -> new TokenJumpBoost(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_HASTE = ITEMS.register("token_haste", () -> new TokenHaste(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_BREATHING = ITEMS.register("token_breathing", () -> new TokenBreathing(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_GOOD_OMEN = ITEMS.register("token_good_omen", () -> new TokenGoodOmen(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)));
	
	public static final RegistryObject<Item> TOKEN_SUNSHINE = ITEMS.register("token_sunshine", () -> new TokenSunshine(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_RESISTANCE = ITEMS.register("token_resistance", () -> new TokenResistance(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_DOLPHIN = ITEMS.register("token_dolphin", () -> new TokenDolphin(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_CONDUIT_POWER = ITEMS.register("token_conduit_power", () -> new TokenConduitPower(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_STRENGTH = ITEMS.register("token_strength", () -> new TokenStrength(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)));

	public static final RegistryObject<Item> TOKEN_AFFLICTION = ITEMS.register("token_affliction", () -> new TokenAffliction(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_HEALTH = ITEMS.register("token_health", () -> new TokenHealth(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_CURING = ITEMS.register("token_curing", () -> new TokenCuring(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_ABSORPTION = ITEMS.register("token_absorption", () -> new TokenAbsorption(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)));
	public static final RegistryObject<Item> TOKEN_DRAGON = ITEMS.register("token_dragon", () -> new TokenDragon(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)));
}
