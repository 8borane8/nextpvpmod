package fr.nextmod.nextpvp.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.nextmod.nextpvp.init.Blocks;
import fr.nextmod.nextpvp.init.Items;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class FastOrBroadsword extends Item {
    float damageBase;

    public FastOrBroadsword(float damages, int max) {
        setMaxStackSize(1);
        setMaxDamage(max);
        this.damageBase = damages;
    }

    public boolean hitEntity(ItemStack stack, EntityLivingBase base, EntityLivingBase base2) {
        base.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer) base2), this.damageBase);
        stack.damageItem(1, base2);
        return true;
    }

    public float getDamageSrc(ItemStack stack) {
        return this.damageBase;
    }

    public boolean onBlockDestroyed(ItemStack p_150894_1_, World p_150894_2_, Block p_150894_3_, int p_150894_4_, int p_150894_5_, int p_150894_6_, EntityLivingBase p_150894_7_) {
        if(p_150894_3_.getBlockHardness(p_150894_2_, p_150894_4_, p_150894_5_, p_150894_6_) != 0.0D)
            p_150894_1_.damageItem(2, p_150894_7_);
        return true;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }

    public EnumAction getItemUseAction(ItemStack p_77661_1_) {
        return EnumAction.block;
    }

    public int getMaxItemUseDuration(ItemStack p_77626_1_) {
        return 72000;
    }

    public void onUpdate(ItemStack stack, World world, Entity entity, int p_77663_4_, boolean p_77663_5_) {
        EntityPlayer player;
        if(entity instanceof EntityPlayer && (player = (EntityPlayer) entity).getHeldItem() != null) {
            if(player.getHeldItem().getItem() == Items.amethyst_broadsword || player.getHeldItem().getItem() == Items.titane_broadsword || player.getHeldItem().getItem() == Items.legendarium_broadsword)
                ((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.digSlowdown.getId(), 1, 4));
            if(player.getHeldItem().getItem() == Items.amethyst_fastsword || player.getHeldItem().getItem() == Items.titane_fastsword || player.getHeldItem().getItem() == Items.legendarium_fastsword)
                ((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 1, 4));
        }
        super.onUpdate(stack, world, entity, p_77663_4_, p_77663_5_);
    }

    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_) {
        p_77659_3_.setItemInUse(p_77659_1_, getMaxItemUseDuration(p_77659_1_));
        return p_77659_1_;
    }

    public boolean func_150897_b(Block p_150897_1_) {
        return (p_150897_1_ == Blocks.web);
    }
}