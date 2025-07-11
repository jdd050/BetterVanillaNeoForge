package com.jdd050.bettervanillamod.datagen;

import com.jdd050.bettervanillamod.BetterVanillaMod;
import com.jdd050.bettervanillamod.block.ModBlocks;
import com.jdd050.bettervanillamod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BetterVanillaMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        // Makes amethyst gem ore mineable by pickaxe
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.AMETHYST_GEM_ORE.get())
                .add(ModBlocks.DEEPSLATE_AMETHYST_GEM_ORE.get());

        // Makes amethyst gem ore require iron pickaxe
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.AMETHYST_GEM_ORE.get())
                .add(ModBlocks.DEEPSLATE_AMETHYST_GEM_ORE.get());

        // Assign netherrack and copper tools the same level as stone
        tag(ModTags.Blocks.NEEDS_NETHERRACK_TOOL)
                .addTag(BlockTags.NEEDS_STONE_TOOL);
        tag(ModTags.Blocks.INCORRECT_FOR_NETHERRACK_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_STONE_TOOL)
                .remove(ModTags.Blocks.NEEDS_NETHERRACK_TOOL);
        tag(ModTags.Blocks.NEEDS_COPPER_TOOL)
                .addTag(BlockTags.NEEDS_STONE_TOOL);
        tag(ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_STONE_TOOL)
                .remove(ModTags.Blocks.NEEDS_COPPER_TOOL);

        // Assign amethyst and quartz tools the same level as iron
        tag(ModTags.Blocks.NEEDS_QUARTZ_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        tag(ModTags.Blocks.INCORRECT_FOR_QUARTZ_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_QUARTZ_TOOL);
        tag(ModTags.Blocks.NEEDS_AMETHYST_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        tag(ModTags.Blocks.INCORRECT_FOR_AMETHYST_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_AMETHYST_TOOL);

        // Assign emerald tools the same level as diamond
        tag(ModTags.Blocks.NEEDS_EMERALD_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        tag(ModTags.Blocks.INCORRECT_FOR_EMERALD_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(ModTags.Blocks.NEEDS_EMERALD_TOOL);
    }
}
