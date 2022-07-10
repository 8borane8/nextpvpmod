package fr.nextmod.nextpvp.fluids;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.nextmod.nextpvp.Main;
import fr.nextmod.nextpvp.utils.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

public class Fluids {

    public static Block sulfuric_water_block;
    public static Fluid sulfuric_water;
    public static Item sulfuric_water_bucket;

    public static Block angelic_water_block;
    public static Fluid angelic_water;
    public static Item angelic_water_bucket;

    public static void init() {
        sulfuric_water = new Fluid("sulfuric_water").setDensity(4000).setViscosity(1200).setTemperature(286).setLuminosity(10).setUnlocalizedName("sulfuric_water");
        FluidRegistry.registerFluid(sulfuric_water);
        sulfuric_water = FluidRegistry.getFluid("sulfuric_water");

        sulfuric_water_block = new SulfuricWater(sulfuric_water, Material.water).setBlockTextureName(References.MOD_ID + ":sulfuric_water_block");
        GameRegistry.registerBlock(sulfuric_water_block, "sulfuric_water_block");

        sulfuric_water_bucket = new SulfuricWaterBucket(sulfuric_water_block).setUnlocalizedName("sulfuric_water_bucket").setCreativeTab(Main.tab).setContainerItem(Items.bucket).setTextureName(References.MOD_ID + ":sulfuric_water_bucket");

        GameRegistry.registerItem(sulfuric_water_bucket, sulfuric_water_bucket.getUnlocalizedName());
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("sulfuric_water", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(sulfuric_water_bucket), FluidContainerRegistry.EMPTY_BUCKET);


        angelic_water = new Fluid("angelic_water").setDensity(4000).setViscosity(1200).setTemperature(286).setLuminosity(10).setUnlocalizedName("angelic_water");
        FluidRegistry.registerFluid(angelic_water);
        angelic_water = FluidRegistry.getFluid("angelic_water");

        angelic_water_block = new AngelicWater(angelic_water, Material.water).setBlockTextureName(References.MOD_ID + ":angelic_water");
        GameRegistry.registerBlock(angelic_water_block, "angelic_water_block");

        angelic_water_bucket = new AngelicWaterBucket(angelic_water_block).setUnlocalizedName("angelic_water_bucket").setCreativeTab(Main.tab).setContainerItem(Items.bucket).setTextureName(References.MOD_ID + ":angelic_water_bucket");

        GameRegistry.registerItem(angelic_water_bucket, angelic_water_bucket.getUnlocalizedName());
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("angelic_water", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(angelic_water_bucket), FluidContainerRegistry.EMPTY_BUCKET);
    }
}
