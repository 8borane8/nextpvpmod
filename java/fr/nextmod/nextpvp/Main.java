package fr.nextmod.nextpvp;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import fr.nextmod.nextpvp.blocks.Obsidian;
import fr.nextmod.nextpvp.entitys.ArrowEntity;
import fr.nextmod.nextpvp.fluids.Fluids;
import fr.nextmod.nextpvp.init.Blocks;
import fr.nextmod.nextpvp.init.Entitys;
import fr.nextmod.nextpvp.init.Items;
import fr.nextmod.nextpvp.init.Recipes;
import fr.nextmod.nextpvp.proxy.CommonProxy;
import fr.nextmod.nextpvp.utils.References;
import fr.nextmod.nextpvp.utils.Tab;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.event.world.BlockEvent;

@Mod(modid = References.MOD_ID, name = References.MOD_NAME, version = References.MOD_VERSION)
public class Main {

    @Mod.Instance(References.MOD_ID)
    public static Main instance;

    @SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.COMMON_PROXY, modId = References.MOD_ID)
    public static CommonProxy commonProxy;

    public static CreativeTabs tab = new Tab("Next Mod");

    @SubscribeEvent
    public void onBucketFill(FillBucketEvent event) {
        Block id = event.world.getBlock(event.target.blockX, event.target.blockY, event.target.blockZ);
        int metadata = event.world.getBlockMetadata(event.target.blockX, event.target.blockY, event.target.blockZ);
        if(id == Fluids.sulfuric_water_block && metadata == 0) {
            event.world.setBlockToAir(event.target.blockX, event.target.blockY, event.target.blockZ);
            if(!event.world.isRemote) {
                event.entityPlayer.inventory.consumeInventoryItem(net.minecraft.init.Items.bucket);
                EntityItem itemsc = new EntityItem(event.world, event.entityPlayer.posX, event.entityPlayer.posY, event.entityPlayer.posZ, new ItemStack(Fluids.sulfuric_water_bucket, 1));
                event.world.spawnEntityInWorld(itemsc);
            }
        } else if(id == Fluids.angelic_water_block && metadata == 0) {
            event.world.setBlockToAir(event.target.blockX, event.target.blockY, event.target.blockZ);
            if(!event.world.isRemote) {
                event.entityPlayer.inventory.consumeInventoryItem(net.minecraft.init.Items.bucket);
                EntityItem itemsc = new EntityItem(event.world, event.entityPlayer.posX, event.entityPlayer.posY, event.entityPlayer.posZ, new ItemStack(Fluids.angelic_water_bucket, 1));
                event.world.spawnEntityInWorld(itemsc);
            }
        }
    }

    @SubscribeEvent
    public void onBlockBreakEvent(BlockEvent.BreakEvent event) {
        if(!(event.block instanceof Obsidian)) return;
        new Thread(() -> {
            ((Obsidian) event.block).fireBlockChange(event.world, event.x, event.y, event.z);
        }).start();
    }

    @SubscribeEvent
    public void onLivingHurt(LivingHurtEvent event) {
        DamageSource source = event.source;
        if(source.isProjectile()) {
            Entity entity = source.getSourceOfDamage();
            if(entity instanceof ArrowEntity && event.entity instanceof EntityLivingBase) {
                double x1, y1, z1, x2, y2, z2;
                ArrowEntity arrow = (ArrowEntity) entity;
                EntityLivingBase base = (EntityLivingBase) event.entity;
                int type = arrow.getType();
                switch(type) {
                    case 1:
                        base.addPotionEffect(new PotionEffect(Potion.poison.getId(), 100, 2));
                        break;
                    case 2:
                        base.addPotionEffect(new PotionEffect(Potion.wither.getId(), 100, 2));
                        break;
                    case 3:
                        base.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 100, 2));
                        break;
                    case 0:
                        event.ammount = 0.0F;
                        arrow.getPlayer().addPotionEffect(new PotionEffect(Potion.confusion.getId(), 250, 255));
                        x1 = (arrow.getPlayer()).posX;
                        y1 = (arrow.getPlayer()).posY;
                        z1 = (arrow.getPlayer()).posZ;
                        x2 = base.posX;
                        y2 = base.posY;
                        z2 = base.posZ;
                        if(!(base instanceof EntityPlayer)) {
                            arrow.getPlayer().setPositionAndUpdate(x2, y2, z2);
                            base.setPosition(x1, y1, z1);
                        }
                        break;
                }
            }
        }
    }

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent e) {
        Items.init();
        Items.register();
        Blocks.init();
        Blocks.register();
        Fluids.init();
        Entitys.registerEntitys();
        Recipes.registerRecipes();
        Recipes.registerSmeltingRecipes();

        commonProxy.registerRenders();
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent e) {
        commonProxy.registerOverlay();
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, commonProxy);
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent e) {
        MinecraftForge.EVENT_BUS.register(instance);
    }
}