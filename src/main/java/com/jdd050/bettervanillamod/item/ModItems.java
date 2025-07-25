package com.jdd050.bettervanillamod.item;

import com.jdd050.bettervanillamod.BetterVanillaMod;
import com.jdd050.bettervanillamod.item.custom.HammerItem;
import com.jdd050.bettervanillamod.item.custom.ModArmorItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    // fields
    public static final int HAMMER_ATK_DMG = 8;
    public static final float HAMMER_ATK_SPD = -3.6f;

    public static final int SWORD_ATK_DMG = 3;
    public static final float SWORD_ATK_SPD = -2.4f;
    public static final int PICKAXE_ATK_DMG = 1;
    public static final float PICKAXE_ATK_SPD = -2.8f;
    public static final int AXE_ATK_DMG = 6;
    public static final float AXE_ATK_SPD = -3.2f;
    public static final float SHOVEL_ATK_DMG = 1.5f;
    public static final float SHOVEL_ATK_SPD = -3.0f;
    public static final int HOE_ATK_DMG = 0;
    public static final float HOE_ATK_SPD = -3.0f;
    // Deferred register (list) of all custom items
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BetterVanillaMod.MODID);

    /* Custom items - Materials */
    //public static final DeferredItem<Item> LAPIS_INGOT = ITEMS.register("lapis_ingot", () -> new Item(new Item.Properties()));
    //public static final DeferredItem<Item> REDSTONE_INGOT = ITEMS.register("redstone_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AMETHYST_GEM = ITEMS.register("amethyst_gem", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> STONE_ROD = ITEMS.register("stone_rod", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHER_ROD = ITEMS.register("nether_rod", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_ROD = ITEMS.register("copper_rod", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_ROD = ITEMS.register("iron_rod", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLD_ROD = ITEMS.register("gold_rod", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> QUARTZ_CHUNK = ITEMS.register("quartz_chunk", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AMETHYST_CHUNK = ITEMS.register("amethyst_chunk", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_CHUNK = ITEMS.register("diamond_chunk", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EMERALD_ROD = ITEMS.register("emerald_rod", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHERITE_ROD = ITEMS.register("netherite_rod", () -> new Item(new Item.Properties()));

    // Item registration method
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    /* Armor Trims */
    public static final DeferredItem<Item> AMETHYST_GEM_SMITHING_TEMPLATE = ITEMS.register("amethyst_gem_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(BetterVanillaMod.MODID, "amethyst_gem_pattern")));

    /* Misc */
    public static final DeferredItem<Item> IRON_HAMMER = ITEMS.register("iron_hammer",
            () -> new HammerItem(Tiers.IRON, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.IRON, HAMMER_ATK_DMG, HAMMER_ATK_SPD))));
    public static final DeferredItem<Item> GOLD_HAMMER = ITEMS.register("gold_hammer",
            () -> new HammerItem(Tiers.GOLD, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.GOLD, HAMMER_ATK_DMG, HAMMER_ATK_SPD))));
    public static final DeferredItem<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer",
            () -> new HammerItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.DIAMOND, HAMMER_ATK_DMG, HAMMER_ATK_SPD))));
    public static final DeferredItem<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer",
            () -> new HammerItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, HAMMER_ATK_DMG, HAMMER_ATK_SPD))));

    /* Bows */
    public static final DeferredItem<Item> STONE_BOW = ITEMS.register("stone_bow", ModBowTiers::stone);
    public static final DeferredItem<Item> NETHERRACK_BOW = ITEMS.register("netherrack_bow", ModBowTiers::netherrack);
    public static final DeferredItem<Item> COPPER_BOW = ITEMS.register("copper_bow", ModBowTiers::copper);
    public static final DeferredItem<Item> IRON_BOW = ITEMS.register("iron_bow", ModBowTiers::iron);
    public static final DeferredItem<Item> QUARTZ_BOW = ITEMS.register("quartz_bow", ModBowTiers::quartz);
    public static final DeferredItem<Item> AMETHYST_BOW = ITEMS.register("amethyst_bow", ModBowTiers::amethyst);
    public static final DeferredItem<Item> GOLD_BOW = ITEMS.register("gold_bow", ModBowTiers::gold);
    public static final DeferredItem<Item> DIAMOND_BOW = ITEMS.register("diamond_bow", ModBowTiers::diamond);
    public static final DeferredItem<Item> EMERALD_BOW = ITEMS.register("emerald_bow", ModBowTiers::emerald);
    public static final DeferredItem<Item> NETHERITE_BOW = ITEMS.register("netherite_bow", ModBowTiers::netherite);

    /* Custom Equipment - Wood Tier */
    public static final DeferredItem<Item> WOOD_HELMET = ITEMS.register("wood_helmet",
            () -> new ModArmorItem(ModArmorMaterials.WOOD_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                            .durability(ArmorItem.Type.HELMET.getDurability(4)))
    );
    public static final DeferredItem<Item> WOOD_CHESTPLATE = ITEMS.register("wood_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.WOOD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                            .durability(ArmorItem.Type.CHESTPLATE.getDurability(4)))
    );
    public static final DeferredItem<Item> WOOD_LEGGINGS = ITEMS.register("wood_leggings",
            () -> new ModArmorItem(ModArmorMaterials.WOOD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                            .durability(ArmorItem.Type.LEGGINGS.getDurability(4)))
    );
    public static final DeferredItem<Item> WOOD_BOOTS = ITEMS.register("wood_boots",
            () -> new ModArmorItem(ModArmorMaterials.WOOD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
                            .durability((ArmorItem.Type.BOOTS.getDurability(4))))
    );
    public static final DeferredItem<HammerItem> WOOD_HAMMER = ITEMS.register("wood_hammer",
            () -> new HammerItem(Tiers.WOOD, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.WOOD, HAMMER_ATK_DMG, HAMMER_ATK_SPD))));

    /* Custom Equipment - Stone Tier */
    public static final DeferredItem<Item> STONE_HELMET = ITEMS.register("stone_helmet",
            () -> new ModArmorItem(ModArmorMaterials.STONE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                    .durability(ArmorItem.Type.HELMET.getDurability(9)))
    );
    public static final DeferredItem<Item> STONE_CHESTPLATE = ITEMS.register("stone_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.STONE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .durability(ArmorItem.Type.CHESTPLATE.getDurability(9)))
    );
    public static final DeferredItem<Item> STONE_LEGGINGS = ITEMS.register("stone_leggings",
            () -> new ModArmorItem(ModArmorMaterials.STONE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .durability(ArmorItem.Type.LEGGINGS.getDurability(9)))
    );
    public static final DeferredItem<Item> STONE_BOOTS = ITEMS.register("stone_boots",
            () -> new ModArmorItem(ModArmorMaterials.STONE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
                    .durability(ArmorItem.Type.BOOTS.getDurability(9)))
    );
    public static final DeferredItem<HammerItem> STONE_HAMMER = ITEMS.register("stone_hammer",
            () -> new HammerItem(Tiers.STONE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.STONE, HAMMER_ATK_DMG, HAMMER_ATK_SPD))));

    /* Custom Equipment - Netherrack Tier */
    public static final DeferredItem<Item> NETHERRACK_HELMET = ITEMS.register("netherrack_helmet",
            () -> new ModArmorItem(ModArmorMaterials.NETHERRACK_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                    .durability(ArmorItem.Type.HELMET.getDurability(11)))
    );
    public static final DeferredItem<Item> NETHERRACK_CHESTPLATE = ITEMS.register("netherrack_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.NETHERRACK_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .durability(ArmorItem.Type.CHESTPLATE.getDurability(11)))
    );
    public static final DeferredItem<Item> NETHERRACK_LEGGINGS = ITEMS.register("netherrack_leggings",
            () -> new ModArmorItem(ModArmorMaterials.NETHERRACK_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .durability(ArmorItem.Type.LEGGINGS.getDurability(11)))
    );
    public static final DeferredItem<Item> NETHERRACK_BOOTS = ITEMS.register("netherrack_boots",
            () -> new ModArmorItem(ModArmorMaterials.NETHERRACK_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
                    .durability(ArmorItem.Type.BOOTS.getDurability(11)))
    );
    public static final DeferredItem<Item> NETHERRACK_SWORD = ITEMS.register("netherrack_sword",
            () -> new SwordItem(ModToolTiers.NETHERRACK, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.NETHERRACK, SWORD_ATK_DMG, SWORD_ATK_SPD))
            ));
    public static final DeferredItem<Item> NETHERRACK_PICKAXE = ITEMS.register("netherrack_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NETHERRACK, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.NETHERRACK, PICKAXE_ATK_DMG, PICKAXE_ATK_SPD))
            ));
    public static final DeferredItem<Item> NETHERRACK_SHOVEL = ITEMS.register("netherrack_shovel",
            () -> new ShovelItem(ModToolTiers.NETHERRACK, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.NETHERRACK, SHOVEL_ATK_DMG, SHOVEL_ATK_SPD))
            ));
    public static final DeferredItem<Item> NETHERRACK_AXE = ITEMS.register("netherrack_axe",
            () -> new AxeItem(ModToolTiers.NETHERRACK, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.NETHERRACK, AXE_ATK_DMG, AXE_ATK_SPD))
            ));
    public static final DeferredItem<Item> NETHERRACK_HOE = ITEMS.register("netherrack_hoe",
            () -> new HoeItem(ModToolTiers.NETHERRACK, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.NETHERRACK, HOE_ATK_DMG, HOE_ATK_SPD))
            ));
    public static final DeferredItem<Item> NETHERRACK_HAMMER = ITEMS.register("netherrack_hammer",
            () -> new HammerItem(ModToolTiers.NETHERRACK, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.NETHERRACK, HAMMER_ATK_DMG, HAMMER_ATK_SPD))));


    /* Custom Equipment - Copper Tier */
    public static final DeferredItem<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ModArmorItem(ModArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                    .durability(ArmorItem.Type.HELMET.getDurability(13)))
    );
    public static final DeferredItem<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .durability(ArmorItem.Type.CHESTPLATE.getDurability(13)))
    );
    public static final DeferredItem<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ModArmorItem(ModArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .durability(ArmorItem.Type.LEGGINGS.getDurability(13)))
    );
    public static final DeferredItem<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ModArmorItem(ModArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
                    .durability(ArmorItem.Type.BOOTS.getDurability(13)))
    );



    public static final DeferredItem<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.COPPER, SWORD_ATK_DMG, SWORD_ATK_SPD)))
    );
    public static final DeferredItem<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.COPPER, PICKAXE_ATK_DMG, PICKAXE_ATK_SPD)))
    );
    public static final DeferredItem<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.COPPER, AXE_ATK_DMG, AXE_ATK_SPD)))
    );
    public static final DeferredItem<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.COPPER, SHOVEL_ATK_DMG, SHOVEL_ATK_SPD)))
    );
    public static final DeferredItem<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.COPPER, HOE_ATK_DMG, HOE_ATK_SPD)))
    );
    public static final DeferredItem<Item> COPPER_HAMMER = ITEMS.register("copper_hammer",
            () -> new HammerItem(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.COPPER, HAMMER_ATK_DMG, HAMMER_ATK_SPD))));

    /* Custom Equipment - Amethyst Tier */
    public static final DeferredItem<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet",
            () -> new ModArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                    .durability(ArmorItem.Type.HELMET.getDurability(27)))
    );
    public static final DeferredItem<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .durability(ArmorItem.Type.CHESTPLATE.getDurability(27)))
    );
    public static final DeferredItem<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings",
            () -> new ModArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .durability(ArmorItem.Type.LEGGINGS.getDurability(27)))
    );
    public static final DeferredItem<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots",
            () -> new ModArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
                    .durability(ArmorItem.Type.BOOTS.getDurability(27)))
    );



    public static final DeferredItem<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            () -> new SwordItem(ModToolTiers.AMETHYST, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.AMETHYST, SWORD_ATK_DMG, SWORD_ATK_SPD)))
    );
    public static final DeferredItem<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AMETHYST, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.AMETHYST, PICKAXE_ATK_DMG, PICKAXE_ATK_SPD)))
    );
    public static final DeferredItem<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            () -> new AxeItem(ModToolTiers.AMETHYST, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.AMETHYST, SWORD_ATK_DMG, SWORD_ATK_SPD)))
    );
    public static final DeferredItem<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            () -> new ShovelItem(ModToolTiers.AMETHYST, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.AMETHYST, SHOVEL_ATK_DMG, SHOVEL_ATK_SPD)))
    );
    public static final DeferredItem<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe",
            () -> new HoeItem(ModToolTiers.AMETHYST, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.AMETHYST, HOE_ATK_DMG, HOE_ATK_SPD)))
    );
    public static final DeferredItem<Item> AMETHYST_HAMMER = ITEMS.register("amethyst_hammer",
            () -> new HammerItem(ModToolTiers.AMETHYST, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.AMETHYST, HAMMER_ATK_DMG, HAMMER_ATK_SPD))));

    /* Custom Equipment - Quartz Tier */
    public static final DeferredItem<Item> QUARTZ_HELMET = ITEMS.register("quartz_helmet",
            () -> new ModArmorItem(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                    .durability(ArmorItem.Type.HELMET.getDurability(27)))
    );
    public static final DeferredItem<Item> QUARTZ_CHESTPLATE = ITEMS.register("quartz_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .durability(ArmorItem.Type.CHESTPLATE.getDurability(27)))
    );
    public static final DeferredItem<Item> QUARTZ_LEGGINGS = ITEMS.register("quartz_leggings",
            () -> new ModArmorItem(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .durability(ArmorItem.Type.LEGGINGS.getDurability(27)))
    );
    public static final DeferredItem<Item> QUARTZ_BOOTS = ITEMS.register("quartz_boots",
            () -> new ModArmorItem(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
                    .durability(ArmorItem.Type.BOOTS.getDurability(27)))
    );



    public static final DeferredItem<Item> QUARTZ_SWORD = ITEMS.register("quartz_sword",
            () -> new SwordItem(ModToolTiers.QUARTZ, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.QUARTZ, SWORD_ATK_DMG, SWORD_ATK_SPD)))
    );
    public static final DeferredItem<Item> QUARTZ_PICKAXE = ITEMS.register("quartz_pickaxe",
            () -> new PickaxeItem(ModToolTiers.QUARTZ, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.QUARTZ, PICKAXE_ATK_DMG, PICKAXE_ATK_SPD)))
    );
    public static final DeferredItem<Item> QUARTZ_AXE = ITEMS.register("quartz_axe",
            () -> new AxeItem(ModToolTiers.QUARTZ, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.QUARTZ, AXE_ATK_DMG, AXE_ATK_SPD)))
    );
    public static final DeferredItem<Item> QUARTZ_SHOVEL = ITEMS.register("quartz_shovel",
            () -> new ShovelItem(ModToolTiers.QUARTZ, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.QUARTZ, SHOVEL_ATK_DMG, SHOVEL_ATK_SPD)))
        );
    public static final DeferredItem<Item> QUARTZ_HOE = ITEMS.register("quartz_hoe",
            () -> new HoeItem(ModToolTiers.QUARTZ, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.QUARTZ, HOE_ATK_DMG, HOE_ATK_SPD)))
    );
    public static final DeferredItem<Item> QUARTZ_HAMMER = ITEMS.register("quartz_hammer",
            () -> new HammerItem(ModToolTiers.QUARTZ, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.QUARTZ, HAMMER_ATK_DMG, HAMMER_ATK_SPD))));

    /* Custom Equipment - Emerald */
    public static final DeferredItem<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet",
            () -> new ModArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                    .durability(ArmorItem.Type.HELMET.getDurability(34)))
    );
    public static final DeferredItem<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .durability(ArmorItem.Type.CHESTPLATE.getDurability(34)))
    );
    public static final DeferredItem<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings",
            () -> new ModArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .durability(ArmorItem.Type.LEGGINGS.getDurability(34)))
    );
    public static final DeferredItem<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots",
            () -> new ModArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
                    .durability(ArmorItem.Type.BOOTS.getDurability(34)))
    );



    public static final DeferredItem<Item> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new SwordItem(ModToolTiers.EMERALD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.EMERALD, SWORD_ATK_DMG, SWORD_ATK_SPD)))
    );
    public static final DeferredItem<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
            () -> new PickaxeItem(ModToolTiers.EMERALD, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.EMERALD, PICKAXE_ATK_DMG, PICKAXE_ATK_SPD)))
    );
    public static final DeferredItem<Item> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new AxeItem(ModToolTiers.EMERALD, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.EMERALD, AXE_ATK_DMG, AXE_ATK_SPD)))
    );
    public static final DeferredItem<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new ShovelItem(ModToolTiers.EMERALD, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.EMERALD, SHOVEL_ATK_DMG, SHOVEL_ATK_SPD)))
    );
    public static final DeferredItem<Item> EMERALD_HOE = ITEMS.register("emerald_hoe",
            () -> new HoeItem(ModToolTiers.EMERALD, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.EMERALD, HOE_ATK_DMG, HOE_ATK_SPD)))
    );
    public static final DeferredItem<Item> EMERALD_HAMMER = ITEMS.register("emerald_hammer",
            () -> new HammerItem(ModToolTiers.EMERALD, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.EMERALD, HAMMER_ATK_DMG, HAMMER_ATK_SPD))));

}
