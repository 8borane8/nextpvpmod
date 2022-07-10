package fr.nextmod.nextpvp.items;

import fr.nextmod.nextpvp.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PotionLauncher extends Item {

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {

        for(int x = 0; x <= 35; x++) {
            if(player.inventory.mainInventory[x] != null && ((player.inventory.mainInventory[x].getItem() instanceof ItemPotion && ItemPotion.isSplash(player.inventory.mainInventory[x].getItemDamage()) || player.inventory.mainInventory[x].getItem() == Items.sickness_potion))) {
                player.inventory.mainInventory[x].useItemRightClick(world, player);
                player.inventory.mainInventory[x] = null;

                break;
            }
        }

        return super.onItemRightClick(itemStack, world, player);
    }
}
