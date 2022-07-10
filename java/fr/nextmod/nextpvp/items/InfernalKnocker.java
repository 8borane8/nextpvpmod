package fr.nextmod.nextpvp.items;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class InfernalKnocker extends ItemSword {
    public InfernalKnocker() {
        super(Item.ToolMaterial.WOOD);
    }

    @Override
    public void onUpdate(ItemStack p_77663_1_, World p_77663_2_, Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_) {
        if(!p_77663_1_.isItemEnchanted())
            p_77663_1_.addEnchantment(Enchantment.knockback, 5);
        super.onUpdate(p_77663_1_, p_77663_2_, p_77663_3_, p_77663_4_, p_77663_5_);
    }

    @Override
    public void onCreated(ItemStack stack, World p_77622_2_, EntityPlayer p_77622_3_) {
        if(!stack.isItemEnchanted())
            stack.addEnchantment(Enchantment.knockback, 5);
        super.onCreated(stack, p_77622_2_, p_77622_3_);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return false;
    }

    @Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
        return false;
    }
}
