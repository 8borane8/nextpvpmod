package fr.nextmod.nextpvp.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class SlimePad extends Block {

    public SlimePad() {
        super(Material.glass);
        setBlockBounds(0.125F, 0.0625F, 0.125F, 0.875F, 0.625F, 0.875F);
        setResistance(8.0F);
        setHarvestLevel("pickaxe", 2);
        setHardness(12.0F);
    }

    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
        if(!world.isBlockIndirectlyGettingPowered(x, y, z)) {
            double moveX = 0.0D;
            double moveZ = 0.0D;
            double speed = 1D;
            int meta = world.getBlockMetadata(x, y, z);
            switch(meta % 8) {
                case 6:
                    moveX += speed;
                    break;
                case 7:
                    moveX += speed;
                    moveZ += speed;
                    break;
                case 0:
                    moveZ += speed;
                    break;
                case 1:
                    moveZ += speed;
                    moveX -= speed;
                    break;
                case 2:
                    moveX -= speed;
                    break;
                case 3:
                    moveX -= speed;
                    moveZ -= speed;
                    break;
                case 4:
                    moveZ -= speed;
                    break;
                case 5:
                    moveZ -= speed;
                    moveX += speed;
                    break;
            }
            if(entity instanceof net.minecraft.entity.item.EntityItem)
                entity.posY++;
            entity.fallDistance = 0.0F;
            entity.addVelocity(moveX * 1.25D, 0.5D, moveZ * 1.25D);
        }
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack) {
        int face = MathHelper.floor_double((entity.rotationYaw * 8.0F / 360.0F) + 0.5D) + (entity.isSneaking() ? 4 : 0) & 0x7;
        int meta = world.getBlockMetadata(x, y, z) & 0x8;
        world.setBlockMetadataWithNotify(x, y, z, face | meta, 2);
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean isOpaqueCube() {
        return false;
    }
}
