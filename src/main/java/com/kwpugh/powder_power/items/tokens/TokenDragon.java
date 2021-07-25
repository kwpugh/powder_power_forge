package com.kwpugh.powder_power.items.tokens;

//import java.util.List;
//
//import javax.annotation.Nullable;
//
//import com.kwpugh.powder_power.util.CuriosDragonToken;
//import com.kwpugh.powder_power.util.CuriosModCheck;
//
//import net.minecraft.world.item.TooltipFlag;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.nbt.CompoundTag;
//import net.minecraft.network.chat.Component;
//import net.minecraft.ChatFormatting;
//import net.minecraft.network.chat.TranslatableComponent;
//import net.minecraft.world.level.Level;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.api.distmarker.OnlyIn;
//import net.minecraftforge.common.capabilities.ICapabilityProvider;
//
//import net.minecraft.world.item.Item.Properties;
//
//public class TokenDragon extends Item
//{
//	public TokenDragon(Properties properties)
//	{
//		super(properties);
//	}
//
//    @Override
//    public ICapabilityProvider initCapabilities(final ItemStack stack, CompoundTag unused)
//    {
//        if (CuriosModCheck.CURIOS.isLoaded())
//        {
//            return CuriosDragonToken.initCapabilities();
//        }
//
//        return super.initCapabilities(stack, unused);
//    }
//
//	@OnlyIn(Dist.CLIENT)
//	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
//	{
//		super.appendHoverText(stack, worldIn, tooltip, flagIn);
//		tooltip.add((new TranslatableComponent("item.powder_power.token_dragon.line1").withStyle(ChatFormatting.GREEN)));
//	}
//}
