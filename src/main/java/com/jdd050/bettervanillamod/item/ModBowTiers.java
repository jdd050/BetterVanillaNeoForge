package com.jdd050.bettervanillamod.item;


import com.jdd050.bettervanillamod.item.custom.TieredBowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;

public class ModBowTiers {
    private static final int REGULAR_BOW_ENCHANTMENT_VALUE = 1;
    private static final float REGULAR_BOW_DURABILITY = 384.0F;
    private static final int BOW_DURABILITY_SCALAR = Math.round(REGULAR_BOW_DURABILITY / Tiers.WOOD.getUses());

    private static int calculateDurability(Tier tier) {
        return Math.round(Math.min(Math.max(REGULAR_BOW_DURABILITY, 0.25F * (tier.getUses() * BOW_DURABILITY_SCALAR)), 2500));
    }

    public static TieredBowItem stone() {
        return new TieredBowItem(
                new Item.Properties().durability(calculateDurability(Tiers.STONE)),
                1.1F,
                0.5F,
                REGULAR_BOW_ENCHANTMENT_VALUE * 2
        );
    }

    public static TieredBowItem netherrack() {
        return new TieredBowItem(
                new Item.Properties().durability(calculateDurability(ModToolTiers.NETHERRACK)),
                1.1F,
                0.5F,
                REGULAR_BOW_ENCHANTMENT_VALUE * 2
        );
    }

    public static TieredBowItem copper() {
        return new TieredBowItem(
                new Item.Properties().durability(calculateDurability(ModToolTiers.COPPER)),
                1.25F,
                0.40F,
                REGULAR_BOW_ENCHANTMENT_VALUE * 3
        );
    }

    public static TieredBowItem iron() {
        return new TieredBowItem(
                new Item.Properties().durability(calculateDurability(Tiers.IRON)),
                1.33F,
                0.33F,
                REGULAR_BOW_ENCHANTMENT_VALUE * 3
        );
    }

    public static TieredBowItem gold() {
        return new TieredBowItem(
                new Item.Properties().durability(calculateDurability(Tiers.GOLD)),
                1.75F,
                0.25F,
                REGULAR_BOW_ENCHANTMENT_VALUE * 5
        );
    }

    public static TieredBowItem quartz() {
        return new TieredBowItem(
                new Item.Properties().durability(calculateDurability(ModToolTiers.QUARTZ)),
                1.5F,
                0.25F,
                REGULAR_BOW_ENCHANTMENT_VALUE * 4
        );
    }

    public static TieredBowItem amethyst() {
        return new TieredBowItem(
                new Item.Properties().durability(calculateDurability(ModToolTiers.AMETHYST)),
                1.5F,
                0.25F,
                REGULAR_BOW_ENCHANTMENT_VALUE * 4
        );
    }

    public static TieredBowItem diamond() {
        return new TieredBowItem(
                new Item.Properties().durability(calculateDurability(Tiers.DIAMOND)),
                1.75F,
                0.15F,
                REGULAR_BOW_ENCHANTMENT_VALUE * 5
        );
    }

    public static TieredBowItem emerald() {
        return new TieredBowItem(
                new Item.Properties().durability(calculateDurability(ModToolTiers.EMERALD)),
                1.85F,
                0.10F,
                REGULAR_BOW_ENCHANTMENT_VALUE * 6
        );
    }

    public static TieredBowItem netherite() {
        return new TieredBowItem(
                new Item.Properties().durability(calculateDurability(Tiers.NETHERITE)),
                2.0F,
                0.05F,
                REGULAR_BOW_ENCHANTMENT_VALUE * 7
        );
    }
}
