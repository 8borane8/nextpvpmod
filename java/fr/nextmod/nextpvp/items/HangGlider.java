package fr.nextmod.nextpvp.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class HangGlider extends Item {

    public HangGlider() {
        this.setMaxStackSize(1);
    }

    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        NBTTagCompound tag = player.getEntityData();
        if(tag.getBoolean("HangGlider")) {
            tag.setBoolean("HangGlider", false);
        } else {
            tag.setBoolean("HangGlider", true);
        }
        return itemStack;
    }

    @Override
    public void onUpdate(ItemStack itemStack, World world, Entity player, int p_77663_4_, boolean p_77663_5_) {
        NBTTagCompound tag = player.getEntityData();

        if(player.isCollidedVertically) {
            tag.setBoolean("HangGlider", false);
        }

        if(!p_77663_5_) {
            return;
        }

        if(tag.getBoolean("HangGlider")) {
            double horizontalSpeed = 0D;
            double verticalSpeed = 0D;

            if(player.isSneaking()) {
                horizontalSpeed = 0.1D;
                verticalSpeed = 0.7D;
            } else {
                horizontalSpeed = 0.03D;
                verticalSpeed = 0.4D;
            }

            player.motionY *= verticalSpeed;
            double x = Math.cos(Math.toRadians((player.getRotationYawHead() + 90.0F))) * horizontalSpeed;
            double z = Math.sin(Math.toRadians((player.getRotationYawHead() + 90.0F))) * horizontalSpeed;
            player.motionX += x;
            player.motionZ += z;
            player.fallDistance = 0.0F;
        }
    }
}
