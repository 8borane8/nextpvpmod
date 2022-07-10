package fr.nextmod.nextpvp.entitys;

import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import java.util.List;

public class EntitySicknessPotion extends EntityThrowable implements IEntityAdditionalSpawnData {

    public EntitySicknessPotion(World world) {
        super(world);
    }

    public EntitySicknessPotion(World world, EntityLivingBase thrower) {
        super(world, thrower);
    }

    public void nauseaEffect(MovingObjectPosition p_70184_1_) {
        AxisAlignedBB axisalignedbb = this.boundingBox.expand(4.0D, 2.0D, 4.0D);
        List<EntityPlayer> list1 = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, axisalignedbb);
        if(list1 != null && !list1.isEmpty())
            for(EntityPlayer entitylivingbase : list1) {
                double d0 = getDistanceSqToEntity(entitylivingbase);
                if(d0 >= 16.0D)
                    continue;
                double d1 = 1.0D - Math.sqrt(d0) / 4.0D;
                if(entitylivingbase == p_70184_1_.entityHit)
                    d1 = 1.0D;
                entitylivingbase.addPotionEffect(new PotionEffect(Potion.confusion.getId(), 400, 100));
            }
        this.worldObj.playAuxSFX(2002, (int) Math.round(this.posX), (int) Math.round(this.posY), (int) Math.round(this.posZ), 4);
    }

    protected void onImpact(MovingObjectPosition mop) {
        nauseaEffect(mop);
        setDead();
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
