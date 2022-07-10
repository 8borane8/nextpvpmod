package fr.nextmod.nextpvp.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.nextmod.nextpvp.entitys.ArrowEntity;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class Bow extends ItemBow {

    public static final String[] iconsForDurations = new String[]{"Legendarium_bow_0", "Legendarium_bow_1", "Legendarium_bow_2"};
    private IIcon[] icons;

    public Bow() {
        setMaxDamage(900);
        setMaxStackSize(1);
    }

    public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int time) {
        int maxItemUse = getMaxItemUseDuration(stack) - time;
        ArrowLooseEvent event = new ArrowLooseEvent(player, stack, maxItemUse);
        if(event.isCanceled())
            return;
        maxItemUse = event.charge;
        MinecraftForge.EVENT_BUS.post(event);
        ItemStack ammo = checkForAmmo(player);
        boolean infiniteAmmo = (!player.capabilities.isCreativeMode && EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) <= 0);
        if(ammo == null && !infiniteAmmo)
            return;
        int type = (ammo != null) ? ((Arrow) ammo.getItem()).getEffect() : 0;
        float scaledItemUse = maxItemUse / 20.0F;
        if((scaledItemUse = (scaledItemUse * scaledItemUse + scaledItemUse * 2.0F) / 3.0F) < 0.1D)
            return;
        if(scaledItemUse > 1.0F)
            scaledItemUse = 1.0F;
        float range = 1.5F;
        ArrowEntity entityarrow = new ArrowEntity(world, player, scaledItemUse * range / 2.0F, type, infiniteAmmo);
        if(scaledItemUse == 1.0F)
            entityarrow.setIsCritical(true);
        int powerLevel;
        if((powerLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, stack)) > 0)
            entityarrow.setDamage(entityarrow.getDamage() + powerLevel * 0.5D + 0.5D);
        int punchLevel;
        if((punchLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, stack)) > 0)
            entityarrow.setKnockbackStrength(punchLevel);
        if(EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, stack) > 0)
            entityarrow.setFire(100);
        stack.damageItem(1, player);
        world.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + scaledItemUse * 0.5F);
        if(infiniteAmmo)
            player.inventory.consumeInventoryItem(ammo.getItem());
        if(!world.isRemote)
            world.spawnEntityInWorld(entityarrow);
    }

    private ItemStack checkForAmmo(EntityPlayer player) {
        InventoryPlayer inventory = player.inventory;
        for(int i = 0; i < inventory.getSizeInventory(); ) {
            ItemStack result = inventory.getStackInSlot(i);
            if(result == null || !(result.getItem() instanceof Arrow)) {
                i++;
                continue;
            }
            return result;
        }
        return null;
    }

    public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) {
        return stack;
    }

    public int getMaxItemUseDuration(ItemStack stack) {
        return 72000;
    }

    public EnumAction getItemUseAction(ItemStack p_77661_1_) {
        return EnumAction.bow;
    }

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        ArrowNockEvent event = new ArrowNockEvent(player, stack);
        MinecraftForge.EVENT_BUS.post(event);
        if(event.isCanceled())
            return event.result;
        if(player.capabilities.isCreativeMode || checkForAmmo(player) != null)
            player.setItemInUse(stack, getMaxItemUseDuration(stack));
        return stack;
    }

    public int getRenderPasses(int metadata) {
        return 3;
    }

    public boolean requiresMultipleRenderPasses() {
        return true;
    }

    public int getItemEnchantability() {
        return 1;
    }

    public boolean isFull3D() {
        return true;
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icons) {
        this.itemIcon = icons.registerIcon(getIconString());
        this.icons = new IIcon[iconsForDurations.length];
        for(int i = 0; i < this.icons.length; i++)
            this.icons[i] = icons.registerIcon(getIconString() + "_" + i);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getItemIconForUseDuration(int par1) {
        return this.icons[par1];
    }

    public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining) {
        if(player.getItemInUse() == null)
            return this.itemIcon;
        int pulling1 = 18;
        int pulling2 = 13;
        int pulling;
        if((pulling = stack.getMaxItemUseDuration() - useRemaining) >= pulling1)
            return this.icons[2];
        if(pulling > pulling2)
            return this.icons[1];
        return this.icons[0];
    }
}
