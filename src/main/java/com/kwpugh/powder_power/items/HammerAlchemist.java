package com.kwpugh.powder_power.items;

import java.util.List;

import javax.annotation.Nullable;

import com.kwpugh.powder_power.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class HammerAlchemist extends PickaxeItem
{
	Block block;
	
	public HammerAlchemist(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	@Override
	public ActionResultType onItemUse(ItemUseContext context)
	{
		 World world = context.getWorld();
		 PlayerEntity player = context.getPlayer();
		 BlockPos pos = context.getPos();
		 BlockState state = world.getBlockState(pos);
		 Block block = state.getBlock();
		 ItemStack stack = context.getItem();

	     if(block == Blocks.REDSTONE_ORE && !player.isShiftKeyDown())
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_REDSTONE.get(), 3)));
	    	 stack.damageItem(1, player, (p_220038_0_) -> {
		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
	    	 
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.IRON_ORE)
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_IRON.get(), 2)));
	    	 stack.damageItem(1, player, (p_220038_0_) -> {
		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
	    	 
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.OBSIDIAN)
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_OBSIDIAN.get(), 2)));
	    	 stack.damageItem(1, player, (p_220038_0_) -> {
		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
	    	 
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.LAPIS_ORE && !player.isShiftKeyDown())
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_LAPIS.get(), 3)));
	    	 stack.damageItem(1, player, (p_220038_0_) -> {
		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
	    	 
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.GOLD_ORE)
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_GOLD.get(), 2)));
	    	 stack.damageItem(1, player, (p_220038_0_) -> {
		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
	    	 
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.DIAMOND_ORE && !player.isShiftKeyDown())
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_DIAMOND.get(), 2))); 
	    	 stack.damageItem(1, player, (p_220038_0_) -> {
		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
	    	 
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.EMERALD_ORE && !player.isShiftKeyDown())
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_EMERALD.get(), 2)));
	    	 stack.damageItem(1, player, (p_220038_0_) -> {
		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
	    	 
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.PRISMARINE || block == Blocks.DARK_PRISMARINE)
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_PRISMARINE.get(), 2)));
	    	 stack.damageItem(1, player, (p_220038_0_) -> {
		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
	    	 
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.NETHER_QUARTZ_ORE)
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_NETHER_QUARTZ.get(), 2)));
	    	 stack.damageItem(1, player, (p_220038_0_) -> {
		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
	    	 
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.PURPUR_PILLAR)
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_PURPUR.get(), 2)));
	    	 stack.damageItem(1, player, (p_220038_0_) -> {
		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
	    	 
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.STONE)
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_STONE.get(), 2)));
	    	 stack.damageItem(1, player, (p_220038_0_) -> {
		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
	    	 
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.OAK_LOG)
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_WOOD.get(), 2)));
	    	 stack.damageItem(1, player, (p_220038_0_) -> {
		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
	    	 
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.MAGMA_BLOCK)
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.BLAZE_POWDER, 1)));
	    	 stack.damageItem(1, player, (p_220038_0_) -> {
		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
	    	 
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.DIAMOND_ORE && player.isShiftKeyDown())
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.DIAMOND_ORE, 1)));
	    	 stack.damageItem(1, player, (p_220038_0_) -> {
		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
	    	 
	    	 return ActionResultType.SUCCESS;
	     }	   
	     else if(block == Blocks.EMERALD_ORE && player.isShiftKeyDown())
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.EMERALD_ORE, 1)));
	    	 stack.damageItem(1, player, (p_220038_0_) -> {
		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
	    	 
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.LAPIS_ORE && player.isShiftKeyDown())
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.LAPIS_ORE, 1)));
	    	 stack.damageItem(1, player, (p_220038_0_) -> {
		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
	    	 
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.REDSTONE_ORE && player.isShiftKeyDown())
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.REDSTONE_ORE, 1)));
	    	 stack.damageItem(1, player, (p_220038_0_) -> {
		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
	    	 
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.COAL_ORE && player.isShiftKeyDown())
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.COAL_ORE, 1)));
	    	 stack.damageItem(1, player, (p_220038_0_) -> {
		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
	    	 
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.GRASS_BLOCK && player.isShiftKeyDown())
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.GRASS_BLOCK, 1)));
	    	 stack.damageItem(1, player, (p_220038_0_) -> {
		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
	    	 
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.PODZOL && player.isShiftKeyDown())
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.PODZOL, 1)));
	    	 stack.damageItem(1, player, (p_220038_0_) -> {
		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
	    	 
	    	 return ActionResultType.SUCCESS;
	     }
	     
		 return ActionResultType.PASS;
	}
	
	@Override
	public boolean isBookEnchantable(ItemStack stack, ItemStack book)
	{
		return true;
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == Items.DIAMOND;
	}

	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.powder_power.hammer_alchemist.line1").applyTextStyle(TextFormatting.GREEN)));
		tooltip.add((new TranslationTextComponent("item.powder_power.hammer_alchemist.line2").applyTextStyle(TextFormatting.AQUA)));
	}
}
