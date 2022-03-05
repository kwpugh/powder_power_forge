package com.kwpugh.powder_power.init;

import com.kwpugh.powder_power.PowderPower;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TagInit
{
    public static final TagKey<Block> PAXEL_MINEABLE = TagKey.create(Registry.BLOCK_REGISTRY,
            new ResourceLocation(PowderPower.modid, "paxel_mineable"));
}