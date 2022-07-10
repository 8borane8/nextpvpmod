package fr.nextmod.nextpvp.blocks;

import fr.nextmod.nextpvp.utils.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class LegendariumMachine extends Block {

    private IIcon top;

    public LegendariumMachine(Material m) {
        super(m);
    }

    public void registerBlockIcons(IIconRegister iiconRegister) {
        this.blockIcon = iiconRegister.registerIcon(References.MOD_ID + ":legendarium_machine");
        this.top = iiconRegister.registerIcon(References.MOD_ID + ":legendarium_machine_top");

    }

    public IIcon getIcon(int side, int metadata) {
        if(side == 1)
            return this.top;

        return this.blockIcon;
    }
}
