package com.kwpugh.powder_power.items.tokens;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.entity.monster.ElderGuardian;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.monster.Guardian;
import net.minecraft.world.entity.monster.Vex;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.phys.AABB;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import net.minecraft.world.item.Item.Properties;

public class TokenAffliction extends Item
{

	public TokenAffliction(Properties properties)
	{
		super(properties);
	}
	
	public void inventoryTick(ItemStack stack, Level world, Entity entity, int itemSlot, boolean isSelected)
	{		
		if(entity instanceof Player && !world.isClientSide)
		{
			Player player = (Player)entity;

			if(!world.isClientSide)
			{
				double x = player.getX();
				double y = player.getY();
				double z = player.getZ();
	
				double d0 = 8.0D;
				double d1 = 5.0D;
	
				Mob hostileMob = scanForHostileMobs(world, x, y, z, d0, d1);

				if(hostileMob != null)
				{					
					hostileMob.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 3600, 0, false, false));
					hostileMob.addEffect(new MobEffectInstance(MobEffects.POISON, 3600, 0, false, false));
					hostileMob.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3600, 0, false, false));
					hostileMob.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 3600, 0, false, false));
					hostileMob.addEffect(new MobEffectInstance(MobEffects.WITHER, 3600, 0, false, false));
					hostileMob.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 3600, 0, false, false));
					
				}					
			}				
		}
	}
		   
	private Mob scanForHostileMobs(Level world, double xpos, double ypos, double zpos, double d0, double d1)
	{
		List<Mob> list = world.<Mob>getEntitiesOfClass(Mob.class, new AABB
				((double) xpos - d0,
				 (double) ypos - d1,
				 (double) zpos - d0,
				 (double) xpos + d0, ypos + d1,
				 (double) zpos + d0));
	
		Mob closestMob = null;
	
		for (Mob entitymob : list)
		{
			// Exclude these mobs
			if (entitymob instanceof Animal ||
					entitymob instanceof Villager ||
					entitymob instanceof WanderingTrader ||
					entitymob instanceof ElderGuardian ||
					entitymob instanceof Evoker ||
					entitymob instanceof Guardian ||
					entitymob instanceof Vex ||
					entitymob instanceof Vindicator ||
					entitymob instanceof WitherBoss ||
					entitymob instanceof EnderDragon)
			{
				continue;
			}
			else
			{
				closestMob = entitymob;
				return closestMob;
			}
		}
		return null;
	}

	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslatableComponent("item.powder_power.token_affliction.line1").withStyle(ChatFormatting.GREEN)));
		tooltip.add((new TranslatableComponent("item.powder_power.token.general1").withStyle(ChatFormatting.AQUA)));
	} 
}
