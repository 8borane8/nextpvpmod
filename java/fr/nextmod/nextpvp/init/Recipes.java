package fr.nextmod.nextpvp.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.nextmod.nextpvp.fluids.Fluids;
import net.minecraft.item.ItemStack;

public class Recipes {

    public static void registerRecipes() {
        GameRegistry.addRecipe(new ItemStack(Items.legendarium_helmet), "XXX", "X X", Character.valueOf('X'), new ItemStack(Items.legendarium_ingot));
        GameRegistry.addRecipe(new ItemStack(Items.legendarium_chestplate), "X X", "XXX", "XXX", Character.valueOf('X'), new ItemStack(Items.legendarium_ingot));
        GameRegistry.addRecipe(new ItemStack(Items.legendarium_leggings), "XXX", "X X", "X X", Character.valueOf('X'), new ItemStack(Items.legendarium_ingot));
        GameRegistry.addRecipe(new ItemStack(Items.legendarium_boots), "X X", "X X", Character.valueOf('X'), new ItemStack(Items.legendarium_ingot));
        GameRegistry.addRecipe(new ItemStack(Items.legendarium_stick, 4), "X", "X", Character.valueOf('X'), new ItemStack(Items.legendarium_ingot));
        GameRegistry.addRecipe(new ItemStack(Items.amethyst_pickaxe, 1), "XXX", " Z ", " Z ", Character.valueOf('X'), new ItemStack(Items.amethyst_ingot), Character.valueOf('Z'), new ItemStack(net.minecraft.init.Items.stick));
        GameRegistry.addRecipe(new ItemStack(Items.titane_pickaxe, 1), "XXX", " Y ", " Y ", Character.valueOf('X'), new ItemStack(Items.titane_ingot), Character.valueOf('Y'), new ItemStack(net.minecraft.init.Items.stick));
        GameRegistry.addRecipe(new ItemStack(Items.titane_axe, 1), " XX", " ZX", " Z ", Character.valueOf('X'), new ItemStack(Items.titane_ingot), Character.valueOf('Z'), new ItemStack(net.minecraft.init.Items.stick));
        GameRegistry.addRecipe(new ItemStack(Items.titane_axe, 1), "XX ", "XZ ", " Z ", Character.valueOf('X'), new ItemStack(Items.titane_ingot), Character.valueOf('Z'), new ItemStack(net.minecraft.init.Items.stick));
        GameRegistry.addRecipe(new ItemStack(Items.amethyst_axe, 1), " XX", " ZX", " Z ", Character.valueOf('X'), new ItemStack(Items.amethyst_ingot), Character.valueOf('Z'), new ItemStack(net.minecraft.init.Items.stick));
        GameRegistry.addRecipe(new ItemStack(Items.amethyst_axe, 1), "XX ", "XZ ", " Z ", Character.valueOf('X'), new ItemStack(Items.amethyst_ingot), Character.valueOf('Z'), new ItemStack(net.minecraft.init.Items.stick));
        GameRegistry.addRecipe(new ItemStack(Items.amethyst_sword, 1), "X", "X", "Y", Character.valueOf('X'), new ItemStack(Items.amethyst_ingot), Character.valueOf('Y'), new ItemStack(net.minecraft.init.Items.stick));
        GameRegistry.addRecipe(new ItemStack(Items.titane_sword, 1), "X", "X", "Y", Character.valueOf('X'), new ItemStack(Items.titane_ingot), Character.valueOf('Y'), new ItemStack(net.minecraft.init.Items.stick));
        GameRegistry.addRecipe(new ItemStack(Items.titane_shovel, 1), "X", "Z", "Z", Character.valueOf('X'), new ItemStack(Items.titane_ingot), Character.valueOf('Z'), new ItemStack(net.minecraft.init.Items.stick));
        GameRegistry.addRecipe(new ItemStack(Items.amethyst_shovel, 1), "X", "Z", "Z", Character.valueOf('X'), new ItemStack(Items.amethyst_ingot), Character.valueOf('Z'), new ItemStack(net.minecraft.init.Items.stick));
        GameRegistry.addRecipe(new ItemStack(Items.titane_stick, 1), "X", "X", Character.valueOf('X'), new ItemStack(Items.titane_ingot));
        GameRegistry.addRecipe(new ItemStack(Items.amethyst_stick, 1), "X", "X", Character.valueOf('X'), new ItemStack(Items.amethyst_ingot));
        GameRegistry.addRecipe(new ItemStack(Items.titane_helmet), "XXX", "X X", Character.valueOf('X'), new ItemStack(Items.titane_ingot));
        GameRegistry.addRecipe(new ItemStack(Items.titane_chestplate), "X X", "XXX", "XXX", Character.valueOf('X'), new ItemStack(Items.titane_ingot));
        GameRegistry.addRecipe(new ItemStack(Items.titane_leggings), "XXX", "X X", "X X", Character.valueOf('X'), new ItemStack(Items.titane_ingot));
        GameRegistry.addRecipe(new ItemStack(Items.titane_boots), "X X", "X X", Character.valueOf('X'), new ItemStack(Items.titane_ingot));
        GameRegistry.addRecipe(new ItemStack(Items.amethyst_helmet), "XXX", "X X", Character.valueOf('X'), new ItemStack(Items.amethyst_ingot));
        GameRegistry.addRecipe(new ItemStack(Items.amethyst_chestplate), "X X", "XXX", "XXX", Character.valueOf('X'), new ItemStack(Items.amethyst_ingot));
        GameRegistry.addRecipe(new ItemStack(Items.amethyst_leggings), "XXX", "X X", "X X", Character.valueOf('X'), new ItemStack(Items.amethyst_ingot));
        GameRegistry.addRecipe(new ItemStack(Items.amethyst_boots), "X X", "X X", Character.valueOf('X'), new ItemStack(Items.amethyst_ingot));
        GameRegistry.addRecipe(new ItemStack(Items.hang_glider, 1), " Y ", "XYX", Character.valueOf('X'), new ItemStack(Items.wings), Character.valueOf('Y'), new ItemStack(net.minecraft.init.Items.leather));
        GameRegistry.addRecipe(new ItemStack(Items.dynamite, 4), "X", "Z", "Z", Character.valueOf('X'), new ItemStack(net.minecraft.init.Items.string), Character.valueOf('Z'), new ItemStack(net.minecraft.init.Blocks.tnt));
        GameRegistry.addRecipe(new ItemStack(Items.ninja_dynamite, 1), "XYX", "XYX", "XYX", Character.valueOf('X'), new ItemStack(Items.titane_ingot), Character.valueOf('Y'), new ItemStack(Items.dynamite));
        GameRegistry.addRecipe(new ItemStack(Items.big_dynamite, 1), "XXX", Character.valueOf('X'), new ItemStack(Items.dynamite));
        GameRegistry.addRecipe(new ItemStack(Items.potion_launcher, 1), "XXX", "ZYY", "XXX", Character.valueOf('X'), new ItemStack(Items.amethyst_ingot), Character.valueOf('Z'), new ItemStack(Items.legendarium_core), Character.valueOf('Y'), new ItemStack(net.minecraft.init.Items.glass_bottle));
        GameRegistry.addRecipe(new ItemStack(Items.legendarium_axe, 1), " XX", " YX", " Y ", Character.valueOf('X'), new ItemStack(Items.legendarium_ingot), Character.valueOf('Y'), new ItemStack(net.minecraft.init.Items.stick));
        GameRegistry.addRecipe(new ItemStack(Items.legendarium_axe, 1), "XX ", "XY ", " Y ", Character.valueOf('X'), new ItemStack(Items.legendarium_ingot), Character.valueOf('Y'), new ItemStack(net.minecraft.init.Items.stick));
        GameRegistry.addRecipe(new ItemStack(Items.legendarium_pickaxe, 1), "XXX", " Y ", " Y ", Character.valueOf('X'), new ItemStack(Items.legendarium_ingot), Character.valueOf('Y'), new ItemStack(net.minecraft.init.Items.stick));
        GameRegistry.addRecipe(new ItemStack(Items.legendarium_shovel, 1), "X", "Y", "Y", Character.valueOf('X'), new ItemStack(Items.legendarium_ingot), Character.valueOf('Y'), new ItemStack(net.minecraft.init.Items.stick));
        GameRegistry.addRecipe(new ItemStack(Items.legendarium_sword, 1), "X", "X", "Y", Character.valueOf('X'), new ItemStack(Items.legendarium_ingot), Character.valueOf('Y'), new ItemStack(net.minecraft.init.Items.stick));
        GameRegistry.addRecipe(new ItemStack(Fluids.sulfuric_water_bucket, 1), "Y", "X", Character.valueOf('X'), new ItemStack(net.minecraft.init.Items.water_bucket), Character.valueOf('Y'), new ItemStack(net.minecraft.init.Items.potionitem, 1, 8268), Character.valueOf('Y'), new ItemStack(Items.legendarium_stick));
        GameRegistry.addRecipe(new ItemStack(Items.unclaim_finderI, 1), " X ", "YZY", " X ", Character.valueOf('X'), new ItemStack(Items.legendarium_ingot), Character.valueOf('Z'), new ItemStack(Items.energium), Character.valueOf('Y'), new ItemStack(Items.legendarium_core));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.titane_ingot, 9), new ItemStack(Blocks.titane_block, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.legendarium_ingot, 9), new ItemStack(Blocks.legendarium_block, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.amethyst_ingot, 9), new ItemStack(Blocks.amethyst_block, 1));
        GameRegistry.addRecipe(new ItemStack(Blocks.legendarium_block), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(Items.legendarium_ingot));
        GameRegistry.addRecipe(new ItemStack(Blocks.titane_block), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(Items.titane_ingot));
        GameRegistry.addRecipe(new ItemStack(Blocks.amethyst_block), "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(Items.amethyst_ingot));
        GameRegistry.addRecipe(new ItemStack(Blocks.guard_keeper), "YYY", "ZXZ", "YYY", Character.valueOf('Y'), Items.legendarium_ingot, Character.valueOf('Z'), new ItemStack(Items.compressed_legendarium), Character.valueOf('X'), Items.guardian_stone);
        GameRegistry.addRecipe(new ItemStack(Blocks.cave_block), "XXX", "XYX", "XXX", Character.valueOf('X'), new ItemStack(net.minecraft.init.Blocks.glass), Character.valueOf('Y'), new ItemStack(Items.energium));


        GameRegistry.addRecipe(new ItemStack(Items.compressed_legendarium), "XXX", "XYX", "XXX", Character.valueOf('Y'), Items.legendarium_ingot, Character.valueOf('X'), new ItemStack(Blocks.legendarium_block));
        GameRegistry.addRecipe(new ItemStack(Items.travel_leggings, 4), "XXX", "Y Y", "Z Z", Character.valueOf('X'), new ItemStack(net.minecraft.init.Items.leather), Character.valueOf('Y'), new ItemStack(net.minecraft.init.Items.feather), Character.valueOf('Z'), new ItemStack(Items.titane_ingot));
        GameRegistry.addRecipe(new ItemStack(Items.travel_boots, 4), "X X", "Y Y", Character.valueOf('X'), new ItemStack(net.minecraft.init.Items.feather), Character.valueOf('Y'), new ItemStack(Items.titane_ingot));
        GameRegistry.addRecipe(new ItemStack(Items.legendarium_apple, 1), "XXX", "XYX", "XXX", Character.valueOf('X'), new ItemStack(Items.legendarium_ingot), Character.valueOf('Y'), new ItemStack(net.minecraft.init.Items.apple));
        GameRegistry.addRecipe(new ItemStack(Items.diamond_string, 9), "XYX", "XYX", "XYX", Character.valueOf('X'), new ItemStack(net.minecraft.init.Items.string), Character.valueOf('Y'), new ItemStack(net.minecraft.init.Items.diamond));
        GameRegistry.addRecipe(new ItemStack(Items.travel_chestplate, 1), "X X", "YZY", "YZY", Character.valueOf('X'), new ItemStack(net.minecraft.init.Items.feather), Character.valueOf('Z'), new ItemStack(net.minecraft.init.Items.iron_ingot), Character.valueOf('Y'), new ItemStack(net.minecraft.init.Items.leather));
        GameRegistry.addRecipe(new ItemStack(Items.hood_helmet, 1), "XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(net.minecraft.init.Blocks.wool), Character.valueOf('Z'), new ItemStack(Items.legendarium_core));
        GameRegistry.addRecipe(new ItemStack(Items.wings, 2), "  X", " XZ", "XZZ", Character.valueOf('X'), new ItemStack(Items.legendarium_stick), Character.valueOf('Z'), new ItemStack(net.minecraft.init.Items.leather));
        GameRegistry.addRecipe(new ItemStack(Items.legendarium_upgrade, 4), " X ", "XUX", " X ", Character.valueOf('X'), new ItemStack(Items.legendarium_ingot), Character.valueOf('U'), new ItemStack(net.minecraft.init.Items.diamond));
        GameRegistry.addRecipe(new ItemStack(Items.guardian_stone, 1), " X ", "XYX", " X ", Character.valueOf('X'), new ItemStack(net.minecraft.init.Blocks.stone), Character.valueOf('Y'), new ItemStack(Items.compressed_legendarium));
        GameRegistry.addRecipe(new ItemStack(Items.void_stone, 1), " X ", "XZX", " X ", Character.valueOf('X'), new ItemStack(Items.amethyst_ingot), Character.valueOf('Z'), new ItemStack(net.minecraft.init.Blocks.chest));
        GameRegistry.addRecipe(new ItemStack(Items.legendarium_core, 1), "YXY", "XZX", "YXY", Character.valueOf('X'), new ItemStack(Items.legendarium_ingot), Character.valueOf('Y'), new ItemStack(Items.titane_ingot), Character.valueOf('Z'), new ItemStack(Items.legendarium_ingot));
        GameRegistry.addRecipe(new ItemStack(Fluids.angelic_water_bucket, 1), "Y", "X", Character.valueOf('X'), new ItemStack(net.minecraft.init.Items.water_bucket), Character.valueOf('Y'), new ItemStack(net.minecraft.init.Items.potionitem, 1, 8193));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.wither_fragment, 9), new ItemStack(net.minecraft.init.Items.skull, 1, 1));
        //GameRegistry.addRecipe(new ItemStack(Blocks.legendarium_grinder), new Object[] { "YYY", "YXY", "YYY", Character.valueOf('Y'), Items.legendarium_ingot, Character.valueOf('X'), new ItemStack((Block)Blocks.legendarium_furnace) });
        GameRegistry.addRecipe(new ItemStack(Blocks.grinder_casing), "Y Y", "Y Y", "Y Y", Character.valueOf('Y'), Items.legendarium_ingot);
        GameRegistry.addRecipe(new ItemStack(Blocks.grinder_frame), "YZY", "   ", "YZY", Character.valueOf('Y'), Items.legendarium_ingot, Character.valueOf('Z'), Items.titane_ingot);
        GameRegistry.addRecipe(new ItemStack(Blocks.guard_block), "YYY", "YXY", "YYY", Character.valueOf('X'), Items.guardian_stone, Character.valueOf('Y'), Items.titane_ingot);
        GameRegistry.addRecipe(new ItemStack(Blocks.guard_keeper), "YYY", "ZXZ", "YYY", Character.valueOf('Y'), Items.legendarium_ingot, Character.valueOf('Z'), new ItemStack(Items.compressed_legendarium), Character.valueOf('X'), Items.guardian_stone);
        GameRegistry.addRecipe(new ItemStack(Blocks.iron_spike), " Y ", "YXY", "XXX", Character.valueOf('Y'), net.minecraft.init.Items.iron_sword, Character.valueOf('X'), net.minecraft.init.Items.iron_ingot);
        GameRegistry.addRecipe(new ItemStack(Blocks.amethyst_spike), " Y ", "YXY", "XXX", Character.valueOf('Y'), Items.amethyst_sword, Character.valueOf('X'), Items.amethyst_ingot);
        GameRegistry.addRecipe(new ItemStack(Blocks.diamond_spike), " Y ", "YXY", "XXX", Character.valueOf('Y'), net.minecraft.init.Items.diamond_sword, Character.valueOf('X'), net.minecraft.init.Items.diamond);
        GameRegistry.addRecipe(new ItemStack(Blocks.legendarium_spike), " Y ", "YXY", "XXX", Character.valueOf('Y'), Items.titane_sword, Character.valueOf('X'), Items.legendarium_ingot);
        GameRegistry.addRecipe(new ItemStack(Blocks.titane_spike), " Y ", "YXY", "XXX", Character.valueOf('Y'), Items.amethyst_sword, Character.valueOf('X'), Items.titane_ingot);
        GameRegistry.addRecipe(new ItemStack(Blocks.wood_spike), " Y ", "YXY", "XXX", Character.valueOf('Y'), net.minecraft.init.Items.wooden_sword, Character.valueOf('X'), net.minecraft.init.Blocks.planks);
        GameRegistry.addRecipe(new ItemStack(Blocks.slime_pad), "XXX", "XXX", Character.valueOf('X'), net.minecraft.init.Items.slime_ball);

        GameRegistry.addRecipe(new ItemStack(Blocks.orange_obsidian), "ZX", Character.valueOf('X'), net.minecraft.init.Blocks.obsidian, Character.valueOf('Z'), net.minecraft.init.Items.lava_bucket);
        GameRegistry.addRecipe(new ItemStack(Blocks.blue_obsidian), "ZX", Character.valueOf('X'), net.minecraft.init.Blocks.obsidian, Character.valueOf('Z'), Fluids.sulfuric_water_bucket);
        GameRegistry.addRecipe(new ItemStack(Blocks.red_obsidian), "XX", Character.valueOf('X'), net.minecraft.init.Blocks.obsidian);
        GameRegistry.addRecipe(new ItemStack(Blocks.wiwi_obsidian), "ZX", Character.valueOf('X'), net.minecraft.init.Blocks.obsidian, Character.valueOf('Z'), Items.wither_fragment);
        GameRegistry.addRecipe(new ItemStack(Blocks.poisonous_obsidian), "ZX", Character.valueOf('X'), net.minecraft.init.Blocks.obsidian, Character.valueOf('Z'), Items.sickness_potion);
        GameRegistry.addRecipe(new ItemStack(Blocks.black_obsidian, 3), "XXX", "XZX", "XXX", Character.valueOf('X'), net.minecraft.init.Blocks.obsidian, Character.valueOf('Z'), net.minecraft.init.Blocks.tnt);

        GameRegistry.addRecipe(new ItemStack(Blocks.amethyst_pik_obsidian), "Z", "X", Character.valueOf('X'), net.minecraft.init.Blocks.obsidian, Character.valueOf('Z'), Blocks.amethyst_spike);
        GameRegistry.addRecipe(new ItemStack(Blocks.titane_pik_obisidan), "Z", "X", Character.valueOf('X'), net.minecraft.init.Blocks.obsidian, Character.valueOf('Z'), Blocks.titane_spike);
        GameRegistry.addRecipe(new ItemStack(Blocks.legendarium_pik_obisidan), "Z", "X", Character.valueOf('X'), net.minecraft.init.Blocks.obsidian, Character.valueOf('Z'), Blocks.legendarium_spike);

        GameRegistry.addRecipe(new ItemStack(Blocks.obsidian_slab), "XXX", Character.valueOf('X'), net.minecraft.init.Blocks.obsidian);
        GameRegistry.addRecipe(new ItemStack(Blocks.obsidian_door), "XX", "XX", "XX", Character.valueOf('X'), net.minecraft.init.Blocks.obsidian);
    }

    public static void registerSmeltingRecipes() {
        GameRegistry.addSmelting(new ItemStack(Blocks.legendarium_ore), new ItemStack(Items.legendarium_ingot), 0.1F);
        GameRegistry.addSmelting(new ItemStack(Blocks.amethyst_ore), new ItemStack(Items.amethyst_ingot), 0.1F);
        GameRegistry.addSmelting(new ItemStack(Blocks.titane_ore), new ItemStack(Items.titane_ingot), 0.1F);
    }
}
