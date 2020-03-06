package com.kwpugh.powder_power.items.tokens;

import java.util.List;

import javax.annotation.Nullable;

import com.kwpugh.powder_power.init.ItemInit;
import com.kwpugh.powder_power.util.SupportMods;
import com.kwpugh.powder_power.util.UtilCurios;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class TokenDragon extends Item
{
	public TokenDragon(Properties properties)
	{
		super(properties);
	}

//	static boolean isHoldingDragonToken;
//	
//	public void inventoryTick(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected)
//	{			
//		if(entity instanceof PlayerEntity && !world.isRemote)
//		{		
//			PlayerEntity player = (PlayerEntity)entity;
//			PlayerInventory inv2 = player.inventory;
//			
//			if(!player.getPersistentData().contains("holdingDragonToken"))player.getPersistentData().putBoolean("holdingDragonToken", false);
//			
//			//Checks player main inventory
//			for (int slot = 0; slot < inv2.getSizeInventory(); slot++)
//			{
//				ItemStack invStack = inv2.getStackInSlot(slot);
//				if (invStack.getItem() == ItemInit.TOKEN_DRAGON.get())
//				{
//					isHoldingDragonToken = true;
//					break;
//				}
//			}
//			
//			//Checks Curios slots
//			if (SupportMods.CURIOS.isLoaded())
//		    {
//				if (UtilCurios.findItem(ItemInit.TOKEN_DRAGON.get(), player) != ItemStack.EMPTY)
//				{
//					isHoldingDragonToken = true;
//			    }
//		    } 
//		
//			boolean wasHoldingDragonToken = player.getPersistentData().getBoolean("holdingDragonToken");
//		  
//			if(!isHoldingDragonToken && wasHoldingDragonToken && !player.isCreative())
//			{
//				player.abilities.allowFlying = false;
//				player.abilities.isFlying = false;
//			}
//			else if(isHoldingDragonToken)
//			{
//				player.abilities.allowFlying = true;
//			}
//			player.getPersistentData().putBoolean("holdingDragonToken", isHoldingDragonToken);
//			
//		}
//	}	
//
//	@OnlyIn(Dist.CLIENT)
//	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
//	{
//		super.addInformation(stack, worldIn, tooltip, flagIn);
//		tooltip.add((new TranslationTextComponent("item.powder_power.token_dragon.line1").applyTextStyle(TextFormatting.GREEN)));	
//	}
}
