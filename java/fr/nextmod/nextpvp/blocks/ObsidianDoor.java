package fr.nextmod.nextpvp.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.nextmod.nextpvp.init.Items;
import fr.nextmod.nextpvp.utils.References;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import java.util.Random;

public class ObsidianDoor extends BlockDoor {
    public ObsidianDoor(Material p_i45402_1_) {
        super(p_i45402_1_);
        setHardness(50F);
        setBlockName("obsidian_door");
        setBlockTextureName(References.MOD_ID + ":" + "obsidian_door");
        setHarvestLevel("pickaxe", 2);
        setResistance(100.0F);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_) {
        return Items.obsidian_door_item;
    }

    @Override
    public Item getItemDropped(int metadata, Random rand, int fortune) {
        return Items.obsidian_door_item;
    }
}
