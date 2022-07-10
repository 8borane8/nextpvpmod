package fr.nextmod.nextpvp.items;

import fr.nextmod.nextpvp.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Backpack extends Item {
    public Backpack() {
        setMaxStackSize(1);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        player.openGui(Main.instance, 0, world, (int) player.posX, (int) player.posY, (int) player.posZ);
        return stack;
    }
}
