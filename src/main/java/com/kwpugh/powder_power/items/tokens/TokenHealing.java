package com.kwpugh.powder_power.items.tokens;

import com.kwpugh.powder_power.init.ItemInit;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class TokenHealing extends Item
{

	public TokenHealing(Properties properties)
	{
		super(properties);
	}

	public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand)
	{	
		ItemStack stack = player.getItemInHand(hand);
		
		if (!world.isClientSide)
		{
	        player.setHealth(player.getMaxHealth());
	        player.getFoodData().setFoodLevel(20);

	        player.displayClientMessage((Component.translatable("item.powder_power.token_healing.line2").withStyle(ChatFormatting.BOLD)), true);
	        
	        double chance = world.random.nextDouble();
	    	
	        if(chance <= .05)
	        {
		        ItemStack gift = null;
		        gift = new ItemStack(ItemInit.SWORD_REDIUM.get());
		        gift.setCount(1);
		        gift.enchant(Enchantments.SHARPNESS, 5);
		        gift.enchant(Enchantments.SWEEPING_EDGE, 5);
		        gift.enchant(Enchantments.MOB_LOOTING, 5);
		        gift.setHoverName(Component.translatable("Redium Vengeance"));
		        
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
		tooltip.add((Component.translatable("item.powder_power.token_healing.line1").withStyle(ChatFormatting.GREEN)));
	}
}
