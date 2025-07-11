package com.jdd050.bettervanillamod.item;

import com.jdd050.bettervanillamod.util.ModTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier NETHERRACK = new SimpleTier(
            ModTags.Blocks.INCORRECT_FOR_NETHERRACK_TOOL,
            Math.round(Tiers.STONE.getUses() * 0.90F),
            Tiers.STONE.getSpeed() * 1.25F,
            Tiers.STONE.getAttackDamageBonus() * 1.10F,
            Math.round(Tiers.STONE.getEnchantmentValue() * 1.25F),
            () -> Ingredient.of(Items.NETHERRACK)
    );

    public static final Tier COPPER = new SimpleTier(
            ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL,
            Math.round(Tiers.IRON.getUses() * 0.90F),
            Tiers.IRON.getSpeed() * 0.90F,
            Tiers.IRON.getAttackDamageBonus() * 0.95F,
            Math.round(Tiers.IRON.getEnchantmentValue() * 2.0F),
            () -> Ingredient.of(Items.COPPER_INGOT)
    );

    public static final Tier QUARTZ = new SimpleTier(
            ModTags.Blocks.INCORRECT_FOR_QUARTZ_TOOL,
            Math.round(Tiers.IRON.getUses() * 1.5F),
            Tiers.IRON.getSpeed() * 1.5F,
            Tiers.DIAMOND.getAttackDamageBonus() * 0.95F,
            Math.round(Tiers.DIAMOND.getEnchantmentValue() * 1.5F),
            () -> Ingredient.of(Items.QUARTZ)
    );

    public static final Tier AMETHYST = new SimpleTier(
            ModTags.Blocks.INCORRECT_FOR_AMETHYST_TOOL,
            Math.round(Tiers.IRON.getUses() * 2.0F),
            Tiers.IRON.getSpeed() * 2.0F,
            Tiers.DIAMOND.getAttackDamageBonus(),
            Math.round(Tiers.DIAMOND.getEnchantmentValue() * 2.0F),
            () -> Ingredient.of(ModItems.AMETHYST_GEM)
    );

    public static final Tier EMERALD = new SimpleTier(
            ModTags.Blocks.INCORRECT_FOR_EMERALD_TOOL,
            Math.round(Tiers.DIAMOND.getUses() * 1.1F),
            Tiers.DIAMOND.getSpeed() * 2.0F,
            Tiers.NETHERITE.getAttackDamageBonus() * 0.90F,
            Math.round(Tiers.DIAMOND.getEnchantmentValue() * 1.75F),
            () -> Ingredient.of(Items.EMERALD)
    );
}