package com.kwpugh.powder_power.items.tokens;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.BaseComponent;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import net.minecraft.world.item.Item.Properties;

public class TokenTrash extends Item
{
	public TokenTrash(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand)
	{
		if(!world.isClientSide)
		{
	       player.openMenu(new SimpleMenuProvider((id, inv, items) -> {
	            return ChestMenu.fourRows(id, inv);
	        }, formatText("item.powder_power.token_trash.line3")));
		}
				
		return super.use(world, player, hand);
	}
	
    public static BaseComponent formatText(String translationKey, Object... args)
    {
        return new TranslatableComponent(translationKey, args);
    }
    
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslatableComponent("item.powder_power.token_trash.line1").withStyle(ChatFormatting.GREEN)));
		tooltip.add((new TranslatableComponent("item.powder_power.token_trash.line2").withStyle(ChatFormatting.RED)));
	}
}
