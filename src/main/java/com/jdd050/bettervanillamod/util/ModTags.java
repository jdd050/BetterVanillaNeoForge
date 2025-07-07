package com.jdd050.bettervanillamod.util;

import com.jdd050.bettervanillamod.BetterVanillaMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        // tool tier tags
        public static final TagKey<Block> NEEDS_NETHERRACK_TOOL = createTag("needs_netherrack_tool");
        public static final TagKey<Block> INCORRECT_FOR_NETHERRACK_TOOL = createTag("incorrect_for_netherrack_tool");
        public static final TagKey<Block> NEEDS_COPPER_TOOL = createTag("needs_copper_tool");
        public static final TagKey<Block> INCORRECT_FOR_COPPER_TOOL = createTag("incorrect_for_copper_tool");
        public static final TagKey<Block> NEEDS_AMETHYST_TOOL = createTag("needs_amethyst_tool");
        public static final TagKey<Block> INCORRECT_FOR_AMETHYST_TOOL = createTag("incorrect_for_amethyst_tool");
        public static final TagKey<Block> NEEDS_QUARTZ_TOOL = createTag("needs_quartz_tool");
        public static final TagKey<Block> INCORRECT_FOR_QUARTZ_TOOL = createTag("incorrect_for_quartz_tool");
        public static final TagKey<Block> NEEDS_EMERALD_TOOL = createTag("needs_emerald_tool");
        public static final TagKey<Block> INCORRECT_FOR_EMERALD_TOOL = createTag("incorrect_for_emerald_tool");
        // helper method
        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(BetterVanillaMod.MODID, name));
        }
    }

    public static class Items {
        // helper method
        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(BetterVanillaMod.MODID, name));
        }
    }
}
