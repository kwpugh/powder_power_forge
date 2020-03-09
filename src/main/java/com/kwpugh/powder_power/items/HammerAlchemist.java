package com.kwpugh.powder_power.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class HammerAlchemist extends Item
{
//	Block block;
	
	public HammerAlchemist(Properties properties)
	{
		super(properties);
	}

    @Override
    public boolean hasContainerItem(ItemStack stack)
    {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack)
    {
        return stack.copy();
    }
    
    
//	@Override
//	  public boolean canHarvestBlock(BlockState blockIn)
//	  {
//	      return true;
//	   }
	  
	
	
//	public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving)
//	{
//		Block block = state.getBlock();	
//		String blockForgeTags = block.getTags().toString(); 
//		PlayerEntity player = PlayerEntity(entityLiving);
//		
//		if (!worldIn.isRemote)
//		{
//			//Powders
//			if(blockForgeTags.contains("forge:ores/diamond"))
//			{
//				stack.damageItem(1, entityLiving, (p_220038_0_) -> {
//					p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//					});
//        
//				worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_DIAMOND.get(), 2)));  
//			}
//			
//			 if(blockForgeTags.contains("forge:ores/emerald"))
//			 {
//					stack.damageItem(1, entityLiving, (p_220038_0_) -> {
//						p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//						});
//		        
//					worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_EMERALD.get(), 2))); 
//			 }
//			
//			if(blockForgeTags.contains("forge:ores/lapis"))
//			{
//		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
//		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		        	});
//		        
//		        worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_LAPIS.get(), 2)));  		         	 
//			}
//			
//			if(blockForgeTags.contains("forge:ores/redstone"))
//			{
//		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
//		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		        	});
//		        
//		        worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_REDSTONE.get(), 2)));  		         	 
//			}
//
//			if(blockForgeTags.contains("forge:ores/iron"))  
//			{
//				stack.damageItem(1, entityLiving, (p_220038_0_) -> {
//					p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//					});
//	        
//				worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_IRON.get(), 2))); 
//			}
//		
//			 if(blockForgeTags.contains("forge:ores/gold"))
//			 {
//					stack.damageItem(1, entityLiving, (p_220038_0_) -> {
//						p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//						});
//		        
//					worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_GOLD.get(), 2))); 
//			 }	
//			
//			 if(block == Blocks.OBSIDIAN)
//		     {
//					stack.damageItem(1, entityLiving, (p_220038_0_) -> {
//						p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//						});
//					state.canHarvestBlock(worldIn, pos, player);
//					worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_OBSIDIAN.get(), 2))); 
//		     }
//			
//		     if(block == Blocks.PRISMARINE || block == Blocks.DARK_PRISMARINE)
//		     {
//					stack.damageItem(1, entityLiving, (p_220038_0_) -> {
//						p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//						});
//		        
//					worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_PRISMARINE.get(), 2))); 
//		     }
//		     
//		     if(block == Blocks.NETHER_QUARTZ_ORE)
//		     {
//					stack.damageItem(1, entityLiving, (p_220038_0_) -> {
//						p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//						});
//		        
//					worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_NETHER_QUARTZ.get(), 2))); 
//		     }
//		     
//		     if(block == Blocks.PURPUR_PILLAR)
//		     {
//					stack.damageItem(1, entityLiving, (p_220038_0_) -> {
//						p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//						});
//		        
//					worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_PURPUR.get(), 2))); 
//		     }
//			 
//		     if(block == Blocks.STONE)
//		     {
//		 		stack.damageItem(1, entityLiving, (p_220038_0_) -> {
//					p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//					});
//	        
//				worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_STONE.get(), 2))); 
//		     }
//		     
//		     if(block == Blocks.OAK_LOG)
//		     {
//		 		stack.damageItem(1, entityLiving, (p_220038_0_) -> {
//					p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//					});
//	        
//				worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_WOOD.get(), 2))); 
//		     }
//		     
//		     if(block == Blocks.MAGMA_BLOCK)
//		     {
//		 		stack.damageItem(1, entityLiving, (p_220038_0_) -> {
//					p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//					});
//		 		
//				worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.BLAZE_POWDER, 2))); 
//		     }
//		    	 
//		    	 
//		    	 
//			
//			
//			
//			 //Silk Touch-like effect
//		     if(blockForgeTags.contains("forge:ores/diamond") && !player.isShiftKeyDown())
//		     {
//					stack.damageItem(1, entityLiving, (p_220038_0_) -> {
//						p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//						});
//		        
//					worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.DIAMOND_ORE, 1))); 
//		     }
//		     
//		     if(blockForgeTags.contains("forge:ores/emerald") && !player.isShiftKeyDown())
//		     {
//					stack.damageItem(1, entityLiving, (p_220038_0_) -> {
//						p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//						});
//		        
//					worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.EMERALD_ORE, 1))); 
//		     }			
//			
//		     else if(blockForgeTags.contains("forge:ores/lapis") && !player.isShiftKeyDown())
//		     {
//		 		stack.damageItem(1, entityLiving, (p_220038_0_) -> {
//					p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//					});
//	        
//				worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.LAPIS_ORE, 1))); 
//		     }
//		     
//		     else if(blockForgeTags.contains("forge:ores/redstone") && !player.isShiftKeyDown())
//		     {
//		 		stack.damageItem(1, entityLiving, (p_220038_0_) -> {
//					p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//					});
//	        
//				worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.REDSTONE_ORE, 1))); 
//		     }
//		     
//		     if(blockForgeTags.contains("forge:ores/coal") && player.isShiftKeyDown())
//		     {
//			 		stack.damageItem(1, entityLiving, (p_220038_0_) -> {
//						p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//						});
//		        
//					worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.COAL_ORE, 1))); 
//		     }
//		     
//		     if(block == Blocks.GRASS_BLOCK && player.isShiftKeyDown())
//		     {
//			 		stack.damageItem(1, entityLiving, (p_220038_0_) -> {
//						p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//						});
//		        
//					worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.GRASS_BLOCK, 1))); 
//		     }
//		     
//		     if(block == Blocks.PODZOL && player.isShiftKeyDown())
//		     {
//			 		stack.damageItem(1, entityLiving, (p_220038_0_) -> {
//						p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//						});
//		        
//					worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.PODZOL, 1))); 
//		     }
//		    	 
//		    	 
//
//		     
//		     
//			//Damage the tool if used to break anything else
//			if(		 !(block == Blocks.REDSTONE_ORE) ||
//					 !(block == Blocks.LAPIS_ORE) ||
//					 !(blockForgeTags.contains("forge:ores/iron")) || 
//					 !(blockForgeTags.contains("forge:ores/gold")) || 
//					 !(blockForgeTags.contains("forge:ores/diamond")) ||
//					 !(blockForgeTags.contains("forge:ores/emerald"))            ) 
//			 {
//					stack.damageItem(1, entityLiving, (p_220038_0_) -> {
//						p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//						}); 
//			 }
//			
//		}
//		
//		
//		
//		
//		
//		
//		return true;
//	}
	
	
	
	

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
//	     if(block == Blocks.REDSTONE_ORE && !player.isShiftKeyDown())
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_REDSTONE.get(), 3)));
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.IRON_ORE)
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_IRON.get(), 2)));
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.OBSIDIAN)
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_OBSIDIAN.get(), 2)));
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.LAPIS_ORE && !player.isShiftKeyDown())
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_LAPIS.get(), 3)));
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.GOLD_ORE)
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_GOLD.get(), 2)));
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.DIAMOND_ORE && !player.isShiftKeyDown())
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_DIAMOND.get(), 2))); 
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.EMERALD_ORE && !player.isShiftKeyDown())
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_EMERALD.get(), 2)));
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.PRISMARINE || block == Blocks.DARK_PRISMARINE)
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_PRISMARINE.get(), 2)));
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.NETHER_QUARTZ_ORE)
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_NETHER_QUARTZ.get(), 2)));
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.PURPUR_PILLAR)
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_PURPUR.get(), 2)));
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.STONE)
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_STONE.get(), 2)));
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.OAK_LOG)
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_WOOD.get(), 2)));
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.MAGMA_BLOCK)
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.BLAZE_POWDER, 1)));
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.DIAMOND_ORE && player.isShiftKeyDown())
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.DIAMOND_ORE, 1)));
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }	   
//	     else if(block == Blocks.EMERALD_ORE && player.isShiftKeyDown())
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.EMERALD_ORE, 1)));
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.LAPIS_ORE && player.isShiftKeyDown())
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.LAPIS_ORE, 1)));
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.REDSTONE_ORE && player.isShiftKeyDown())
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.REDSTONE_ORE, 1)));
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.COAL_ORE && player.isShiftKeyDown())
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.COAL_ORE, 1)));
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.GRASS_BLOCK && player.isShiftKeyDown())
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.GRASS_BLOCK, 1)));
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     else if(block == Blocks.PODZOL && player.isShiftKeyDown())
//	     {
//	    	 world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
//	    	 world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.PODZOL, 1)));
//	    	 stack.damageItem(1, player, (p_220038_0_) -> {
//		         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
//		         });
//	    	 
//	    	 return ActionResultType.SUCCESS;
//	     }
//	     
//		 return ActionResultType.PASS;
//	}
	
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
