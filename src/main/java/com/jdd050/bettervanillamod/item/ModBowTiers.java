package com.jdd050.bettervanillamod.item;


import com.jdd050.bettervanillamod.item.custom.TieredBowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;

public class ModBowTiers {
    private static final int REGULAR_BOW_ENCHANTMENT_VALUE = 1;
    private static final float REGULAR_BOW_DURABILITY = 384.0F;
    private static final int BOW_DURABILITY_SCALAR = Math.round(REGULAR_BOW_DURABILITY / Tiers.WOOD.getUses());

    public static TieredBowItem stone() {
        return new TieredBowItem(
                new Item.Properties().durability(Tiers.STONE.getUses() * BOW_DURABILITY_SCALAR),
                2.0F,
                0.5F,
                REGULAR_BOW_ENCHANTMENT_VALUE * 2
        );
    }

    public static TieredBowItem netherrack() {
        return new TieredBowItem(
                new Item.Properties().durability(ModToolTiers.NETHERRACK.getUses() * BOW_DURABILITY_SCALAR),
                2.0F,
                0.5F,
                REGULAR_BOW_ENCHANTMENT_VALUE * 2
        );
    }

    public static TieredBowItem copper() {
        return new TieredBowItem(
                new Item.Properties().durability(ModToolTiers.COPPER.getUses() * BOW_DURABILITY_SCALAR),
                2.5F,
                0.40F,
                REGULAR_BOW_ENCHANTMENT_VALUE * 3
        );
    }

    public static TieredBowItem iron() {
        return new TieredBowItem(
                new Item.Properties().durability(Tiers.IRON.getUses() * BOW_DURABILITY_SCALAR),
                3.0F,
                0.33F,
                REGULAR_BOW_ENCHANTMENT_VALUE * 3
        );
    }

    public static TieredBowItem gold() {
        return new TieredBowItem(
                new Item.Properties().durability(Tiers.GOLD.getUses()),
                6.0F,
                0.25F,
                REGULAR_BOW_ENCHANTMENT_VALUE * 5
        );
    }

    public static TieredBowItem quartz() {
        return new TieredBowItem(
                new Item.Properties().durability(ModToolTiers.QUARTZ.getUses() * BOW_DURABILITY_SCALAR),
                3.5F,
                0.25F,
                REGULAR_BOW_ENCHANTMENT_VALUE * 4
        );
    }

    public static TieredBowItem amethyst() {
        return new TieredBowItem(
                new Item.Properties().durability(ModToolTiers.AMETHYST.getUses() * BOW_DURABILITY_SCALAR),
                3.5F,
                0.25F,
                REGULAR_BOW_ENCHANTMENT_VALUE * 4
        );
    }

    public static TieredBowItem diamond() {
        return new TieredBowItem(
                new Item.Properties().durability(Tiers.DIAMOND.getUses() * BOW_DURABILITY_SCALAR),
                4.0F,
                0.15F,
                REGULAR_BOW_ENCHANTMENT_VALUE * 5
        );
    }

    public static TieredBowItem emerald() {
        return new TieredBowItem(
                new Item.Properties().durability(ModToolTiers.EMERALD.getUses() * BOW_DURABILITY_SCALAR),
                4.5F,
                0.10F,
                REGULAR_BOW_ENCHANTMENT_VALUE * 6
        );
    }

    public static TieredBowItem netherite() {
        return new TieredBowItem(
                new Item.Properties().durability(Tiers.NETHERITE.getUses() * BOW_DURABILITY_SCALAR),
                5.0F,
                0.05F,
                REGULAR_BOW_ENCHANTMENT_VALUE * 7
        );
    }
}
