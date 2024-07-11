package net.diamond_5501.terraria_ores.item;

import net.diamond_5501.terraria_ores.TerrariaOres;
import net.diamond_5501.terraria_ores.block.ModBlocks;
import net.diamond_5501.terraria_ores.item.custom.BladeOfGrassItem;
import net.diamond_5501.terraria_ores.item.custom.BloodButchererItem;
import net.diamond_5501.terraria_ores.item.custom.VolcanoItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TerrariaOres.MOD_ID);
    //Terraria Copper
    public static final RegistryObject<Item> TCOPPER_INGOT = ITEMS.register("tcopper_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TCOPPER = ITEMS.register("raw_tcopper",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TCOPPER_PICKAXE = ITEMS.register("tcopper_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TCOPPER,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TCOPPER_SHOVEL = ITEMS.register("tcopper_shovel",
            () -> new ShovelItem(ModToolTiers.TCOPPER,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TCOPPER_AXE = ITEMS.register("tcopper_axe",
            () -> new AxeItem(ModToolTiers.TCOPPER,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TCOPPER_SICKLE = ITEMS.register("tcopper_sickle",
            () -> new HoeItem(ModToolTiers.TCOPPER,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TCOPPER_SHORTSWORD = ITEMS.register("tcopper_shortsword",
            () -> new SwordItem(ModToolTiers.TCOPPER,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TCOPPER_BROADSWORD = ITEMS.register("tcopper_broadsword",
            () -> new SwordItem(ModToolTiers.TCOPPER,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TCOPPER_BOW = ITEMS.register("tcopper_bow",
            () -> new BowItem(new Item.Properties()));

    public static final RegistryObject<Item> TCOPPER_HELMET = ITEMS.register("tcopper_helmet",
            () -> new ArmorItem(ModArmorMaterials.TCOPPER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> TCOPPER_CHESTPLATE = ITEMS.register("tcopper_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TCOPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> TCOPPER_LEGGINGS = ITEMS.register("tcopper_leggings",
            () -> new ArmorItem(ModArmorMaterials.TCOPPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> TCOPPER_BOOTS = ITEMS.register("tcopper_boots",
            () -> new ArmorItem(ModArmorMaterials.TCOPPER, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Tin
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_PICKAXE = ITEMS.register("tin_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TIN,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TIN_SHOVEL = ITEMS.register("tin_shovel",
            () -> new ShovelItem(ModToolTiers.TIN,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TIN_AXE = ITEMS.register("tin_axe",
            () -> new AxeItem(ModToolTiers.TIN,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TIN_SICKLE = ITEMS.register("tin_sickle",
            () -> new HoeItem(ModToolTiers.TIN,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TIN_SHORTSWORD = ITEMS.register("tin_shortsword",
            () -> new SwordItem(ModToolTiers.TIN,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TIN_BROADSWORD = ITEMS.register("tin_broadsword",
            () -> new SwordItem(ModToolTiers.TIN,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TIN_BOW = ITEMS.register("tin_bow",
            () -> new BowItem(new Item.Properties()));

    public static final RegistryObject<Item> TIN_HELMET = ITEMS.register("tin_helmet",
            () -> new ArmorItem(ModArmorMaterials.TIN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> TIN_CHESTPLATE = ITEMS.register("tin_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TIN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> TIN_LEGGINGS = ITEMS.register("tin_leggings",
            () -> new ArmorItem(ModArmorMaterials.TIN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register("tin_boots",
            () -> new ArmorItem(ModArmorMaterials.TIN, ArmorItem.Type.BOOTS, new Item.Properties()));


    //Terraria Iron
    public static final RegistryObject<Item> TIRON_INGOT = ITEMS.register("tiron_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TIRON = ITEMS.register("raw_tiron",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIRON_PICKAXE = ITEMS.register("tiron_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TIRON,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TIRON_SHOVEL = ITEMS.register("tiron_shovel",
            () -> new ShovelItem(ModToolTiers.TIRON,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TIRON_AXE = ITEMS.register("tiron_axe",
            () -> new AxeItem(ModToolTiers.TIRON,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TIRON_SICKLE = ITEMS.register("tiron_sickle",
            () -> new HoeItem(ModToolTiers.TIRON,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TIRON_SHORTSWORD = ITEMS.register("tiron_shortsword",
            () -> new SwordItem(ModToolTiers.TIRON,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TIRON_BROADSWORD = ITEMS.register("tiron_broadsword",
            () -> new SwordItem(ModToolTiers.TIRON,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TIRON_BOW = ITEMS.register("tiron_bow",
            () -> new BowItem(new Item.Properties()));

    public static final RegistryObject<Item> TIRON_HELMET = ITEMS.register("tiron_helmet",
            () -> new ArmorItem(ModArmorMaterials.TIRON, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> TIRON_CHESTPLATE = ITEMS.register("tiron_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TIRON, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> TIRON_LEGGINGS = ITEMS.register("tiron_leggings",
            () -> new ArmorItem(ModArmorMaterials.TIRON, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> TIRON_BOOTS = ITEMS.register("tiron_boots",
            () -> new ArmorItem(ModArmorMaterials.TIRON, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Lead
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LEAD_PICKAXE = ITEMS.register("lead_pickaxe",
            () -> new PickaxeItem(ModToolTiers.LEAD,1,1, new Item.Properties()));
    public static final RegistryObject<Item> LEAD_SHOVEL = ITEMS.register("lead_shovel",
            () -> new ShovelItem(ModToolTiers.LEAD,1,1, new Item.Properties()));
    public static final RegistryObject<Item> LEAD_AXE = ITEMS.register("lead_axe",
            () -> new AxeItem(ModToolTiers.LEAD,1,1, new Item.Properties()));
    public static final RegistryObject<Item> LEAD_SICKLE = ITEMS.register("lead_sickle",
            () -> new HoeItem(ModToolTiers.LEAD,1,1, new Item.Properties()));
    public static final RegistryObject<Item> LEAD_SHORTSWORD = ITEMS.register("lead_shortsword",
            () -> new SwordItem(ModToolTiers.LEAD,1,1, new Item.Properties()));
    public static final RegistryObject<Item> LEAD_BROADSWORD = ITEMS.register("lead_broadsword",
            () -> new SwordItem(ModToolTiers.LEAD,1,1, new Item.Properties()));
    public static final RegistryObject<Item> LEAD_BOW = ITEMS.register("lead_bow",
            () -> new BowItem(new Item.Properties()));

    public static final RegistryObject<Item> LEAD_HELMET = ITEMS.register("lead_helmet",
            () -> new ArmorItem(ModArmorMaterials.LEAD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> LEAD_CHESTPLATE = ITEMS.register("lead_chestplate",
            () -> new ArmorItem(ModArmorMaterials.LEAD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> LEAD_LEGGINGS = ITEMS.register("lead_leggings",
            () -> new ArmorItem(ModArmorMaterials.LEAD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> LEAD_BOOTS = ITEMS.register("lead_boots",
            () -> new ArmorItem(ModArmorMaterials.LEAD, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Silver
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SILVER,1,1, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel",
            () -> new ShovelItem(ModToolTiers.SILVER,1,1, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe",
            () -> new AxeItem(ModToolTiers.SILVER,1,1, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_SICKLE = ITEMS.register("silver_sickle",
            () -> new HoeItem(ModToolTiers.SILVER,1,1, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_SHORTSWORD = ITEMS.register("silver_shortsword",
            () -> new SwordItem(ModToolTiers.SILVER,1,1, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_BROADSWORD = ITEMS.register("silver_broadsword",
            () -> new SwordItem(ModToolTiers.SILVER,1,1, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_BOW = ITEMS.register("silver_bow",
            () -> new BowItem(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Tungsten
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TUNGSTEN_PICKAXE = ITEMS.register("tungsten_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TUNGSTEN,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_SHOVEL = ITEMS.register("tungsten_shovel",
            () -> new ShovelItem(ModToolTiers.TUNGSTEN,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_AXE = ITEMS.register("tungsten_axe",
            () -> new AxeItem(ModToolTiers.TUNGSTEN,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_SICKLE = ITEMS.register("tungsten_sickle",
            () -> new HoeItem(ModToolTiers.TUNGSTEN,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_SHORTSWORD = ITEMS.register("tungsten_shortsword",
            () -> new SwordItem(ModToolTiers.TUNGSTEN,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_BROADSWORD = ITEMS.register("tungsten_broadsword",
            () -> new SwordItem(ModToolTiers.TUNGSTEN,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_BOW = ITEMS.register("tungsten_bow",
            () -> new BowItem(new Item.Properties()));

    public static final RegistryObject<Item> TUNGSTEN_HELMET = ITEMS.register("tungsten_helmet",
            () -> new ArmorItem(ModArmorMaterials.TUNGSTEN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_CHESTPLATE = ITEMS.register("tungsten_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TUNGSTEN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_LEGGINGS = ITEMS.register("tungsten_leggings",
            () -> new ArmorItem(ModArmorMaterials.TUNGSTEN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_BOOTS = ITEMS.register("tungsten_boots",
            () -> new ArmorItem(ModArmorMaterials.TUNGSTEN, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Terraria Gold
    public static final RegistryObject<Item> TGOLD_INGOT = ITEMS.register("tgold_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TGOLD = ITEMS.register("raw_tgold",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TGOLD_PICKAXE = ITEMS.register("tgold_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TGOLD,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TGOLD_SHOVEL = ITEMS.register("tgold_shovel",
            () -> new ShovelItem(ModToolTiers.TGOLD,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TGOLD_AXE = ITEMS.register("tgold_axe",
            () -> new AxeItem(ModToolTiers.TGOLD,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TGOLD_SICKLE = ITEMS.register("tgold_sickle",
            () -> new HoeItem(ModToolTiers.TGOLD,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TGOLD_SHORTSWORD = ITEMS.register("tgold_shortsword",
            () -> new SwordItem(ModToolTiers.TGOLD,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TGOLD_BROADSWORD = ITEMS.register("tgold_broadsword",
            () -> new SwordItem(ModToolTiers.TGOLD,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TGOLD_BOW = ITEMS.register("tgold_bow",
            () -> new BowItem(new Item.Properties()));

    public static final RegistryObject<Item> TGOLD_HELMET = ITEMS.register("tgold_helmet",
            () -> new ArmorItem(ModArmorMaterials.TGOLD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> TGOLD_CHESTPLATE = ITEMS.register("tgold_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TGOLD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> TGOLD_LEGGINGS = ITEMS.register("tgold_leggings",
            () -> new ArmorItem(ModArmorMaterials.TGOLD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> TGOLD_BOOTS = ITEMS.register("tgold_boots",
            () -> new ArmorItem(ModArmorMaterials.TGOLD, ArmorItem.Type.BOOTS, new Item.Properties()));


    //Platinum
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PLATINUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel",
            () -> new ShovelItem(ModToolTiers.PLATINUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_AXE = ITEMS.register("platinum_axe",
            () -> new AxeItem(ModToolTiers.PLATINUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_SICKLE = ITEMS.register("platinum_sickle",
            () -> new HoeItem(ModToolTiers.PLATINUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_BROADSWORD = ITEMS.register("platinum_broadsword",
            () -> new SwordItem(ModToolTiers.PLATINUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_SHORTSWORD = ITEMS.register("platinum_shortsword",
            () -> new SwordItem(ModToolTiers.PLATINUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_BOW = ITEMS.register("platinum_bow",
            () -> new BowItem(new Item.Properties()));

    public static final RegistryObject<Item> PLATINUM_HELMET = ITEMS.register("platinum_helmet",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_BOOTS = ITEMS.register("platinum_boots",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Meteorite
    public static final RegistryObject<Item> METEORITE_INGOT = ITEMS.register("meteorite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_METEORITE = ITEMS.register("raw_meteorite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PHASEBLADE_BLANK = ITEMS.register("phaseblade_blank",
            () -> new SwordItem(ModToolTiers.METEORITE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> RED_PHASEBLADE = ITEMS.register("red_phaseblade",
            () -> new SwordItem(ModToolTiers.METEORITE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_PHASEBLADE = ITEMS.register("orange_phaseblade",
            () -> new SwordItem(ModToolTiers.METEORITE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_PHASEBLADE = ITEMS.register("yellow_phaseblade",
            () -> new SwordItem(ModToolTiers.METEORITE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> GREEN_PHASEBLADE = ITEMS.register("green_phaseblade",
            () -> new SwordItem(ModToolTiers.METEORITE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> BLUE_PHASEBLADE = ITEMS.register("blue_phaseblade",
            () -> new SwordItem(ModToolTiers.METEORITE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_PHASEBLADE = ITEMS.register("purple_phaseblade",
            () -> new SwordItem(ModToolTiers.METEORITE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_PHASEBLADE = ITEMS.register("white_phaseblade",
            () -> new SwordItem(ModToolTiers.METEORITE,1,1, new Item.Properties()));

    public static final RegistryObject<Item> METEORITE_HELMET = ITEMS.register("meteorite_helmet",
            () -> new ArmorItem(ModArmorMaterials.METEORITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> METEORITE_CHESTPLATE = ITEMS.register("meteorite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.METEORITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> METEORITE_LEGGINGS = ITEMS.register("meteorite_leggings",
            () -> new ArmorItem(ModArmorMaterials.METEORITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> METEORITE_BOOTS = ITEMS.register("meteorite_boots",
            () -> new ArmorItem(ModArmorMaterials.METEORITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Demonite
    public static final RegistryObject<Item> DEMONITE_INGOT = ITEMS.register("demonite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_DEMONITE = ITEMS.register("raw_demonite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NIGHTMARE_PICKAXE = ITEMS.register("nightmare_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DEMONITE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> DEMON_SHOVEL = ITEMS.register("demon_shovel",
            () -> new ShovelItem(ModToolTiers.DEMONITE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> WAR_AXE_OF_THE_NIGHT = ITEMS.register("war_axe_of_the_night",
            () -> new AxeItem(ModToolTiers.DEMONITE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> DEMON_SICKLE = ITEMS.register("demon_sickle",
            () -> new HoeItem(ModToolTiers.DEMONITE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> LIGHTS_BANE = ITEMS.register("lights_bane",
            () -> new SwordItem(ModToolTiers.DEMONITE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> DEMON_BOW = ITEMS.register("demon_bow",
            () -> new BowItem(new Item.Properties()));

    public static final RegistryObject<Item> SHADOW_HELMET = ITEMS.register("shadow_helmet",
            () -> new ArmorItem(ModArmorMaterials.DEMONITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SHADOW_CHESTPLATE = ITEMS.register("shadow_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DEMONITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SHADOW_LEGGINGS = ITEMS.register("shadow_leggings",
            () -> new ArmorItem(ModArmorMaterials.DEMONITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SHADOW_BOOTS = ITEMS.register("shadow_boots",
            () -> new ArmorItem(ModArmorMaterials.DEMONITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Crimtane
    public static final RegistryObject<Item> CRIMTANE_INGOT = ITEMS.register("crimtane_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_CRIMTANE = ITEMS.register("raw_crimtane",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DEATHBRINGER_PICKAXE = ITEMS.register("deathbringer_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CRIMTANE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> BLOOD_SHOVEL = ITEMS.register("blood_shovel",
            () -> new ShovelItem(ModToolTiers.CRIMTANE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> BLOOD_LUST_CLUSTER = ITEMS.register("blood_lust_cluster",
            () -> new AxeItem(ModToolTiers.CRIMTANE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> BLOODY_SICKLE = ITEMS.register("bloody_sickle",
            () -> new HoeItem(ModToolTiers.CRIMTANE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> BLOOD_BUTCHERER = ITEMS.register("blood_butcherer",
            () -> new BloodButchererItem(ModToolTiers.CRIMTANE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TENDON_BOW = ITEMS.register("tendon_bow",
            () -> new BowItem(new Item.Properties()));

    public static final RegistryObject<Item> CRIMSON_HELMET = ITEMS.register("crimson_helmet",
            () -> new ArmorItem(ModArmorMaterials.CRIMTANE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_CHESTPLATE = ITEMS.register("crimson_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CRIMTANE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_LEGGINGS = ITEMS.register("crimson_leggings",
            () -> new ArmorItem(ModArmorMaterials.CRIMTANE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_BOOTS = ITEMS.register("crimson_boots",
            () -> new ArmorItem(ModArmorMaterials.CRIMTANE, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Hellstone
    public static final RegistryObject<Item> HELLSTONE_INGOT = ITEMS.register("hellstone_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_HELLSTONE = ITEMS.register("raw_hellstone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MOLTEN_PICKAXE = ITEMS.register("molten_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HELLSTONE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> MOLTEN_SHOVEL = ITEMS.register("molten_shovel",
            () -> new ShovelItem(ModToolTiers.HELLSTONE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> MOLTEN_AXE = ITEMS.register("molten_axe",
            () -> new AxeItem(ModToolTiers.HELLSTONE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> MOLTEN_SICKLE = ITEMS.register("molten_sickle",
            () -> new HoeItem(ModToolTiers.HELLSTONE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> VOLCANO = ITEMS.register("volcano",
            () -> new VolcanoItem(ModToolTiers.HELLSTONE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> MOLTEN_FURY = ITEMS.register("molten_fury",
            () -> new BowItem(new Item.Properties()));

    public static final RegistryObject<Item> MOLTEN_HELMET = ITEMS.register("molten_helmet",
            () -> new ArmorItem(ModArmorMaterials.HELLSTONE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MOLTEN_CHESTPLATE = ITEMS.register("molten_chestplate",
            () -> new ArmorItem(ModArmorMaterials.HELLSTONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> MOLTEN_LEGGINGS = ITEMS.register("molten_leggings",
            () -> new ArmorItem(ModArmorMaterials.HELLSTONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> MOLTEN_BOOTS = ITEMS.register("molten_boots",
            () -> new ArmorItem(ModArmorMaterials.HELLSTONE, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Cobalt
    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_COBALT = ITEMS.register("raw_cobalt",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COBALT,1,1, new Item.Properties()));
    public static final RegistryObject<Item> COBALT_SHOVEL = ITEMS.register("cobalt_shovel",
            () -> new ShovelItem(ModToolTiers.COBALT,1,1, new Item.Properties()));
    public static final RegistryObject<Item> COBALT_WARAXE = ITEMS.register("cobalt_waraxe",
            () -> new AxeItem(ModToolTiers.COBALT,1,1, new Item.Properties()));
    public static final RegistryObject<Item> COBALT_SICKLE = ITEMS.register("cobalt_sickle",
            () -> new HoeItem(ModToolTiers.COBALT,1,1, new Item.Properties()));
    public static final RegistryObject<Item> COBALT_NAGINATA = ITEMS.register("cobalt_naginata",
            () -> new SwordItem(ModToolTiers.COBALT,1,1, new Item.Properties()));
    public static final RegistryObject<Item> COBALT_SWORD = ITEMS.register("cobalt_sword",
            () -> new SwordItem(ModToolTiers.COBALT,1,1, new Item.Properties()));
    public static final RegistryObject<Item> COBALT_REPEATER = ITEMS.register("cobalt_repeater",
            () -> new CrossbowItem(new Item.Properties()));

    public static final RegistryObject<Item> COBALT_HELMET = ITEMS.register("cobalt_helmet",
            () -> new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> COBALT_CHESTPLATE = ITEMS.register("cobalt_chestplate",
            () -> new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> COBALT_LEGGINGS = ITEMS.register("cobalt_leggings",
            () -> new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> COBALT_BOOTS = ITEMS.register("cobalt_boots",
            () -> new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Palladium
    public static final RegistryObject<Item> PALLADIUM_INGOT = ITEMS.register("palladium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PALLADIUM = ITEMS.register("raw_palladium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PALLADIUM_PICKAXE = ITEMS.register("palladium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PALLADIUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> PALLADIUM_SHOVEL = ITEMS.register("palladium_shovel",
            () -> new ShovelItem(ModToolTiers.PALLADIUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> PALLADIUM_WARAXE = ITEMS.register("palladium_waraxe",
            () -> new AxeItem(ModToolTiers.PALLADIUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> PALLADIUM_SICKLE = ITEMS.register("palladium_sickle",
            () -> new HoeItem(ModToolTiers.PALLADIUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> PALLADIUM_PIKE = ITEMS.register("palladium_pike",
            () -> new SwordItem(ModToolTiers.PALLADIUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> PALLADIUM_SWORD = ITEMS.register("palladium_sword",
            () -> new SwordItem(ModToolTiers.PALLADIUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> PALLADIUM_REPEATER = ITEMS.register("palladium_repeater",
            () -> new CrossbowItem(new Item.Properties()));

    public static final RegistryObject<Item> PALLADIUM_HELMET = ITEMS.register("palladium_helmet",
            () -> new ArmorItem(ModArmorMaterials.PALLADIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> PALLADIUM_CHESTPLATE = ITEMS.register("palladium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PALLADIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> PALLADIUM_LEGGINGS = ITEMS.register("palladium_leggings",
            () -> new ArmorItem(ModArmorMaterials.PALLADIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> PALLADIUM_BOOTS = ITEMS.register("palladium_boots",
            () -> new ArmorItem(ModArmorMaterials.PALLADIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Mythril
    public static final RegistryObject<Item> MYTHRIL_INGOT = ITEMS.register("mythril_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_MYTHRIL = ITEMS.register("raw_mythril",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MYTHRIL_PICKAXE = ITEMS.register("mythril_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MYTHRIL,1,1, new Item.Properties()));
    public static final RegistryObject<Item> MYTHRIL_SHOVEL = ITEMS.register("mythril_shovel",
            () -> new ShovelItem(ModToolTiers.MYTHRIL,1,1, new Item.Properties()));
    public static final RegistryObject<Item> MYTHRIL_WARAXE = ITEMS.register("mythril_waraxe",
            () -> new AxeItem(ModToolTiers.MYTHRIL,1,1, new Item.Properties()));
    public static final RegistryObject<Item> MYTHRIL_SICKLE = ITEMS.register("mythril_sickle",
            () -> new HoeItem(ModToolTiers.MYTHRIL,1,1, new Item.Properties()));
    public static final RegistryObject<Item> MYTHRIL_HALBERD = ITEMS.register("mythril_halberd",
            () -> new SwordItem(ModToolTiers.MYTHRIL,1,1, new Item.Properties()));
    public static final RegistryObject<Item> MYTHRIL_SWORD = ITEMS.register("mythril_sword",
            () -> new SwordItem(ModToolTiers.MYTHRIL,1,1, new Item.Properties()));
    public static final RegistryObject<Item> MYTHRIL_REPEATER = ITEMS.register("mythril_repeater",
            () -> new CrossbowItem(new Item.Properties()));

    public static final RegistryObject<Item> MYTHRIL_HELMET = ITEMS.register("mythril_helmet",
            () -> new ArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MYTHRIL_CHESTPLATE = ITEMS.register("mythril_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> MYTHRIL_LEGGINGS = ITEMS.register("mythril_leggings",
            () -> new ArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> MYTHRIL_BOOTS = ITEMS.register("mythril_boots",
            () -> new ArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Orichalcum
    public static final RegistryObject<Item> ORICHALCUM_INGOT = ITEMS.register("orichalcum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ORICHALCUM = ITEMS.register("raw_orichalcum",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ORICHALCUM_PICKAXE = ITEMS.register("orichalcum_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ORICHALCUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> ORICHALCUM_SHOVEL = ITEMS.register("orichalcum_shovel",
            () -> new ShovelItem(ModToolTiers.ORICHALCUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> ORICHALCUM_WARAXE = ITEMS.register("orichalcum_waraxe",
            () -> new AxeItem(ModToolTiers.ORICHALCUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> ORICHALCUM_SICKLE = ITEMS.register("orichalcum_sickle",
            () -> new HoeItem(ModToolTiers.ORICHALCUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> ORICHALCUM_HALBERD = ITEMS.register("orichalcum_halberd",
            () -> new SwordItem(ModToolTiers.ORICHALCUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> ORICHALCUM_SWORD = ITEMS.register("orichalcum_sword",
            () -> new SwordItem(ModToolTiers.ORICHALCUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> ORICHALCUM_REPEATER = ITEMS.register("orichalcum_repeater",
            () -> new CrossbowItem(new Item.Properties()));

    public static final RegistryObject<Item> ORICHALCUM_HELMET = ITEMS.register("orichalcum_helmet",
            () -> new ArmorItem(ModArmorMaterials.ORICHALCUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ORICHALCUM_CHESTPLATE = ITEMS.register("orichalcum_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ORICHALCUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ORICHALCUM_LEGGINGS = ITEMS.register("orichalcum_leggings",
            () -> new ArmorItem(ModArmorMaterials.ORICHALCUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ORICHALCUM_BOOTS = ITEMS.register("orichalcum_boots",
            () -> new ArmorItem(ModArmorMaterials.ORICHALCUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Adamantite
    public static final RegistryObject<Item> ADAMANTITE_INGOT = ITEMS.register("adamantite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ADAMANTITE = ITEMS.register("raw_adamantite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ADAMANTITE_PICKAXE = ITEMS.register("adamantite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ADAMANTITE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTITE_SHOVEL = ITEMS.register("adamantite_shovel",
            () -> new ShovelItem(ModToolTiers.ADAMANTITE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTITE_WARAXE = ITEMS.register("adamantite_waraxe",
            () -> new AxeItem(ModToolTiers.ADAMANTITE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTITE_SICKLE = ITEMS.register("adamantite_sickle",
            () -> new HoeItem(ModToolTiers.ADAMANTITE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTITE_GLAIVE = ITEMS.register("adamantite_glaive",
            () -> new SwordItem(ModToolTiers.ADAMANTITE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTITE_SWORD = ITEMS.register("adamantite_sword",
            () -> new SwordItem(ModToolTiers.ADAMANTITE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTITE_REPEATER = ITEMS.register("adamantite_repeater",
            () -> new CrossbowItem(new Item.Properties()));

    public static final RegistryObject<Item> ADAMANTITE_HELMET = ITEMS.register("adamantite_helmet",
            () -> new ArmorItem(ModArmorMaterials.ADAMANTITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTITE_CHESTPLATE = ITEMS.register("adamantite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ADAMANTITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTITE_LEGGINGS = ITEMS.register("adamantite_leggings",
            () -> new ArmorItem(ModArmorMaterials.ADAMANTITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTITE_BOOTS = ITEMS.register("adamantite_boots",
            () -> new ArmorItem(ModArmorMaterials.ADAMANTITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Titanium
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TITANIUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel",
            () -> new ShovelItem(ModToolTiers.TITANIUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_WARAXE = ITEMS.register("titanium_waraxe",
            () -> new AxeItem(ModToolTiers.TITANIUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_SICKLE = ITEMS.register("titanium_sickle",
            () -> new HoeItem(ModToolTiers.TITANIUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_TRIDENT = ITEMS.register("titanium_trident",
            () -> new SwordItem(ModToolTiers.TITANIUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword",
            () -> new SwordItem(ModToolTiers.TITANIUM,1,1, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_REPEATER = ITEMS.register("titanium_repeater",
            () -> new CrossbowItem(new Item.Properties()));

    public static final RegistryObject<Item> TITANIUM_HELMET = ITEMS.register("titanium_helmet",
            () -> new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings",
            () -> new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_BOOTS = ITEMS.register("titanium_boots",
            () -> new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Chlorophyte
    public static final RegistryObject<Item> CHLOROPHYTE_INGOT = ITEMS.register("chlorophyte_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_CHLOROPHYTE = ITEMS.register("raw_chlorophyte",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHLOROPHYTE_PICKAXE = ITEMS.register("chlorophyte_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CHLOROPHYTE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> CHLOROPHYTE_SHOVEL = ITEMS.register("chlorophyte_shovel",
            () -> new ShovelItem(ModToolTiers.CHLOROPHYTE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> CHLOROPHYTE_GREATAXE = ITEMS.register("chlorophyte_greataxe",
            () -> new AxeItem(ModToolTiers.CHLOROPHYTE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> CHLOROPHYTE_SICKLE = ITEMS.register("chlorophyte_sickle",
            () -> new HoeItem(ModToolTiers.CHLOROPHYTE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> CHLOROPHYTE_PARTISAN = ITEMS.register("chlorophyte_partisan",
            () -> new SwordItem(ModToolTiers.CHLOROPHYTE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> CHLOROPHYTE_SABER = ITEMS.register("chlorophyte_saber",
            () -> new SwordItem(ModToolTiers.CHLOROPHYTE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> CHLOROPHYTE_CLAYMORE = ITEMS.register("chlorophyte_claymore",
            () -> new SwordItem(ModToolTiers.CHLOROPHYTE,1,1, new Item.Properties()));
    public static final RegistryObject<Item> CHLOROPHYTE_SHOTBOW = ITEMS.register("chlorophyte_shotbow",
            () -> new BowItem(new Item.Properties()));

    public static final RegistryObject<Item> CHLOROPHYTE_HELMET = ITEMS.register("chlorophyte_helmet",
            () -> new ArmorItem(ModArmorMaterials.CHLOROPHYTE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CHLOROPHYTE_CHESTPLATE = ITEMS.register("chlorophyte_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CHLOROPHYTE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CHLOROPHYTE_LEGGINGS = ITEMS.register("chlorophyte_leggings",
            () -> new ArmorItem(ModArmorMaterials.CHLOROPHYTE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CHLOROPHYTE_BOOTS = ITEMS.register("chlorophyte_boots",
            () -> new ArmorItem(ModArmorMaterials.CHLOROPHYTE, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Unclassified
    public static final RegistryObject<Item> BLADE_OF_GRASS = ITEMS.register("blade_of_grass",
            () -> new BladeOfGrassItem(Tiers.NETHERITE, 1,1,new Item.Properties()));
    public static final RegistryObject<Item> MURAMASA = ITEMS.register("muramasa",
            () -> new SwordItem(Tiers.NETHERITE, 1,1,new Item.Properties()));
    public static final RegistryObject<Item> NIGHTS_EDGE = ITEMS.register("nights_edge",
            () -> new SwordItem(Tiers.NETHERITE, 1,1,new Item.Properties()));

    public static final RegistryObject<Item> JUNGLE_SPORES = ITEMS.register("jungle_spores",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STINGER = ITEMS.register("stinger",
            () -> new Item(new Item.Properties()));

    //Boreal Wood
    public static final RegistryObject<Item> BOREAL_SIGN = ITEMS.register("boreal_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.BOREAL_SIGN.get(), ModBlocks.BOREAL_WALL_SIGN.get()));
    public static final RegistryObject<Item> BOREAL_HANGING_SIGN = ITEMS.register("boreal_hanging_sign",
            () -> new HangingSignItem(ModBlocks.BOREAL_HANGING_SIGN.get(), ModBlocks.BOREAL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
