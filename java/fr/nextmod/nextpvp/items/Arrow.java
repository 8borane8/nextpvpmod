package fr.nextmod.nextpvp.items;

import net.minecraft.item.Item;

public class Arrow extends Item {
    private int effect;

    public Arrow(int effect) {
        this.effect = effect;
    }

    public int getEffect() {
        return this.effect;
    }
}
