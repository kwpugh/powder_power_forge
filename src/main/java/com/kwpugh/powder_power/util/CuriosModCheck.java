package com.kwpugh.powder_power.util;

import net.minecraft.util.IStringSerializable;
import net.minecraftforge.fml.ModList;

public enum CuriosModCheck implements IStringSerializable
{
    CURIOS("curios");

    private final String modid;
    private final boolean loaded;

    CuriosModCheck(String modid) {
        this.modid = modid;
        this.loaded = ModList.get() != null && ModList.get().getModContainerById(modid).isPresent();
    }

    public boolean isLoaded() {
        return this.loaded;
    }

    @Override
    public String getName() {
        return this.modid;
    }
}