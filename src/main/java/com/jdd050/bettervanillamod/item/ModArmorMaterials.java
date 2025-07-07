package com.jdd050.bettervanillamod.item;

import com.jdd050.bettervanillamod.BetterVanillaMod;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final Holder<ArmorMaterial> WOOD_ARMOR_MATERIAL = register("wood", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 1);
                attribute.put(ArmorItem.Type.CHESTPLATE, 2);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 1);
            }), 15, 0, 0, () -> Items.OAK_PLANKS, SoundEvents.WOOD_PLACE); // TODO: account for all planks

    public static final Holder<ArmorMaterial> STONE_ARMOR_MATERIAL = register("stone", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 3);
                attribute.put(ArmorItem.Type.CHESTPLATE, 4);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 1);
            }), 13, 1, 0.05f, () -> Items.STONE, SoundEvents.STONE_PLACE); // TODO: account for all stone

    public static final Holder<ArmorMaterial> NETHERRACK_ARMOR_MATERIAL = register("netherrack", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 3);
                attribute.put(ArmorItem.Type.CHESTPLATE, 4);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 3);
            }), 5, 0, 0.05f, () -> Items.NETHERRACK, SoundEvents.NETHERRACK_PLACE);

    public static final Holder<ArmorMaterial> COPPER_ARMOR_MATERIAL = register("copper", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 2);
            }), 10, 0, 0, () -> Items.COPPER_INGOT, SoundEvents.COPPER_PLACE);

    public static final Holder<ArmorMaterial> AMETHYST_ARMOR_MATERIAL = register("amethyst", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 7);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 2);
            }), 12, 1, 0, () -> ModItems.AMETHYST_GEM.get(), SoundEvents.AMETHYST_BLOCK_CHIME);

    public static final Holder<ArmorMaterial> QUARTZ_ARMOR_MATERIAL = register("quartz", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 7);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 2);
            }), 12, 1, 0, () -> Items.QUARTZ, SoundEvents.AMETHYST_BLOCK_CHIME);

    public static final Holder<ArmorMaterial> EMERALD_ARMOR_MATERIAL = register("emerald", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.BODY, 3);
            }), 13, 2.5f, 0.05f, () -> Items.EMERALD, SoundEvents.EXPERIENCE_ORB_PICKUP);

    // helper method
    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection,
                                                  int enchantability, float toughness, float knockbackResistance,
                                                  Supplier<Item> ingredientItem, SoundEvent equipSound) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(BetterVanillaMod.MODID, name);
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));
        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            typeMap.put(type, typeProtection.get(type));
        }

        Holder<SoundEvent> equipSoundHolder = BuiltInRegistries.SOUND_EVENT.getHolderOrThrow(
                BuiltInRegistries.SOUND_EVENT.getResourceKey(equipSound).orElseThrow()
        );

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                new ArmorMaterial(typeProtection, enchantability, equipSoundHolder, ingredient, layers, toughness, knockbackResistance));
    }
}