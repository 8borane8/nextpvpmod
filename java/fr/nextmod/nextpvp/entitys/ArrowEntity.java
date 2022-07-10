package fr.nextmod.nextpvp.entitys;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import java.util.List;

public class ArrowEntity extends EntityArrow {

    public Entity field_70250_c;
    EntityPlayer player;
    int type;
    private boolean inGround;
    private boolean canBePickedUp;
    private int ticksInAir;

    public ArrowEntity(World world) {
        super(world);
    }

    public ArrowEntity(World world, int type, EntityPlayer player) {
        super(world);
        this.type = type;
        this.player = player;
    }

    public ArrowEntity(World world, EntityLivingBase entity, float power, int type, boolean infiniteAmmo) {
        super(world, entity, power);
        this.type = type;
        this.player = (EntityPlayer) entity;
        this.canBePickedUp = infiniteAmmo;
    }

    public void readEntityFromNBT(NBTTagCompound nbt) {
        super.readEntityFromNBT(nbt);
        this.canBePickedUp = nbt.getBoolean("canBePickedUp");
        if(nbt.hasKey("typearrow"))
            setType(nbt.getInteger("typearrow"));
    }

    public EntityPlayer getPlayer() {
        return this.player;
    }

    public void writeEntityToNBT(NBTTagCompound nbt) {
        super.writeEntityToNBT(nbt);
        nbt.setBoolean("canBePickedUp", this.canBePickedUp);
        nbt.setInteger("typearrow", getType());
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void onEntityUpdate() {
        if(this.ticksExisted >= 2000) {
            this.setDead();
        }
        Vec3 vec3d = Vec3.createVectorHelper((double) this.posX, (double) this.posY, (double) this.posZ);
        Vec3 vec3d1 = Vec3.createVectorHelper((double) (this.posX + this.motionX), (double) (this.posY + this.motionY), (double) (this.posZ + this.motionZ));
        MovingObjectPosition movingobjectposition = this.worldObj.func_147447_a(vec3d, vec3d1, false, true, false);
        List list = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity) this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0, 1.0, 1.0));
        double d = 0.0;
        Entity entity = null;
        for(Object o : list) {
            double d1;
            float f4;
            AxisAlignedBB axisalignedbb1;
            MovingObjectPosition movingobjectposition1;
            Entity entity1 = (Entity) o;
            if(!entity1.canBeCollidedWith() || entity1 == this.shootingEntity && this.ticksInAir < 5 || (movingobjectposition1 = (axisalignedbb1 = entity1.boundingBox.expand((double) (f4 = 0.3f), (double) f4, (double) f4)).calculateIntercept(vec3d, vec3d1)) == null || !((d1 = vec3d.distanceTo(movingobjectposition1.hitVec)) < d) && d != 0.0)
                continue;
            entity = entity1;
            d = d1;
        }
        if(entity != null) {
            movingobjectposition = new MovingObjectPosition(entity);
        }
        if(movingobjectposition != null && movingobjectposition.entityHit == null) {
            this.inGround = true;
        }
        super.onEntityUpdate();
    }

    public EntityItem entityDropItem(ItemStack p_70099_1_, float p_70099_2_) {
        return super.entityDropItem(p_70099_1_, p_70099_2_);
    }

    public void onCollideWithPlayer(EntityPlayer player) {
        if(!this.canBePickedUp)
            return;
        if(this.inGround) {
            EntityItem arrow = new EntityItem(player.worldObj, player.posX, player.posY, player.posZ, new ItemStack(Items.arrow));
            if(!player.worldObj.isRemote)
                player.worldObj.spawnEntityInWorld(arrow);
            setDead();

        }
    }
}
