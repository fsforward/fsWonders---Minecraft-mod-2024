package com.fsforward.fswonders.items;

import com.fsforward.fswonders.CustomItemGroups;
import com.fsforward.fswonders.FsWonders;
import com.fsforward.fswonders.blocks.CustomBlocks;
import com.fsforward.fswonders.items.custom.CustomFoodComponents;
import com.fsforward.fswonders.items.custom.GlassJarFoodItem;
import com.fsforward.fswonders.items.custom.TinCanFoodItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CustomItems {
    // Tin Can Food Items
    public static final Item PUFFER_FISH_TIN_CAN = registerTinCanFood("pufferfish_tin_can", CustomFoodComponents.PUFFERFISH_TIN_CAN);
    public static final Item COD_FISH_TIN_CAN = registerTinCanFood("cod_fish_tin_can", CustomFoodComponents.COD_FISH_TIN_CAN);
    public static final Item SALMON_FISH_TIN_CAN = registerTinCanFood("salmon_fish_tin_can", CustomFoodComponents.SALMON_FISH_TIN_CAN);
    public static final Item TROPICAL_FISH_TIN_CAN = registerTinCanFood("tropical_fish_tin_can", CustomFoodComponents.TROPICAL_FISH_TIN_CAN);
    public static final Item VEGETABLE_TIN_CAN = registerTinCanFood("vegetable_tin_can", CustomFoodComponents.VEGETABLE_TIN_CAN);
    // Regular Food Items
    public static final Item MUFFIN = registerFood("muffin", CustomFoodComponents.MUFFIN, 16);
    public static final Item SWEET_BERRIES_SOUP = registerFood("sweet_berries_soup", CustomFoodComponents.SWEET_BERRIES_SOUP, 1);
    public static final Item BROWN_MUNCHROOM = registerFood("brown_munchroom", CustomFoodComponents.BROWN_MUNCHROOM);
    public static final Item RED_MUNCHROOM = registerFood("red_munchroom", CustomFoodComponents.RED_MUNCHROOM);
    public static final Item APPLE_PIE = registerFood("apple_pie", CustomFoodComponents.APPLE_PIE);
    public static final Item GREEN_APPLE = registerFood("green_apple", CustomFoodComponents.GREEN_APPLE);
    // Glass Jar Food Items
    public static final Item RED_JAM = registerGlassJarFood("red_jam", CustomFoodComponents.RED_JAM);
    public static final Item GREEN_JAM = registerGlassJarFood("green_jam", CustomFoodComponents.GREEN_JAM);
    // Block Items
    public static final Item RED_CANDY_CANE = registerBlockItemFood("red_candy_cane", CustomBlocks.RED_CANDY_CANE, CustomFoodComponents.RED_CANDY_CANE);
    public static final Item GREEN_CANDY_CANE = registerBlockItemFood("green_candy_cane", CustomBlocks.GREEN_CANDY_CANE, CustomFoodComponents.GREEN_CANDY_CANE);
    public static final Item BLUE_CANDY_CANE = registerBlockItemFood("blue_candy_cane", CustomBlocks.BLUE_CANDY_CANE, CustomFoodComponents.BLUE_CANDY_CANE);
    public static final Item GOLDEN_CANDY_CANE = registerBlockItemFood("golden_candy_cane", CustomBlocks.GOLDEN_CANDY_CANE, CustomFoodComponents.GOLDEN_CANDY_CANE);
    // Miscellaneous Items
    public static final Item TIN_CAN = registerMiscItem("tin_can", CustomItemGroups.FS_WONDERS_MISC_GROUP);
    public static final Item WATERED_TIN_CAN = registerMiscItem("watered_tin_can", CustomItemGroups.FS_WONDERS_MISC_GROUP);
    public static final Item GLASS_JAR = registerMiscItem("glass_jar", CustomItemGroups.FS_WONDERS_MISC_GROUP);
    // Wood Items
    // Black Ash
    public static final Item BLACK_ASH_LOG = registerBlockItem("black_ash_log", CustomBlocks.BLACK_ASH_LOG, CustomItemGroups.FS_WONDERS_WOOD_GROUP);
    public static final Item STRIPPED_BLACK_ASH_LOG = registerBlockItem("stripped_black_ash_log", CustomBlocks.STRIPPED_BLACK_ASH_LOG, CustomItemGroups.FS_WONDERS_WOOD_GROUP);
    public static final Item BLACK_ASH_WOOD = registerBlockItem("black_ash_wood", CustomBlocks.BLACK_ASH_WOOD, CustomItemGroups.FS_WONDERS_WOOD_GROUP);
    public static final Item STRIPPED_BLACK_ASH_WOOD = registerBlockItem("stripped_black_ash_wood", CustomBlocks.STRIPPED_BLACK_ASH_WOOD, CustomItemGroups.FS_WONDERS_WOOD_GROUP);
    public static final Item BLACK_ASH_PLANKS = registerBlockItem("black_ash_planks", CustomBlocks.BLACK_ASH_PLANKS, CustomItemGroups.FS_WONDERS_WOOD_GROUP);
    public static final Item BLACK_ASH_LEAVES = registerBlockItem("black_ash_leaves", CustomBlocks.BLACK_ASH_LEAVES, CustomItemGroups.FS_WONDERS_WOOD_GROUP);
    // Mahogany
    public static final Item MAHOGANY_LOG = registerBlockItem("mahogany_log", CustomBlocks.MAHOGANY_LOG, CustomItemGroups.FS_WONDERS_WOOD_GROUP);
    public static final Item STRIPPED_MAHOGANY_LOG = registerBlockItem("stripped_mahogany_log", CustomBlocks.STRIPPED_MAHOGANY_LOG, CustomItemGroups.FS_WONDERS_WOOD_GROUP);
    public static final Item MAHOGANY_WOOD = registerBlockItem("mahogany_wood", CustomBlocks.MAHOGANY_WOOD, CustomItemGroups.FS_WONDERS_WOOD_GROUP);
    public static final Item STRIPPED_MAHOGANY_WOOD = registerBlockItem("stripped_mahogany_wood", CustomBlocks.STRIPPED_MAHOGANY_WOOD, CustomItemGroups.FS_WONDERS_WOOD_GROUP);
    public static final Item MAHOGANY_PLANKS = registerBlockItem("mahogany_planks", CustomBlocks.MAHOGANY_PLANKS, CustomItemGroups.FS_WONDERS_WOOD_GROUP);
    public static final Item MAHOGANY_LEAVES = registerBlockItem("mahogany_leaves", CustomBlocks.MAHOGANY_LEAVES, CustomItemGroups.FS_WONDERS_WOOD_GROUP);
    // Pinkyeus
    public static final Item PINKYEUS_LOG = registerBlockItem("pinkyeus_log", CustomBlocks.PINKYEUS_LOG, CustomItemGroups.FS_WONDERS_WOOD_GROUP);
    public static final Item STRIPPED_PINKYEUS_LOG = registerBlockItem("stripped_pinkyeus_log", CustomBlocks.STRIPPED_PINKYEUS_LOG, CustomItemGroups.FS_WONDERS_WOOD_GROUP);
    public static final Item PINKYEUS_WOOD = registerBlockItem("pinkyeus_wood", CustomBlocks.PINKYEUS_WOOD, CustomItemGroups.FS_WONDERS_WOOD_GROUP);
    public static final Item STRIPPED_PINKYEUS_WOOD = registerBlockItem("stripped_pinkyeus_wood", CustomBlocks.STRIPPED_PINKYEUS_WOOD, CustomItemGroups.FS_WONDERS_WOOD_GROUP);
    public static final Item PINKYEUS_PLANKS = registerBlockItem("pinkyeus_planks", CustomBlocks.PINKYEUS_PLANKS, CustomItemGroups.FS_WONDERS_WOOD_GROUP);
    public static final Item PINKYEUS_LEAVES = registerBlockItem("pinkyeus_leaves", CustomBlocks.PINKYEUS_LEAVES, CustomItemGroups.FS_WONDERS_WOOD_GROUP);

    private static Item registerTinCanFood(String id, FoodComponent foodComponent) {
        return register(id, new TinCanFoodItem(new FabricItemSettings().maxCount(64).group(CustomItemGroups.FS_WONDERS_FOOD_GROUP).food(foodComponent)));
    }

    private static Item registerFood(String id, FoodComponent foodComponent, int maxCount) {
        return register(id, new Item(new FabricItemSettings().maxCount(maxCount).group(CustomItemGroups.FS_WONDERS_FOOD_GROUP).food(foodComponent)));
    }

    private static Item registerFood(String id, FoodComponent foodComponent) {
        return register(id, new Item(new FabricItemSettings().maxCount(64).group(CustomItemGroups.FS_WONDERS_FOOD_GROUP).food(foodComponent)));
    }

    private static Item registerGlassJarFood(String id, FoodComponent foodComponent) {
        return register(id, new GlassJarFoodItem(new FabricItemSettings().maxCount(64).group(CustomItemGroups.FS_WONDERS_FOOD_GROUP).food(foodComponent)));
    }

    private static Item registerBlockItemFood(String id, Block block, FoodComponent foodComponent) {
        return register(id, new BlockItem(block, new FabricItemSettings().maxCount(64).group(CustomItemGroups.FS_WONDERS_FOOD_GROUP).food(foodComponent)));
    }

    private static Item registerBlockItem(String id, Block block, ItemGroup itemGroup) {
        return register(id, new BlockItem(block, new FabricItemSettings().maxCount(64).group(itemGroup)));
    }

    private static Item registerMiscItem(String id, ItemGroup itemGroup) {
        return register(id, new Item(new FabricItemSettings().group(itemGroup)));
    }

    private static Item register(String id, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FsWonders.MOD_ID, id), item);
    }

    public static void RegisterItems() {
        FsWonders.LOGGER.info("Registering custom [Items] for: fsWonders");
    }
}