package com.frenqy.infinityChest.init;

import com.frenqy.infinityChest.blocks.BlockInfinityChest;
import com.frenqy.infinityChest.items.ItemInfinityChest;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ModBlocks {

    public static Block INFINITY_CHEST_BLOCK;
    public static Item INFINITY_CHEST_ITEM;

    public static void init() {
        INFINITY_CHEST_BLOCK = new BlockInfinityChest();
        INFINITY_CHEST_ITEM = new ItemInfinityChest();
    }
}
