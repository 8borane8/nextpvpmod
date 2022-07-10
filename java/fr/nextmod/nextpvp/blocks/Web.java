package fr.nextmod.nextpvp.blocks;

import fr.nextmod.nextpvp.utils.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.Random;

public class Web extends Block {
    IIcon icon1;

    IIcon icon2;

    IIcon icon3;

    IIcon icon4;

    public Web() {
        super(Material.web);
        setHarvestLevel("sword", 1);
        setResistance(4.0F);
        setHardness(4.0F);
        setTickRandomly(true);
    }

    public void onEntityCollidedWithBlock(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity p_149670_5_) {
        p_149670_5_.setInWeb();
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public void registerBlockIcons(IIconRegister icon) {
        this.icon1 = icon.registerIcon(References.MOD_ID + ":web_1");
        this.icon2 = icon.registerIcon(References.MOD_ID + ":web_2");
        this.icon3 = icon.registerIcon(References.MOD_ID + ":web_3");
        this.icon4 = icon.registerIcon(References.MOD_ID + ":web_4");
    }

    public IIcon getIcon(int side, int meta) {
        switch(meta) {
            case 0:
                return this.icon1;
            case 1:
                return this.icon2;
            case 2:
                return this.icon3;
            case 3:
                return this.icon4;
        }
        return this.icon1;
    }

    public void updateTick(World world, int x, int y, int z, Random random1) {
        if(world.isRemote)
            return;
        int meta = world.getBlockMetadata(x, y, z);
        if(meta < 4) {
            world.setBlock(x, y, z, this, meta + 1, 3);
        } else {
            world.setBlockToAir(x, y, z);
        }
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
        return null;
    }

    public int getRenderType() {
        return 1;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return Items.string;
    }

    protected boolean canSilkHarvest() {
        return false;
    }
}