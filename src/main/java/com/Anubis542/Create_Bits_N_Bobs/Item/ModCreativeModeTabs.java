package com.Anubis542.Create_Bits_N_Bobs.Item;

import com.Anubis542.Create_Bits_N_Bobs.CreateBitsNBobs;
import com.Anubis542.Create_Bits_N_Bobs.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateBitsNBobs.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CREATE_BITS_N_BOBS_TAB = CREATIVE_MODE_TABS.register("create_bits_n_bobs_tab",
            ()-> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COPPER_WIRE.get()))
                    .title(Component.translatable("creativetab.createbitsnbobs.create_bits_n_bobs_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                      output.accept(ModItems.COPPER_WIRE.get());
                      output.accept(ModItems.IRON_WIRE.get());
                      output.accept(ModBlocks.COPPER_CABLE.get());
                      output.accept(ModBlocks.IRON_CABLE.get());

                    }).build());

    //for another tab do same as above but with .withTabsBefore([Previous Tab Name].getId()) on 3rd line

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
