package com.jdd050.bettervanillamod.item;

import com.jdd050.bettervanillamod.BetterVanillaMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


import java.util.List;
import java.util.function.Supplier;


public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterVanillaMod.MODID);

    public static final Supplier<CreativeModeTab> TOOLS_TAB = CREATIVE_MODE_TABS.register("tools_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack((ItemLike) ModItems.DIAMOND_HAMMER))
                    .title(Component.translatable("creativetab.bettervanillamod.tools_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        for (DeferredHolder<Item, ? extends Item> item : ModItems.ITEMS.getEntries()) {
                            String[] parts = item.getId().toString().split("_");
                            for (String part : parts) {
                                part = part.toLowerCase();
                                switch (part) {
                                    case "sword", "pickaxe", "shovel", "axe", "hoe", "hammer":
                                        output.accept(item.get());
                                }
                            }
                        }
                    }).build());

    public static final Supplier<CreativeModeTab> ARMOR_TAB = CREATIVE_MODE_TABS.register("armor_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack((ItemLike) ModItems.EMERALD_CHESTPLATE))
                    .title(Component.translatable("creativetab.bettervanillamod.armor_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        for (DeferredHolder<Item, ? extends Item> item : ModItems.ITEMS.getEntries()) {
                            String[] parts = item.getId().toString().split("_");
                            for (String part : parts) {
                                part = part.toLowerCase();
                                switch (part) {
                                    case "helmet", "chestplate", "leggings", "boots":
                                        output.accept(item.get());
                                }
                            }
                        }
                    }).build());

    public static final Supplier<CreativeModeTab> MISC_TAB = CREATIVE_MODE_TABS.register("misc_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.AMETHYST_GEM.get()))
                    .title(Component.translatable("creativetab.bettervanillamod.misc_tab"))
                    .displayItems((parameters, output) -> {
                        // These are suffixes that identify tools and armor
                        List<String> toolAndArmorSuffixes = List.of(
                                "sword", "pickaxe", "shovel", "axe", "hoe", "hammer",
                                "helmet", "chestplate", "leggings", "boots"
                        );

                        for (DeferredHolder<Item, ? extends Item> item : ModItems.ITEMS.getEntries()) {
                            String registryName = item.getId().getPath();

                            boolean isToolOrArmor = toolAndArmorSuffixes.stream()
                                    .anyMatch(registryName::endsWith);

                            if (!isToolOrArmor) {
                                output.accept(item.get());
                            }
                        }
                    })
                    .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
