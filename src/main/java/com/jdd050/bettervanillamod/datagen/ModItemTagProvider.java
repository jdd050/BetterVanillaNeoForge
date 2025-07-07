package com.jdd050.bettervanillamod.datagen;

import com.jdd050.bettervanillamod.BetterVanillaMod;
import com.jdd050.bettervanillamod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, BetterVanillaMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        // custom item tags go here
        for (DeferredHolder<Item, ? extends Item> item : ModItems.ITEMS.getEntries()) {
            String[] parts = item.getId().toString().split("_");
            for (String part : parts) {
                switch (part) {
                    case "helmet":
                        tag(ItemTags.TRIMMABLE_ARMOR)
                                .add(item.get());
                        tag(ItemTags.ARMOR_ENCHANTABLE)
                                .add(item.get());
                        tag(ItemTags.DURABILITY_ENCHANTABLE)
                                .add(item.get());
                        tag(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                                .add(item.get());
                        break;
                    case "chestplate":
                        tag(ItemTags.TRIMMABLE_ARMOR)
                                .add(item.get());
                        tag(ItemTags.ARMOR_ENCHANTABLE)
                                .add(item.get());
                        tag(ItemTags.DURABILITY_ENCHANTABLE)
                                .add(item.get());
                        tag(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                                .add(item.get());
                        break;
                    case "leggings":
                        tag(ItemTags.TRIMMABLE_ARMOR)
                                .add(item.get());
                        tag(ItemTags.ARMOR_ENCHANTABLE)
                                .add(item.get());
                        tag(ItemTags.DURABILITY_ENCHANTABLE)
                                .add(item.get());
                        tag(ItemTags.LEG_ARMOR_ENCHANTABLE)
                                .add(item.get());
                        break;
                    case "boots":
                        tag(ItemTags.TRIMMABLE_ARMOR)
                                .add(item.get());
                        tag(ItemTags.ARMOR_ENCHANTABLE)
                                .add(item.get());
                        tag(ItemTags.DURABILITY_ENCHANTABLE)
                                .add(item.get());
                        tag(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                                .add(item.get());
                        break;
                    case "sword":
                        tag(ItemTags.SWORDS)
                                .add(item.get());
                        tag(ItemTags.SWORD_ENCHANTABLE);
                        break;
                    case "pickaxe":
                        tag(ItemTags.PICKAXES)
                                .add(item.get());
                        tag(ItemTags.MINING_ENCHANTABLE)
                                .add(item.get());
                        tag(ItemTags.MINING_LOOT_ENCHANTABLE)
                                .add(item.get());
                        break;
                    case "shovel":
                        tag(ItemTags.SHOVELS)
                                .add(item.get());
                        tag(ItemTags.MINING_ENCHANTABLE)
                                .add(item.get());
                        tag(ItemTags.MINING_LOOT_ENCHANTABLE)
                                .add(item.get());
                        break;
                    case "axe":
                        tag(ItemTags.AXES)
                                .add(item.get());
                        tag(ItemTags.MINING_ENCHANTABLE)
                                .add(item.get());
                        tag(ItemTags.MINING_LOOT_ENCHANTABLE)
                                .add(item.get());
                        break;
                    case "hoe":
                        tag(ItemTags.HOES)
                                .add(item.get());
                        tag(ItemTags.MINING_ENCHANTABLE)
                                .add(item.get());
                        tag(ItemTags.MINING_LOOT_ENCHANTABLE)
                                .add(item.get());
                        break;
                }
            }

        }
    }
}
