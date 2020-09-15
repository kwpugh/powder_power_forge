package com.kwpugh.powder_power.items.tokens;

import java.util.List;

import javax.annotation.Nullable;

import com.kwpugh.powder_power.util.CuriosDragonToken;
import com.kwpugh.powder_power.util.CuriosModCheck;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

public class TokenDragon extends Item
{
	public TokenDragon(Properties properties)
	{
		super(properties);
	}

    @Override
    public ICapabilityProvider initCapabilities(final ItemStack stack, CompoundNBT unused)
    {
        if (CuriosModCheck.CURIOS.isLoaded())
        {
            return CuriosDragonToken.initCapabilities();
        }
        
        return super.initCapabilities(stack, unused);
    }
    
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.powder_power.token_dragon.line1").mergeStyle(TextFormatting.GREEN)));	
	}
}
