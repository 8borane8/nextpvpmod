package fr.nextmod.nextpvp.blocks;

import fr.nextmod.nextpvp.Main;
import fr.nextmod.nextpvp.fluids.Fluids;
import fr.nextmod.nextpvp.init.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class Obsidian extends Block {
    public Obsidian(Material m) {
        super(m);
        if(this == Blocks.antiagro_obsidian || this == Blocks.wiwi_obsidian) {
            setHardness(1F);
        } else setHardness(50F);
        setCreativeTab(Main.tab);
    }

    @Override
    public void onBlockDestroyedByExplosion(World world, int x, int y, int z, Explosion explosion) {
        super.onBlockDestroyedByExplosion(world, x, y, z, explosion);
        fireBlockChange(world, x, y, z);
    }

    public void fireBlockChange(World world, int x, int y, int z) {
        if(this == Blocks.blue_obsidian) {
            world.setBlock(x, y, z, Fluids.sulfuric_water_block);
        } else if(this == Blocks.orange_obsidian) {
            world.setBlock(x, y, z, net.minecraft.init.Blocks.lava);
        } else if(this == Blocks.red_obsidian) {
            world.setBlock(x, y, z, net.minecraft.init.Blocks.obsidian);
        } else if(this == Blocks.mega_black_obsidian) {
            world.newExplosion(null, x, y, z, 10F, false, false);
        } else if(this == Blocks.wiwi_obsidian) {
            AxisAlignedBB axisalignedbb = AxisAlignedBB.getBoundingBox(x - 10, y - 10, z - 10, z + 10, y + 10, z + 10);
            List<EntityWither> list1 = world.getEntitiesWithinAABB(EntityWither.class, axisalignedbb);
            if(list1 != null && !list1.isEmpty()) {
                list1.forEach(entityWither -> {
                    FreezeAI freezeAI = new FreezeAI(entityWither);
                    entityWither.tasks.addTask(0, freezeAI);
                    entityWither.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 10 * 20, 1));
                    for(int cx = MathHelper.floor_double(entityWither.posX - 3); cx < MathHelper.floor_double(entityWither.posX + 3); cx++) {
                        for(int cy = MathHelper.floor_double(entityWither.posY - 3); cy < MathHelper.floor_double(entityWither.posY + 3); cy++) {
                            for(int cz = MathHelper.floor_double(entityWither.posZ - 3); cz < MathHelper.floor_double(entityWither.posZ + 3); cz++) {
                                world.setBlock(cx, cy, cz, net.minecraft.init.Blocks.obsidian);
                            }
                        }
                    }

                    for(int cx = MathHelper.floor_double(entityWither.posX - 2); cx < MathHelper.floor_double(entityWither.posX + 2); cx++) {
                        for(int cy = MathHelper.floor_double(entityWither.posY - 2); cy < MathHelper.floor_double(entityWither.posY + 2); cy++) {
                            for(int cz = MathHelper.floor_double(entityWither.posZ - 2); cz < MathHelper.floor_double(entityWither.posZ + 2); cz++) {
                                world.setBlock(cx, cy, cz, net.minecraft.init.Blocks.air);
                            }
                        }
                    }
                    entityWither.tasks.removeTask(freezeAI);
                });
            }
        } else if(this == Blocks.black_obsidian) {
            world.newExplosion(null, x, y, z, 2F, false, false);
        } else if(this == Blocks.amethyst_pik_obsidian) {
            world.setBlock(x, y, z, Blocks.amethyst_spike, 1, 3);
        } else if(this == Blocks.titane_pik_obisidan) {
            world.setBlock(x, y, z, Blocks.titane_spike, 1, 3);
        } else if(this == Blocks.legendarium_pik_obisidan) {
            world.setBlock(x, y, z, Blocks.legendarium_spike, 1, 3);
        } else if(this == Blocks.poisonous_obsidian) {
            AxisAlignedBB axisalignedbb = AxisAlignedBB.getBoundingBox(x - 3, y - 3, z - 3, x + 3, y + 3, z + 3);
            List<EntityPlayer> list1 = world.getEntitiesWithinAABB(EntityPlayer.class, axisalignedbb);
            if(list1 != null && !list1.isEmpty())
                for(EntityPlayer entitylivingbase : list1) {
                    entitylivingbase.addPotionEffect(new PotionEffect(Potion.poison.getId(), 400, 100));
                }
        } else if(this == Blocks.green_obsidian) {

            for(int cx = (x + 1 - 2); cx < (x + 1); cx++) {
                for(int cy = (y+ 1 - 2); cy < (y + 1); cy++) {
                    for(int cz = (z+ 1 - 2); cz < (z + 1); cz++) {
                        if(world.getBlock(cx, cy, cz) == net.minecraft.init.Blocks.air) {
                            if(new Random().nextInt(9) > 5){
                                world.setBlock(cx, cy, cz, Blocks.slime_pad);
                            }
                        }
                    }
                }
            }
        } else if(this == Blocks.antiagro_obsidian) {
            AxisAlignedBB axisalignedbb = AxisAlignedBB.getBoundingBox(x - 5, y - 5, z - 5, (z + 5), (y + 5), (z + 5));
            List<EntityWither> list1 = world.getEntitiesWithinAABB(EntityWither.class, axisalignedbb);
            if(list1 != null && !list1.isEmpty()) {
                list1.forEach(entityWither -> {
                    entityWither.setTarget(null);
                    entityWither.setAttackTarget(null);
                });
            }
        }
    }

    @Override
    public int quantityDropped(Random p_149745_1_) {
        return 0;
    }
}

class FreezeAI extends EntityAIBase {

    public FreezeAI(EntityLiving p_i1647_1_) {
        this.setMutexBits(0xFFFFFF);
    }

    @Override
    public boolean shouldExecute() {
        return true;
    }

    @Override
    public boolean isInterruptible() {
        return false;
    }
}
