package fr.nextmod.nextpvp.blocks;

import fr.nextmod.nextpvp.init.Blocks;
import fr.nextmod.nextpvp.init.Items;
import fr.nextmod.nextpvp.utils.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.Random;

public class MysteryBox extends Block {

    private IIcon top, bottom;

    public MysteryBox(Material m) {
        super(m);
    }

    @Override
    public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int metadata) {
        super.onBlockDestroyedByPlayer(world, x, y, z, metadata);
    }

    public Item getItemDropped(int metadata, Random random, int fortune) {
        Item[] drops = new Item[2];
        if(this == Blocks.amethyst_mystery_box) {
            drops[0] = Items.amethyst_boots;
            drops[1] = Items.amethyst_shovel;
        } else if(this == Blocks.titane_mystery_box) {
            drops[0] = Items.titane_axe;
            drops[1] = Items.titane_stick;
        } else if(this == Blocks.legendarium_mystery_box) {
            drops[0] = Items.legendarium_sword;
            drops[1] = Items.legendarium_chestplate;
        } else if(this == Blocks.ultimate_mystery_box) {
            drops[0] = Items.ultimate_leggings;
            drops[1] = Items.ultimate_sword;
        }
        return drops[random.nextInt(drops.length)];
    }

    public void registerBlockIcons(IIconRegister iiconRegister) {
        if(this == Blocks.amethyst_mystery_box) {
            this.blockIcon = iiconRegister.registerIcon(References.MOD_ID + ":amethyst_mystery_box");
            this.top = iiconRegister.registerIcon(References.MOD_ID + ":amethyst_mystery_box_top");
            this.bottom = iiconRegister.registerIcon(References.MOD_ID + ":amethyst_mystery_box_bottom");
        } else if(this == Blocks.titane_mystery_box) {
            this.blockIcon = iiconRegister.registerIcon(References.MOD_ID + ":titane_mystery_box");
            this.top = iiconRegister.registerIcon(References.MOD_ID + ":titane_mystery_box_top");
            this.bottom = iiconRegister.registerIcon(References.MOD_ID + ":titane_mystery_box_bottom");
        } else if(this == Blocks.legendarium_mystery_box) {
            this.blockIcon = iiconRegister.registerIcon(References.MOD_ID + ":legendarium_mystery_box");
            this.top = iiconRegister.registerIcon(References.MOD_ID + ":legendarium_mystery_box_top");
            this.bottom = iiconRegister.registerIcon(References.MOD_ID + ":legendarium_mystery_box_bottom");
        } else if(this == Blocks.ultimate_mystery_box) {
            this.blockIcon = iiconRegister.registerIcon(References.MOD_ID + ":ultimate_mystery_box");
            this.top = iiconRegister.registerIcon(References.MOD_ID + ":ultimate_mystery_box_top");
            this.bottom = iiconRegister.registerIcon(References.MOD_ID + ":ultimate_mystery_box_bottom");
        }
    }

    public IIcon getIcon(int side, int metadata) {
        if(side == 0)
            return this.bottom;
        else if(side == 1)
            return this.top;

        return this.blockIcon;
    }
}
