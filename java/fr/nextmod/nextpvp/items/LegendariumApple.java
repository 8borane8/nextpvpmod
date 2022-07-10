package fr.nextmod.nextpvp.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class LegendariumApple extends ItemFood {
    public LegendariumApple() {
        super(20, 0F, false);
        setAlwaysEdible();
        setMaxStackSize(16);
    }

    @Override
    public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer player) {

        player.setAbsorptionAmount(10F);
        player.addPotionEffect(new PotionEffect(10, 80, 1, true));

        return super.onEaten(itemStack, world, player);
    }
}
