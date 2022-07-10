package fr.nextmod.nextpvp.fluids;

import fr.nextmod.nextpvp.utils.References;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class AngelicWater extends BlockFluidClassic {

    private IIcon still;
    private IIcon flowing;

    public AngelicWater(Fluid fluid, Material material) {
        super(fluid, material);
    }

    public boolean canDisplace(IBlockAccess world, int x, int y, int z) {
        if(world.getBlock(x, y, z).getMaterial().isLiquid()) {
            return false;
        }
        return super.canDisplace(world, x, y, z);
    }

    public boolean displaceIfPossible(World world, int x, int y, int z) {
        if(world.getBlock(x, y, z).getMaterial().isLiquid()) {
            return false;
        }
        return super.displaceIfPossible(world, x, y, z);
    }

    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
        if(((entity instanceof EntityLivingBase)) && (!world.isRemote)) {
            ((EntityLivingBase) entity).addPotionEffect(new PotionEffect(6, 60, 0));
        }
    }

    @Override
    public void registerBlockIcons(IIconRegister p_149651_1_) {
        super.registerBlockIcons(p_149651_1_);
        still = p_149651_1_.registerIcon(References.MOD_ID + ":angelic_water_still");
        flowing = p_149651_1_.registerIcon(References.MOD_ID + ":angelic_water_flowing");
    }

    public IIcon getIcon(int side, int meta) {
        return (side == 0 || side == 1) ? this.still : this.flowing;
    }
}