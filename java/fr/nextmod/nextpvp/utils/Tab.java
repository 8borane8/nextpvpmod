package fr.nextmod.nextpvp.utils;

import fr.nextmod.nextpvp.init.Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Tab extends CreativeTabs {

    public Tab(String l) {
        super(l);
    }

    @Override
    public Item getTabIconItem() {
        return Items.legendarium_sword;
    }
}
