package fr.nextmod.nextpvp.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import fr.nextmod.nextpvp.entitys.*;
import fr.nextmod.nextpvp.guis.UnclaimFinderGui;
import fr.nextmod.nextpvp.utils.PotionRender;
import fr.nextmod.nextpvp.utils.SpikeRender;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityDynamite.class, new PotionRender());
        RenderingRegistry.registerEntityRenderingHandler(EntityBigDynamite.class, new PotionRender());
        RenderingRegistry.registerEntityRenderingHandler(EntityNinjaDynamite.class, new PotionRender());
        RenderingRegistry.registerEntityRenderingHandler(EntityUltimateDynamite.class, new PotionRender());
        RenderingRegistry.registerEntityRenderingHandler(EntitySicknessPotion.class, new PotionRender());
        RenderingRegistry.registerEntityRenderingHandler(EntityWebPotion.class, new PotionRender());


        RenderingRegistry.registerBlockHandler(new SpikeRender());


    }

    @Override
    public void registerOverlay() {
        MinecraftForge.EVENT_BUS.register(new UnclaimFinderGui());
    }
}
