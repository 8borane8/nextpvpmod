package fr.nextmod.nextpvp.blocks;

import fr.nextmod.nextpvp.utils.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class InvisibleBlock extends Block {

    public InvisibleBlock(Material m) {
        super(m);
        setLightOpacity(0);
        setBlockUnbreakable();
        setHardness(100F);
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public String getItemIconName() {
        return References.MOD_ID + ":invisible_block_crea";
    }

    public boolean renderAsNormalBlock() {
        return false;
    }
}
