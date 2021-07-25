package com.kwpugh.powder_power.util;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;

public class EnableUtil
{
    public static boolean isEnabled(ItemStack stack)
    {
        return stack.hasTag() && stack.getTag().getBoolean("IsEnabled");
    }

    public static void changeEnabled(Player player, InteractionHand hand)
    {
        changeEnabled(player.getItemInHand(hand));
    }

    public static void changeEnabled(ItemStack stack)
    {
        if(!stack.hasTag())
        {
            stack.setTag(new CompoundTag());
        }
        boolean isEnabled = isEnabled(stack);
        stack.getTag().putBoolean("IsEnabled", !isEnabled);
    }
}
