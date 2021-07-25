package com.kwpugh.powder_power.init;

import com.kwpugh.powder_power.PowderPower;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.level.block.Block;

public class TagInit
{
    public static final Tag<Block> PAXEL_MINEABLE = getBlockTagWrapper("paxel_mineable");

    public static Tag<Block> getBlockTagWrapper(String path)
    {
        return BlockTags.bind(PowderPower.modid + ":" + path);
    }
}