package fr.nextmod.nextpvp.inventory.container;

import fr.nextmod.nextpvp.inventory.InventoryBackPack;
import fr.nextmod.nextpvp.inventory.slot.SlotBackPack;
import fr.nextmod.nextpvp.items.Backpack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/**
 * @author SCAREX
 * @ChestContainer InventoryTweaks API implementation
 * <br />
 * isLargeChest indicates whether the buttons should be placed at the top of the gui or on the right.
 */
//@ChestContainer(isLargeChest = false)
public class ContainerBackPack extends Container {
    public InventoryBackPack invBackpack;
    public int rows;

    public ContainerBackPack(InventoryPlayer playerInv, InventoryBackPack inv) {
        this.invBackpack = inv;
        this.rows = inv.getSizeInventory() / 9;
        int i = (this.rows - 4) * 18;
        int j;
        int k;

        // Adding slots to the backpack
        for(j = 0; j < this.rows; ++j) {
            for(k = 0; k < 9; ++k) {
                this.addSlotToContainer(new SlotBackPack(inv, k + j * 9, 8 + k * 18, 18 + j * 18));
            }
        }

        // Adding player's slots
        for(j = 0; j < 3; ++j) {
            for(k = 0; k < 9; ++k) {
                this.addSlotToContainer(new Slot(playerInv, k + j * 9 + 9, 8 + k * 18, 103 + j * 18 + i));
            }
        }

        for(j = 0; j < 9; ++j) {
            this.addSlotToContainer(new Slot(playerInv, j, 8 + j * 18, 161 + i));
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }

    public void writeToNBT(ItemStack stack) {
        if(!stack.hasTagCompound()) stack.setTagCompound(new NBTTagCompound());
        invBackpack.writeToNBT(stack.getTagCompound());
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int index) {
        ItemStack itemstack = null;
        Slot slot = (Slot) this.inventorySlots.get(index);

        if(slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            // Prevents backpack-ception (backpack inside backpack) with
            // shift-click
            if(itemstack.getItem() instanceof Backpack) return null;

            if(index < this.invBackpack.getSizeInventory()) {
                if(!this.mergeItemStack(itemstack1, this.invBackpack.getSizeInventory(), this.inventorySlots.size(), true))
                    return null;
            } else if(!this.mergeItemStack(itemstack1, 0, this.invBackpack.getSizeInventory(), false)) {
                return null;
            }

            if(itemstack1.stackSize == 0)
                slot.putStack((ItemStack) null);
            else
                slot.onSlotChanged();
        }

        return itemstack;
    }

    /**
     * @param buttonPressed left click, right click, wheel click, etc.
     * @param flag          category (e.g.: hotbar keys)
     */
    @Override
    public ItemStack slotClick(int slotIndex, int buttonPressed, int flag, EntityPlayer player) {
        // Prevents from removing current backpack
        if(flag == 2 && buttonPressed == player.inventory.currentItem) return null;
        if(slotIndex - this.invBackpack.getSizeInventory() - 27 == player.inventory.currentItem) return null;
        return super.slotClick(slotIndex, buttonPressed, flag, player);
    }

    /**
     * Used to save content
     */
    @Override
    public void onContainerClosed(EntityPlayer player) {
        this.writeToNBT(player.getHeldItem());
        super.onContainerClosed(player);
    }
}
