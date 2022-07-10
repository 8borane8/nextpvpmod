package fr.nextmod.nextpvp.items;

import fr.nextmod.nextpvp.entitys.EntitySicknessPotion;
import fr.nextmod.nextpvp.entitys.EntityWebPotion;
import fr.nextmod.nextpvp.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Potion extends Item {

    public Potion() {
        setMaxStackSize(1);
        setHasSubtypes(true);
    }

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        --stack.stackSize;
        if(!world.isRemote)
            if(this == Items.sickness_potion)
                world.spawnEntityInWorld(new EntitySicknessPotion(world, player));
            else if(this == Items.web_potion)
                world.spawnEntityInWorld(new EntityWebPotion(world, player));
        return stack;
    }

    public int getMetadata(int metadata) {
        return metadata;
    }
}
