package com.Anubis542.Create_Bits_N_Bobs.Item;

import com.Anubis542.Create_Bits_N_Bobs.CreateBitsNBobs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, CreateBitsNBobs.MOD_ID);

    //repeat this unit for each item, bit in the main & assets stuff(including PNG in textures)
    public static final RegistryObject<Item> COPPER_WIRE = ITEMS.register("copper_wire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_WIRE = ITEMS.register("iron_wire",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
