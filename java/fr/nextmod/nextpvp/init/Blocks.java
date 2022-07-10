package fr.nextmod.nextpvp.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.nextmod.nextpvp.Main;
import fr.nextmod.nextpvp.blocks.*;
import fr.nextmod.nextpvp.utils.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blocks {
    public static Block amethyst_ore, amethyst_block;
    public static Block titane_ore, titane_block;
    public static Block legendarium_ore, legendarium_block;
    public static Block ultimate_block;
    public static Block energium_ore, energium_block;

    public static Block invisible_block, cave_block, guard_block, guard_keeper;

    public static Block amethyst_mystery_box, titane_mystery_box, legendarium_mystery_box, ultimate_mystery_box;

    public static Block blue_obsidian, orange_obsidian, red_obsidian, wiwi_obsidian, black_obsidian, amethyst_pik_obsidian, titane_pik_obisidan, legendarium_pik_obisidan, poisonous_obsidian, green_obsidian,
            obsidian_slab, obsidian_door, mega_black_obsidian, antiagro_obsidian;

    public static Block legendarium_machine, bow_machine;

    public static Block legendarium_grinder, grinder_casing, grinder_frame;

    public static Block wood_spike, iron_spike, diamond_spike, amethyst_spike, titane_spike, legendarium_spike;

    public static Block slime_pad, web;

    public static void init() {
        amethyst_ore = new BaseBlock(Material.rock).setBlockName("amethyst_ore").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":amethyst_ore").setHardness(5F);
        amethyst_ore.setHarvestLevel("pickaxe", 2);
        amethyst_block = new BaseBlock(Material.rock).setBlockName("amethyst_block").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":amethyst_block");

        titane_ore = new BaseBlock(Material.rock).setBlockName("titane_ore").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":titane_ore").setHardness(7F);
        titane_ore.setHarvestLevel("pickaxe", 2);
        titane_block = new BaseBlock(Material.rock).setBlockName("titane_block").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":titane_block");

        legendarium_ore = new BaseBlock(Material.rock).setBlockName("legendarium_ore").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":legendarium_ore").setHardness(10F);
        legendarium_ore.setHarvestLevel("pickaxe", 3);
        legendarium_block = new BaseBlock(Material.rock).setBlockName("legendarium_block").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":legendarium_block").setResistance(100.0F);

        ultimate_block = new BaseBlock(Material.rock).setBlockName("ultimate_block").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":ultimate_block");

        energium_ore = new BaseBlock(Material.rock).setBlockName("energium_ore").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":energium_ore");
        energium_block = new BaseBlock(Material.rock).setBlockName("energium_block").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":energium_block");

        invisible_block = new InvisibleBlock(Material.rock).setBlockName("invisible_block").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":invisible_block");
        cave_block = new CaveBlock(Material.rock).setBlockName("cave_block").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":cave_block");
        guard_block = new BaseBlock(Material.rock).setBlockName("guard_block").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":guard_block");
        guard_keeper = new BaseBlock(Material.rock).setBlockName("guard_keeper").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":guard_keeper");

        amethyst_mystery_box = new MysteryBox(Material.rock).setBlockName("amethyst_mystery_box").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":amethyst_mystery_box");
        titane_mystery_box = new MysteryBox(Material.rock).setBlockName("titane_mystery_box").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":titane_mystery_box");
        legendarium_mystery_box = new MysteryBox(Material.rock).setBlockName("legendarium_mystery_box").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":legendarium_mystery_box");
        ultimate_mystery_box = new MysteryBox(Material.rock).setBlockName("ultimate_mystery_box").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":ultimate_mystery_box");

        blue_obsidian = new Obsidian(Material.rock).setBlockName("blue_obsidian").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":blue_obsidian");
        orange_obsidian = new Obsidian(Material.rock).setBlockName("orange_obsidian").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":orange_obsidian");
        red_obsidian = new Obsidian(Material.rock).setBlockName("red_obsidian").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":red_obsidian");
        wiwi_obsidian = new Obsidian(Material.rock).setBlockName("wiwi_obsidian").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":wiwi_obsidian");
        black_obsidian = new Obsidian(Material.rock).setBlockName("black_obsidian").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":black_obsidian");
        amethyst_pik_obsidian = new Obsidian(Material.rock).setBlockName("amethyst_pik_obsidian").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":amethyst_pik_obsidian");
        titane_pik_obisidan = new Obsidian(Material.rock).setBlockName("titane_pik_obisidan").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":titane_pik_obisidan");
        legendarium_pik_obisidan = new Obsidian(Material.rock).setBlockName("legendarium_pik_obisidan").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":legendarium_pik_obisidan");
        poisonous_obsidian = new Obsidian(Material.rock).setBlockName("poisonous_obsidian").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":poisonous_obsidian");
        green_obsidian = new Obsidian(Material.rock).setBlockName("green_obsidian").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":green_obsidian");
        mega_black_obsidian = new Obsidian(Material.rock).setBlockName("mega_black_obsidian").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":mega_black_obsidian");
        antiagro_obsidian = new Obsidian(Material.rock).setBlockName("antiagro_obsidian").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":antiagro_obsidian");

        legendarium_machine = new LegendariumMachine(Material.rock).setBlockName("legendarium_machine").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":legendarium_machine");
        bow_machine = new BaseBlock(Material.rock).setBlockName("bow_machine").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":bow_machine");

        legendarium_grinder = new Legendarium_grinder(Material.rock).setBlockName("legendarium_grinder").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":legendarium_grinder");
        grinder_casing = new BaseBlock(Material.rock).setBlockName("grinder_casing").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":grinder_casing");
        grinder_frame = new BaseBlock(Material.rock).setBlockName("grinder_frame").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":grinder_frame");

        wood_spike = new Spike(Material.iron, "wood_spike", "wood_spike_base", "wood_spike", 2F, false);
        iron_spike = new Spike(Material.iron, "iron_spike", "iron_spike_base", "iron_spike", 4.5F, false);
        diamond_spike = new Spike(Material.iron, "diamond_spike", "diamond_spike_base", "diamond_spike", 10F, false);
        amethyst_spike = new Spike(Material.iron, "amethyst_spike", "amethyst_spike_base", "amethyst_spike", 10F, false);
        titane_spike = new Spike(Material.iron, "titane_spike", "titane_spike_base", "titane_spike", 12F, false);
        legendarium_spike = new Spike(Material.iron, "legendarium_spike", "legendarium_spike_base", "legendarium_spike", 14F, true);

        slime_pad = new SlimePad().setBlockName("slime_pad").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":slime_pad");
        web = new Web().setBlockName("web").setCreativeTab(Main.tab).setBlockTextureName(References.MOD_ID + ":web");

        obsidian_slab = new ObsidianSlab(Material.rock);
        obsidian_door = new ObsidianDoor(Material.rock);
    }

    public static void register() {
        GameRegistry.registerBlock(amethyst_ore, amethyst_ore.getUnlocalizedName());
        GameRegistry.registerBlock(amethyst_block, amethyst_block.getUnlocalizedName());

        GameRegistry.registerBlock(titane_ore, titane_ore.getUnlocalizedName());
        GameRegistry.registerBlock(titane_block, titane_block.getUnlocalizedName());

        GameRegistry.registerBlock(legendarium_ore, legendarium_ore.getUnlocalizedName());
        GameRegistry.registerBlock(legendarium_block, legendarium_block.getUnlocalizedName());

        GameRegistry.registerBlock(ultimate_block, ultimate_block.getUnlocalizedName());

        GameRegistry.registerBlock(energium_ore, energium_ore.getUnlocalizedName());
        GameRegistry.registerBlock(energium_block, energium_block.getUnlocalizedName());

        GameRegistry.registerBlock(invisible_block, invisible_block.getUnlocalizedName());
        GameRegistry.registerBlock(cave_block, cave_block.getUnlocalizedName());
        GameRegistry.registerBlock(guard_block, guard_block.getUnlocalizedName());
        GameRegistry.registerBlock(guard_keeper, guard_keeper.getUnlocalizedName());

        GameRegistry.registerBlock(amethyst_mystery_box, amethyst_mystery_box.getUnlocalizedName());
        GameRegistry.registerBlock(titane_mystery_box, titane_mystery_box.getUnlocalizedName());
        GameRegistry.registerBlock(legendarium_mystery_box, legendarium_mystery_box.getUnlocalizedName());
        GameRegistry.registerBlock(ultimate_mystery_box, ultimate_mystery_box.getUnlocalizedName());

        GameRegistry.registerBlock(blue_obsidian, blue_obsidian.getUnlocalizedName());
        GameRegistry.registerBlock(orange_obsidian, orange_obsidian.getUnlocalizedName());
        GameRegistry.registerBlock(red_obsidian, red_obsidian.getUnlocalizedName());
        GameRegistry.registerBlock(wiwi_obsidian, wiwi_obsidian.getUnlocalizedName());
        GameRegistry.registerBlock(black_obsidian, black_obsidian.getUnlocalizedName());
        GameRegistry.registerBlock(amethyst_pik_obsidian, amethyst_pik_obsidian.getUnlocalizedName());
        GameRegistry.registerBlock(titane_pik_obisidan, titane_pik_obisidan.getUnlocalizedName());
        GameRegistry.registerBlock(legendarium_pik_obisidan, legendarium_pik_obisidan.getUnlocalizedName());
        GameRegistry.registerBlock(poisonous_obsidian, poisonous_obsidian.getUnlocalizedName());
        GameRegistry.registerBlock(green_obsidian, green_obsidian.getUnlocalizedName());
        GameRegistry.registerBlock(mega_black_obsidian, mega_black_obsidian.getUnlocalizedName());
        GameRegistry.registerBlock(antiagro_obsidian, antiagro_obsidian.getUnlocalizedName());

        GameRegistry.registerBlock(legendarium_machine, legendarium_machine.getUnlocalizedName());
        GameRegistry.registerBlock(bow_machine, bow_machine.getUnlocalizedName());

        GameRegistry.registerBlock(legendarium_grinder, legendarium_grinder.getUnlocalizedName());
        GameRegistry.registerBlock(grinder_casing, grinder_casing.getUnlocalizedName());
        GameRegistry.registerBlock(grinder_frame, grinder_frame.getUnlocalizedName());

        GameRegistry.registerBlock(wood_spike, wood_spike.getUnlocalizedName());
        GameRegistry.registerBlock(iron_spike, iron_spike.getUnlocalizedName());
        GameRegistry.registerBlock(diamond_spike, diamond_spike.getUnlocalizedName());
        GameRegistry.registerBlock(amethyst_spike, amethyst_spike.getUnlocalizedName());
        GameRegistry.registerBlock(titane_spike, titane_spike.getUnlocalizedName());
        GameRegistry.registerBlock(legendarium_spike, legendarium_spike.getUnlocalizedName());

        GameRegistry.registerBlock(slime_pad, slime_pad.getUnlocalizedName());
        GameRegistry.registerBlock(web, web.getUnlocalizedName());

        GameRegistry.registerBlock(obsidian_slab, obsidian_slab.getUnlocalizedName());
        GameRegistry.registerBlock(obsidian_door, obsidian_door.getUnlocalizedName());
    }
}
