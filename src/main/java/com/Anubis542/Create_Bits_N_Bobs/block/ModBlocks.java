package com.Anubis542.Create_Bits_N_Bobs.block;

import com.Anubis542.Create_Bits_N_Bobs.CreateBitsNBobs;
import com.Anubis542.Create_Bits_N_Bobs.Item.Moditems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CreateBitsNBobs.MOD_ID);

    public static final RegistryObject<Block> COPPER_CABLE = registerBlock("copper_cable",
            () -> new Block(BlockBehaviour.Properties.of()
                    .isRedstoneConductor().instabreak().requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final RegistryObject<Block> IRON_CABLE = registerBlock("iron_cable",
            () -> new Block(BlockBehaviour.Properties.of()
                    .isRedstoneConductor().instabreak().requiresCorrectToolForDrops().sound(SoundType.METAL)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        Moditems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()))
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
