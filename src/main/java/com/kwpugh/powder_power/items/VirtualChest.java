package com.kwpugh.powder_power.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;

public class VirtualChest extends Inventory
{

    public static final String VIRTUALCHEST_TAG = "VirtualChestItems";

    private ServerPlayerEntity owner;

    public VirtualChest(ServerPlayerEntity player)
    {  	
        super(54);
        owner = player;
    }

    @Override
    public void openInventory(PlayerEntity player)
    {
        loadInventoryFromNBT(getPersistedTag(owner, false).getList(VIRTUALCHEST_TAG, 10));
        super.openInventory(player);
    }

    @Override
    public void closeInventory(PlayerEntity player)
    {
        getPersistedTag(owner, true).put(VIRTUALCHEST_TAG, saveInventoryToNBT());
        super.closeInventory(player);
    }

    @Override
    public void markDirty()
    {
        super.markDirty();
        getPersistedTag(owner, true).put(VIRTUALCHEST_TAG, saveInventoryToNBT());
    }

    public void loadInventoryFromNBT(ListNBT tag)
    {    	
        for (int slotIndex = 0; slotIndex < getSizeInventory(); ++slotIndex)
            setInventorySlotContents(slotIndex, (ItemStack) null);
        for (int tagIndex = 0; tagIndex < tag.size(); ++tagIndex)
        {
        	CompoundNBT tagSlot = tag.getCompound(tagIndex);
            int var4 = tagSlot.getByte("Slot") & 255;
            
            if (var4 >= 0 && var4 < getSizeInventory())
            {
            	
            	setInventorySlotContents(var4, null);
            }               
        }
    }

	public ListNBT saveInventoryToNBT()
    {
    	ListNBT var1 = new ListNBT();

        for (int var2 = 0; var2 < getSizeInventory(); ++var2)
        {
            ItemStack var3 = getStackInSlot(var2);

            if (var3 != null)
            {
            	CompoundNBT var4 = new CompoundNBT();
                var4.putByte("Slot", (byte) var2);
                var3.write(var4);
                var1.add(var4);
            }
        }

        return var1;
    }

    public static CompoundNBT getPersistedTag(ServerPlayerEntity player, boolean createIfMissing)
    {
    	CompoundNBT tag = player.getPersistentData();
        if (createIfMissing)
            player.getPersistentData().put(PlayerEntity.PERSISTED_NBT_TAG, tag);
        return tag;
    }
    
}