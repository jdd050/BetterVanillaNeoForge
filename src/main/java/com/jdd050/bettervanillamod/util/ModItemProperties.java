package com.jdd050.bettervanillamod.util;

import com.jdd050.bettervanillamod.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModItemProperties {
    public static void addCustomItemProperties() {
        for (DeferredHolder<Item, ? extends Item> item : ModItems.ITEMS.getEntries()) {
            if (item.getId().toString().contains("bow")) {
                makeCustomBow(item.get());
            }
        }
    }

    private static void makeCustomBow(Item item) {
        ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pull"), (p_344163_, p_344164_, p_344165_, p_344166_) -> {
            if (p_344165_ == null) {
                return 0.0F;
            } else {
                return p_344165_.getUseItem() != p_344163_ ? 0.0F : (float)(p_344163_.getUseDuration(p_344165_) - p_344165_.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pulling"), (p_174630_, p_174631_, p_174632_, p_174633_) -> {
            return p_174632_ != null && p_174632_.isUsingItem() && p_174632_.getUseItem() == p_174630_ ? 1.0F : 0.0F;
        });
    }
}
