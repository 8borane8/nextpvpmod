package fr.nextmod.nextpvp.guis;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import fr.nextmod.nextpvp.init.Items;
import fr.nextmod.nextpvp.utils.References;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import org.lwjgl.opengl.GL11;

public class UnclaimFinderGui extends Gui {
    private final Minecraft mc;
    private final FontRenderer fontRender;
    private final ResourceLocation u1 = new ResourceLocation(References.MOD_ID, "textures/items/unclaim_finderI.png");
    private final ResourceLocation u2 = new ResourceLocation(References.MOD_ID, "textures/items/unclaim_finderII.png");
    private final ResourceLocation u3 = new ResourceLocation(References.MOD_ID, "textures/items/unclaim_finderIII.png");
    private String show;

    public UnclaimFinderGui() {
        this.mc = Minecraft.getMinecraft();
        this.show = "0%";
        fontRender = mc.fontRenderer;
    }

    public void drawUnclaimFinder(ResourceLocation u, String s) {
        this.mc.renderEngine.bindTexture(u);

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(2896);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);

        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(10 + 0.0D, 10 + 32, 0, 0.0D, 1.0D);
        tessellator.addVertexWithUV(10 + 32, 10 + 32, 0, 1.0D, 1.0D);
        tessellator.addVertexWithUV(10 + 32, 10 + 0.0D, 0, 1.0D, 0.0D);
        tessellator.addVertexWithUV(10 + 0.0D, 10 + 0.0D, 0, 0.0D, 0.0D);
        tessellator.draw();

        fontRender.drawStringWithShadow(s, 10 + 16 - s.length() / 2 * 8, 52, 0xffFFFFFF);
    }

    @SubscribeEvent(priority = EventPriority.NORMAL)
    public void onRender(RenderGameOverlayEvent.Post event) {
        if(event.type != RenderGameOverlayEvent.ElementType.HOTBAR) {
            return;
        }
        if(this.mc.thePlayer.getHeldItem() != null && this.mc.thePlayer.getHeldItem().getItem() == Items.unclaim_finderI) {
            show = this.mc.theWorld.getChunkFromChunkCoords(this.mc.thePlayer.chunkCoordX, this.mc.thePlayer.chunkCoordZ).chunkTileEntityMap.size() + "%";
            drawUnclaimFinder(u1, show);
        } else if(this.mc.thePlayer.getHeldItem() != null && this.mc.thePlayer.getHeldItem().getItem() == Items.unclaim_finderII) {
            int chests = 0;
            for(int x = -1; x <= 1; x++) {
                for(int z = -1; z <= 1; z++) {
                    chests += this.mc.theWorld.getChunkFromChunkCoords(this.mc.thePlayer.chunkCoordX + x, this.mc.thePlayer.chunkCoordZ + z).chunkTileEntityMap.size();
                }
            }
            show = chests + "%";
            drawUnclaimFinder(u2, show);
        } else if(this.mc.thePlayer.getHeldItem() != null && this.mc.thePlayer.getHeldItem().getItem() == Items.unclaim_finderIII) {
            int chests = 0;
            for(int x = -2; x <= 2; x++) {
                for(int z = -2; z <= 2; z++) {
                    chests += this.mc.theWorld.getChunkFromChunkCoords(this.mc.thePlayer.chunkCoordX + x, this.mc.thePlayer.chunkCoordZ + z).chunkTileEntityMap.size();
                }
            }
            show = chests + "%";
            drawUnclaimFinder(u3, show);
        }
        show = "0%";
    }
}
