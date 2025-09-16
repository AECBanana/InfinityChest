package com.frenqy.infinityChest.init;

import com.frenqy.infinityChest.tileentity.TileEntityInfinityChest;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class ModRegistry {

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        ModBlocks.init();
        event.getRegistry().register(ModBlocks.INFINITY_CHEST_BLOCK);

        // 注册TileEntity
        GameRegistry.registerTileEntity(TileEntityInfinityChest.class,
            new ResourceLocation("infinitychest", "infinity_chest"));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(ModBlocks.INFINITY_CHEST_ITEM);
    }
}
