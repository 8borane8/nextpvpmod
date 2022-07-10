package fr.nextmod.nextpvp.items;

import fr.nextmod.nextpvp.Main;
import fr.nextmod.nextpvp.init.Blocks;
import fr.nextmod.nextpvp.utils.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ObsidianDoorItem extends ItemDoor {
    private Material material;

    public ObsidianDoorItem(Material material) {
        super(material);
        this.material = material;
        setCreativeTab(Main.tab);
        setTextureName(References.MOD_ID + ":obsidian_door_item");
        setUnlocalizedName("obsidian_door_item");

    }

    @Override
    public boolean onItemUse(ItemStack p_onItemUse_1_, EntityPlayer p_onItemUse_2_, World p_onItemUse_3_, int p_onItemUse_4_, int p_onItemUse_5_, int p_onItemUse_6_, int p_onItemUse_7_, float p_onItemUse_8_, float p_onItemUse_9_, float p_onItemUse_10_) {
        if(p_onItemUse_7_ != 1) {
            return false;
        } else {
            ++p_onItemUse_5_;
            Block var11;
            if(this.material == Material.rock) {
                var11 = Blocks.obsidian_door;
            } else return false;
            if(p_onItemUse_2_.canPlayerEdit(p_onItemUse_4_, p_onItemUse_5_, p_onItemUse_6_, p_onItemUse_7_, p_onItemUse_1_) && p_onItemUse_2_.canPlayerEdit(p_onItemUse_4_, p_onItemUse_5_ + 1, p_onItemUse_6_, p_onItemUse_7_, p_onItemUse_1_)) {
                if(!var11.canPlaceBlockAt(p_onItemUse_3_, p_onItemUse_4_, p_onItemUse_5_, p_onItemUse_6_)) {
                    return false;
                } else {
                    int var12 = MathHelper.floor_double((double) ((p_onItemUse_2_.rotationYaw + 180.0F) * 4.0F / 360.0F) - 0.5) & 3;
                    placeDoorBlock(p_onItemUse_3_, p_onItemUse_4_, p_onItemUse_5_, p_onItemUse_6_, var12, var11);
                    --p_onItemUse_1_.stackSize;
                    return true;
                }
            } else {
                return false;
            }
        }
    }

    public static void placeDoorBlock(World p_placeDoorBlock_0_, int p_placeDoorBlock_1_, int p_placeDoorBlock_2_, int p_placeDoorBlock_3_, int p_placeDoorBlock_4_, Block p_placeDoorBlock_5_) {
        byte var6 = 0;
        byte var7 = 0;
        if(p_placeDoorBlock_4_ == 0) {
            var7 = 1;
        }

        if(p_placeDoorBlock_4_ == 1) {
            var6 = -1;
        }

        if(p_placeDoorBlock_4_ == 2) {
            var7 = -1;
        }

        if(p_placeDoorBlock_4_ == 3) {
            var6 = 1;
        }

        int var8 = (p_placeDoorBlock_0_.getBlock(p_placeDoorBlock_1_ - var6, p_placeDoorBlock_2_, p_placeDoorBlock_3_ - var7).isNormalCube() ? 1 : 0) + (p_placeDoorBlock_0_.getBlock(p_placeDoorBlock_1_ - var6, p_placeDoorBlock_2_ + 1, p_placeDoorBlock_3_ - var7).isNormalCube() ? 1 : 0);
        int var9 = (p_placeDoorBlock_0_.getBlock(p_placeDoorBlock_1_ + var6, p_placeDoorBlock_2_, p_placeDoorBlock_3_ + var7).isNormalCube() ? 1 : 0) + (p_placeDoorBlock_0_.getBlock(p_placeDoorBlock_1_ + var6, p_placeDoorBlock_2_ + 1, p_placeDoorBlock_3_ + var7).isNormalCube() ? 1 : 0);
        boolean var10 = p_placeDoorBlock_0_.getBlock(p_placeDoorBlock_1_ - var6, p_placeDoorBlock_2_, p_placeDoorBlock_3_ - var7) == p_placeDoorBlock_5_ || p_placeDoorBlock_0_.getBlock(p_placeDoorBlock_1_ - var6, p_placeDoorBlock_2_ + 1, p_placeDoorBlock_3_ - var7) == p_placeDoorBlock_5_;
        boolean var11 = p_placeDoorBlock_0_.getBlock(p_placeDoorBlock_1_ + var6, p_placeDoorBlock_2_, p_placeDoorBlock_3_ + var7) == p_placeDoorBlock_5_ || p_placeDoorBlock_0_.getBlock(p_placeDoorBlock_1_ + var6, p_placeDoorBlock_2_ + 1, p_placeDoorBlock_3_ + var7) == p_placeDoorBlock_5_;
        boolean var12 = false;
        if(var10 && !var11) {
            var12 = true;
        } else if(var9 > var8) {
            var12 = true;
        }

        p_placeDoorBlock_0_.setBlock(p_placeDoorBlock_1_, p_placeDoorBlock_2_, p_placeDoorBlock_3_, p_placeDoorBlock_5_, p_placeDoorBlock_4_, 2);
        p_placeDoorBlock_0_.setBlock(p_placeDoorBlock_1_, p_placeDoorBlock_2_ + 1, p_placeDoorBlock_3_, p_placeDoorBlock_5_, 8 | (var12 ? 1 : 0), 2);
        p_placeDoorBlock_0_.notifyBlocksOfNeighborChange(p_placeDoorBlock_1_, p_placeDoorBlock_2_, p_placeDoorBlock_3_, p_placeDoorBlock_5_);
        p_placeDoorBlock_0_.notifyBlocksOfNeighborChange(p_placeDoorBlock_1_, p_placeDoorBlock_2_ + 1, p_placeDoorBlock_3_, p_placeDoorBlock_5_);
    }
}
