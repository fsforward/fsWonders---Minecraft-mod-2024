package com.fsforward.fswonders.blocks;

import com.fsforward.fswonders.FsWonders;
import com.fsforward.fswonders.blocks.custom.CandyCaneBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CustomBlocks {
    // Candy Canes
    public static final Block RED_CANDY_CANE = registerCandyCane("red_candy_cane");
    public static final Block GREEN_CANDY_CANE = registerCandyCane("green_candy_cane");
    public static final Block BLUE_CANDY_CANE = registerCandyCane("blue_candy_cane");
    public static final Block GOLDEN_CANDY_CANE = registerCandyCane("golden_candy_cane");
    // Black Ash
    public static final Block BLACK_ASH_LOG = registerPillar("black_ash_log");
    public static final Block STRIPPED_BLACK_ASH_LOG = registerPillar("stripped_black_ash_log");
    public static final Block BLACK_ASH_WOOD = registerPillar("black_ash_wood");
    public static final Block STRIPPED_BLACK_ASH_WOOD = registerPillar("stripped_black_ash_wood");
    public static final Block BLACK_ASH_PLANKS = registerSimple("black_ash_planks");
    public static final Block BLACK_ASH_LEAVES = registerLeaves("black_ash_leaves");
    // Mahogany
    public static final Block MAHOGANY_LOG = registerPillar("mahogany_log");
    public static final Block STRIPPED_MAHOGANY_LOG = registerPillar("stripped_mahogany_log");
    public static final Block MAHOGANY_WOOD = registerPillar("mahogany_wood");
    public static final Block STRIPPED_MAHOGANY_WOOD = registerPillar("stripped_mahogany_wood");
    public static final Block MAHOGANY_PLANKS = registerSimple("mahogany_planks");
    public static final Block MAHOGANY_LEAVES = registerLeaves("mahogany_leaves");
    // Pinkyeus
    public static final Block PINKYEUS_LOG = registerPillar("pinkyeus_log");
    public static final Block STRIPPED_PINKYEUS_LOG = registerPillar("stripped_pinkyeus_log");
    public static final Block PINKYEUS_WOOD = registerPillar("pinkyeus_wood");
    public static final Block STRIPPED_PINKYEUS_WOOD = registerPillar("stripped_pinkyeus_wood");
    public static final Block PINKYEUS_PLANKS = registerSimple("pinkyeus_planks");
    public static final Block PINKYEUS_LEAVES = registerLeaves("pinkyeus_leaves");

    public static Block register(String id, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(FsWonders.MOD_ID, id), block);
    }

    private static Block registerCandyCane(String id) {
        return register(id, new CandyCaneBlock(FabricBlockSettings.of(Material.GLASS).strength(0.5F).breakByHand(true).sounds(BlockSoundGroup.GLASS).nonOpaque()));
    }

    private static Block registerPillar(String id) {
        return register(id, new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));
    }

    private static Block registerSimple(String id) {
        return register(id, new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    }

    private static Block registerLeaves(String id) {
        return register(id, new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));
    }

    public static void RegisterBlocks() {
        FsWonders.LOGGER.info("Registering custom [Blocks] for: fsWonders");
    }
}
