package com.kwpugh.powder_power.items;

import java.util.List;

import com.kwpugh.powder_power.lists.ItemList;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantments;
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
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class WandAlchemist extends PickaxeItem
{
	Block block;
	
	public WandAlchemist(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
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
		 
	     if (!world.isRemote && state.getBlockHardness(world, pos) != 0.0F)
		 {
	    	 stack.damageItem(1, player, (p_220038_0_) -> {
	         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
	         });
	     }
	      
	     if(block == Blocks.COBBLESTONE)
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.NETHERRACK, 1))); 
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.DIORITE)
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.END_STONE, 1)));
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.BROWN_MUSHROOM_BLOCK || block == Blocks.RED_MUSHROOM_BLOCK)
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.NETHER_WART_BLOCK, 1)));
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.GRANITE)
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.PURPUR_BLOCK, 1)));
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.NETHERRACK)
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.MAGMA_BLOCK, 1)));
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.LAPIS_BLOCK)
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.QUARTZ_BLOCK, 1)));
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.SAND || block == Blocks.RED_SAND)
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.SOUL_SAND, 1)));
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.REDSTONE_BLOCK)
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.GLOWSTONE, 1)));
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.DIAMOND_BLOCK)
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.GHAST_TEAR, 1)));
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.EMERALD_BLOCK)
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.END_ROD, 1)));
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.ENDER_CHEST)
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.BLACK_SHULKER_BOX, 1)));
	    	 return ActionResultType.SUCCESS;
	     }
	     else if(block == Blocks.BOOKSHELF)
	     {
	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.BOOKSHELF, 1)));
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
		return repair.getItem() == ItemList.gem_gemium;
	}
	
	@Override
	public void addInformation(ItemStack stack, World world, List<ITextComponent> list, ITooltipFlag flag)
	{
		super.addInformation(stack, world, list, flag);				
		list.add(new StringTextComponent(TextFormatting.GREEN + "Transforms many Overworld blocks into resources from the Nether and End"));
		list.add(new StringTextComponent(TextFormatting.BLUE + "Right-click on block to use"));

	} 
}
