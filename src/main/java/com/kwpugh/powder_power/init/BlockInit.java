package com.kwpugh.powder_power.init;

import com.kwpugh.powder_power.PowderPower;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PowderPower.modid);

	public static final RegistryObject<Block> BLOCK_REDIUM = BLOCKS.register("block_redium", () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.METAL)));
	public static final RegistryObject<Block> BLOCK_LAPIUM = BLOCKS.register("block_lapium", () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.METAL)));
	public static final RegistryObject<Block> BLOCK_GEMIUM = BLOCKS.register("block_gemium", () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.METAL)));
	public static final RegistryObject<Block> BLOCK_TRILIUM = BLOCKS.register("block_trilium", () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.METAL)));	
}