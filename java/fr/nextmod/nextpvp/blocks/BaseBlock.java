package fr.nextmod.nextpvp.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BaseBlock extends Block {

    public BaseBlock(Material m) {
        super(m);
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }
}
