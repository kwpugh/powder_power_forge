package com.kwpugh.powder_power.items;

import java.util.List;

import javax.annotation.Nullable;

import com.kwpugh.powder_power.init.ItemInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class WandAlchemist extends Item
{
	public WandAlchemist(Properties properties)
	{
		super(properties);
	}

	@Override
    public boolean hasContainerItem(ItemStack stack)
    {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stackIn)
    {
    	ItemStack stack = stackIn.copy();
    	stack.setDamage(getDamage(stack) + 1);

        return stack;
    }
    
//	@Override
//	public ActionResultType onItemUse(ItemUseContext context)
//	{
//		 World world = context.getWorld();
//		 PlayerEntity player = context.getPlayer();
//		 BlockPos pos = context.getPos();
//		 BlockState state = world.getBlockState(pos);
//		 Block block = state.getBlock();
//		 ItemStack stack = context.getItem();
//	      
//	     if(block == Blocks.COBBLESTONE)
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.setBlockState(pos, Blocks.NETHERRACK.getDefaultState(), 3);
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.DIORITE)
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.setBlockState(pos, Blocks.END_STONE.getDefaultState(), 3);
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.BROWN_MUSHROOM_BLOCK || block == Blocks.RED_MUSHROOM_BLOCK)
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.setBlockState(pos, Blocks.NETHER_WART_BLOCK.getDefaultState(), 3);
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.GRANITE)
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.setBlockState(pos, Blocks.PURPUR_BLOCK.getDefaultState(), 3);
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.NETHERRACK)
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.setBlockState(pos, Blocks.MAGMA_BLOCK.getDefaultState(), 3);
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.LAPIS_BLOCK)
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.setBlockState(pos, Blocks.QUARTZ_BLOCK.getDefaultState(), 3);
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.SAND || block == Blocks.RED_SAND)
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.setBlockState(pos, Blocks.SOUL_SAND.getDefaultState(), 3);
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.REDSTONE_BLOCK)
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.setBlockState(pos, Blocks.GLOWSTONE.getDefaultState(), 3);
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.DIAMOND_BLOCK)
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.GHAST_TEAR, 1)));
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.EMERALD_BLOCK)
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.END_ROD, 1)));
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.ENDER_CHEST)
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.BLACK_SHULKER_BOX, 1)));
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.BOOKSHELF)
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.BOOKSHELF, 1)));
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     
//		 return ActionResultType.PASS;
//	}
//	   
//	@Override
//	public boolean isBookEnchantable(ItemStack stack, ItemStack book)
//	{
//		return true;
//	}



	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == ItemInit.GEM_GEMIUM.get();
	}
	
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.powder_power.wand_alchemist.line1").applyTextStyle(TextFormatting.GREEN)));
		tooltip.add((new TranslationTextComponent("item.powder_power.wand_alchemist.line2").applyTextStyle(TextFormatting.AQUA)));
	}
}
