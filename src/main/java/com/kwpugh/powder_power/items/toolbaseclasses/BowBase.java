package com.kwpugh.powder_power.items.toolbaseclasses;

import com.kwpugh.powder_power.init.ItemInit;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Predicate;

public class BowBase extends BowItem
{	
	 public BowBase(Properties builder)
	{
		super(builder);
	}

	/**
	    * Called when the player stops using an Item (stops holding the right mouse button).
	    */
	   public void releaseUsing(ItemStack stack, Level worldIn, LivingEntity entityLiving, int timeLeft) {
	      if (entityLiving instanceof Player) {
	         Player playerentity = (Player)entityLiving;
	         boolean flag = playerentity.getAbilities().instabuild || EnchantmentHelper.getItemEnchantmentLevel(Enchantments.INFINITY_ARROWS, stack) > 0;
	         ItemStack itemstack = playerentity.getProjectile(stack);

	         int i = this.getUseDuration(stack) - timeLeft;
	         i = net.minecraftforge.event.ForgeEventFactory.onArrowLoose(stack, worldIn, playerentity, i, !itemstack.isEmpty() || flag);
	         if (i < 0) return;

	         if (!itemstack.isEmpty() || flag) {
	            if (itemstack.isEmpty()) {
	               itemstack = new ItemStack(Items.ARROW);
	            }

	            float f = getArrowVelocity(i);
	            if (!((double)f < 0.1D)) {
	               boolean flag1 = playerentity.getAbilities().instabuild || (itemstack.getItem() instanceof ArrowItem && ((ArrowItem)itemstack.getItem()).isInfinite(itemstack, stack, playerentity));
	               if (!worldIn.isClientSide) {
	                  ArrowItem arrowitem = (ArrowItem)(itemstack.getItem() instanceof ArrowItem ? itemstack.getItem() : Items.ARROW);
	                  AbstractArrow abstractarrowentity = arrowitem.createArrow(worldIn, itemstack, playerentity);
	                  abstractarrowentity = customArrow(abstractarrowentity);
	                  abstractarrowentity.shootFromRotation(playerentity, playerentity.xRotO, playerentity.yRotO, 0.0F, f * 3.0F, 1.0F);
	                  if (f == 1.0F) {
	                     abstractarrowentity.setCritArrow(true);
	                  }

	                  int j = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.POWER_ARROWS, stack);
	                  if (j > 0) {
	                     abstractarrowentity.setBaseDamage(abstractarrowentity.getBaseDamage() + (double)j * 0.5D + 0.5D);
	                  }

	                  int k = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.PUNCH_ARROWS, stack);
	                  if (k > 0) {
	                     abstractarrowentity.setKnockback(k);
	                  }

	                  if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FLAMING_ARROWS, stack) > 0) {
	                     abstractarrowentity.setSecondsOnFire(100);
	                  }

	                  stack.hurtAndBreak(1, playerentity, (p_220009_1_) -> {
	                     p_220009_1_.broadcastBreakEvent(playerentity.getUsedItemHand());
	                  });
	                  if (flag1 || playerentity.getAbilities().instabuild && (itemstack.getItem() == Items.SPECTRAL_ARROW || itemstack.getItem() == Items.TIPPED_ARROW)) {
	                     abstractarrowentity.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
	                  }

	                  worldIn.addFreshEntity(abstractarrowentity);
	               }

	               worldIn.playSound((Player)null, playerentity.getX(), playerentity.getY(), playerentity.getZ(), SoundEvents.ARROW_SHOOT, SoundSource.PLAYERS, 1.0F, 1.0F / (worldIn.random.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
	               if (!flag1 && !playerentity.getAbilities().instabuild) {
	                  itemstack.shrink(1);
	                  if (itemstack.isEmpty()) {
	                     playerentity.getInventory().removeItem(itemstack);
	                  }
	               }

	               playerentity.awardStat(Stats.ITEM_USED.get(this));
	            }
	         }
	      }
	   }

	   /**
	    * Gets the velocity of the arrow entity from the bow's charge
	    */
	   public static float getArrowVelocity(int charge) {
	      float f = (float)charge / 20.0F;
	      f = (f * f + f * 2.0F) / 3.0F;
	      if (f > 1.0F) {
	         f = 1.0F;
	      }

	      return f;
	   }

	   /**
	    * How long it takes to use or consume an item
	    */
	   public int getUseDuration(ItemStack stack) {
	      return 72000;
	   }

	   /**
	    * returns the action that specifies what animation to play when the items is being used
	    */
	   public UseAnim getUseAnimation(ItemStack stack) {
	      return UseAnim.BOW;
	   }


	   public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn) {
	      ItemStack itemstack = playerIn.getItemInHand(handIn);
	      boolean flag = !playerIn.getProjectile(itemstack).isEmpty();

	      InteractionResultHolder<ItemStack> ret = net.minecraftforge.event.ForgeEventFactory.onArrowNock(itemstack, worldIn, playerIn, handIn, flag);
	      if (ret != null) return ret;

	      if (!playerIn.getAbilities().instabuild && !flag) {
	         return InteractionResultHolder.fail(itemstack);
	      } else {
	         playerIn.startUsingItem(handIn);
	         return InteractionResultHolder.consume(itemstack);
	      }
	   }

	   /**
	    * Get the predicate to match ammunition when searching the player's inventory, not their main/offhand
	    */
	   public Predicate<ItemStack> getAllSupportedProjectiles() {
	      return ARROW_ONLY;
	   }

	   public AbstractArrow customArrow(AbstractArrow arrow) {
	      return arrow;
	   }

	   public int getDefaultProjectileRange() {
	      return 15;
	   }
   
   @Override
   public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair)
   {
	   return repair.getItem() == ItemInit.INGOT_REDIUM.get();
   }
   
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((Component.translatable("item.powder_power.bow.line1").withStyle(ChatFormatting.GREEN)));
	}
}