package fr.nextmod.nextpvp.items;

import fr.nextmod.nextpvp.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SuperCalculator extends Item {
    List<Block> blockList = new ArrayList<>();
    List<String> msgToSend = new ArrayList<>();
    private boolean running = false;

    public SuperCalculator() {
        setMaxStackSize(1);
        setUnlocalizedName("supercalculator");
        setCreativeTab(Main.tab);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {

        if(running) return super.onItemRightClick(itemStack, world, player);
        running = true;

        world.updateEntities();
        world.getChunkFromChunkCoords(player.chunkCoordX, player.chunkCoordY);

        blockList.clear();
        msgToSend.clear();

        msgToSend.add(EnumChatFormatting.GOLD + "----" + EnumChatFormatting.RESET);
        for(int x = 0; x < 16; x++) {
            for(int z = 0; z < 16; z++) {
                for(int y = 0; y < 255; y++) {
                    blockList.add(world.getChunkFromChunkCoords(player.chunkCoordX, player.chunkCoordY).getBlock(x, y, z));
                }
            }
        }

        msgToSend.add(EnumChatFormatting.GREEN + "Total: " + blockList.stream().filter(block -> !block.getMaterial().equals(Material.air)).count() + EnumChatFormatting.RESET);

        blockList.stream().filter(block -> !block.getMaterial().equals(Material.air))
                .collect(Collectors.groupingBy(Block::getLocalizedName))
                .forEach((k, v) -> msgToSend.add(k + " " + v.size()));

        msgToSend.add(EnumChatFormatting.GOLD + "----" + EnumChatFormatting.RESET);

        msgToSend.forEach(s -> player.addChatMessage(new ChatComponentText(s)));

        running = false;
        return super.onItemRightClick(itemStack, world, player);
    }
}
/*class BlockCountGui extends GuiScreen {

    int guiWidth = 195;
    int guiHeight = 136;

    int tab1Width = 28;
    int tab1Height = 32;

    boolean tab1 = true;
    boolean tab2;

    IIcon book;

    public static String localize(String key) {
        return StatCollector.translateToLocal(key);
    }

    @Override
    public void drawScreen(int x, int y, float ticks) {
        int guiX = (width - guiWidth) / 2;
        int guiY = (height - guiHeight) / 2;
        GL11.glColor4f(1, 1, 1, 1);
        drawDefaultBackground();
        mc.renderEngine.bindTexture(new ResourceLocation(References.MOD_ID, "textures/gui/supercalculator.png"));
        drawTexturedModalRect(guiX, guiY, 0, 28, guiWidth, guiHeight);
        buttonList.clear();

        fontRendererObj.drawString()
        itemRender.
        super.drawScreen(x, y, ticks);
    }
}*/
