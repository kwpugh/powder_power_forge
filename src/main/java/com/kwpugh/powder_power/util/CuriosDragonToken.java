package com.kwpugh.powder_power.util;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.kwpugh.powder_power.init.ItemInit;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.LazyOptional;
import top.theillusivec4.curios.api.CuriosAPI;
import top.theillusivec4.curios.api.capability.CuriosCapability;
import top.theillusivec4.curios.api.capability.ICurio;

/*
 * Adapted from AngelRing mod
 * by: DenisMasterHerobrine
 * 
 * All credit goes to that author
 */

public class CuriosDragonToken
{
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
            public void onEquipped(String identifier, LivingEntity livingEntity)
            {
                if (livingEntity instanceof PlayerEntity)
                {
                    startFlying((PlayerEntity) livingEntity);
                }
            }
            @Override
            public void onUnequipped(String identifier, LivingEntity livingEntity)
            {
                if (livingEntity instanceof PlayerEntity)
                {
                    stopFlying((PlayerEntity) livingEntity);
                }
            }
            private void startFlying(PlayerEntity player)
            {
                if (!player.isCreative() && !player.isSpectator())
                {
                    player.abilities.allowFlying = true;
                    player.sendPlayerAbilities();
                }
            }
            private void stopFlying(PlayerEntity player)
            {
                if (!player.isCreative() && !player.isSpectator())
                {
                    player.abilities.isFlying = false;
                    player.abilities.allowFlying = false;
                    player.sendPlayerAbilities();
                }
            }
            @Override
            public void onCurioTick(String identifier, int index, LivingEntity livingEntity)
            {
                if (livingEntity instanceof PlayerEntity)
                {
                    PlayerEntity player = ((PlayerEntity) livingEntity);
                    if (!player.abilities.allowFlying)
                    {
                        startFlying(player);
                    }
                }
            }
            @Override
            public boolean canEquip(String identifier, LivingEntity entityLivingBase)
            {
                return !CuriosAPI.getCurioEquipped(ItemInit.TOKEN_DRAGON.get(), entityLivingBase).isPresent();
            }

            @Override
            public void playEquipSound(LivingEntity entityLivingBase)
            {
                entityLivingBase.world.playSound(null, entityLivingBase.getPosition(),
                        SoundEvents.ENTITY_ENDER_DRAGON_GROWL, SoundCategory.NEUTRAL,
                        1.0F, 1.0F);
            }
        };

        return new ICapabilityProvider()
        {
            private final LazyOptional<ICurio> curioOpt = LazyOptional.of(() -> curio);

            @Nonnull
            @Override
            public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap,
                                                     @Nullable Direction side) {

                return CuriosCapability.ITEM.orEmpty(cap, curioOpt);
            }
        };
    }

    public static boolean isRingInCuriosSlot(ItemStack token, LivingEntity player)
    {
        return CuriosAPI.getCurioEquipped(token.getItem(), player).isPresent();
    }
}