package com.fsforward.fswonders;

import com.fsforward.fswonders.blocks.CustomBlocks;
import com.fsforward.fswonders.items.CustomItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FsWonders implements ModInitializer {
	public static final String MOD_ID = "fswonders";
    public static final Logger LOGGER = LogManager.getLogger("fswonders");

	@Override
	public void onInitialize() {
		CustomItemGroups.RegisterGroups();
		CustomItems.RegisterItems();
		CustomBlocks.RegisterBlocks();
		this.RegisterFlammableBlocks();
	}

	public void RegisterFlammableBlocks() {
		FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

		instance.add(CustomBlocks.BLACK_ASH_LOG, 5, 5);
		instance.add(CustomBlocks.STRIPPED_BLACK_ASH_LOG, 5 ,5);
		instance.add(CustomBlocks.BLACK_ASH_WOOD, 5, 5);
		instance.add(CustomBlocks.STRIPPED_BLACK_ASH_WOOD, 5, 5);
		instance.add(CustomBlocks.BLACK_ASH_PLANKS, 5, 20);
		instance.add(CustomBlocks.BLACK_ASH_LEAVES, 60, 30);

		instance.add(CustomBlocks.MAHOGANY_LOG, 5, 5);
		instance.add(CustomBlocks.STRIPPED_MAHOGANY_LOG, 5 ,5);
		instance.add(CustomBlocks.MAHOGANY_WOOD, 5, 5);
		instance.add(CustomBlocks.STRIPPED_MAHOGANY_WOOD, 5, 5);
		instance.add(CustomBlocks.MAHOGANY_PLANKS, 5, 20);
		instance.add(CustomBlocks.MAHOGANY_LEAVES, 60, 30);

		instance.add(CustomBlocks.PINKYEUS_LOG, 5, 5);
		instance.add(CustomBlocks.STRIPPED_PINKYEUS_LOG, 5 ,5);
		instance.add(CustomBlocks.PINKYEUS_WOOD, 5, 5);
		instance.add(CustomBlocks.STRIPPED_PINKYEUS_WOOD, 5, 5);
		instance.add(CustomBlocks.PINKYEUS_PLANKS, 5, 20);
		instance.add(CustomBlocks.PINKYEUS_LEAVES, 60, 30);
	}
}