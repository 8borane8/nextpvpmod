package fr.nextmod.nextpvp.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Ring extends Item {

    @Override
    public void onUpdate(ItemStack itemStack, World world, Entity entity, int p_77663_4_, boolean p_77663_5_) {
        if(entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entity;
            for(int i = 0; i < 4; i++) {
                ItemStack armor = player.getCurrentArmor(i);
                if(armor != null && armor.getItemDamage() > 0 && itemStack.getItemDamage() < itemStack.getMaxDamage()) {
                    itemStack.setItemDamage(itemStack.getItemDamage() + 1);
                    armor.setItemDamage(armor.getItemDamage() - 1);
                }
            }
        }
    }
}
