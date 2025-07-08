package com.jdd050.bettervanillamod.datagen;

import com.jdd050.bettervanillamod.BetterVanillaMod;
import com.jdd050.bettervanillamod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BetterVanillaMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.AMETHYST_GEM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_AMETHYST_GEM_ORE);
    }

    // helpers
    private void blockWithItem(DeferredBlock<?> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
