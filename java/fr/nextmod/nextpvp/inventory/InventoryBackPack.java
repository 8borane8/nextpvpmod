package fr.nextmod.nextpvp.inventory;

import fr.nextmod.nextpvp.items.Backpack;
import fr.nextmod.nextpvp.utils.References;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.util.Constants;

public class InventoryBackPack implements IInventory {
    public ItemStack[] content;
    public int size;

    public InventoryBackPack(ItemStack container, int size) {
        this.size = size;
        this.content = new ItemStack[size];
        if(!container.hasTagCompound()) container.setTagCompound(new NBTTagCompound());
        this.readFromNBT(container.getTagCompound());
    }

    /**
     * This methods reads the content of the NBTTagCompound inside the container
     *
     * @param comp the container NBTTagCompound
     */
    public void readFromNBT(NBTTagCompound comp) {
        NBTTagList nbtlist = comp.getTagList("Inventory", Constants.NBT.TAG_COMPOUND);
        for(int i = 0; i < nbtlist.tagCount(); i++) {
            NBTTagCompound comp1 = nbtlist.getCompoundTagAt(i);
            int slot = comp1.getInteger("Slot");
            this.content[slot] = ItemStack.loadItemStackFromNBT(comp1);
        }
    }

    /**
     * This methods saves the content inside the container
     *
     * @param comp the NBTTagCompound to write in
     */
    public void writeToNBT(NBTTagCompound comp) {
        NBTTagList nbtlist = new NBTTagList();

        for(int i = 0; i < this.size; i++) {
            if(this.content[i] != null) {
                NBTTagCompound comp1 = new NBTTagCompound();
                comp1.setInteger("Slot", i);
                this.content[i].writeToNBT(comp1);
                nbtlist.appendTag(comp1);
            }
        }
        comp.setTag("Inventory", nbtlist);
    }

    @Override
    public int getSizeInventory() {
        return this.size;
    }

    @Override
    public ItemStack getStackInSlot(int index) {
        return this.content[index];
    }

    @Override
    public ItemStack decrStackSize(int index, int amount) {
        ItemStack stack = getStackInSlot(index);
        if(stack != null) {
            if(stack.stackSize > amount) {
                stack = stack.splitStack(amount);
                if(stack.stackSize == 0) this.content[index] = null;
            } else {
                this.content[index] = null;
            }
        }
        return stack;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int index) {
        ItemStack stack = getStackInSlot(index);
        if(stack != null) this.content[index] = null;
        return stack;
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        this.content[index] = stack;
    }

    @Override
    public String getInventoryName() {
        return References.MOD_ID + ".container.backpack";
    }

    @Override
    public boolean hasCustomInventoryName() {
        return false;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public void markDirty() {
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return true;
    }

    @Override
    public void openInventory() {
    }

    @Override
    public void closeInventory() {
    }

    /**
     * Prevents backpack-ception
     */
    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return !(stack.getItem() instanceof Backpack);
    }

}
