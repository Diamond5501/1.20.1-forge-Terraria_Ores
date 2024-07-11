package net.diamond_5501.terraria_ores.item;

import net.diamond_5501.terraria_ores.TerrariaOres;
import net.diamond_5501.terraria_ores.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    //Terraria Copper
    public static final Tier TCOPPER = TierSortingRegistry.registerTier(
            new ForgeTier(2,200,5f,2f,14,
                    ModTags.Blocks.NEEDS_TCOPPER_TOOL, () -> Ingredient.of(ModItems.TCOPPER_INGOT.get())),
            new ResourceLocation(TerrariaOres.MOD_ID, "tcopper"), List.of(Tiers.STONE), List.of());

    //Tin
    public static final Tier TIN = TierSortingRegistry.registerTier(
            new ForgeTier(2,200,5f,2f,14,
                    ModTags.Blocks.NEEDS_TIN_TOOL, () -> Ingredient.of(ModItems.TIN_INGOT.get())),
            new ResourceLocation(TerrariaOres.MOD_ID, "tin"), List.of(Tiers.STONE), List.of());

    //Terraria Iron
    public static final Tier TIRON = TierSortingRegistry.registerTier(
            new ForgeTier(2,250,6f,2f,14,
                    ModTags.Blocks.NEEDS_TIRON_TOOL, () -> Ingredient.of(ModItems.TIRON_INGOT.get())),
            new ResourceLocation(TerrariaOres.MOD_ID, "tiron"), List.of(Tiers.STONE), List.of());

    //Lead
    public static final Tier LEAD = TierSortingRegistry.registerTier(
            new ForgeTier(2,250,6f,2f,14,
                    ModTags.Blocks.NEEDS_LEAD_TOOL, () -> Ingredient.of(ModItems.LEAD_INGOT.get())),
            new ResourceLocation(TerrariaOres.MOD_ID, "lead"), List.of(Tiers.IRON), List.of());

    //Silver
    public static final Tier SILVER = TierSortingRegistry.registerTier(
            new ForgeTier(2,500,6f,2f,14,
                    ModTags.Blocks.NEEDS_SILVER_TOOL, () -> Ingredient.of(ModItems.SILVER_INGOT.get())),
            new ResourceLocation(TerrariaOres.MOD_ID, "silver"), List.of(Tiers.IRON), List.of());

    //Tungsten
    public static final Tier TUNGSTEN = TierSortingRegistry.registerTier(
            new ForgeTier(2,500,6f,2f,14,
                    ModTags.Blocks.NEEDS_TUNGSTEN_TOOL, () -> Ingredient.of(ModItems.TUNGSTEN_INGOT.get())),
            new ResourceLocation(TerrariaOres.MOD_ID, "tungsten"), List.of(Tiers.IRON), List.of());

    //Terraria Gold
    public static final Tier TGOLD = TierSortingRegistry.registerTier(
            new ForgeTier(2,500,6f,2f,14,
                    ModTags.Blocks.NEEDS_TGOLD_TOOL, () -> Ingredient.of(ModItems.TGOLD_INGOT.get())),
            new ResourceLocation(TerrariaOres.MOD_ID, "tgold"), List.of(Tiers.IRON), List.of());

    //Platinum
    public static final Tier PLATINUM = TierSortingRegistry.registerTier(
            new ForgeTier(2,1500,6f,2f,14,
                    ModTags.Blocks.NEEDS_PLATINUM_TOOL, () -> Ingredient.of(ModItems.PLATINUM_INGOT.get())),
            new ResourceLocation(TerrariaOres.MOD_ID, "platinum"), List.of(Tiers.IRON), List.of());

    //Meteorite
    public static final Tier METEORITE = TierSortingRegistry.registerTier(
            new ForgeTier(2,500,6f,2f,14,
                    ModTags.Blocks.NEEDS_METEORITE_TOOL, () -> Ingredient.of(ModItems.METEORITE_INGOT.get())),
            new ResourceLocation(TerrariaOres.MOD_ID, "meteorite"), List.of(Tiers.IRON), List.of());

    //Demonite
    public static final Tier DEMONITE = TierSortingRegistry.registerTier(
            new ForgeTier(2,500,7f,2f,14,
                    ModTags.Blocks.NEEDS_DEMONITE_TOOL, () -> Ingredient.of(ModItems.DEMONITE_INGOT.get())),
            new ResourceLocation(TerrariaOres.MOD_ID, "demonite"), List.of(Tiers.IRON), List.of());

    //Crimtane
    public static final Tier CRIMTANE = TierSortingRegistry.registerTier(
            new ForgeTier(2,500,7f,2f,14,
                    ModTags.Blocks.NEEDS_CRIMTANE_TOOL, () -> Ingredient.of(ModItems.CRIMTANE_INGOT.get())),
            new ResourceLocation(TerrariaOres.MOD_ID, "crimtane"), List.of(Tiers.IRON), List.of());

    //Hellstone
    public static final Tier HELLSTONE = TierSortingRegistry.registerTier(
            new ForgeTier(3,2000,8f,4f,10,
                    ModTags.Blocks.NEEDS_HELLSTONE_TOOL, () -> Ingredient.of(ModItems.HELLSTONE_INGOT.get())),
            new ResourceLocation(TerrariaOres.MOD_ID, "hellstone"), List.of(Tiers.DIAMOND), List.of());

    //Cobalt
    public static final Tier COBALT = TierSortingRegistry.registerTier(
            new ForgeTier(3,2000,9f,4f,10,
                    ModTags.Blocks.NEEDS_COBALT_TOOL, () -> Ingredient.of(ModItems.COBALT_INGOT.get())),
            new ResourceLocation(TerrariaOres.MOD_ID, "cobalt"), List.of(Tiers.DIAMOND), List.of());

    //Palladium
    public static final Tier PALLADIUM = TierSortingRegistry.registerTier(
            new ForgeTier(3,2000,9f,4f,10,
                    ModTags.Blocks.NEEDS_PALLADIUM_TOOL, () -> Ingredient.of(ModItems.PALLADIUM_INGOT.get())),
            new ResourceLocation(TerrariaOres.MOD_ID, "palladium"), List.of(Tiers.DIAMOND), List.of());

    //Mythril
    public static final Tier MYTHRIL = TierSortingRegistry.registerTier(
            new ForgeTier(3,2000,10f,4f,10,
                    ModTags.Blocks.NEEDS_MYTHRIL_TOOL, () -> Ingredient.of(ModItems.MYTHRIL_INGOT.get())),
            new ResourceLocation(TerrariaOres.MOD_ID, "mythril"), List.of(Tiers.DIAMOND), List.of());

    //Orichalcum
    public static final Tier ORICHALCUM = TierSortingRegistry.registerTier(
            new ForgeTier(3,2000,10f,4f,10,
                    ModTags.Blocks.NEEDS_ORICHALCUM_TOOL, () -> Ingredient.of(ModItems.ORICHALCUM_INGOT.get())),
            new ResourceLocation(TerrariaOres.MOD_ID, "orichalcum"), List.of(Tiers.DIAMOND), List.of());

    //Adamantite
    public static final Tier ADAMANTITE = TierSortingRegistry.registerTier(
            new ForgeTier(4,3000,11f,4f,15,
                    ModTags.Blocks.NEEDS_ADAMANTITE_TOOL, () -> Ingredient.of(ModItems.ADAMANTITE_INGOT.get())),
            new ResourceLocation(TerrariaOres.MOD_ID, "adamantite"), List.of(Tiers.NETHERITE), List.of());

    //Titanium
    public static final Tier TITANIUM = TierSortingRegistry.registerTier(
            new ForgeTier(4,3000,11f,4f,15,
                    ModTags.Blocks.NEEDS_TITANIUM_TOOL, () -> Ingredient.of(ModItems.TITANIUM_INGOT.get())),
            new ResourceLocation(TerrariaOres.MOD_ID, "titanium"), List.of(Tiers.NETHERITE), List.of());

    //Chlorophyte
    public static final Tier CHLOROPHYTE = TierSortingRegistry.registerTier(
            new ForgeTier(5,200,5f,2f,15,
                    ModTags.Blocks.NEEDS_CHLOROPHYTE_TOOL, () -> Ingredient.of(ModItems.CHLOROPHYTE_INGOT.get())),
            new ResourceLocation(TerrariaOres.MOD_ID, "chlorophyte"), List.of(Tiers.NETHERITE), List.of());

}
