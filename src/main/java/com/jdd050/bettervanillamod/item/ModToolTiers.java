package com.jdd050.bettervanillamod.item;

import com.jdd050.bettervanillamod.util.ModTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier NETHERRACK = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_NETHERRACK_TOOL,
            150, 4.0f, 1.0f, 5, () -> Ingredient.of(Items.NETHERRACK));
    public static final Tier COPPER = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL,
            200, 5.5f, 1.5f, 18, () -> Ingredient.of(Items.COPPER_INGOT));
    public static final Tier AMETHYST = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_AMETHYST_TOOL,
            656, 7.5f, 2.75f, 9, () -> Ingredient.of(ModItems.AMETHYST_GEM.get()));
    public static final Tier QUARTZ = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_QUARTZ_TOOL,
            656, 7.5f, 2.75f, 9, () -> Ingredient.of(Items.QUARTZ));
    public static final Tier EMERALD = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_EMERALD_TOOL,
            1900, 7.8f, 3.25f, 10, () -> Ingredient.of(Items.EMERALD));
}
