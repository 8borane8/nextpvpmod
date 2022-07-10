package fr.nextmod.nextpvp.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.nextmod.nextpvp.Main;
import fr.nextmod.nextpvp.items.*;
import fr.nextmod.nextpvp.utils.References;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class Items {
    public static Item hang_glider;

    public static Item.ToolMaterial amethystTool = EnumHelper.addToolMaterial("amethystTool", 3, 1999, 20.0F, 4F, 15);
    public static ItemArmor.ArmorMaterial amethystArmor = EnumHelper.addArmorMaterial("amethystArmor", 225, new int[]{3, 8, 6, 3}, 15);
    public static Item amethyst_ingot, amethyst_stick, amethyst_sword, amethyst_pickaxe, amethyst_shovel, amethyst_axe, amethyst_helmet, amethyst_chestplate, amethyst_leggings, amethyst_boots;

    public static Item.ToolMaterial titaneTool = EnumHelper.addToolMaterial("titaneTool", 3, 2999, 24F, 5F, 20);
    public static ItemArmor.ArmorMaterial titaneArmor = EnumHelper.addArmorMaterial("titaneArmor", 275, new int[]{4, 8, 6, 3}, 30);
    public static Item titane_ingot, titane_stick, titane_sword, titane_pickaxe, titane_shovel, titane_axe, titane_helmet, titane_chestplate, titane_leggings, titane_boots;

    public static Item.ToolMaterial legendariumTool = EnumHelper.addToolMaterial("legendariumTool", 3, 4999, 30F, 6F, 30);
    public static ItemArmor.ArmorMaterial legendariumArmor = EnumHelper.addArmorMaterial("legendariumArmor", 350, new int[]{5, 8, 6, 3}, 30);
    public static Item legendarium_ingot, legendarium_stick, legendarium_sword, legendarium_pickaxe, legendarium_shovel, legendarium_axe, legendarium_helmet, legendarium_chestplate, legendarium_leggings, legendarium_boots;

    public static Item.ToolMaterial ultimateTool = EnumHelper.addToolMaterial("ultimateTool", 3, 4999, 30, 7F, 35);
    public static ItemArmor.ArmorMaterial ultimateArmor = EnumHelper.addArmorMaterial("ultimateArmor", 400, new int[]{5, 8, 6, 3}, 30);
    public static Item ultimate_ingot, ultimate_stick, ultimate_sword, ultimate_pickaxe, ultimate_shovel, ultimate_axe, ultimate_helmet, ultimate_chestplate, ultimate_leggings, ultimate_boots;

    public static Item energium;

    public static Item dynamite, big_dynamite, ninja_dynamite, ultimate_dynamite;

    public static Item dopant_stick, power_stick, super_stick, flash_stick, damage_stick, jump_stick, hyper_jump_stick;

    public static Item unclaim_finderI, unclaim_finderII, unclaim_finderIII;

    public static Item potion_launcher;

    public static Item wings, compressed_legendarium, guardian_stone, legendarium_core;

    public static Item heal_orb, speed_orb, strenght_orb, jump_orb;

    public static Item legendarium_upgrade, diamond_string, legendarium_apple;

    public static ItemArmor.ArmorMaterial travelArmor = EnumHelper.addArmorMaterial("travelArmor", 40, new int[]{2, 6, 5, 2}, 30);
    public static Item slimy_helmet, scuba_helmet, hood_helmet;

    public static Item travel_chestplate, travel_leggings, travel_boots;

    public static Item void_stone;

    public static Item sickness_potion, web_potion;

    public static Item wither_fragment;

    public static Item switch_arrow, poison_arrow, wither_arrow, slowness_arrow;

    public static Item infernal_knocker;

    public static Item amethyst_broadsword, titane_broadsword, legendarium_broadsword;

    public static Item amethyst_fastsword, titane_fastsword, legendarium_fastsword;

    public static Item amethyst_hammer, titane_hammer, legendarium_hammer;

    public static Item ring, small_ring, big_ring;

    public static Item legendarium_bow, backpack, obsidian_door_item, supercalculator;

    public static void init() {
        hang_glider = new HangGlider().setUnlocalizedName("hang_glider").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":hang_glider");

        amethyst_ingot = new Item().setUnlocalizedName("amethyst_ingot").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":amethyst_ingot");
        amethyst_stick = new Item().setUnlocalizedName("amethyst_stick").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":amethyst_stick");
        amethyst_sword = new Sword(amethystTool).setUnlocalizedName("amethyst_sword").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":amethyst_sword");
        amethyst_pickaxe = new Pickaxe(amethystTool).setUnlocalizedName("amethyst_pickaxe").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":amethyst_pickaxe");
        amethyst_shovel = new Shovel(amethystTool).setUnlocalizedName("amethyst_shovel").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":amethyst_shovel");
        amethyst_axe = new Axe(amethystTool).setUnlocalizedName("amethyst_axe").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":amethyst_axe");
        amethyst_helmet = new Armor(amethystArmor, 0, 0, "amethyst").setUnlocalizedName("amethyst_helmet").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":amethyst_helmet");
        amethyst_chestplate = new Armor(amethystArmor, 0, 1, "amethyst").setUnlocalizedName("amethyst_chestplate").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":amethyst_chestplate");
        amethyst_leggings = new Armor(amethystArmor, 0, 2, "amethyst").setUnlocalizedName("amethyst_leggings").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":amethyst_leggings");
        amethyst_boots = new Armor(amethystArmor, 0, 3, "amethyst").setUnlocalizedName("amethyst_boots").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":amethyst_boots");

        titane_ingot = new Item().setUnlocalizedName("titane_ingot").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":titane_ingot");
        titane_stick = new Item().setUnlocalizedName("titane_stick").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":titane_stick");
        titane_sword = new Sword(titaneTool).setUnlocalizedName("titane_sword").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":titane_sword");
        titane_pickaxe = new Pickaxe(titaneTool).setUnlocalizedName("titane_pickaxe").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":titane_pickaxe");
        titane_shovel = new Shovel(titaneTool).setUnlocalizedName("titane_shovel").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":titane_shovel");
        titane_axe = new Axe(titaneTool).setUnlocalizedName("titane_axe").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":titane_axe");
        titane_helmet = new Armor(titaneArmor, 0, 0, "titane").setUnlocalizedName("titane_helmet").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":titane_helmet");
        titane_chestplate = new Armor(titaneArmor, 0, 1, "titane").setUnlocalizedName("titane_chestplate").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":titane_chestplate");
        titane_leggings = new Armor(titaneArmor, 0, 2, "titane").setUnlocalizedName("titane_leggings").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":titane_leggings");
        titane_boots = new Armor(titaneArmor, 0, 3, "titane").setUnlocalizedName("titane_boots").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":titane_boots");

        legendarium_ingot = new Item().setUnlocalizedName("legendarium_ingot").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":legendarium_ingot");
        legendarium_stick = new Item().setUnlocalizedName("legendarium_stick").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":legendarium_stick");
        legendarium_sword = new Sword(legendariumTool).setUnlocalizedName("legendarium_sword").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":legendarium_sword");
        legendarium_pickaxe = new Pickaxe(legendariumTool).setUnlocalizedName("legendarium_pickaxe").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":legendarium_pickaxe");
        legendarium_shovel = new Shovel(legendariumTool).setUnlocalizedName("legendarium_shovel").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":legendarium_shovel");
        legendarium_axe = new Axe(legendariumTool).setUnlocalizedName("legendarium_axe").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":legendarium_axe");
        legendarium_helmet = new Armor(legendariumArmor, 0, 0, "legendarium").setUnlocalizedName("legendarium_helmet").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":legendarium_helmet");
        legendarium_chestplate = new Armor(legendariumArmor, 0, 1, "legendarium").setUnlocalizedName("legendarium_chestplate").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":legendarium_chestplate");
        legendarium_leggings = new Armor(legendariumArmor, 0, 2, "legendarium").setUnlocalizedName("legendarium_leggings").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":legendarium_leggings");
        legendarium_boots = new Armor(legendariumArmor, 0, 3, "legendarium").setUnlocalizedName("legendarium_boots").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":legendarium_boots");

        ultimate_ingot = new Item().setUnlocalizedName("ultimate_ingot").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":ultimate_ingot");
        ultimate_stick = new Item().setUnlocalizedName("ultimate_stick").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":ultimate_stick");
        ultimate_sword = new Sword(ultimateTool).setUnlocalizedName("ultimate_sword").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":ultimate_sword");
        ultimate_pickaxe = new Pickaxe(ultimateTool).setUnlocalizedName("ultimate_pickaxe").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":ultimate_pickaxe");
        ultimate_shovel = new Shovel(ultimateTool).setUnlocalizedName("ultimate_shovel").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":ultimate_shovel");
        ultimate_axe = new Axe(ultimateTool).setUnlocalizedName("ultimate_axe").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":ultimate_axe");
        ultimate_helmet = new Armor(ultimateArmor, 0, 0, "ultimate").setUnlocalizedName("ultimate_helmet").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":ultimate_helmet");
        ultimate_chestplate = new Armor(ultimateArmor, 0, 1, "ultimate").setUnlocalizedName("ultimate_chestplate").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":ultimate_chestplate");
        ultimate_leggings = new Armor(ultimateArmor, 0, 2, "ultimate").setUnlocalizedName("ultimate_leggings").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":ultimate_leggings");
        ultimate_boots = new Armor(ultimateArmor, 0, 3, "ultimate").setUnlocalizedName("ultimate_boots").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":ultimate_boots");

        energium = new Item().setUnlocalizedName("energium").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":energium");

        dynamite = new Dynamite().setUnlocalizedName("dynamite").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":dynamite");
        big_dynamite = new BigDynamite().setUnlocalizedName("big_dynamite").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":big_dynamite");
        ninja_dynamite = new NinjaDynamite().setUnlocalizedName("ninja_dynamite").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":ninja_dynamite");
        ultimate_dynamite = new UltimateDynamite().setUnlocalizedName("ultimate_dynamite").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":ultimate_dynamite");

        dopant_stick = new Stick(9).setUnlocalizedName("dopant_stick").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":dopant_stick");
        power_stick = new Stick(10).setUnlocalizedName("power_stick").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":power_stick");
        super_stick = new Stick(12).setUnlocalizedName("super_stick").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":super_stick");
        flash_stick = new Stick(8).setUnlocalizedName("flash_stick").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":flash_stick");
        damage_stick = new Stick(10).setUnlocalizedName("damage_stick").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":damage_stick");
        jump_stick = new Stick(8).setUnlocalizedName("jump_stick").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":jump_stick");
        hyper_jump_stick = new Stick(12).setUnlocalizedName("hyper_jump_stick").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":hyper_jump_stick");

        unclaim_finderI = new Item().setUnlocalizedName("unclaim_finderI").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":unclaim_finderI").setMaxStackSize(1);
        unclaim_finderII = new Item().setUnlocalizedName("unclaim_finderII").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":unclaim_finderII").setMaxStackSize(1);
        unclaim_finderIII = new Item().setUnlocalizedName("unclaim_finderIII").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":unclaim_finderIII").setMaxStackSize(1);

        potion_launcher = new PotionLauncher().setUnlocalizedName("potion_launcher").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":potion_launcher").setMaxStackSize(1);

        wings = new Item().setUnlocalizedName("wings").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":wings");
        compressed_legendarium = new Item().setUnlocalizedName("compressed_legendarium").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":compressed_legendarium");
        guardian_stone = new Item().setUnlocalizedName("guardian_stone").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":guardian_stone");
        legendarium_core = new Item().setUnlocalizedName("legendarium_core").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":legendarium_core");

        heal_orb = new Item().setUnlocalizedName("heal_orb").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":heal_orb");
        speed_orb = new Item().setUnlocalizedName("speed_orb").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":speed_orb");
        strenght_orb = new Item().setUnlocalizedName("strenght_orb").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":strenght_orb");
        jump_orb = new Item().setUnlocalizedName("jump_orb").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":jump_orb");

        legendarium_upgrade = new Item().setUnlocalizedName("legendarium_upgrade").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":legendarium_upgrade").setMaxStackSize(16);
        diamond_string = new Item().setUnlocalizedName("diamond_string").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":diamond_string");
        legendarium_apple = new LegendariumApple().setUnlocalizedName("legendarium_apple").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":legendarium_apple");

        slimy_helmet = new Travel(travelArmor, 0, 0).setUnlocalizedName("slimy_helmet").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":slimy_helmet");
        scuba_helmet = new Travel(travelArmor, 0, 0).setUnlocalizedName("scuba_helmet").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":scuba_helmet");
        hood_helmet = new Travel(travelArmor, 0, 0).setUnlocalizedName("hood_helmet").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":hood_helmet");

        travel_chestplate = new Travel(travelArmor, 0, 1).setUnlocalizedName("travel_chestplate").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":travel_chestplate");
        travel_leggings = new Travel(travelArmor, 0, 2).setUnlocalizedName("travel_leggings").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":travel_leggings");
        travel_boots = new Travel(travelArmor, 0, 3).setUnlocalizedName("travel_boots").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":travel_boots");

        void_stone = new VoidStone().setUnlocalizedName("void_stone").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":void_stone").setMaxStackSize(1);

        sickness_potion = new Potion().setUnlocalizedName("sickness_potion").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":sickness_potion").setMaxStackSize(1);
        web_potion = new Potion().setUnlocalizedName("web_potion").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":web_potion").setMaxStackSize(1);

        wither_fragment = new Item().setUnlocalizedName("wither_fragment").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":wither_fragment");

        switch_arrow = new Arrow(0).setUnlocalizedName("switch_arrow").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":switch_arrow");
        poison_arrow = new Arrow(1).setUnlocalizedName("poison_arrow").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":poison_arrow");
        wither_arrow = new Arrow(2).setUnlocalizedName("wither_arrow").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":wither_arrow");
        slowness_arrow = new Arrow(3).setUnlocalizedName("slowness_arrow").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":slowness_arrow");

        infernal_knocker = new InfernalKnocker().setUnlocalizedName("infernal_knocker").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":infernal_knocker");

        amethyst_broadsword = new FastOrBroadsword(8, 1999).setUnlocalizedName("amethyst_broadsword").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":amethyst_broadsword");
        titane_broadsword = new FastOrBroadsword(12, 2999).setUnlocalizedName("titane_broadsword").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":titane_broadsword");
        legendarium_broadsword = new FastOrBroadsword(12, 4999).setUnlocalizedName("legendarium_broadsword").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":legendarium_broadsword");

        amethyst_fastsword = new FastOrBroadsword(5, 1999).setUnlocalizedName("amethyst_fastsword").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":amethyst_fastsword");
        titane_fastsword = new FastOrBroadsword(6, 2999).setUnlocalizedName("titane_fastsword").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":titane_fastsword");
        legendarium_fastsword = new FastOrBroadsword(7, 4999).setUnlocalizedName("legendarium_fastsword").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":legendarium_fastsword");

        amethyst_hammer = new Hammer(amethystTool).setUnlocalizedName("amethyst_hammer").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":amethyst_hammer");
        titane_hammer = new Hammer(titaneTool).setUnlocalizedName("titane_hammer").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":titane_hammer");
        legendarium_hammer = new Hammer(legendariumTool).setUnlocalizedName("legendarium_hammer").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":legendarium_hammer");

        ring = new Ring().setUnlocalizedName("ring").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":ring").setMaxStackSize(1).setMaxDamage(1999);
        small_ring = new Ring().setUnlocalizedName("small_ring").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":small_ring").setMaxStackSize(1).setMaxDamage(2999);
        big_ring = new Ring().setUnlocalizedName("big_ring").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":big_ring").setMaxStackSize(1).setMaxDamage(4999);

        legendarium_bow = new Bow().setUnlocalizedName("legendarium_bow").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":legendarium_bow");
        backpack = new Backpack().setUnlocalizedName("backpack").setCreativeTab(Main.tab).setTextureName(References.MOD_ID + ":backpack");
        obsidian_door_item = new ObsidianDoorItem(Material.rock);

        supercalculator = new SuperCalculator();
    }

    public static void register() {
        GameRegistry.registerItem(hang_glider, hang_glider.getUnlocalizedName());

        GameRegistry.registerItem(amethyst_ingot, amethyst_ingot.getUnlocalizedName());
        GameRegistry.registerItem(amethyst_stick, amethyst_stick.getUnlocalizedName());
        GameRegistry.registerItem(amethyst_sword, amethyst_sword.getUnlocalizedName());
        GameRegistry.registerItem(amethyst_pickaxe, amethyst_pickaxe.getUnlocalizedName());
        GameRegistry.registerItem(amethyst_shovel, amethyst_shovel.getUnlocalizedName());
        GameRegistry.registerItem(amethyst_axe, amethyst_axe.getUnlocalizedName());
        GameRegistry.registerItem(amethyst_helmet, amethyst_helmet.getUnlocalizedName());
        GameRegistry.registerItem(amethyst_chestplate, amethyst_chestplate.getUnlocalizedName());
        GameRegistry.registerItem(amethyst_leggings, amethyst_leggings.getUnlocalizedName());
        GameRegistry.registerItem(amethyst_boots, amethyst_boots.getUnlocalizedName());

        GameRegistry.registerItem(titane_ingot, titane_ingot.getUnlocalizedName());
        GameRegistry.registerItem(titane_stick, titane_stick.getUnlocalizedName());
        GameRegistry.registerItem(titane_sword, titane_sword.getUnlocalizedName());
        GameRegistry.registerItem(titane_pickaxe, titane_pickaxe.getUnlocalizedName());
        GameRegistry.registerItem(titane_shovel, titane_shovel.getUnlocalizedName());
        GameRegistry.registerItem(titane_axe, titane_axe.getUnlocalizedName());
        GameRegistry.registerItem(titane_helmet, titane_helmet.getUnlocalizedName());
        GameRegistry.registerItem(titane_chestplate, titane_chestplate.getUnlocalizedName());
        GameRegistry.registerItem(titane_leggings, titane_leggings.getUnlocalizedName());
        GameRegistry.registerItem(titane_boots, titane_boots.getUnlocalizedName());

        GameRegistry.registerItem(legendarium_ingot, legendarium_ingot.getUnlocalizedName());
        GameRegistry.registerItem(legendarium_stick, legendarium_stick.getUnlocalizedName());
        GameRegistry.registerItem(legendarium_sword, legendarium_sword.getUnlocalizedName());
        GameRegistry.registerItem(legendarium_pickaxe, legendarium_pickaxe.getUnlocalizedName());
        GameRegistry.registerItem(legendarium_shovel, legendarium_shovel.getUnlocalizedName());
        GameRegistry.registerItem(legendarium_axe, legendarium_axe.getUnlocalizedName());
        GameRegistry.registerItem(legendarium_helmet, legendarium_helmet.getUnlocalizedName());
        GameRegistry.registerItem(legendarium_chestplate, legendarium_chestplate.getUnlocalizedName());
        GameRegistry.registerItem(legendarium_leggings, legendarium_leggings.getUnlocalizedName());
        GameRegistry.registerItem(legendarium_boots, legendarium_boots.getUnlocalizedName());

        GameRegistry.registerItem(ultimate_ingot, ultimate_ingot.getUnlocalizedName());
        GameRegistry.registerItem(ultimate_stick, ultimate_stick.getUnlocalizedName());
        GameRegistry.registerItem(ultimate_sword, ultimate_sword.getUnlocalizedName());
        GameRegistry.registerItem(ultimate_pickaxe, ultimate_pickaxe.getUnlocalizedName());
        GameRegistry.registerItem(ultimate_shovel, ultimate_shovel.getUnlocalizedName());
        GameRegistry.registerItem(ultimate_axe, ultimate_axe.getUnlocalizedName());
        GameRegistry.registerItem(ultimate_helmet, ultimate_helmet.getUnlocalizedName());
        GameRegistry.registerItem(ultimate_chestplate, ultimate_chestplate.getUnlocalizedName());
        GameRegistry.registerItem(ultimate_leggings, ultimate_leggings.getUnlocalizedName());
        GameRegistry.registerItem(ultimate_boots, ultimate_boots.getUnlocalizedName());

        GameRegistry.registerItem(energium, energium.getUnlocalizedName());

        GameRegistry.registerItem(dynamite, dynamite.getUnlocalizedName());
        GameRegistry.registerItem(big_dynamite, big_dynamite.getUnlocalizedName());
        GameRegistry.registerItem(ninja_dynamite, ninja_dynamite.getUnlocalizedName());
        GameRegistry.registerItem(ultimate_dynamite, ultimate_dynamite.getUnlocalizedName());

        GameRegistry.registerItem(dopant_stick, dopant_stick.getUnlocalizedName());
        GameRegistry.registerItem(power_stick, power_stick.getUnlocalizedName());
        GameRegistry.registerItem(super_stick, super_stick.getUnlocalizedName());
        GameRegistry.registerItem(flash_stick, flash_stick.getUnlocalizedName());
        GameRegistry.registerItem(damage_stick, damage_stick.getUnlocalizedName());
        GameRegistry.registerItem(jump_stick, jump_stick.getUnlocalizedName());
        GameRegistry.registerItem(hyper_jump_stick, hyper_jump_stick.getUnlocalizedName());

        GameRegistry.registerItem(unclaim_finderI, unclaim_finderI.getUnlocalizedName());
        GameRegistry.registerItem(unclaim_finderII, unclaim_finderII.getUnlocalizedName());
        GameRegistry.registerItem(unclaim_finderIII, unclaim_finderIII.getUnlocalizedName());

        GameRegistry.registerItem(potion_launcher, potion_launcher.getUnlocalizedName());

        GameRegistry.registerItem(wings, wings.getUnlocalizedName());
        GameRegistry.registerItem(compressed_legendarium, compressed_legendarium.getUnlocalizedName());
        GameRegistry.registerItem(guardian_stone, guardian_stone.getUnlocalizedName());
        GameRegistry.registerItem(legendarium_core, legendarium_core.getUnlocalizedName());

        GameRegistry.registerItem(heal_orb, heal_orb.getUnlocalizedName());
        GameRegistry.registerItem(speed_orb, speed_orb.getUnlocalizedName());
        GameRegistry.registerItem(strenght_orb, strenght_orb.getUnlocalizedName());
        GameRegistry.registerItem(jump_orb, jump_orb.getUnlocalizedName());

        GameRegistry.registerItem(legendarium_upgrade, legendarium_upgrade.getUnlocalizedName());
        GameRegistry.registerItem(diamond_string, diamond_string.getUnlocalizedName());
        GameRegistry.registerItem(legendarium_apple, legendarium_apple.getUnlocalizedName());

        GameRegistry.registerItem(slimy_helmet, slimy_helmet.getUnlocalizedName());
        GameRegistry.registerItem(scuba_helmet, scuba_helmet.getUnlocalizedName());
        GameRegistry.registerItem(hood_helmet, hood_helmet.getUnlocalizedName());

        GameRegistry.registerItem(travel_chestplate, travel_chestplate.getUnlocalizedName());
        GameRegistry.registerItem(travel_leggings, travel_leggings.getUnlocalizedName());
        GameRegistry.registerItem(travel_boots, travel_boots.getUnlocalizedName());

        GameRegistry.registerItem(void_stone, void_stone.getUnlocalizedName());

        GameRegistry.registerItem(sickness_potion, sickness_potion.getUnlocalizedName());
        GameRegistry.registerItem(web_potion, web_potion.getUnlocalizedName());

        GameRegistry.registerItem(wither_fragment, wither_fragment.getUnlocalizedName());

        GameRegistry.registerItem(switch_arrow, switch_arrow.getUnlocalizedName());
        GameRegistry.registerItem(poison_arrow, poison_arrow.getUnlocalizedName());
        GameRegistry.registerItem(wither_arrow, wither_arrow.getUnlocalizedName());
        GameRegistry.registerItem(slowness_arrow, slowness_arrow.getUnlocalizedName());

        GameRegistry.registerItem(infernal_knocker, infernal_knocker.getUnlocalizedName());

        GameRegistry.registerItem(amethyst_broadsword, amethyst_broadsword.getUnlocalizedName());
        GameRegistry.registerItem(titane_broadsword, titane_broadsword.getUnlocalizedName());
        GameRegistry.registerItem(legendarium_broadsword, legendarium_broadsword.getUnlocalizedName());

        GameRegistry.registerItem(amethyst_fastsword, amethyst_fastsword.getUnlocalizedName());
        GameRegistry.registerItem(titane_fastsword, titane_fastsword.getUnlocalizedName());
        GameRegistry.registerItem(legendarium_fastsword, legendarium_fastsword.getUnlocalizedName());

        GameRegistry.registerItem(amethyst_hammer, amethyst_hammer.getUnlocalizedName());
        GameRegistry.registerItem(titane_hammer, titane_hammer.getUnlocalizedName());
        GameRegistry.registerItem(legendarium_hammer, legendarium_hammer.getUnlocalizedName());

        GameRegistry.registerItem(ring, ring.getUnlocalizedName());
        GameRegistry.registerItem(small_ring, small_ring.getUnlocalizedName());
        GameRegistry.registerItem(big_ring, big_ring.getUnlocalizedName());

        GameRegistry.registerItem(legendarium_bow, legendarium_bow.getUnlocalizedName());
        GameRegistry.registerItem(backpack, backpack.getUnlocalizedName());
        GameRegistry.registerItem(obsidian_door_item, obsidian_door_item.getUnlocalizedName());
        GameRegistry.registerItem(supercalculator, supercalculator.getUnlocalizedName());
    }
}
