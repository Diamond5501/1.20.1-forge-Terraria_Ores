package net.diamond_5501.terraria_ores.item;

import net.diamond_5501.terraria_ores.TerrariaOres;
import net.diamond_5501.terraria_ores.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TerrariaOres.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TERRARIA_TAB = CREATIVE_MODE_TABS.register("terraria_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NIGHTS_EDGE.get()))
                    .title(Component.translatable("creativetab.terraria_tab"))
                    .displayItems((itemDisplayParameters, pOutput) -> {
                        //Terraria Copper
                        pOutput.accept(ModItems.TCOPPER_INGOT.get());
                        pOutput.accept(ModItems.RAW_TCOPPER.get());
                        pOutput.accept(ModBlocks.TCOPPER_ORE.get());

                        pOutput.accept(ModItems.TCOPPER_PICKAXE.get());
                        pOutput.accept(ModItems.TCOPPER_SHOVEL.get());
                        pOutput.accept(ModItems.TCOPPER_AXE.get());
                        pOutput.accept(ModItems.TCOPPER_SICKLE.get());
                        pOutput.accept(ModItems.TCOPPER_SHORTSWORD.get());
                        pOutput.accept(ModItems.TCOPPER_BROADSWORD.get());
                        pOutput.accept(ModItems.TCOPPER_BOW.get());

                        pOutput.accept(ModItems.TCOPPER_HELMET.get());
                        pOutput.accept(ModItems.TCOPPER_CHESTPLATE.get());
                        pOutput.accept(ModItems.TCOPPER_LEGGINGS.get());
                        pOutput.accept(ModItems.TCOPPER_BOOTS.get());

                        //Tin
                        pOutput.accept(ModItems.TIN_INGOT.get());
                        pOutput.accept(ModItems.RAW_TIN.get());
                        pOutput.accept(ModBlocks.TIN_ORE.get());

                        pOutput.accept(ModItems.TIN_PICKAXE.get());
                        pOutput.accept(ModItems.TIN_SHOVEL.get());
                        pOutput.accept(ModItems.TIN_AXE.get());
                        pOutput.accept(ModItems.TIN_SICKLE.get());
                        pOutput.accept(ModItems.TIN_SHORTSWORD.get());
                        pOutput.accept(ModItems.TIN_BROADSWORD.get());
                        pOutput.accept(ModItems.TIN_BOW.get());

                        pOutput.accept(ModItems.TIN_HELMET.get());
                        pOutput.accept(ModItems.TIN_CHESTPLATE.get());
                        pOutput.accept(ModItems.TIN_LEGGINGS.get());
                        pOutput.accept(ModItems.TIN_BOOTS.get());

                        //Terraria Iron
                        pOutput.accept(ModItems.TIRON_INGOT.get());
                        pOutput.accept(ModItems.RAW_TIRON.get());
                        pOutput.accept(ModBlocks.TIRON_ORE.get());

                        pOutput.accept(ModItems.TIRON_PICKAXE.get());
                        pOutput.accept(ModItems.TIRON_SHOVEL.get());
                        pOutput.accept(ModItems.TIRON_AXE.get());
                        pOutput.accept(ModItems.TIRON_SICKLE.get());
                        pOutput.accept(ModItems.TIRON_SHORTSWORD.get());
                        pOutput.accept(ModItems.TIRON_BROADSWORD.get());
                        pOutput.accept(ModItems.TIRON_BOW.get());

                        pOutput.accept(ModItems.TIRON_HELMET.get());
                        pOutput.accept(ModItems.TIRON_CHESTPLATE.get());
                        pOutput.accept(ModItems.TIRON_LEGGINGS.get());
                        pOutput.accept(ModItems.TIRON_BOOTS.get());

                        //Lead
                        pOutput.accept(ModItems.LEAD_INGOT.get());
                        pOutput.accept(ModItems.RAW_LEAD.get());
                        pOutput.accept(ModBlocks.LEAD_ORE.get());

                        pOutput.accept(ModItems.LEAD_PICKAXE.get());
                        pOutput.accept(ModItems.LEAD_SHOVEL.get());
                        pOutput.accept(ModItems.LEAD_AXE.get());
                        pOutput.accept(ModItems.LEAD_SICKLE.get());
                        pOutput.accept(ModItems.LEAD_SHORTSWORD.get());
                        pOutput.accept(ModItems.LEAD_BROADSWORD.get());
                        pOutput.accept(ModItems.LEAD_BOW.get());

                        pOutput.accept(ModItems.LEAD_HELMET.get());
                        pOutput.accept(ModItems.LEAD_CHESTPLATE.get());
                        pOutput.accept(ModItems.LEAD_LEGGINGS.get());
                        pOutput.accept(ModItems.LEAD_BOOTS.get());

                        //Silver
                        pOutput.accept(ModItems.SILVER_INGOT.get());
                        pOutput.accept(ModItems.RAW_SILVER.get());
                        pOutput.accept(ModBlocks.SILVER_ORE.get());

                        pOutput.accept(ModItems.SILVER_PICKAXE.get());
                        pOutput.accept(ModItems.SILVER_SHOVEL.get());
                        pOutput.accept(ModItems.SILVER_AXE.get());
                        pOutput.accept(ModItems.SILVER_SICKLE.get());
                        pOutput.accept(ModItems.SILVER_SHORTSWORD.get());
                        pOutput.accept(ModItems.SILVER_BROADSWORD.get());
                        pOutput.accept(ModItems.SILVER_BOW.get());

                        pOutput.accept(ModItems.SILVER_HELMET.get());
                        pOutput.accept(ModItems.SILVER_CHESTPLATE.get());
                        pOutput.accept(ModItems.SILVER_LEGGINGS.get());
                        pOutput.accept(ModItems.SILVER_BOOTS.get());

                        //Tungsten
                        pOutput.accept(ModItems.TUNGSTEN_INGOT.get());
                        pOutput.accept(ModItems.RAW_TUNGSTEN.get());
                        pOutput.accept(ModBlocks.TUNGSTEN_ORE.get());

                        pOutput.accept(ModItems.TUNGSTEN_PICKAXE.get());
                        pOutput.accept(ModItems.TUNGSTEN_SHOVEL.get());
                        pOutput.accept(ModItems.TUNGSTEN_AXE.get());
                        pOutput.accept(ModItems.TUNGSTEN_SICKLE.get());
                        pOutput.accept(ModItems.TUNGSTEN_SHORTSWORD.get());
                        pOutput.accept(ModItems.TUNGSTEN_BROADSWORD.get());
                        pOutput.accept(ModItems.TUNGSTEN_BOW.get());

                        pOutput.accept(ModItems.TUNGSTEN_HELMET.get());
                        pOutput.accept(ModItems.TUNGSTEN_CHESTPLATE.get());
                        pOutput.accept(ModItems.TUNGSTEN_LEGGINGS.get());
                        pOutput.accept(ModItems.TUNGSTEN_BOOTS.get());

                        //Terraria Gold
                        pOutput.accept(ModItems.TGOLD_INGOT.get());
                        pOutput.accept(ModItems.RAW_TGOLD.get());
                        pOutput.accept(ModBlocks.TGOLD_ORE.get());

                        pOutput.accept(ModItems.TGOLD_PICKAXE.get());
                        pOutput.accept(ModItems.TGOLD_SHOVEL.get());
                        pOutput.accept(ModItems.TGOLD_AXE.get());
                        pOutput.accept(ModItems.TGOLD_SICKLE.get());
                        pOutput.accept(ModItems.TGOLD_SHORTSWORD.get());
                        pOutput.accept(ModItems.TGOLD_BROADSWORD.get());
                        pOutput.accept(ModItems.TGOLD_BOW.get());

                        pOutput.accept(ModItems.TGOLD_HELMET.get());
                        pOutput.accept(ModItems.TGOLD_CHESTPLATE.get());
                        pOutput.accept(ModItems.TGOLD_LEGGINGS.get());
                        pOutput.accept(ModItems.TGOLD_BOOTS.get());

                        //Platinum
                        pOutput.accept(ModItems.PLATINUM_INGOT.get());
                        pOutput.accept(ModItems.RAW_PLATINUM.get());
                        pOutput.accept(ModBlocks.PLATINUM_ORE.get());

                        pOutput.accept(ModItems.PLATINUM_PICKAXE.get());
                        pOutput.accept(ModItems.PLATINUM_SHOVEL.get());
                        pOutput.accept(ModItems.PLATINUM_AXE.get());
                        pOutput.accept(ModItems.PLATINUM_SICKLE.get());
                        pOutput.accept(ModItems.PLATINUM_SHORTSWORD.get());
                        pOutput.accept(ModItems.PLATINUM_BROADSWORD.get());
                        pOutput.accept(ModItems.PLATINUM_BOW.get());

                        pOutput.accept(ModItems.PLATINUM_HELMET.get());
                        pOutput.accept(ModItems.PLATINUM_CHESTPLATE.get());
                        pOutput.accept(ModItems.PLATINUM_LEGGINGS.get());
                        pOutput.accept(ModItems.PLATINUM_BOOTS.get());

                        //Meteorite
                        pOutput.accept(ModItems.METEORITE_INGOT.get());
                        pOutput.accept(ModItems.RAW_METEORITE.get());
                        pOutput.accept(ModBlocks.METEORITE.get());
                        pOutput.accept(ModItems.PHASEBLADE_BLANK.get());
                        pOutput.accept(ModItems.RED_PHASEBLADE.get());
                        pOutput.accept(ModItems.ORANGE_PHASEBLADE.get());
                        pOutput.accept(ModItems.YELLOW_PHASEBLADE.get());
                        pOutput.accept(ModItems.GREEN_PHASEBLADE.get());
                        pOutput.accept(ModItems.BLUE_PHASEBLADE.get());
                        pOutput.accept(ModItems.PURPLE_PHASEBLADE.get());
                        pOutput.accept(ModItems.WHITE_PHASEBLADE.get());

                        pOutput.accept(ModItems.METEORITE_HELMET.get());
                        pOutput.accept(ModItems.METEORITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.METEORITE_LEGGINGS.get());
                        pOutput.accept(ModItems.METEORITE_BOOTS.get());

                        //Demonite
                        pOutput.accept(ModItems.DEMONITE_INGOT.get());
                        pOutput.accept(ModItems.RAW_DEMONITE.get());
                        pOutput.accept(ModBlocks.DEMONITE_ORE.get());

                        pOutput.accept(ModItems.NIGHTMARE_PICKAXE.get());
                        pOutput.accept(ModItems.DEMON_SHOVEL.get());
                        pOutput.accept(ModItems.WAR_AXE_OF_THE_NIGHT.get());
                        pOutput.accept(ModItems.DEMON_SICKLE.get());
                        pOutput.accept(ModItems.LIGHTS_BANE.get());
                        pOutput.accept(ModItems.DEMON_BOW.get());

                        pOutput.accept(ModItems.SHADOW_HELMET.get());
                        pOutput.accept(ModItems.SHADOW_CHESTPLATE.get());
                        pOutput.accept(ModItems.SHADOW_LEGGINGS.get());
                        pOutput.accept(ModItems.SHADOW_BOOTS.get());

                        //Crimtane
                        pOutput.accept(ModItems.CRIMTANE_INGOT.get());
                        pOutput.accept(ModItems.RAW_CRIMTANE.get());
                        pOutput.accept(ModBlocks.CRIMTANE_ORE.get());

                        pOutput.accept(ModItems.DEATHBRINGER_PICKAXE.get());
                        pOutput.accept(ModItems.BLOOD_SHOVEL.get());
                        pOutput.accept(ModItems.BLOOD_LUST_CLUSTER.get());
                        pOutput.accept(ModItems.BLOODY_SICKLE.get());
                        pOutput.accept(ModItems.BLOOD_BUTCHERER.get());
                        pOutput.accept(ModItems.TENDON_BOW.get());

                        pOutput.accept(ModItems.CRIMSON_HELMET.get());
                        pOutput.accept(ModItems.CRIMSON_CHESTPLATE.get());
                        pOutput.accept(ModItems.CRIMSON_LEGGINGS.get());
                        pOutput.accept(ModItems.CRIMSON_BOOTS.get());

                        //Hellstone
                        pOutput.accept(ModItems.HELLSTONE_INGOT.get());
                        pOutput.accept(ModItems.RAW_HELLSTONE.get());
                        pOutput.accept(ModBlocks.HELLSTONE_ORE.get());

                        pOutput.accept(ModItems.MOLTEN_PICKAXE.get());
                        pOutput.accept(ModItems.MOLTEN_SHOVEL.get());
                        pOutput.accept(ModItems.MOLTEN_AXE.get());
                        pOutput.accept(ModItems.MOLTEN_SICKLE.get());
                        pOutput.accept(ModItems.VOLCANO.get());
                        pOutput.accept(ModItems.MOLTEN_FURY.get());

                        pOutput.accept(ModItems.MOLTEN_HELMET.get());
                        pOutput.accept(ModItems.MOLTEN_CHESTPLATE.get());
                        pOutput.accept(ModItems.MOLTEN_LEGGINGS.get());
                        pOutput.accept(ModItems.MOLTEN_BOOTS.get());

                        //Cobalt
                        pOutput.accept(ModItems.COBALT_INGOT.get());
                        pOutput.accept(ModItems.RAW_COBALT.get());
                        pOutput.accept(ModBlocks.COBALT_ORE.get());

                        pOutput.accept(ModItems.COBALT_PICKAXE.get());
                        pOutput.accept(ModItems.COBALT_SHOVEL.get());
                        pOutput.accept(ModItems.COBALT_WARAXE.get());
                        pOutput.accept(ModItems.COBALT_SICKLE.get());
                        pOutput.accept(ModItems.COBALT_NAGINATA.get());
                        pOutput.accept(ModItems.COBALT_SWORD.get());
                        pOutput.accept(ModItems.COBALT_REPEATER.get());

                        pOutput.accept(ModItems.COBALT_HELMET.get());
                        pOutput.accept(ModItems.COBALT_CHESTPLATE.get());
                        pOutput.accept(ModItems.COBALT_LEGGINGS.get());
                        pOutput.accept(ModItems.COBALT_BOOTS.get());

                        //Palladium
                        pOutput.accept(ModItems.PALLADIUM_INGOT.get());
                        pOutput.accept(ModItems.RAW_PALLADIUM.get());
                        pOutput.accept(ModBlocks.PALLADIUM_ORE.get());

                        pOutput.accept(ModItems.PALLADIUM_PICKAXE.get());
                        pOutput.accept(ModItems.PALLADIUM_SHOVEL.get());
                        pOutput.accept(ModItems.PALLADIUM_WARAXE.get());
                        pOutput.accept(ModItems.PALLADIUM_SICKLE.get());
                        pOutput.accept(ModItems.PALLADIUM_PIKE.get());
                        pOutput.accept(ModItems.PALLADIUM_SWORD.get());
                        pOutput.accept(ModItems.PALLADIUM_REPEATER.get());

                        pOutput.accept(ModItems.PALLADIUM_HELMET.get());
                        pOutput.accept(ModItems.PALLADIUM_CHESTPLATE.get());
                        pOutput.accept(ModItems.PALLADIUM_LEGGINGS.get());
                        pOutput.accept(ModItems.PALLADIUM_BOOTS.get());

                        //Mythril
                        pOutput.accept(ModItems.MYTHRIL_INGOT.get());
                        pOutput.accept(ModItems.RAW_MYTHRIL.get());
                        pOutput.accept(ModBlocks.MYTHRIL_ORE.get());

                        pOutput.accept(ModItems.MYTHRIL_PICKAXE.get());
                        pOutput.accept(ModItems.MYTHRIL_SHOVEL.get());
                        pOutput.accept(ModItems.MYTHRIL_WARAXE.get());
                        pOutput.accept(ModItems.MYTHRIL_SICKLE.get());
                        pOutput.accept(ModItems.MYTHRIL_HALBERD.get());
                        pOutput.accept(ModItems.MYTHRIL_SWORD.get());
                        pOutput.accept(ModItems.MYTHRIL_REPEATER.get());

                        pOutput.accept(ModItems.MYTHRIL_HELMET.get());
                        pOutput.accept(ModItems.MYTHRIL_CHESTPLATE.get());
                        pOutput.accept(ModItems.MYTHRIL_LEGGINGS.get());
                        pOutput.accept(ModItems.MYTHRIL_BOOTS.get());

                        //Orichalcum
                        pOutput.accept(ModItems.ORICHALCUM_INGOT.get());
                        pOutput.accept(ModItems.RAW_ORICHALCUM.get());
                        pOutput.accept(ModBlocks.ORICHALCUM_ORE.get());

                        pOutput.accept(ModItems.ORICHALCUM_PICKAXE.get());
                        pOutput.accept(ModItems.ORICHALCUM_SHOVEL.get());
                        pOutput.accept(ModItems.ORICHALCUM_WARAXE.get());
                        pOutput.accept(ModItems.ORICHALCUM_SICKLE.get());
                        pOutput.accept(ModItems.ORICHALCUM_HALBERD.get());
                        pOutput.accept(ModItems.ORICHALCUM_SWORD.get());
                        pOutput.accept(ModItems.ORICHALCUM_REPEATER.get());

                        pOutput.accept(ModItems.ORICHALCUM_HELMET.get());
                        pOutput.accept(ModItems.ORICHALCUM_CHESTPLATE.get());
                        pOutput.accept(ModItems.ORICHALCUM_LEGGINGS.get());
                        pOutput.accept(ModItems.ORICHALCUM_BOOTS.get());

                        //Adamantite
                        pOutput.accept(ModItems.ADAMANTITE_INGOT.get());
                        pOutput.accept(ModItems.RAW_ADAMANTITE.get());
                        pOutput.accept(ModBlocks.ADAMANTITE_ORE.get());

                        pOutput.accept(ModItems.ADAMANTITE_PICKAXE.get());
                        pOutput.accept(ModItems.ADAMANTITE_SHOVEL.get());
                        pOutput.accept(ModItems.ADAMANTITE_WARAXE.get());
                        pOutput.accept(ModItems.ADAMANTITE_SICKLE.get());
                        pOutput.accept(ModItems.ADAMANTITE_GLAIVE.get());
                        pOutput.accept(ModItems.ADAMANTITE_SWORD.get());
                        pOutput.accept(ModItems.ADAMANTITE_REPEATER.get());

                        pOutput.accept(ModItems.ADAMANTITE_HELMET.get());
                        pOutput.accept(ModItems.ADAMANTITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.ADAMANTITE_LEGGINGS.get());
                        pOutput.accept(ModItems.ADAMANTITE_BOOTS.get());

                        //Titanium
                        pOutput.accept(ModItems.TITANIUM_INGOT.get());
                        pOutput.accept(ModItems.RAW_TITANIUM.get());
                        pOutput.accept(ModBlocks.TITANIUM_ORE.get());

                        pOutput.accept(ModItems.TITANIUM_PICKAXE.get());
                        pOutput.accept(ModItems.TITANIUM_SHOVEL.get());
                        pOutput.accept(ModItems.TITANIUM_WARAXE.get());
                        pOutput.accept(ModItems.TITANIUM_SICKLE.get());
                        pOutput.accept(ModItems.TITANIUM_TRIDENT.get());
                        pOutput.accept(ModItems.TITANIUM_SWORD.get());
                        pOutput.accept(ModItems.TITANIUM_REPEATER.get());

                        pOutput.accept(ModItems.TITANIUM_HELMET.get());
                        pOutput.accept(ModItems.TITANIUM_CHESTPLATE.get());
                        pOutput.accept(ModItems.TITANIUM_LEGGINGS.get());
                        pOutput.accept(ModItems.TITANIUM_BOOTS.get());

                        //Chlorophyte
                        pOutput.accept(ModItems.CHLOROPHYTE_INGOT.get());
                        pOutput.accept(ModItems.RAW_CHLOROPHYTE.get());
                        pOutput.accept(ModBlocks.CHLOROPHYTE_ORE.get());

                        pOutput.accept(ModItems.CHLOROPHYTE_PICKAXE.get());
                        pOutput.accept(ModItems.CHLOROPHYTE_SHOVEL.get());
                        pOutput.accept(ModItems.CHLOROPHYTE_GREATAXE.get());
                        pOutput.accept(ModItems.CHLOROPHYTE_SICKLE.get());
                        pOutput.accept(ModItems.CHLOROPHYTE_PARTISAN.get());
                        pOutput.accept(ModItems.CHLOROPHYTE_SABER.get());
                        pOutput.accept(ModItems.CHLOROPHYTE_CLAYMORE.get());
                        pOutput.accept(ModItems.CHLOROPHYTE_SHOTBOW.get());

                        pOutput.accept(ModItems.CHLOROPHYTE_HELMET.get());
                        pOutput.accept(ModItems.CHLOROPHYTE_CHESTPLATE.get());
                        pOutput.accept(ModItems.CHLOROPHYTE_LEGGINGS.get());
                        pOutput.accept(ModItems.CHLOROPHYTE_BOOTS.get());

                        //Unclassified
                        pOutput.accept(ModItems.BLADE_OF_GRASS.get());
                        pOutput.accept(ModItems.MURAMASA.get());
                        pOutput.accept(ModItems.NIGHTS_EDGE.get());

                        pOutput.accept(ModItems.JUNGLE_SPORES.get());
                        pOutput.accept(ModItems.STINGER.get());

                        //Boreal Wood
                        pOutput.accept(ModBlocks.BOREAL_LOG.get());
                        pOutput.accept(ModBlocks.BOREAL_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_BOREAL_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_BOREAL_WOOD.get());

                        pOutput.accept(ModBlocks.BOREAL_PLANKS.get());
                        pOutput.accept(ModBlocks.BOREAL_LEAVES.get());

                        pOutput.accept(ModBlocks.BOREAL_SIGN.get());
                        pOutput.accept(ModBlocks.BOREAL_HANGING_SIGN.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
