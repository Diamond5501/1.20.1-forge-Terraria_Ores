package net.diamond_5501.terraria_ores.datagen;

import net.diamond_5501.terraria_ores.TerrariaOres;
import net.diamond_5501.terraria_ores.block.ModBlocks;
import net.diamond_5501.terraria_ores.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    //Terraria Copper
    public static final List<ItemLike> TCOPPER_SMELTABLES = List.of(ModItems.RAW_TCOPPER.get(),
            ModBlocks.TCOPPER_ORE.get());
    //Tin
    public static final List<ItemLike> TIN_SMELTABLES = List.of(ModItems.RAW_TIN.get(),
            ModBlocks.TIN_ORE.get());
    //Terraria Iron
    public static final List<ItemLike> TIRON_SMELTABLES = List.of(ModItems.RAW_TIRON.get(),
            ModBlocks.TIRON_ORE.get());
    //Lead
    public static final List<ItemLike> LEAD_SMELTABLES = List.of(ModItems.RAW_LEAD.get(),
            ModBlocks.LEAD_ORE.get());
    //Silver
    public static final List<ItemLike> SILVER_SMELTABLES = List.of(ModItems.RAW_SILVER.get(),
            ModBlocks.SILVER_ORE.get());
    //Tungsten
    public static final List<ItemLike> TUNGSTEN_SMELTABLES = List.of(ModItems.RAW_TUNGSTEN.get(),
            ModBlocks.TUNGSTEN_ORE.get());
    //Terraria Gold
    public static final List<ItemLike> TGOLD_SMELTABLES = List.of(ModItems.RAW_TGOLD.get(),
            ModBlocks.TGOLD_ORE.get());
    //Platinum
    public static final List<ItemLike> PLATINUM_SMELTABLES = List.of(ModItems.RAW_PLATINUM.get(),
            ModBlocks.PLATINUM_ORE.get());
    //Meteorite
    public static final List<ItemLike> METEORITE_SMELTABLES = List.of(ModItems.RAW_METEORITE.get(),
            ModBlocks.METEORITE.get());
    //Demonite
    public static final List<ItemLike> DEMONITE_SMELTABLES = List.of(ModItems.RAW_DEMONITE.get(),
            ModBlocks.DEMONITE_ORE.get());
    //Crimtane
    public static final List<ItemLike> CRIMTANE_SMELTABLES = List.of(ModItems.RAW_CRIMTANE.get(),
            ModBlocks.CRIMTANE_ORE.get());
    //Cobalt
    public static final List<ItemLike> COBALT_SMELTABLES = List.of(ModItems.RAW_COBALT.get(),
            ModBlocks.COBALT_ORE.get());
    //Palladium
    public static final List<ItemLike> PALLADIUM_SMELTABLES = List.of(ModItems.RAW_PALLADIUM.get(),
            ModBlocks.PALLADIUM_ORE.get());
    //Mythril
    public static final List<ItemLike> MYTHRIL_SMELTABLES = List.of(ModItems.RAW_MYTHRIL.get(),
            ModBlocks.MYTHRIL_ORE.get());
    //Orichalcum
    public static final List<ItemLike> ORICHALCUM_SMELTABLES = List.of(ModItems.RAW_ORICHALCUM.get(),
            ModBlocks.ORICHALCUM_ORE.get());
    //Adamantite
    public static final List<ItemLike> ADAMANTITE_SMELTABLES = List.of(ModItems.RAW_ADAMANTITE.get(),
            ModBlocks.ADAMANTITE_ORE.get());
    //Titanium
    public static final List<ItemLike> TITANIUM_SMELTABLES = List.of(ModItems.RAW_TITANIUM.get(),
            ModBlocks.TITANIUM_ORE.get());
    //Chlorophyte
    public static final List<ItemLike> CHLOROPHYTE_SMELTABLES = List.of(ModItems.RAW_CHLOROPHYTE.get(),
            ModBlocks.CHLOROPHYTE_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        //Terraria Copper
        oreSmelting(pWriter, TCOPPER_SMELTABLES, RecipeCategory.MISC, ModItems.TCOPPER_INGOT.get(), 0.25f, 200,"tcopper_ingot");
        oreBlasting(pWriter, TCOPPER_SMELTABLES, RecipeCategory.MISC, ModItems.TCOPPER_INGOT.get(), 0.25f, 100,"tcopper_ingot");
        //Tin
        oreSmelting(pWriter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.25f, 200,"tin_ingot");
        oreBlasting(pWriter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.25f, 100,"tin_ingot");
        //Terraria Iron
        oreSmelting(pWriter, TIRON_SMELTABLES, RecipeCategory.MISC, ModItems.TIRON_INGOT.get(), 0.25f, 200,"tiron_ingot");
        oreBlasting(pWriter, TIRON_SMELTABLES, RecipeCategory.MISC, ModItems.TIRON_INGOT.get(), 0.25f, 100,"tiron_ingot");
        //Lead
        oreSmelting(pWriter, LEAD_SMELTABLES, RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), 0.25f, 200,"lead_ingot");
        oreBlasting(pWriter, LEAD_SMELTABLES, RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), 0.25f, 100,"lead_ingot");
        //Silver
        oreSmelting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 0.25f, 200,"silver_ingot");
        oreBlasting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 0.25f, 100,"silver_ingot");
        //Tungsten
        oreSmelting(pWriter, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT.get(), 0.25f, 200,"tungsten_ingot");
        oreBlasting(pWriter, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT.get(), 0.25f, 100,"tungsten_ingot");
        //Terraria Gold
        oreSmelting(pWriter, TGOLD_SMELTABLES, RecipeCategory.MISC, ModItems.TGOLD_INGOT.get(), 0.25f, 200,"tgold_ingot");
        oreBlasting(pWriter, TGOLD_SMELTABLES, RecipeCategory.MISC, ModItems.TGOLD_INGOT.get(), 0.25f, 100,"tgold_ingot");
        //Platinum
        oreSmelting(pWriter, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(), 0.25f, 200,"platinum_ingot");
        oreBlasting(pWriter, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(), 0.25f, 100,"platinum_ingot");
        //Meteorite
        oreSmelting(pWriter, METEORITE_SMELTABLES, RecipeCategory.MISC, ModItems.METEORITE_INGOT.get(), 0.25f, 200,"meteorite_ingot");
        oreBlasting(pWriter, METEORITE_SMELTABLES, RecipeCategory.MISC, ModItems.METEORITE_INGOT.get(), 0.25f, 100,"meteorite_ingot");
        //Demonite
        oreSmelting(pWriter, DEMONITE_SMELTABLES, RecipeCategory.MISC, ModItems.DEMONITE_INGOT.get(), 0.25f, 200,"demonite_ingot");
        oreBlasting(pWriter, DEMONITE_SMELTABLES, RecipeCategory.MISC, ModItems.DEMONITE_INGOT.get(), 0.25f, 100,"demonite_ingot");
        //Crimtane
        oreSmelting(pWriter, CRIMTANE_SMELTABLES, RecipeCategory.MISC, ModItems.CRIMTANE_INGOT.get(), 0.25f, 200,"crimtane_ingot");
        oreBlasting(pWriter, CRIMTANE_SMELTABLES, RecipeCategory.MISC, ModItems.CRIMTANE_INGOT.get(), 0.25f, 100,"crimtane_ingot");
        //Cobalt
        oreSmelting(pWriter, COBALT_SMELTABLES, RecipeCategory.MISC, ModItems.COBALT_INGOT.get(), 0.25f, 200,"cobalt_ingot");
        oreBlasting(pWriter, COBALT_SMELTABLES, RecipeCategory.MISC, ModItems.COBALT_INGOT.get(), 0.25f, 100,"cobalt_ingot");
        //Palladium
        oreSmelting(pWriter, PALLADIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PALLADIUM_INGOT.get(), 0.25f, 200,"palladium_ingot");
        oreBlasting(pWriter, PALLADIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PALLADIUM_INGOT.get(), 0.25f, 100,"palladium_ingot");
        //Mythril
        oreSmelting(pWriter, MYTHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MYTHRIL_INGOT.get(), 0.25f, 200,"mythril_ingot");
        oreBlasting(pWriter, MYTHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MYTHRIL_INGOT.get(), 0.25f, 100,"mythril_ingot");
        //Orichalcum
        oreSmelting(pWriter, ORICHALCUM_SMELTABLES, RecipeCategory.MISC, ModItems.ORICHALCUM_INGOT.get(), 0.25f, 200,"orichalcum_ingot");
        oreBlasting(pWriter, ORICHALCUM_SMELTABLES, RecipeCategory.MISC, ModItems.ORICHALCUM_INGOT.get(), 0.25f, 100,"orichalcum_ingot");
        //Adamantite
        oreSmelting(pWriter, ADAMANTITE_SMELTABLES, RecipeCategory.MISC, ModItems.ADAMANTITE_INGOT.get(), 0.25f, 200,"adamantite_ingot");
        oreBlasting(pWriter, ADAMANTITE_SMELTABLES, RecipeCategory.MISC, ModItems.ADAMANTITE_INGOT.get(), 0.25f, 100,"adamantite_ingot");
        //Titanium
        oreSmelting(pWriter, TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(), 0.25f, 200,"titanium_ingot");
        oreBlasting(pWriter, TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(), 0.25f, 100,"titanium_ingot");
        //Chlorophyte
        oreSmelting(pWriter, CHLOROPHYTE_SMELTABLES, RecipeCategory.MISC, ModItems.CHLOROPHYTE_INGOT.get(), 0.25f, 200,"chlorophyte_ingot");
        oreBlasting(pWriter, CHLOROPHYTE_SMELTABLES, RecipeCategory.MISC, ModItems.CHLOROPHYTE_INGOT.get(), 0.25f, 100,"chlorophyte_ingot");

        //ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.get())
                //.pattern("AAA")
                //.pattern("AAA")
                //.pattern("AAA")
                //.define("A", ModItems.get())
                //.unlockedBy(getHasName(ModItems.get()), has(ModItems.get()))
                //.save(pWriter);

        //ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks..get(),pCount)
                //.requires(ModBlocks..get())
                //.unlockedBy(getHasName(ModBlocks..get()), has(ModBlocks..get()))
                //.save(pWriter);
    }
    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        Iterator var9 = pIngredients.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, TerrariaOres.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
