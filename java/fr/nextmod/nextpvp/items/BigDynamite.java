package fr.nextmod.nextpvp.items;

import fr.nextmod.nextpvp.entitys.EntityBigDynamite;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BigDynamite extends Item {

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        --stack.stackSize;
        world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        if(!world.isRemote) {
            world.spawnEntityInWorld(new EntityBigDynamite(world, player));
        }
        return stack;
    }

}
