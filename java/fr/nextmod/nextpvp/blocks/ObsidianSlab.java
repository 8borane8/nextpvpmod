package fr.nextmod.nextpvp.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.nextmod.nextpvp.Main;
import fr.nextmod.nextpvp.init.Blocks;
import fr.nextmod.nextpvp.utils.References;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;

public class ObsidianSlab extends BlockSlab {
    public static final String[] StepTypes = new String[]{"obsidianSlab"};

    public ObsidianSlab(Material material) {
        super(false, material);
        setHardness(50F);
        setBlockName("obsidian_slab");
        setBlockTextureName(References.MOD_ID + ":" + "obsidian_slab");
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(Main.tab);
        setResistance(100.0F);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
    }

    @SideOnly(Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_) {
        return Item.getItemFromBlock(Blocks.obsidian_slab);
    }

    @Override
    public Item getItemDropped(int metadata, Random rand, int fortune) {
        return Item.getItemFromBlock(Blocks.obsidian_slab);
    }

    @Override
    protected ItemStack createStackedBlock(int metadata) {
        return new ItemStack(Blocks.obsidian_slab, 2, metadata & 7);
    }

    @Override
    public String func_150002_b(int metadata) {
        if(metadata < 0 || metadata >= StepTypes.length) {
            metadata = 0;
        }
        return super.getUnlocalizedName() + "." + StepTypes[metadata];
    }

    @SideOnly(Side.CLIENT)
    private static boolean func_150003_a(Block block) {
        return block == Blocks.obsidian_slab;
    }
}
