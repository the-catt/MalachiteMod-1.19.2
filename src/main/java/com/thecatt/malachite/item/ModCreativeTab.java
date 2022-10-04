package com.thecatt.malachite.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab
{
    public static final CreativeModeTab MALACHITE_TAB = new CreativeModeTab("malachitetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_MALACHITE.get());
        }
    };
}
