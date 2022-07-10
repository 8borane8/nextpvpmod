package fr.nextmod.nextpvp.proxy;

import cpw.mods.fml.common.network.IGuiHandler;
import fr.nextmod.nextpvp.guis.GuiBackPack;
import fr.nextmod.nextpvp.inventory.InventoryBackPack;
import fr.nextmod.nextpvp.inventory.container.ContainerBackPack;
import fr.nextmod.nextpvp.items.Backpack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class CommonProxy implements IGuiHandler {

    public void registerRenders() {

    }

    public void registerOverlay() {

    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch(ID) {
            case 0:
                // The last parameter must be a multiple of 9 (e.g: 9, 18, 27, 54)
                // Condition to check if the player has the right item in hand
                if(player.getHeldItem() == null || !(player.getHeldItem().getItem() instanceof Backpack)) return null;
                return new ContainerBackPack(player.inventory, new InventoryBackPack(player.getHeldItem(), 54));
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch(ID) {
            case 0:
                // The last parameter must be a multiple of 9 (e.g: 9, 18, 27, 54)
                // Condition to check if the player has the right item in hand
                if(player.getHeldItem() == null || !(player.getHeldItem().getItem() instanceof Backpack)) return null;
                return new GuiBackPack(player.inventory, new InventoryBackPack(player.getHeldItem(), 54));
        }
        return null;
    }
}
