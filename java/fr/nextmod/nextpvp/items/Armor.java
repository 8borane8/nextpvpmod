package fr.nextmod.nextpvp.items;

import fr.nextmod.nextpvp.init.Items;
import fr.nextmod.nextpvp.utils.References;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Armor extends ItemArmor {

    public Armor(ArmorMaterial am, int id, int metadata, String tp) {
        super(am, id, metadata);
    }

    public String getArmorTexture(ItemStack itemStack, Entity entity, int slot, String type) {
        if(slot == 2) {
            if(itemStack.getItem() == Items.ultimate_leggings) {
                return References.MOD_ID + ":textures/models/ultimate_layer_2.png";
            } else if(itemStack.getItem() == Items.legendarium_leggings) {
                return References.MOD_ID + ":textures/models/legendarium_layer_2.png";
            } else if(itemStack.getItem() == Items.titane_leggings) {
                return References.MOD_ID + ":textures/models/titane_layer_2.png";
            } else if(itemStack.getItem() == Items.amethyst_leggings) {
                return References.MOD_ID + ":textures/models/amethyst_layer_2.png";
            }
        }
        if(itemStack.getItem() == Items.ultimate_helmet) {
            return References.MOD_ID + ":textures/models/ultimate_layer_1.png";
        } else if(itemStack.getItem() == Items.legendarium_helmet) {
            return References.MOD_ID + ":textures/models/legendarium_layer_1.png";
        } else if(itemStack.getItem() == Items.titane_helmet) {
            return References.MOD_ID + ":textures/models/titane_layer_1.png";
        } else if(itemStack.getItem() == Items.amethyst_helmet) {
            return References.MOD_ID + ":textures/models/amethyst_layer_1.png";
        }

        if(itemStack.getItem() == Items.ultimate_chestplate) {
            return References.MOD_ID + ":textures/models/ultimate_layer_1.png";
        } else if(itemStack.getItem() == Items.legendarium_chestplate) {
            return References.MOD_ID + ":textures/models/legendarium_layer_1.png";
        } else if(itemStack.getItem() == Items.titane_chestplate) {
            return References.MOD_ID + ":textures/models/titane_layer_1.png";
        } else if(itemStack.getItem() == Items.amethyst_chestplate) {
            return References.MOD_ID + ":textures/models/amethyst_layer_1.png";
        }

        if(itemStack.getItem() == Items.ultimate_boots) {
            return References.MOD_ID + ":textures/models/ultimate_layer_1.png";
        } else if(itemStack.getItem() == Items.legendarium_boots) {
            return References.MOD_ID + ":textures/models/legendarium_layer_1.png";
        } else if(itemStack.getItem() == Items.titane_boots) {
            return References.MOD_ID + ":textures/models/titane_layer_1.png";
        } else if(itemStack.getItem() == Items.amethyst_boots) {
            return References.MOD_ID + ":textures/models/amethyst_layer_1.png";
        }

        return null;
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        super.onArmorTick(world, player, itemStack);

        if(itemStack.getItem() == Items.legendarium_helmet) {
            player.addPotionEffect(new PotionEffect(16, 20 * 10, 1, true));
        } else if(itemStack.getItem() == Items.legendarium_boots) {
            player.addPotionEffect(new PotionEffect(1, 20 * 10, 0, true));
        } else if(itemStack.getItem() == Items.ultimate_chestplate) {
            player.addPotionEffect(new PotionEffect(5, 20 * 10, 0, true));
        } else if(itemStack.getItem() == Items.ultimate_leggings) {
            player.addPotionEffect(new PotionEffect(3, 20 * 10, 0, true));
        } else if(itemStack.getItem() == Items.ultimate_boots) {
            player.addPotionEffect(new PotionEffect(1, 20 * 10, 1, true));
        } else if(itemStack.getItem() == Items.ultimate_helmet) {
            player.addPotionEffect(new PotionEffect(16, 20 * 10, 1, true));
        }

        if(player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == Items.ultimate_boots &&
                player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == Items.ultimate_leggings &&
                player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == Items.ultimate_chestplate &&
                player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == Items.ultimate_helmet) {
            player.addPotionEffect(new PotionEffect(14, 20, 1, true));
        }
    }
}
