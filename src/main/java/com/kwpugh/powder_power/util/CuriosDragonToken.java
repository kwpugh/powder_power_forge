package com.kwpugh.powder_power.util;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.kwpugh.powder_power.init.ItemInit;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.fml.InterModComms;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.CuriosCapability;
import top.theillusivec4.curios.api.SlotTypeMessage;
import top.theillusivec4.curios.api.type.capability.ICurio;

/*
* Adapted from AngelRing mod
* by: DenisMasterHerobrine
*
* All credit goes to that author
*/

public class CuriosDragonToken
{
    public static void sendImc()
    {
        InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("dragontoken").build());
    }

    public static ICapabilityProvider initCapabilities()
    {
        ICurio curio = new ICurio()
        {
            @Override
            public boolean canRightClickEquip()
            {
                return true;
            }

            @Override
            public void onEquip(String identifier, int index, LivingEntity livingEntity)
            {
                if (livingEntity instanceof Player)
                {
                    startFlying((Player) livingEntity);
                }
            }
            @Override
            public void onUnequip(String identifier, int index, LivingEntity livingEntity)
            {
                if (livingEntity instanceof Player)
                {
                    stopFlying((Player) livingEntity);
                }
            }
            private void startFlying(Player player)
            {
                if (!player.isCreative() && !player.isSpectator())
                {
                    player.getAbilities().mayfly = true;
                    player.onUpdateAbilities();
                }
            }
            private void stopFlying(Player player)
            {
                if (!player.isCreative() && !player.isSpectator())
                {
                    player.getAbilities().flying = false;
                    player.getAbilities().mayfly = false;
                    player.onUpdateAbilities();
                }
            }

            @Override
            public ItemStack getStack()
            {
                return this.getStack();
            }

            @Override
            public void curioTick(String identifier, int index, LivingEntity livingEntity)
            {
                if (livingEntity instanceof Player)
                {
                    Player player = ((Player) livingEntity);
                    if (!player.getAbilities().mayfly)
                    {
                        startFlying(player);
                    }
                }
            }
            @Override
            public boolean canEquip(String identifier, LivingEntity entityLivingBase)
            {
                return !CuriosApi.getCuriosHelper().findEquippedCurio(ItemInit.TOKEN_DRAGON.get(), entityLivingBase).isPresent();
            }
        };

        return new ICapabilityProvider()
        {
            private final LazyOptional<ICurio> curioOpt = LazyOptional.of(() -> curio);

            @Nonnull
            @Override
            public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side)
            {
                return CuriosCapability.ITEM.orEmpty(cap, curioOpt);
            }
        };
    }

    public static boolean isRingInCuriosSlot(ItemStack belt, LivingEntity player)
    {
        return CuriosApi.getCuriosHelper().findEquippedCurio(belt.getItem(), player).isPresent();
    }
}