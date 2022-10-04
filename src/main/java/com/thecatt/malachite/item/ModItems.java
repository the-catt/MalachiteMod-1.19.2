package com.thecatt.malachite.item;

import com.thecatt.malachite.malachite;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, malachite.MOD_ID);

    public static final RegistryObject<Item> MALACHITE = ITEMS.register("malachite",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.MALACHITE_TAB)));
    public static final RegistryObject<Item> RAW_MALACHITE = ITEMS.register("raw_malachite",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.MALACHITE_TAB)));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
