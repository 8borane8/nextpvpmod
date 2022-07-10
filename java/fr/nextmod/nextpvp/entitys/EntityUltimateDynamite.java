package fr.nextmod.nextpvp.entitys;

import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import fr.nextmod.nextpvp.blocks.Obsidian;
import fr.nextmod.nextpvp.blocks.ObsidianDoor;
import fr.nextmod.nextpvp.blocks.ObsidianSlab;
import fr.nextmod.nextpvp.blocks.Spike;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import java.util.Random;

public class EntityUltimateDynamite extends EntityThrowable implements IEntityAdditionalSpawnData {
    private int fuseTime = 30;

    public EntityUltimateDynamite(World world) {
        super(world);
    }


    public EntityUltimateDynamite(World world, EntityLivingBase thrower) {
        super(world, thrower);
    }

    @Override
    public void onImpact(MovingObjectPosition mop) {
        this.motionX = 0;
        this.motionY = 0;
        this.motionZ = 0;
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if(fuseTime > 0) {
            this.fuseTime--;
        } else if(!this.worldObj.isRemote) {
            Explosion explosion = this.worldObj.newExplosion(this, this.posX, this.posY, this.posZ, 16F, false, true);
            for(int x = -2; x < 3; x++) {
                for(int y = -2; y < 3; y++) {
                    for(int z = -2; z < 3; z++) {
                        if(worldObj.getBlock((int) posX + x, (int) posY + y, (int) posZ + z) == Blocks.obsidian || worldObj.getBlock((int) posX + x, (int) posY + y, (int) posZ + z) instanceof Obsidian || worldObj.getBlock((int) posX + x, (int) posY + y, (int) posZ + z) instanceof Spike || worldObj.getBlock((int) posX + x, (int) posY + y, (int) posZ + z) instanceof ObsidianSlab || worldObj.getBlock((int) posX + x, (int) posY + y, (int) posZ + z) instanceof ObsidianDoor) {
                            if(new Random().nextInt(9) > 7)
                                worldObj.getBlock((int) posX + x, (int) posY + y, (int) posZ + z).onBlockDestroyedByExplosion(worldObj, (int) posX + x, (int) posY + y, (int) posZ + z, explosion);
                            if(worldObj.getBlock((int) posX + x, (int) posY + y, (int) posZ + z) == Blocks.obsidian) {
                                worldObj.setBlock((int) posX + x, (int) posY + y, (int) posZ + z, Blocks.air);
                            }
                        }
                    }
                }
            }
            this.setDead();
        }
    }

    @Override
    public void writeSpawnData(ByteBuf buffer) {
        buffer.writeInt(this.fuseTime);
        buffer.writeDouble(this.motionX);
        buffer.writeDouble(this.motionY);
        buffer.writeDouble(this.motionZ);
    }

    @Override
    public void readSpawnData(ByteBuf additionalData) {
        this.fuseTime = additionalData.readInt();

        this.motionX = additionalData.readDouble();
        this.motionY = additionalData.readDouble();
        this.motionZ = additionalData.readDouble();
    }

    public float getGravityVelocity() {
        return 0.04F;
    }

    public float func_70182_d() {
        return 0.5F;
    }

    public float func_70183_g() {
        return 0.95F;
    }
}