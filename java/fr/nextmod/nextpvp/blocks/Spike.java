package fr.nextmod.nextpvp.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.nextmod.nextpvp.Main;
import fr.nextmod.nextpvp.utils.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Facing;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class Spike extends Block {
    String texture1;
    float damage;
    IIcon icon;

    public Spike(Material m, String name, String texture, String texture1, float damage, boolean isResistant) {
        super(m);

        setResistance(8.0F);
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(Main.tab);
        setBlockName(name);
        setHardness(12.0F);
        setBlockTextureName(References.MOD_ID + ":" + texture);
        if(isResistant) {
            setResistance(100.0F);
        } else {
            setResistance(1.0F);
        }
        this.texture1 = texture1;
        this.damage = damage;
    }

    public int getRenderType() {
        return 43;
    }

    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity target) {
        if(world.isRemote || !(world instanceof net.minecraft.world.WorldServer))
            return;
        target.attackEntityFrom(DamageSource.cactus, this.damage);
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public void registerBlockIcons(IIconRegister icons) {
        super.registerBlockIcons(icons);
        this.icon = icons.registerIcon(References.MOD_ID + ":" + this.texture1);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2) {
        int side = par2 % 6;
        if(par1 == Facing.oppositeSide[side])
            return this.blockIcon;
        return this.icon;
    }

    public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9) {
        int meta = par5 % 6;
        int flag = 0;
        ForgeDirection side = ForgeDirection.getOrientation(meta);
        if(!par1World.isSideSolid(par2 - side.offsetX, par3 - side.offsetY, par4 - side.offsetZ, side.getOpposite()))
            for(ForgeDirection dir : ForgeDirection.VALID_DIRECTIONS) {
                if(side != dir) {
                    if(par1World.isSideSolid(par2 - dir.offsetX, par3 - dir.offsetY, par4 - dir.offsetZ, dir.getOpposite()))
                        return flag + dir.ordinal();
                    if(par1World.getBlock(par2 - dir.offsetX, par3 - dir.offsetY, par4 - dir.offsetZ) == this)
                        par5 = par1World.getBlockMetadata(par2 - dir.offsetX, par3 - dir.offsetY, par4 - dir.offsetZ) % 6;
                }
            }
        return flag + par5;
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
        double h = 0.0625D;
        int side = par1World.getBlockMetadata(par2, par3, par4) % 6;
        switch(side) {
            case 0:
                return AxisAlignedBB.getBoundingBox(par2 + h, par3 + h, par4 + h, par2 + 1.0D - h, par3 + 1.0D, par4 + 1.0D - h);
            case 1:
                return AxisAlignedBB.getBoundingBox(par2 + h, par3, par4 + h, par2 + 1.0D - h, par3 + 1.0D - h, par4 + 1.0D - h);
            case 2:
                return AxisAlignedBB.getBoundingBox(par2 + h, par3 + h, par4 + h, par2 + 1.0D - h, par3 + 1.0D - h, par4 + 1.0D);
            case 3:
                return AxisAlignedBB.getBoundingBox(par2 + h, par3 + h, par4, par2 + 1.0D - h, par3 + 1.0D - h, par4 + 1.0D - h);
            case 4:
                return AxisAlignedBB.getBoundingBox(par2 + h, par3 + h, par4 + h, par2 + 1.0D, par3 + 1.0D - h, par4 + 1.0D - h);
            case 5:
                return AxisAlignedBB.getBoundingBox(par2, par3 + h, par4 + h, par2 + 1.0D - h, par3 + 1.0D - h, par4 + 1.0D - h);
        }
        return AxisAlignedBB.getBoundingBox(par2 + h, par3 + h, par4 + h, par2 + 1.0D - h, par3 + 1.0D - h, par4 + 1.0D - h);
    }
}