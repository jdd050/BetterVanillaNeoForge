package com.jdd050.bettervanillamod.datagen;

import com.jdd050.bettervanillamod.BetterVanillaMod;
import com.jdd050.bettervanillamod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    private static void makeHelmetRecipe(RecipeOutput pRecipeOutput, Item result, Item material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern("XXX")
                .pattern("X X")
                .pattern("   ")
                .define('X', material)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeHelmetRecipe(RecipeOutput pRecipeOutput, Item result, TagKey<Item> material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern("XXX")
                .pattern("X X")
                .pattern("   ")
                .define('X', material)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeChestplateRecipe(RecipeOutput pRecipeOutput, Item result, Item material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', material)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeChestplateRecipe(RecipeOutput pRecipeOutput, Item result, TagKey<Item> material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', material)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeLeggingRecipe(RecipeOutput pRecipeOutput, Item result, Item material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', material)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeLeggingRecipe(RecipeOutput pRecipeOutput, Item result, TagKey<Item> material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', material)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeBootsRecipe(RecipeOutput pRecipeOutput, Item result, Item material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern("   ")
                .pattern("X X")
                .pattern("X X")
                .define('X', material)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeBootsRecipe(RecipeOutput pRecipeOutput, Item result, TagKey<Item> material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern("   ")
                .pattern("X X")
                .pattern("X X")
                .define('X', material)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeSwordRecipe(RecipeOutput pRecipeOutput, Item result, Item material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern(" X ")
                .pattern(" X ")
                .pattern(" Y ")
                .define('X', material)
                .define('Y', Items.STICK)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeSwordRecipe(RecipeOutput pRecipeOutput, Item result, TagKey<Item> material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern(" X ")
                .pattern(" X ")
                .pattern(" Y ")
                .define('X', material)
                .define('Y', Items.STICK)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makePickaxeRecipe(RecipeOutput pRecipeOutput, Item result, Item material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
                .pattern("XXX")
                .pattern(" Y ")
                .pattern(" Y ")
                .define('X', material)
                .define('Y', Items.STICK)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makePickaxeRecipe(RecipeOutput pRecipeOutput, Item result, TagKey<Item> material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
                .pattern("XXX")
                .pattern(" Y ")
                .pattern(" Y ")
                .define('X', material)
                .define('Y', Items.STICK)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeShovelRecipe(RecipeOutput pRecipeOutput, Item result, Item material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
                .pattern(" X ")
                .pattern(" Y ")
                .pattern(" Y ")
                .define('X', material)
                .define('Y', Items.STICK)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeShovelRecipe(RecipeOutput pRecipeOutput, Item result, TagKey<Item> material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
                .pattern(" X ")
                .pattern(" Y ")
                .pattern(" Y ")
                .define('X', material)
                .define('Y', Items.STICK)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeAxeRecipe(RecipeOutput pRecipeOutput, Item result, Item material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
                .pattern("XX ")
                .pattern("XY ")
                .pattern(" Y ")
                .define('X', material)
                .define('Y', Items.STICK)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeAxeRecipe(RecipeOutput pRecipeOutput, Item result, TagKey<Item> material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
                .pattern("XX ")
                .pattern("XY ")
                .pattern(" Y ")
                .define('X', material)
                .define('Y', Items.STICK)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeHoeRecipe(RecipeOutput pRecipeOutput, Item result, Item material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
                .pattern("XX ")
                .pattern(" Y ")
                .pattern(" Y ")
                .define('X', material)
                .define('Y', Items.STICK)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeHammerRecipe(RecipeOutput pRecipeOutput, Item result, TagKey<Item> material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
                .pattern("XXX")
                .pattern("XYX")
                .pattern(" Y ")
                .define('X', material)
                .define('Y', Items.STICK)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeHammerRecipe(RecipeOutput pRecipeOutput, Item result, Item material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
                .pattern("XXX")
                .pattern("XYX")
                .pattern(" Y ")
                .define('X', material)
                .define('Y', Items.STICK)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeTrimSmithing(RecipeOutput pRecipeOutput, Item template, ResourceLocation location) {
        trimSmithing(pRecipeOutput, template, location);
    }

    private static void makeStickRecipe(RecipeOutput pRecipeOutput, Item result, Item material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern("   ")
                .pattern(" X ")
                .pattern(" X ")
                .define('X', material)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeBowRecipe(RecipeOutput pRecipeOutput, Item result, Item material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern(" XY")
                .pattern("X Y")
                .pattern(" XY")
                .define('X', material)
                .define('Y', Items.STRING)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        // smelting list
        List<ItemLike> SMELTABLES = List.of();

        /* MATERIAL RECIPES */
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AMETHYST_GEM.get())
                .requires(Items.AMETHYST_SHARD, 2)
                .unlockedBy("has_amethyst_shard", has(Items.AMETHYST_SHARD)).save(pRecipeOutput);

        makeTrimSmithing(pRecipeOutput, ModItems.AMETHYST_GEM_SMITHING_TEMPLATE.get(), ResourceLocation.fromNamespaceAndPath(BetterVanillaMod.MODID, "amethyst_gem_pattern"));

        makeStickRecipe(pRecipeOutput, ModItems.STONE_ROD.get(), Items.COBBLESTONE, "has_cobblestone");
        makeStickRecipe(pRecipeOutput, ModItems.NETHER_ROD.get(), Items.NETHERRACK, "has_netherrack");
        makeStickRecipe(pRecipeOutput, ModItems.COPPER_ROD.get(), Items.COPPER_INGOT, "has_copper_ingot");
        makeStickRecipe(pRecipeOutput, ModItems.IRON_ROD.get(), Items.IRON_INGOT, "has_iron_ingot");
        makeStickRecipe(pRecipeOutput, ModItems.GOLD_ROD.get(), Items.GOLD_INGOT, "has_gold_ingot");
        makeStickRecipe(pRecipeOutput, ModItems.QUARTZ_CHUNK.get(), Items.QUARTZ, "has_quartz");
        makeStickRecipe(pRecipeOutput, ModItems.AMETHYST_CHUNK.get(), ModItems.AMETHYST_GEM.get(), "has_amethyst_gem");
        makeStickRecipe(pRecipeOutput, ModItems.DIAMOND_CHUNK.get(), Items.DIAMOND, "has_diamond");
        makeStickRecipe(pRecipeOutput, ModItems.EMERALD_ROD.get(), Items.EMERALD, "has_emerald");
        makeStickRecipe(pRecipeOutput, ModItems.NETHERITE_ROD.get(), Items.NETHERITE_INGOT, "has_netherite_ingot");

        /* BOW RECIPES */
        makeBowRecipe(pRecipeOutput, ModItems.STONE_BOW.get(), ModItems.STONE_ROD.get(), "has_stone_rod");
        makeBowRecipe(pRecipeOutput, ModItems.NETHERRACK_BOW.get(), ModItems.NETHER_ROD.get(), "has_nether_rod");
        makeBowRecipe(pRecipeOutput, ModItems.COPPER_BOW.get(), ModItems.COPPER_ROD.get(), "has_copper_rod");
        makeBowRecipe(pRecipeOutput, ModItems.IRON_BOW.get(), ModItems.IRON_ROD.get(), "has_iron_rod");
        makeBowRecipe(pRecipeOutput, ModItems.QUARTZ_BOW.get(), ModItems.QUARTZ_CHUNK.get(), "has_quartz_chunk");
        makeBowRecipe(pRecipeOutput, ModItems.AMETHYST_BOW.get(), ModItems.AMETHYST_CHUNK.get(), "has_amethyst_chunk");
        makeBowRecipe(pRecipeOutput, ModItems.GOLD_BOW.get(), ModItems.GOLD_ROD.get(), "has_gold_rod");
        makeBowRecipe(pRecipeOutput, ModItems.DIAMOND_BOW.get(), ModItems.DIAMOND_CHUNK.get(), "has_diamond_chunk");
        makeBowRecipe(pRecipeOutput, ModItems.EMERALD_BOW.get(), ModItems.EMERALD_ROD.get(), "has_emerald_rod");
        makeBowRecipe(pRecipeOutput, ModItems.NETHERITE_BOW.get(), ModItems.NETHERITE_ROD.get(), "has_netherite_rod");


        /* Misc Tools */
        makeHammerRecipe(pRecipeOutput, ModItems.IRON_HAMMER.get(), Items.IRON_INGOT, "has_iron_ingot");
        makeHammerRecipe(pRecipeOutput, ModItems.GOLD_HAMMER.get(), Items.GOLD_INGOT, "has_gold_ingot");
        makeHammerRecipe(pRecipeOutput, ModItems.DIAMOND_HAMMER.get(), Items.DIAMOND, "has_diamond");
        makeHammerRecipe(pRecipeOutput, ModItems.NETHERITE_HAMMER.get(), Items.NETHERITE_INGOT, "has_netherite_ingot");

        /* WOOD TIER RECIPES */
        makeHelmetRecipe(pRecipeOutput, ModItems.WOOD_HELMET.get(), ItemTags.PLANKS, "has_planks");
        makeChestplateRecipe(pRecipeOutput, ModItems.WOOD_CHESTPLATE.get(), ItemTags.PLANKS, "has_planks");
        makeLeggingRecipe(pRecipeOutput, ModItems.WOOD_LEGGINGS.get(), ItemTags.PLANKS, "has_planks");
        makeBootsRecipe(pRecipeOutput, ModItems.WOOD_BOOTS.get(), ItemTags.PLANKS, "has_planks");
        makeHammerRecipe(pRecipeOutput, ModItems.WOOD_HAMMER.get(), ItemTags.PLANKS, "has_planks");

        /* STONE TIER RECIPES */
        makeHelmetRecipe(pRecipeOutput, ModItems.STONE_HELMET.get(), Items.COBBLESTONE, "has_stone");
        makeChestplateRecipe(pRecipeOutput, ModItems.STONE_CHESTPLATE.get(), Items.COBBLESTONE, "has_stone");
        makeLeggingRecipe(pRecipeOutput, ModItems.STONE_LEGGINGS.get(), Items.COBBLESTONE, "has_stone");
        makeBootsRecipe(pRecipeOutput, ModItems.STONE_BOOTS.get(), Items.COBBLESTONE, "has_stone");
        makeHammerRecipe(pRecipeOutput, ModItems.STONE_HAMMER.get(), Items.COBBLESTONE, "has_stone");


        /* NETHERRACK TIER RECIPES */
        // armor
        makeHelmetRecipe(pRecipeOutput, ModItems.NETHERRACK_HELMET.get(), Items.NETHERRACK, "has_netherrack");
        makeChestplateRecipe(pRecipeOutput, ModItems.NETHERRACK_CHESTPLATE.get(), Items.NETHERRACK, "has_netherrack");
        makeLeggingRecipe(pRecipeOutput, ModItems.NETHERRACK_LEGGINGS.get(), Items.NETHERRACK, "has_netherrack");
        makeBootsRecipe(pRecipeOutput, ModItems.NETHERRACK_BOOTS.get(), Items.NETHERRACK, "has_netherrack");

        // tools
        makeSwordRecipe(pRecipeOutput, ModItems.NETHERRACK_SWORD.get(), Items.NETHERRACK, "has_netherrack");
        makePickaxeRecipe(pRecipeOutput, ModItems.NETHERRACK_PICKAXE.get(), Items.NETHERRACK, "has_netherrack");
        makeShovelRecipe(pRecipeOutput, ModItems.NETHERRACK_SHOVEL.get(), Items.NETHERRACK, "has_netherrack");
        makeAxeRecipe(pRecipeOutput, ModItems.NETHERRACK_AXE.get(), Items.NETHERRACK, "has_netherrack");
        makeHoeRecipe(pRecipeOutput, ModItems.NETHERRACK_HOE.get(), Items.NETHERRACK, "has_netherrack");
        makeHammerRecipe(pRecipeOutput, ModItems.NETHERRACK_HAMMER.get(), Items.NETHERRACK, "has_netherrack");

        /* COPPER TIER RECIPES */
        // armor
        makeHelmetRecipe(pRecipeOutput, ModItems.COPPER_HELMET.get(), Items.COPPER_INGOT, "has_copper_ingot");
        makeChestplateRecipe(pRecipeOutput, ModItems.COPPER_CHESTPLATE.get(), Items.COPPER_INGOT, "has_copper_ingot");
        makeLeggingRecipe(pRecipeOutput, ModItems.COPPER_LEGGINGS.get(), Items.COPPER_INGOT, "has_copper_ingot");
        makeBootsRecipe(pRecipeOutput, ModItems.COPPER_BOOTS.get(), Items.COPPER_INGOT, "has_copper_ingot");

        // tools
        makeSwordRecipe(pRecipeOutput, ModItems.COPPER_SWORD.get(), Items.COPPER_INGOT, "has_copper_ingot");
        makePickaxeRecipe(pRecipeOutput, ModItems.COPPER_PICKAXE.get(), Items.COPPER_INGOT, "has_copper_ingot");
        makeShovelRecipe(pRecipeOutput, ModItems.COPPER_SHOVEL.get(), Items.COPPER_INGOT, "has_copper_ingot");
        makeAxeRecipe(pRecipeOutput, ModItems.COPPER_AXE.get(), Items.COPPER_INGOT, "has_copper_ingot");
        makeHoeRecipe(pRecipeOutput, ModItems.COPPER_HOE.get(), Items.COPPER_INGOT, "has_copper_ingot");
        makeHammerRecipe(pRecipeOutput, ModItems.COPPER_HAMMER.get(), Items.COPPER_INGOT, "has_copper_ingot");

        /* AMETHYST TIER RECIPES */
        // armor
        makeHelmetRecipe(pRecipeOutput, ModItems.AMETHYST_HELMET.get(), ModItems.AMETHYST_GEM.get(), "has_amethyst_gem");
        makeChestplateRecipe(pRecipeOutput, ModItems.AMETHYST_CHESTPLATE.get(), ModItems.AMETHYST_GEM.get(), "has_amethyst_gem");
        makeLeggingRecipe(pRecipeOutput, ModItems.AMETHYST_LEGGINGS.get(), ModItems.AMETHYST_GEM.get(), "has_amethyst_gem");
        makeBootsRecipe(pRecipeOutput, ModItems.AMETHYST_BOOTS.get(), ModItems.AMETHYST_GEM.get(), "has_amethyst_gem");

        // tools
        makeSwordRecipe(pRecipeOutput, ModItems.AMETHYST_SWORD.get(), ModItems.AMETHYST_GEM.get(), "has_amethyst_gem");
        makePickaxeRecipe(pRecipeOutput, ModItems.AMETHYST_PICKAXE.get(), ModItems.AMETHYST_GEM.get(), "has_amethyst_gem");
        makeShovelRecipe(pRecipeOutput, ModItems.AMETHYST_SHOVEL.get(), ModItems.AMETHYST_GEM.get(), "has_amethyst_gem");
        makeAxeRecipe(pRecipeOutput, ModItems.AMETHYST_AXE.get(), ModItems.AMETHYST_GEM.get(), "has_amethyst_gem");
        makeHoeRecipe(pRecipeOutput, ModItems.AMETHYST_HOE.get(), ModItems.AMETHYST_GEM.get(), "has_amethyst_gem");
        makeHammerRecipe(pRecipeOutput, ModItems.AMETHYST_HAMMER.get(), ModItems.AMETHYST_GEM.get(), "has_amethyst_gem");

        /* QUARTZ TIER RECIPES */
        // armor
        makeHelmetRecipe(pRecipeOutput, ModItems.QUARTZ_HELMET.get(), Items.QUARTZ, "has_quartz");
        makeChestplateRecipe(pRecipeOutput, ModItems.QUARTZ_CHESTPLATE.get(), Items.QUARTZ, "has_quartz");
        makeLeggingRecipe(pRecipeOutput, ModItems.QUARTZ_LEGGINGS.get(), Items.QUARTZ, "has_quartz");
        makeBootsRecipe(pRecipeOutput, ModItems.QUARTZ_BOOTS.get(), Items.QUARTZ, "has_quartz");

        // tools
        makeSwordRecipe(pRecipeOutput, ModItems.QUARTZ_SWORD.get(), Items.QUARTZ, "has_quartz");
        makePickaxeRecipe(pRecipeOutput, ModItems.QUARTZ_PICKAXE.get(), Items.QUARTZ, "has_quartz");
        makeShovelRecipe(pRecipeOutput, ModItems.QUARTZ_SHOVEL.get(), Items.QUARTZ, "has_quartz");
        makeAxeRecipe(pRecipeOutput, ModItems.QUARTZ_AXE.get(), Items.QUARTZ, "has_quartz");
        makeHoeRecipe(pRecipeOutput, ModItems.QUARTZ_HOE.get(), Items.QUARTZ, "has_quartz");
        makeHammerRecipe(pRecipeOutput, ModItems.QUARTZ_HAMMER.get(), Items.QUARTZ, "has_quartz");

        /* EMERALD TIER RECIPES */
        // armor
        makeHelmetRecipe(pRecipeOutput, ModItems.EMERALD_HELMET.get(), Items.EMERALD, "has_emerald");
        makeChestplateRecipe(pRecipeOutput, ModItems.EMERALD_CHESTPLATE.get(), Items.EMERALD, "has_emerald");
        makeLeggingRecipe(pRecipeOutput, ModItems.EMERALD_LEGGINGS.get(), Items.EMERALD, "has_emerald");
        makeBootsRecipe(pRecipeOutput, ModItems.EMERALD_BOOTS.get(), Items.EMERALD, "has_emerald");

        // tools
        makeSwordRecipe(pRecipeOutput, ModItems.EMERALD_SWORD.get(), Items.EMERALD, "has_emerald");
        makePickaxeRecipe(pRecipeOutput, ModItems.EMERALD_PICKAXE.get(), Items.EMERALD, "has_emerald");
        makeShovelRecipe(pRecipeOutput, ModItems.EMERALD_SHOVEL.get(), Items.EMERALD, "has_emerald");
        makeAxeRecipe(pRecipeOutput, ModItems.EMERALD_AXE.get(), Items.EMERALD, "has_emerald");
        makeHoeRecipe(pRecipeOutput, ModItems.EMERALD_HOE.get(), Items.EMERALD, "has_emerald");
        makeHammerRecipe(pRecipeOutput, ModItems.EMERALD_HAMMER.get(), Items.EMERALD, "has_emerald");
    }

    /*
     * OVERRIDDEN METHODS FOR GENERATING JSON FILES IN CORRECT LOCATION
     * CREDIT: Kaupenjoe (https://github.com/Tutorials-By-Kaupenjoe/Forge-Tutorial-1.21.X)
     */
    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, BetterVanillaMod.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
