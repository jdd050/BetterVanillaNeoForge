package com.jdd050.bettervanillamod.item;

import com.jdd050.bettervanillamod.BetterVanillaMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterVanillaMod.MODID);

    public static final Supplier<CreativeModeTab> TOOLS_TAB = CREATIVE_MODE_TABS.register("tools_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.DIAMOND_SWORD))
                    .title(Component.translatable("creativetab.bettervanillamod.tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        for (DeferredHolder<Item, ? extends Item> item : ModItems.ITEMS.getEntries()) {
                            output.accept(item.get());
                        }
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
