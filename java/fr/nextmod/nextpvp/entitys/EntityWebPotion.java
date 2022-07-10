package fr.nextmod.nextpvp.entitys;

import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import fr.nextmod.nextpvp.init.Blocks;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityWebPotion extends EntityThrowable implements IEntityAdditionalSpawnData {

    public EntityWebPotion(World world) {
        super(world);
    }

    public EntityWebPotion(World world, EntityLivingBase thrower) {
        super(world, thrower);
    }

    public void spawnWeb() {
        worldObj.setBlock((int) posX - 1, (int) posY, (int) posZ - 1, Blocks.web);
    }

    protected void onImpact(MovingObjectPosition mop) {
        setDead();
        spawnWeb();
    }

    @Override
    public void writeSpawnData(ByteBuf buffer) {
        buffer.writeDouble(this.motionX);
        buffer.writeDouble(this.motionY);
        buffer.writeDouble(this.motionZ);
    }

    @Override
    public void readSpawnData(ByteBuf additionalData) {
        this.motionX = additionalData.readDouble();
        this.motionY = additionalData.readDouble();
        this.motionZ = additionalData.readDouble();
    }

    protected float getGravityVelocity() {
        return 0.05F;
    }

    protected float func_70182_d() {
        return 0.5F;
    }

    protected float func_70183_g() {
        return -20.0F;
    }
}
