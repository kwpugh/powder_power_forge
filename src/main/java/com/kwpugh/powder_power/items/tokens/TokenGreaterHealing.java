package com.kwpugh.powder_power.items.tokens;
import java.util.List;

import javax.annotation.Nullable;

import com.kwpugh.powder_power.init.ItemInit;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import net.minecraft.world.item.Item.Properties;

public class TokenGreaterHealing extends Item
{

	public TokenGreaterHealing(Properties properties)
	{
		super(properties);
	}

	public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand)
	{	
		ItemStack stack = player.getItemInHand(hand);

		if (!world.isClientSide)
		{
	        player.setHealth(player.getMaxHealth());
	        player.getFoodData().eat(20, 20);
	        player.clearFire();
	        player.removeAllEffects();

	        player.displayClientMessage((new TranslatableComponent("item.powder_power.token_healing.line2").withStyle(ChatFormatting.BOLD)), true);
	        
	        double chance = world.random.nextDouble();
	    	
	        if(chance <= .05)
	        {
		        ItemStack gift = null;
		        gift = new ItemStack(ItemInit.SWORD_GEMIUM.get());
		        gift.setCount(1);
		        gift.enchant(Enchantments.SHARPNESS, 10);
		        gift.enchant(Enchantments.SWEEPING_EDGE, 10);
		        gift.enchant(Enchantments.MOB_LOOTING, 10);
		        gift.setHoverName(new TextComponent("Gemium Vengeance"));
		        
		        BlockPos playerPos = player.blockPosition();
				player.level.addFreshEntity(new ItemEntity(player.level, playerPos.getX(), playerPos.getY(), playerPos.getZ(), gift));	        	
	        }
	        
	        if (!player.getAbilities().instabuild) {
	           stack.shrink(1);
	        }
		}

        return new InteractionResultHolder<ItemStack>(InteractionResult.SUCCESS, stack);
	}
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslatableComponent("item.powder_power.token_healing.line1").withStyle(ChatFormatting.GREEN)));	
	}
}