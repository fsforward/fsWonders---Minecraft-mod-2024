package com.fsforward.fswonders.items.custom;

import com.fsforward.fswonders.items.CustomItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class TinCanFoodItem extends Item {
    public TinCanFoodItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (user instanceof PlayerEntity && !((PlayerEntity) user).abilities.creativeMode) {
            stack.decrement(1);
            user.eatFood(world, stack);
            if (!((PlayerEntity) user).inventory.insertStack(new ItemStack(CustomItems.TIN_CAN))) {
                user.dropItem(new ItemStack(CustomItems.TIN_CAN).getItem());
            }
        }
        return stack;
    }
}
