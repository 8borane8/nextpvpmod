package fr.nextmod.nextpvp.items;

import fr.nextmod.nextpvp.init.Items;
import fr.nextmod.nextpvp.utils.References;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;

public class Travel extends ItemArmor {
    public Travel(ArmorMaterial am, int id, int metadata) {
        super(am, id, metadata);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if(slot == 0) {
            if(this == Items.slimy_helmet) {
                return References.MOD_ID + ":textures/models/travel_slimy.png";
            } else if(this == Items.scuba_helmet) {
                return References.MOD_ID + ":textures/models/travel_scuba.png";
            } else if(this == Items.hood_helmet) {
                return References.MOD_ID + ":textures/models/travel_hood.png";
            }
        } else if(slot == 1) {
            return References.MOD_ID + ":textures/models/travel_layer_1.png";
        }

        return References.MOD_ID + ":textures/models/travel_layer_2.png";
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        super.onArmorTick(world, player, itemStack);

        if(this == Items.slimy_helmet) {
            player.fallDistance = 0F;
            if(world.getBlock((int) player.posX - 1, (int) player.posY + 1, (int) player.posZ - 1).getMaterial().isSolid() && Keyboard.isKeyDown((Minecraft.getMinecraft()).gameSettings.keyBindJump.getKeyCode())) {
                player.motionY = 0.1D;
            }
        } else if(this == Items.scuba_helmet) {
            player.setAir(300);
        } else if(this == Items.hood_helmet) {
            // REPARER
        } else if(this == Items.travel_chestplate) {
            player.addPotionEffect(new PotionEffect(8, 60, 2));
        } else if(this == Items.travel_leggings) {
            player.addPotionEffect(new PotionEffect(1, 60, 2));
        } else if(this == Items.travel_boots) {
            player.stepHeight = 1F;
        }
    }
}
