package com.jdd050.bettervanillamod.item;

import com.jdd050.bettervanillamod.BetterVanillaMod;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    // fields
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

    // Item registration method
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    /* Custom Equipment - Wood Tier */
    public static final DeferredItem<Item> WOOD_HELMET = ITEMS.register("wood_helmet",
            () -> new ArmorItem(ModArmorMaterials.WOOD_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                            .durability(ArmorItem.Type.HELMET.getDurability(4)))
    );
    public static final DeferredItem<Item> WOOD_CHESTPLATE = ITEMS.register("wood_chestplate",
            () -> new ArmorItem(ModArmorMaterials.WOOD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                            .durability(ArmorItem.Type.CHESTPLATE.getDurability(4)))
    );
    public static final DeferredItem<Item> WOOD_LEGGINGS = ITEMS.register("wood_leggings",
            () -> new ArmorItem(ModArmorMaterials.WOOD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                            .durability(ArmorItem.Type.LEGGINGS.getDurability(4)))
    );
    public static final DeferredItem<Item> WOOD_BOOTS = ITEMS.register("wood_boots",
            () -> new ArmorItem(ModArmorMaterials.WOOD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
                            .durability((ArmorItem.Type.BOOTS.getDurability(4))))
    );

    /* Custom Equipment - Stone Tier */
    public static final DeferredItem<Item> STONE_HELMET = ITEMS.register("stone_helmet",
            () -> new ArmorItem(ModArmorMaterials.STONE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                    .durability(ArmorItem.Type.HELMET.getDurability(9)))
    );
    public static final DeferredItem<Item> STONE_CHESTPLATE = ITEMS.register("stone_chestplate",
            () -> new ArmorItem(ModArmorMaterials.STONE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .durability(ArmorItem.Type.CHESTPLATE.getDurability(9)))
    );
    public static final DeferredItem<Item> STONE_LEGGINGS = ITEMS.register("stone_leggings",
            () -> new ArmorItem(ModArmorMaterials.STONE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .durability(ArmorItem.Type.LEGGINGS.getDurability(9)))
    );
    public static final DeferredItem<Item> STONE_BOOTS = ITEMS.register("stone_boots",
            () -> new ArmorItem(ModArmorMaterials.STONE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
                    .durability(ArmorItem.Type.BOOTS.getDurability(9)))
    );

    /* Custom Equipment - Netherrack Tier */
    public static final DeferredItem<Item> NETHERRACK_HELMET = ITEMS.register("netherrack_helmet",
            () -> new ArmorItem(ModArmorMaterials.NETHERRACK_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                    .durability(ArmorItem.Type.HELMET.getDurability(11)))
    );
    public static final DeferredItem<Item> NETHERRACK_CHESTPLATE = ITEMS.register("netherrack_chestplate",
            () -> new ArmorItem(ModArmorMaterials.NETHERRACK_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .durability(ArmorItem.Type.CHESTPLATE.getDurability(11)))
    );
    public static final DeferredItem<Item> NETHERRACK_LEGGINGS = ITEMS.register("netherrack_leggings",
            () -> new ArmorItem(ModArmorMaterials.NETHERRACK_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .durability(ArmorItem.Type.LEGGINGS.getDurability(11)))
    );
    public static final DeferredItem<Item> NETHERRACK_BOOTS = ITEMS.register("netherrack_boots",
            () -> new ArmorItem(ModArmorMaterials.NETHERRACK_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
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


    /* Custom Equipment - Copper Tier */
    public static final DeferredItem<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(ModArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                    .durability(ArmorItem.Type.HELMET.getDurability(13)))
    );
    public static final DeferredItem<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(ModArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .durability(ArmorItem.Type.CHESTPLATE.getDurability(13)))
    );
    public static final DeferredItem<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(ModArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .durability(ArmorItem.Type.LEGGINGS.getDurability(13)))
    );
    public static final DeferredItem<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(ModArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
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

    /* Custom Equipment - Amethyst Tier */
    public static final DeferredItem<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                    .durability(ArmorItem.Type.HELMET.getDurability(27)))
    );
    public static final DeferredItem<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .durability(ArmorItem.Type.CHESTPLATE.getDurability(27)))
    );
    public static final DeferredItem<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .durability(ArmorItem.Type.LEGGINGS.getDurability(27)))
    );
    public static final DeferredItem<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
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

    /* Custom Equipment - Quartz Tier */
    public static final DeferredItem<Item> QUARTZ_HELMET = ITEMS.register("quartz_helmet",
            () -> new ArmorItem(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                    .durability(ArmorItem.Type.HELMET.getDurability(27)))
    );
    public static final DeferredItem<Item> QUARTZ_CHESTPLATE = ITEMS.register("quartz_chestplate",
            () -> new ArmorItem(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .durability(ArmorItem.Type.CHESTPLATE.getDurability(27)))
    );
    public static final DeferredItem<Item> QUARTZ_LEGGINGS = ITEMS.register("quartz_leggings",
            () -> new ArmorItem(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .durability(ArmorItem.Type.LEGGINGS.getDurability(27)))
    );
    public static final DeferredItem<Item> QUARTZ_BOOTS = ITEMS.register("quartz_boots",
            () -> new ArmorItem(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
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

    /* Custom Equipment - Emerald */
    public static final DeferredItem<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet",
            () -> new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                    .durability(ArmorItem.Type.HELMET.getDurability(34)))
    );
    public static final DeferredItem<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate",
            () -> new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .durability(ArmorItem.Type.CHESTPLATE.getDurability(34)))
    );
    public static final DeferredItem<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings",
            () -> new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .durability(ArmorItem.Type.LEGGINGS.getDurability(34)))
    );
    public static final DeferredItem<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots",
            () -> new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
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

}
