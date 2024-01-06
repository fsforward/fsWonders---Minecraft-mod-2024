package com.fsforward.fswonders;

import com.fsforward.fswonders.items.CustomItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CustomItemGroups {
    public static final ItemGroup FS_WONDERS_MISC_GROUP = FabricItemGroupBuilder.build(new Identifier(FsWonders.MOD_ID, "fswonders_misc_group"), () -> new ItemStack(CustomItems.TIN_CAN));
    public static final ItemGroup FS_WONDERS_WOOD_GROUP = FabricItemGroupBuilder.build(new Identifier(FsWonders.MOD_ID, "fswonders_wood_group"), () -> new ItemStack(CustomItems.BLACK_ASH_LOG));
    public static final ItemGroup FS_WONDERS_FOOD_GROUP = FabricItemGroupBuilder.build(new Identifier(FsWonders.MOD_ID, "fswonders_food_group"), () -> new ItemStack(CustomItems.TROPICAL_FISH_TIN_CAN));

    public static void RegisterGroups() {
        FsWonders.LOGGER.info("Registering custom [Item Groups] for: fsWonders");
    }
}
