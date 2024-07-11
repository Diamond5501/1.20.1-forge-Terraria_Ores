package net.diamond_5501.terraria_ores.datagen;

import net.diamond_5501.terraria_ores.TerrariaOres;
import net.diamond_5501.terraria_ores.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TerrariaOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Terraria Copper
        simpleItem(ModItems.TCOPPER_INGOT);
        simpleItem(ModItems.RAW_TCOPPER);

        handheldItem(ModItems.TCOPPER_PICKAXE);
        handheldItem(ModItems.TCOPPER_SHOVEL);
        handheldItem(ModItems.TCOPPER_AXE);
        handheldItem(ModItems.TCOPPER_SICKLE);
        handheldItem(ModItems.TCOPPER_SHORTSWORD);
        handheldItem(ModItems.TCOPPER_BROADSWORD);
        handheldItem(ModItems.TCOPPER_BOW);

        trimmedArmorItem(ModItems.TCOPPER_HELMET);
        trimmedArmorItem(ModItems.TCOPPER_CHESTPLATE);
        trimmedArmorItem(ModItems.TCOPPER_LEGGINGS);
        trimmedArmorItem(ModItems.TCOPPER_BOOTS);

        //Tin
        simpleItem(ModItems.TIN_INGOT);
        simpleItem(ModItems.RAW_TIN);

        handheldItem(ModItems.TIN_PICKAXE);
        handheldItem(ModItems.TIN_SHOVEL);
        handheldItem(ModItems.TIN_AXE);
        handheldItem(ModItems.TIN_SICKLE);
        handheldItem(ModItems.TIN_SHORTSWORD);
        handheldItem(ModItems.TIN_BROADSWORD);
        handheldItem(ModItems.TIN_BOW);

        trimmedArmorItem(ModItems.TIN_HELMET);
        trimmedArmorItem(ModItems.TIN_CHESTPLATE);
        trimmedArmorItem(ModItems.TIN_LEGGINGS);
        trimmedArmorItem(ModItems.TIN_BOOTS);

        //Terraria Iron
        simpleItem(ModItems.TIRON_INGOT);
        simpleItem(ModItems.RAW_TIRON);

        handheldItem(ModItems.TIRON_PICKAXE);
        handheldItem(ModItems.TIRON_SHOVEL);
        handheldItem(ModItems.TIRON_AXE);
        handheldItem(ModItems.TIRON_SICKLE);
        handheldItem(ModItems.TIRON_SHORTSWORD);
        handheldItem(ModItems.TIRON_BROADSWORD);
        handheldItem(ModItems.TIRON_BOW);

        trimmedArmorItem(ModItems.TIRON_HELMET);
        trimmedArmorItem(ModItems.TIRON_CHESTPLATE);
        trimmedArmorItem(ModItems.TIRON_LEGGINGS);
        trimmedArmorItem(ModItems.TIRON_BOOTS);

        //Lead
        simpleItem(ModItems.LEAD_INGOT);
        simpleItem(ModItems.RAW_LEAD);

        handheldItem(ModItems.LEAD_PICKAXE);
        handheldItem(ModItems.LEAD_SHOVEL);
        handheldItem(ModItems.LEAD_AXE);
        handheldItem(ModItems.LEAD_SICKLE);
        handheldItem(ModItems.LEAD_SHORTSWORD);
        handheldItem(ModItems.LEAD_BROADSWORD);
        handheldItem(ModItems.LEAD_BOW);

        trimmedArmorItem(ModItems.LEAD_HELMET);
        trimmedArmorItem(ModItems.LEAD_CHESTPLATE);
        trimmedArmorItem(ModItems.LEAD_LEGGINGS);
        trimmedArmorItem(ModItems.LEAD_BOOTS);

        //Silver
        simpleItem(ModItems.SILVER_INGOT);
        simpleItem(ModItems.RAW_SILVER);

        handheldItem(ModItems.SILVER_PICKAXE);
        handheldItem(ModItems.SILVER_SHOVEL);
        handheldItem(ModItems.SILVER_AXE);
        handheldItem(ModItems.SILVER_SICKLE);
        handheldItem(ModItems.SILVER_SHORTSWORD);
        handheldItem(ModItems.SILVER_BROADSWORD);
        handheldItem(ModItems.SILVER_BOW);

        trimmedArmorItem(ModItems.SILVER_HELMET);
        trimmedArmorItem(ModItems.SILVER_CHESTPLATE);
        trimmedArmorItem(ModItems.SILVER_LEGGINGS);
        trimmedArmorItem(ModItems.SILVER_BOOTS);

        //Tungsten
        simpleItem(ModItems.TUNGSTEN_INGOT);
        simpleItem(ModItems.RAW_TUNGSTEN);

        handheldItem(ModItems.TUNGSTEN_PICKAXE);
        handheldItem(ModItems.TUNGSTEN_SHOVEL);
        handheldItem(ModItems.TUNGSTEN_AXE);
        handheldItem(ModItems.TUNGSTEN_SICKLE);
        handheldItem(ModItems.TUNGSTEN_SHORTSWORD);
        handheldItem(ModItems.TUNGSTEN_BROADSWORD);
        handheldItem(ModItems.TUNGSTEN_BOW);

        trimmedArmorItem(ModItems.TUNGSTEN_HELMET);
        trimmedArmorItem(ModItems.TUNGSTEN_CHESTPLATE);
        trimmedArmorItem(ModItems.TUNGSTEN_LEGGINGS);
        trimmedArmorItem(ModItems.TUNGSTEN_BOOTS);

        //Terraria Gold
        simpleItem(ModItems.TGOLD_INGOT);
        simpleItem(ModItems.RAW_TGOLD);

        handheldItem(ModItems.TGOLD_PICKAXE);
        handheldItem(ModItems.TGOLD_SHOVEL);
        handheldItem(ModItems.TGOLD_AXE);
        handheldItem(ModItems.TGOLD_SICKLE);
        handheldItem(ModItems.TGOLD_SHORTSWORD);
        handheldItem(ModItems.TGOLD_BROADSWORD);
        handheldItem(ModItems.TGOLD_BOW);

        trimmedArmorItem(ModItems.TGOLD_HELMET);
        trimmedArmorItem(ModItems.TGOLD_CHESTPLATE);
        trimmedArmorItem(ModItems.TGOLD_LEGGINGS);
        trimmedArmorItem(ModItems.TGOLD_BOOTS);

        //Platinum
        simpleItem(ModItems.PLATINUM_INGOT);
        simpleItem(ModItems.RAW_PLATINUM);

        handheldItem(ModItems.PLATINUM_PICKAXE);
        handheldItem(ModItems.PLATINUM_SHOVEL);
        handheldItem(ModItems.PLATINUM_AXE);
        handheldItem(ModItems.PLATINUM_SICKLE);
        handheldItem(ModItems.PLATINUM_SHORTSWORD);
        handheldItem(ModItems.PLATINUM_BROADSWORD);
        handheldItem(ModItems.PLATINUM_BOW);

        trimmedArmorItem(ModItems.PLATINUM_HELMET);
        trimmedArmorItem(ModItems.PLATINUM_CHESTPLATE);
        trimmedArmorItem(ModItems.PLATINUM_LEGGINGS);
        trimmedArmorItem(ModItems.PLATINUM_BOOTS);

        //Meteorite
        simpleItem(ModItems.METEORITE_INGOT);
        simpleItem(ModItems.RAW_METEORITE);
        handheldItem(ModItems.PHASEBLADE_BLANK);
        handheldItem(ModItems.RED_PHASEBLADE);
        handheldItem(ModItems.ORANGE_PHASEBLADE);
        handheldItem(ModItems.YELLOW_PHASEBLADE);
        handheldItem(ModItems.GREEN_PHASEBLADE);
        handheldItem(ModItems.BLUE_PHASEBLADE);
        handheldItem(ModItems.PURPLE_PHASEBLADE);
        handheldItem(ModItems.WHITE_PHASEBLADE);

        trimmedArmorItem(ModItems.METEORITE_HELMET);
        trimmedArmorItem(ModItems.METEORITE_CHESTPLATE);
        trimmedArmorItem(ModItems.METEORITE_LEGGINGS);
        trimmedArmorItem(ModItems.METEORITE_BOOTS);

        //Demonite
        simpleItem(ModItems.DEMONITE_INGOT);
        simpleItem(ModItems.RAW_DEMONITE);

        handheldItem(ModItems.NIGHTMARE_PICKAXE);
        handheldItem(ModItems.DEMON_SHOVEL);
        handheldItem(ModItems.WAR_AXE_OF_THE_NIGHT);
        handheldItem(ModItems.DEMON_SICKLE);
        handheldItem(ModItems.LIGHTS_BANE);
        handheldItem(ModItems.DEMON_BOW);

        trimmedArmorItem(ModItems.SHADOW_HELMET);
        trimmedArmorItem(ModItems.SHADOW_CHESTPLATE);
        trimmedArmorItem(ModItems.SHADOW_LEGGINGS);
        trimmedArmorItem(ModItems.SHADOW_BOOTS);

        //Crimtane
        simpleItem(ModItems.CRIMTANE_INGOT);
        simpleItem(ModItems.RAW_CRIMTANE);

        handheldItem(ModItems.DEATHBRINGER_PICKAXE);
        handheldItem(ModItems.BLOOD_SHOVEL);
        handheldItem(ModItems.BLOOD_LUST_CLUSTER);
        handheldItem(ModItems.BLOODY_SICKLE);
        handheldItem(ModItems.TENDON_BOW);

        trimmedArmorItem(ModItems.CRIMSON_HELMET);
        trimmedArmorItem(ModItems.CRIMSON_CHESTPLATE);
        trimmedArmorItem(ModItems.CRIMSON_LEGGINGS);
        trimmedArmorItem(ModItems.CRIMSON_BOOTS);

        //Hellstone
        simpleItem(ModItems.HELLSTONE_INGOT);
        simpleItem(ModItems.RAW_HELLSTONE);

        handheldItem(ModItems.MOLTEN_PICKAXE);
        handheldItem(ModItems.MOLTEN_SHOVEL);
        handheldItem(ModItems.MOLTEN_AXE);
        handheldItem(ModItems.MOLTEN_SICKLE);
        handheldItem(ModItems.MOLTEN_FURY);

        trimmedArmorItem(ModItems.MOLTEN_HELMET);
        trimmedArmorItem(ModItems.MOLTEN_CHESTPLATE);
        trimmedArmorItem(ModItems.MOLTEN_LEGGINGS);
        trimmedArmorItem(ModItems.MOLTEN_BOOTS);

        //Cobalt
        simpleItem(ModItems.COBALT_INGOT);
        simpleItem(ModItems.RAW_COBALT);

        handheldItem(ModItems.COBALT_PICKAXE);
        handheldItem(ModItems.COBALT_SHOVEL);
        handheldItem(ModItems.COBALT_WARAXE);
        handheldItem(ModItems.COBALT_SICKLE);
        handheldItem(ModItems.COBALT_NAGINATA);
        handheldItem(ModItems.COBALT_SWORD);
        handheldItem(ModItems.COBALT_REPEATER);

        trimmedArmorItem(ModItems.COBALT_HELMET);
        trimmedArmorItem(ModItems.COBALT_CHESTPLATE);
        trimmedArmorItem(ModItems.COBALT_LEGGINGS);
        trimmedArmorItem(ModItems.COBALT_BOOTS);

        //Palladium
        simpleItem(ModItems.PALLADIUM_INGOT);
        simpleItem(ModItems.RAW_PALLADIUM);

        handheldItem(ModItems.PALLADIUM_PICKAXE);
        handheldItem(ModItems.PALLADIUM_SHOVEL);
        handheldItem(ModItems.PALLADIUM_WARAXE);
        handheldItem(ModItems.PALLADIUM_SICKLE);
        handheldItem(ModItems.PALLADIUM_PIKE);
        handheldItem(ModItems.PALLADIUM_SWORD);
        handheldItem(ModItems.PALLADIUM_REPEATER);

        trimmedArmorItem(ModItems.PALLADIUM_HELMET);
        trimmedArmorItem(ModItems.PALLADIUM_CHESTPLATE);
        trimmedArmorItem(ModItems.PALLADIUM_LEGGINGS);
        trimmedArmorItem(ModItems.PALLADIUM_BOOTS);

        //Mythril
        simpleItem(ModItems.MYTHRIL_INGOT);
        simpleItem(ModItems.RAW_MYTHRIL);

        handheldItem(ModItems.MYTHRIL_PICKAXE);
        handheldItem(ModItems.MYTHRIL_SHOVEL);
        handheldItem(ModItems.MYTHRIL_WARAXE);
        handheldItem(ModItems.MYTHRIL_SICKLE);
        handheldItem(ModItems.MYTHRIL_HALBERD);
        handheldItem(ModItems.MYTHRIL_SWORD);
        handheldItem(ModItems.MYTHRIL_REPEATER);

        trimmedArmorItem(ModItems.MYTHRIL_HELMET);
        trimmedArmorItem(ModItems.MYTHRIL_CHESTPLATE);
        trimmedArmorItem(ModItems.MYTHRIL_LEGGINGS);
        trimmedArmorItem(ModItems.MYTHRIL_BOOTS);

        //Orichalcum
        simpleItem(ModItems.ORICHALCUM_INGOT);
        simpleItem(ModItems.RAW_ORICHALCUM);

        handheldItem(ModItems.ORICHALCUM_PICKAXE);
        handheldItem(ModItems.ORICHALCUM_SHOVEL);
        handheldItem(ModItems.ORICHALCUM_WARAXE);
        handheldItem(ModItems.ORICHALCUM_SICKLE);
        handheldItem(ModItems.ORICHALCUM_HALBERD);
        handheldItem(ModItems.ORICHALCUM_SWORD);
        handheldItem(ModItems.ORICHALCUM_REPEATER);

        trimmedArmorItem(ModItems.ORICHALCUM_HELMET);
        trimmedArmorItem(ModItems.ORICHALCUM_CHESTPLATE);
        trimmedArmorItem(ModItems.ORICHALCUM_LEGGINGS);
        trimmedArmorItem(ModItems.ORICHALCUM_BOOTS);

        //Adamantite
        simpleItem(ModItems.ADAMANTITE_INGOT);
        simpleItem(ModItems.RAW_ADAMANTITE);

        handheldItem(ModItems.ADAMANTITE_PICKAXE);
        handheldItem(ModItems.ADAMANTITE_SHOVEL);
        handheldItem(ModItems.ADAMANTITE_WARAXE);
        handheldItem(ModItems.ADAMANTITE_SICKLE);
        handheldItem(ModItems.ADAMANTITE_GLAIVE);
        handheldItem(ModItems.ADAMANTITE_SWORD);
        handheldItem(ModItems.ADAMANTITE_REPEATER);

        trimmedArmorItem(ModItems.ADAMANTITE_HELMET);
        trimmedArmorItem(ModItems.ADAMANTITE_CHESTPLATE);
        trimmedArmorItem(ModItems.ADAMANTITE_LEGGINGS);
        trimmedArmorItem(ModItems.ADAMANTITE_BOOTS);

        //Titanium
        simpleItem(ModItems.TITANIUM_INGOT);
        simpleItem(ModItems.RAW_TITANIUM);

        handheldItem(ModItems.TITANIUM_PICKAXE);
        handheldItem(ModItems.TITANIUM_SHOVEL);
        handheldItem(ModItems.TITANIUM_WARAXE);
        handheldItem(ModItems.TITANIUM_SICKLE);
        handheldItem(ModItems.TITANIUM_TRIDENT);
        handheldItem(ModItems.TITANIUM_SWORD);
        handheldItem(ModItems.TITANIUM_REPEATER);

        trimmedArmorItem(ModItems.TITANIUM_HELMET);
        trimmedArmorItem(ModItems.TITANIUM_CHESTPLATE);
        trimmedArmorItem(ModItems.TITANIUM_LEGGINGS);
        trimmedArmorItem(ModItems.TITANIUM_BOOTS);

        //Chlorophyte
        simpleItem(ModItems.CHLOROPHYTE_INGOT);
        simpleItem(ModItems.RAW_CHLOROPHYTE);

        handheldItem(ModItems.CHLOROPHYTE_PICKAXE);
        handheldItem(ModItems.CHLOROPHYTE_SHOVEL);
        handheldItem(ModItems.CHLOROPHYTE_GREATAXE);
        handheldItem(ModItems.CHLOROPHYTE_SICKLE);
        handheldItem(ModItems.CHLOROPHYTE_PARTISAN);
        handheldItem(ModItems.CHLOROPHYTE_SABER);
        handheldItem(ModItems.CHLOROPHYTE_CLAYMORE);
        handheldItem(ModItems.CHLOROPHYTE_SHOTBOW);

        trimmedArmorItem(ModItems.CHLOROPHYTE_HELMET);
        trimmedArmorItem(ModItems.CHLOROPHYTE_CHESTPLATE);
        trimmedArmorItem(ModItems.CHLOROPHYTE_LEGGINGS);
        trimmedArmorItem(ModItems.CHLOROPHYTE_BOOTS);

        simpleItem(ModItems.JUNGLE_SPORES);
        simpleItem(ModItems.STINGER);

        //Boreal Wood
        simpleItem(ModItems.BOREAL_SIGN);
        simpleItem(ModItems.BOREAL_HANGING_SIGN);
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(TerrariaOres.MOD_ID,"item/" + item.getId().getPath()));
    }

    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = TerrariaOres.MOD_ID;

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TerrariaOres.MOD_ID,"item/" + item.getId().getPath()));
    }
}
