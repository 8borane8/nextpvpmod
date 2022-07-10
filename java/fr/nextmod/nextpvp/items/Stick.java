package fr.nextmod.nextpvp.items;

import fr.nextmod.nextpvp.init.Items;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class Stick extends Item {

    int cooldown;

    public Stick(int c) {
        setMaxStackSize(1);
        setMaxDamage(10);
        cooldown = c;
    }

    public boolean isFull3D() {
        return true;
    }

    public void onUpdate(ItemStack item, World world, Entity player, int slotIndex, boolean inHand) {
        if(item.hasTagCompound()) {
            if(item.stackTagCompound.getInteger("timer") > 0)
                item.stackTagCompound.setInteger("timer", item.stackTagCompound.getInteger("timer") + 1);
            if(item.stackTagCompound.getInteger("timer") >= this.cooldown * 20)
                item.stackTagCompound.setInteger("timer", 0);
        }
        super.onUpdate(item, world, player, slotIndex, inHand);
    }

    public boolean hasEffect(ItemStack item, int pass) {
        if(item.hasTagCompound())
            return (item.stackTagCompound.getInteger("timer") == 0);
        return true;
    }

    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
        if(!item.hasTagCompound()) {
            item.setTagCompound(new NBTTagCompound());
            item.stackTagCompound.setInteger("timer", 0);
        }
        if(item.stackTagCompound.getInteger("timer") == 0) {
            item.damageItem(1, (EntityLivingBase) player);
            getTypeEffect(player);
            item.stackTagCompound.setInteger("timer", 1);
        } else if(world.isRemote) {
            player.addChatComponentMessage((IChatComponent) new ChatComponentTranslation(EnumChatFormatting.RED + "Tu dois attendre que le baton se recharge !", new Object[0]));
        }
        return item;
    }

    public void getTypeEffect(EntityPlayer player) {
        if(this == Items.dopant_stick) {
            player.heal(6.0F);
        } else if(this == Items.flash_stick) {
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 25, 9));
        } else if(this == Items.power_stick) {
            player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 60, 2));
        } else if(this == Items.super_stick) {
            player.heal(20.0F);
            player.setAbsorptionAmount(6.0F);
            player.addPotionEffect(new PotionEffect(Potion.field_76443_y.getId(), 30, 1));
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 50, 11));
            player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 80, 2));
            player.addPotionEffect(new PotionEffect(Potion.heal.getId(), 60, 1));
        } else if(this == Items.damage_stick) {
            player.worldObj.spawnEntityInWorld(new EntityPotion(player.worldObj, (EntityLivingBase) player, 12));
        } else if(this == Items.jump_stick) {
            player.motionY += 1D;
        } else if(this == Items.hyper_jump_stick) {
            player.motionY += 2.5D;
        }
    }
}
