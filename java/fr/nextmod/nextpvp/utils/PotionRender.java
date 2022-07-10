package fr.nextmod.nextpvp.utils;

import fr.nextmod.nextpvp.entitys.*;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class PotionRender extends Render {
    private static final ResourceLocation nausea = new ResourceLocation(References.MOD_ID, "textures/items/sickness_potion.png");
    private static final ResourceLocation web = new ResourceLocation(References.MOD_ID, "textures/items/web_potion.png");

    private static final ResourceLocation dyna = new ResourceLocation(References.MOD_ID, "textures/items/dynamite.png");
    private static final ResourceLocation big = new ResourceLocation(References.MOD_ID, "textures/items/big_dynamite.png");
    private static final ResourceLocation ninja = new ResourceLocation(References.MOD_ID, "textures/items/ninja_dynamite.png");
    private static final ResourceLocation ultimate = new ResourceLocation(References.MOD_ID, "textures/items/ultimate_dynamite.png");

    private final float scale = 1.0F;

    public void renderProjectile(EntityThrowable projectile, double x, double y, double z) {
        GL11.glPushMatrix();
        bindEntityTexture(projectile);
        GL11.glTranslatef((float) x, (float) y, (float) z);
        GL11.glEnable(32826);
        getClass();
        getClass();
        getClass();
        GL11.glScalef(0.5F, 0.5F, 0.5F);
        Tessellator tessellator = Tessellator.instance;
        float minU = 0.0F;
        float maxU = 1.0F;
        float minV = 0.0F;
        float maxV = 1.0F;
        float f7 = 1.0F;
        float f8 = 0.5F;
        float f9 = 0.25F;
        GL11.glRotatef(180.0F - this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
        tessellator.startDrawingQuads();
        tessellator.setNormal(0.0F, 1.0F, 0.0F);
        tessellator.addVertexWithUV((0.0F - f8), (0.0F - f9), 0.0D, minU, maxV);
        tessellator.addVertexWithUV((f7 - f8), (0.0F - f9), 0.0D, maxU, maxV);
        tessellator.addVertexWithUV((f7 - f8), (1.0F - f9), 0.0D, maxU, minV);
        tessellator.addVertexWithUV((0.0F - f8), (1.0F - f9), 0.0D, minU, minV);
        tessellator.draw();
        GL11.glDisable(32826);
        GL11.glPopMatrix();
    }

    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
        renderProjectile((EntityThrowable) par1Entity, par2, par4, par6);
    }

    protected ResourceLocation getEntityTexture(Entity entity) {
        if(entity instanceof EntitySicknessPotion) {
            return nausea;
        } else if(entity instanceof EntityWebPotion) {
            return web;
        } else if(entity instanceof EntityDynamite) {
            return dyna;
        } else if(entity instanceof EntityBigDynamite) {
            return big;
        } else if(entity instanceof EntityNinjaDynamite) {
            return ninja;
        } else if(entity instanceof EntityUltimateDynamite) {
            return ultimate;
        }
        return null;
    }
}