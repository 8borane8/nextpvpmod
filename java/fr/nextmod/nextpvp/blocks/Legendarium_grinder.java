package fr.nextmod.nextpvp.blocks;

import fr.nextmod.nextpvp.utils.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class Legendarium_grinder extends Block {

    private IIcon front;

    public Legendarium_grinder(Material m) {
        super(m);
    }

    public void registerBlockIcons(IIconRegister iiconRegister) {
        this.blockIcon = iiconRegister.registerIcon(References.MOD_ID + ":legendarium_grinder");
        this.front = iiconRegister.registerIcon(References.MOD_ID + ":legendarium_grinder_front");
    }

    public IIcon getIcon(int side, int metadata) {
        if(metadata == 0 && side == 3)
            return this.front;
        return (side != metadata) ? this.blockIcon : this.front;
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
        super.onBlockPlacedBy(world, x, y, z, entity, itemStack);
        byte b0 = 4;
        b0 = rotateBlock(b0, entity);
        world.setBlockMetadataWithNotify(x, y, z, b0, 2);
    }

    public byte rotateBlock(byte b0, EntityLivingBase entity) {
        if((entity.rotationYaw >= 135.0F && entity.rotationYaw <= 181.0F) || (entity.rotationYaw <= -135.0F && entity.rotationYaw >= -181.0F)) {
            b0 = 3;
        } else if(entity.rotationYaw > -135.0F && entity.rotationYaw < -45.0F) {
            b0 = 4;
        } else if(entity.rotationYaw >= -45.0F && entity.rotationYaw <= 45.0F) {
            b0 = 2;
        } else if(entity.rotationYaw > 45.0F && entity.rotationYaw < 135.0F) {
            b0 = 5;
        } else if(entity.rotationYaw >= 181.0F) {
            entity.rotationYaw -= 360.0F;
            b0 = rotateBlock(b0, entity);
        } else if(entity.rotationYaw <= -181.0F) {
            entity.rotationYaw += 360.0F;
            b0 = rotateBlock(b0, entity);
        }
        return b0;
    }
}
