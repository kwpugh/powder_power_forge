package com.kwpugh.powder_power.init;

import com.kwpugh.powder_power.PowderPower;
import com.kwpugh.powder_power.lists.BlockList;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class BlockInit
{
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents
	{
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event)
		{
			event.getRegistry().registerAll
			(

				BlockList.block_redium = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).lightValue(1).sound(SoundType.METAL)).setRegistryName(location("block_redium")),
				BlockList.block_lapium = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).lightValue(1).sound(SoundType.METAL)).setRegistryName(location("block_lapium")),
				BlockList.block_gemium = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).lightValue(1).sound(SoundType.METAL)).setRegistryName(location("block_gemium")),
				BlockList.block_trilium = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f).lightValue(1).sound(SoundType.METAL)).setRegistryName(location("block_trilium"))
				
			);
			PowderPower.logger.info("PowderPower blocks registered.");			
		}
	}
	
	private static ResourceLocation location(String name)
	{
		return new ResourceLocation(PowderPower.modid, name);
	}	
}