package com.kwpugh.powder_power.init;

import com.kwpugh.powder_power.PowderPower;
import com.kwpugh.powder_power.items.HammerAlchemist;
import com.kwpugh.powder_power.items.MotarPestle;
import com.kwpugh.powder_power.items.WandAlchemist;
import com.kwpugh.powder_power.items.armor.ArmorGemium;
import com.kwpugh.powder_power.items.armor.ArmorLapium;
import com.kwpugh.powder_power.items.armor.ArmorRedium;
import com.kwpugh.powder_power.items.armor.ArmorTrilium;
import com.kwpugh.powder_power.items.paxels.PaxelGemium;
import com.kwpugh.powder_power.items.paxels.PaxelLapium;
import com.kwpugh.powder_power.items.paxels.PaxelRedium;
import com.kwpugh.powder_power.items.paxels.PaxelTrilium;
import com.kwpugh.powder_power.items.tokens.TokenAbsorption;
import com.kwpugh.powder_power.items.tokens.TokenBreathing;
import com.kwpugh.powder_power.items.tokens.TokenConduitPower;
import com.kwpugh.powder_power.items.tokens.TokenCuring;
import com.kwpugh.powder_power.items.tokens.TokenDolphin;
import com.kwpugh.powder_power.items.tokens.TokenFireResistance;
import com.kwpugh.powder_power.items.tokens.TokenHaste;
import com.kwpugh.powder_power.items.tokens.TokenHealth;
import com.kwpugh.powder_power.items.tokens.TokenJumpBoost;
import com.kwpugh.powder_power.items.tokens.TokenNightVision;
import com.kwpugh.powder_power.items.tokens.TokenNoFall;
import com.kwpugh.powder_power.items.tokens.TokenResistance;
import com.kwpugh.powder_power.items.tokens.TokenSpeed;
import com.kwpugh.powder_power.items.tokens.TokenStrength;
import com.kwpugh.powder_power.items.tools.BowCustom;
import com.kwpugh.powder_power.items.tools.SwordRedium;
import com.kwpugh.powder_power.lists.ArmorMaterialList;
import com.kwpugh.powder_power.lists.BlockList;
import com.kwpugh.powder_power.lists.ItemList;
import com.kwpugh.powder_power.lists.ToolMaterialList;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ItemInit
{
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents
	{
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event)
		{
			event.getRegistry().registerAll
			(				
				ItemList.hammer_alchemist = new HammerAlchemist(ToolMaterialList.redium, 1, -3, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("hammer_alchemist")),
				ItemList.motar_pestle = new MotarPestle(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)).setRegistryName(location("motar_pestle")),
				
				
				
				ItemList.wand_core = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("wand_core")),
				ItemList.wand_alchemist = new WandAlchemist(ToolMaterialList.redium, 1, -3, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("wand_alchemist")),
						
				ItemList.pickaxe_obsidian = new PickaxeItem(ToolMaterialList.redium, 1, -3.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("pickaxe_obsidian")),
				ItemList.pickaxe_prismarine = new PickaxeItem(ToolMaterialList.redium, 1, -3.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("pickaxe_prismarine")),
					
				
				
				ItemList.powder_wood = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("powder_wood")),
				ItemList.powder_stone = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("powder_stone")),
				ItemList.powder_iron = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("powder_iron")),	
				ItemList.powder_redstone = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("powder_redstone")),
				ItemList.powder_obsidian = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("powder_obsidian")),
				ItemList.powder_nether_quartz = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("powder_nether_quartz")),
				ItemList.powder_purpur = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("powder_purpur")),
				ItemList.blend_redium = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("blend_redium")),			
				ItemList.powder_end_pearl = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("powder_end_pearl")),
				ItemList.powder_gold = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("powder_gold")),
				ItemList.powder_lapis = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("powder_lapis")),
				ItemList.blend_lapium = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("blend_lapium")),
				ItemList.powder_diamond = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("powder_diamond")),
				ItemList.powder_emerald = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("powder_emerald")),
				ItemList.powder_prismarine = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("powder_prismarine")),
				ItemList.blend_gemium = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("blend_gemium")),	
				ItemList.blend_trilium = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("blend_trilium")),
				
				
				
				ItemList.ingot_obsidian = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("ingot_obsidian")),
				ItemList.ingot_prismarine = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("ingot_prismarine")),
				ItemList.ingot_redium = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("ingot_redium")),
				ItemList.ingot_lapium = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("ingot_lapium")),
				ItemList.gem_gemium = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("gem_gemium")),
				ItemList.ingot_trilium = new Item(new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("ingot_trilium")),
			
				ItemList.block_redium = new BlockItem(BlockList.block_redium, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(BlockList.block_redium.getRegistryName()),
				ItemList.block_lapium = new BlockItem(BlockList.block_lapium, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(BlockList.block_lapium.getRegistryName()),
				ItemList.block_gemium = new BlockItem(BlockList.block_gemium, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(BlockList.block_gemium.getRegistryName()),
				ItemList.block_trilium = new BlockItem(BlockList.block_trilium, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(BlockList.block_trilium.getRegistryName()),
						
				
				
				ItemList.armor_redium_head = new ArmorRedium(ArmorMaterialList.redium, EquipmentSlotType.HEAD, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_redium_head")),
				ItemList.armor_redium_body = new ArmorRedium(ArmorMaterialList.redium, EquipmentSlotType.CHEST, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_redium_body")),
				ItemList.armor_redium_leggings = new ArmorRedium(ArmorMaterialList.redium, EquipmentSlotType.LEGS, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_redium_leggings")),
				ItemList.armor_redium_boots = new ArmorRedium(ArmorMaterialList.redium, EquipmentSlotType.FEET, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_redium_boots")),
							
				ItemList.armor_lapium_head = new ArmorLapium(ArmorMaterialList.lapium, EquipmentSlotType.HEAD, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_lapium_head")),
				ItemList.armor_lapium_body = new ArmorLapium(ArmorMaterialList.lapium, EquipmentSlotType.CHEST, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_lapium_body")),
				ItemList.armor_lapium_leggings = new ArmorLapium(ArmorMaterialList.lapium, EquipmentSlotType.LEGS, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_lapium_leggings")),
				ItemList.armor_lapium_boots = new ArmorLapium(ArmorMaterialList.lapium, EquipmentSlotType.FEET, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_lapium_boots")),
				
				ItemList.armor_gemium_head = new ArmorGemium(ArmorMaterialList.gemium, EquipmentSlotType.HEAD, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_gemium_head")),
				ItemList.armor_gemium_body = new ArmorGemium(ArmorMaterialList.gemium, EquipmentSlotType.CHEST, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_gemium_body")),
				ItemList.armor_gemium_leggings = new ArmorGemium(ArmorMaterialList.gemium, EquipmentSlotType.LEGS, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_gemium_leggings")),
				ItemList.armor_gemium_boots = new ArmorGemium(ArmorMaterialList.gemium, EquipmentSlotType.FEET, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_gemium_boots")),
				
				ItemList.armor_trilium_head = new ArmorTrilium(ArmorMaterialList.trilium, EquipmentSlotType.HEAD, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_trilium_head")),
				ItemList.armor_trilium_body = new ArmorTrilium(ArmorMaterialList.trilium, EquipmentSlotType.CHEST, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_trilium_body")),
				ItemList.armor_trilium_leggings = new ArmorTrilium(ArmorMaterialList.trilium, EquipmentSlotType.LEGS, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_trilium_leggings")),
				ItemList.armor_trilium_boots = new ArmorTrilium(ArmorMaterialList.trilium, EquipmentSlotType.FEET, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("armor_trilium_boots")),
				
				
				
				ItemList.sword_redium = new SwordRedium(ToolMaterialList.redium, 6, -2.3f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("sword_redium")),
				ItemList.bow_redium = new BowCustom((new Item.Properties()).maxStackSize(1).group(PowderPower.powder_power).maxDamage(2000)).setRegistryName(location("bow_redium")),
				ItemList.pickaxe_redium = new PickaxeItem(ToolMaterialList.redium, 3, -2.7f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("pickaxe_redium")),
				ItemList.axe_redium = new AxeItem(ToolMaterialList.redium, 7, -3.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("axe_redium")),
				ItemList.shovel_redium = new ShovelItem(ToolMaterialList.redium, 4, -3.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("shovel_redium")),
				ItemList.hoe_redium = new HoeItem(ToolMaterialList.redium, 1.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("hoe_redium")),
				ItemList.paxel_redium = new PaxelRedium(7, -3.0f, ToolMaterialList.redium, null, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("paxel_redium")),		
										
				ItemList.sword_lapium = new SwordItem(ToolMaterialList.lapium, 6, -2.3f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("sword_lapium")),
				ItemList.bow_lapium = new BowCustom((new Item.Properties()).maxStackSize(1).group(PowderPower.powder_power).maxDamage(2000)).setRegistryName(location("bow_lapium")),
				ItemList.pickaxe_lapium = new PickaxeItem(ToolMaterialList.lapium, 3, -2.7f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("pickaxe_lapium")),
				ItemList.axe_lapium = new AxeItem(ToolMaterialList.lapium, 7, -3.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("axe_lapium")),
				ItemList.shovel_lapium = new ShovelItem(ToolMaterialList.lapium, 4, -3.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("shovel_lapium")),
				ItemList.hoe_lapium = new HoeItem(ToolMaterialList.lapium, 1.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("hoe_lapium")),
				ItemList.paxel_lapium = new PaxelLapium(7, -3.0f, ToolMaterialList.lapium, null, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("paxel_lapium")),	
									
				ItemList.sword_gemium = new SwordItem(ToolMaterialList.gemium, 7, -2.2f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("sword_gemium")),
				ItemList.bow_gemium = new BowCustom((new Item.Properties()).maxStackSize(1).group(PowderPower.powder_power).maxDamage(4000)).setRegistryName(location("bow_gemium")),
				ItemList.pickaxe_gemium = new PickaxeItem(ToolMaterialList.gemium, 3, -2.6f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("pickaxe_gemium")),
				ItemList.axe_gemium = new AxeItem(ToolMaterialList.gemium, 7, -2.7f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("axe_gemium")),
				ItemList.shovel_gemium = new ShovelItem(ToolMaterialList.gemium, 5, -2.7f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("shovel_gemium")),
				ItemList.hoe_gemium = new HoeItem(ToolMaterialList.gemium, 1.5f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("hoe_gemium")),
				ItemList.paxel_gemium = new PaxelGemium(7, -2.7f, ToolMaterialList.gemium, null, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("paxel_gemium")),
				
//				SAVE FOR REFERENCE					
//				ItemList.sword_trilium = new SwordItem(ToolMaterialList.trilium, 8, -2.1f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("sword_trilium")),
//				ItemList.bow_trilium = new BowCustom((new Item.Properties()).maxStackSize(1).group(PowderPower.powder_power).maxDamage(8000)).setRegistryName(location("bow_trilium")),
//				ItemList.pickaxe_trilium = new PickaxeItem(ToolMaterialList.trilium, 3, -2.5f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("pickaxe_trilium")),
//				ItemList.axe_trilium = new AxeItem(ToolMaterialList.trilium, 7, -2.6f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("axe_trilium")),
//				ItemList.shovel_trilium = new ShovelItem(ToolMaterialList.trilium, 5, -2.6f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("shovel_trilium")),
//				ItemList.hoe_trilium = new HoeItem(ToolMaterialList.trilium, 2.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("hoe_trilium")),
//				ItemList.paxel_trilium = new PaxelTrilium(7, -2.6f, ToolMaterialList.trilium, null, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("paxel_trilium")),
		
				//Damage values set to 0 and handled by the config, speed values are hard-coded here
				ItemList.sword_trilium = new SwordItem(ToolMaterialList.trilium, 0, -2.1f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("sword_trilium")),			
				ItemList.bow_trilium = new BowCustom((new Item.Properties()).maxStackSize(1).group(PowderPower.powder_power).maxDamage(8000)).setRegistryName(location("bow_trilium")),
				ItemList.pickaxe_trilium = new PickaxeItem(ToolMaterialList.trilium, -5, -2.5f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("pickaxe_trilium")),
				ItemList.axe_trilium = new AxeItem(ToolMaterialList.trilium, -1, -2.6f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("axe_trilium")),
				ItemList.shovel_trilium = new ShovelItem(ToolMaterialList.trilium, -3, -2.6f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("shovel_trilium")),
				ItemList.hoe_trilium = new HoeItem(ToolMaterialList.trilium, 2.0f, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("hoe_trilium")),
				ItemList.paxel_trilium = new PaxelTrilium(-1, -2.6f, ToolMaterialList.trilium, null, new Item.Properties().group(PowderPower.powder_power)).setRegistryName(location("paxel_trilium")),	
						
				
				
				ItemList.token_night_vision = new TokenNightVision(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)).setRegistryName(location("token_night_vision")),
				ItemList.token_fire_resistance = new TokenFireResistance(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)).setRegistryName(location("token_fire_resistance")),
				ItemList.token_speed = new TokenSpeed(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)).setRegistryName(location("token_speed")),
				ItemList.token_no_fall = new TokenNoFall(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)).setRegistryName(location("token_no_fall")),
						
				ItemList.token_jump_boost = new TokenJumpBoost(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)).setRegistryName(location("token_jump_boost")),
				ItemList.token_haste = new TokenHaste(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)).setRegistryName(location("token_haste")),
				ItemList.token_breathing = new TokenBreathing(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)).setRegistryName(location("token_breathing")),
						
				ItemList.token_resistance = new TokenResistance(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)).setRegistryName(location("token_resistance")),					
				ItemList.token_strength = new TokenStrength(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)).setRegistryName(location("token_strength")),
				ItemList.token_dolphin = new TokenDolphin(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)).setRegistryName(location("token_dolphin")),
				ItemList.token_conduit_power = new TokenConduitPower(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)).setRegistryName(location("token_conduit_power")),
				
				ItemList.token_health = new TokenHealth(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)).setRegistryName(location("token_health")),
				ItemList.token_curing = new TokenCuring(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)).setRegistryName(location("token_curing")),	
				ItemList.token_absorption = new TokenAbsorption(new Item.Properties().maxStackSize(1).group(PowderPower.powder_power)).setRegistryName(location("token_absorption"))
			);		
			PowderPower.logger.info("PowderPower items registered.");
		}
		
		private static ResourceLocation location(String name)
		{
			return new ResourceLocation(PowderPower.modid, name);
		}
	}
}
