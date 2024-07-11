package net.diamond_5501.terraria_ores.datagen;

import net.diamond_5501.terraria_ores.TerrariaOres;
import net.diamond_5501.terraria_ores.block.ModBlocks;
import net.diamond_5501.terraria_ores.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, TerrariaOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)

                //Terraria Copper
                .add(ModItems.TCOPPER_HELMET.get(),
                    ModItems.TCOPPER_BOOTS.get(),
                    ModItems.TCOPPER_BOOTS.get(),
                    ModItems.TCOPPER_BOOTS.get(),
                        //Tin
                        ModItems.TIN_HELMET.get(),
                        ModItems.TIN_BOOTS.get(),
                        ModItems.TIN_BOOTS.get(),
                        ModItems.TIN_BOOTS.get(),
                        //Lead
                        ModItems.LEAD_HELMET.get(),
                        ModItems.LEAD_BOOTS.get(),
                        ModItems.LEAD_BOOTS.get(),
                        ModItems.LEAD_BOOTS.get(),
                        //Terraria Iron
                        ModItems.TIRON_HELMET.get(),
                        ModItems.TIRON_BOOTS.get(),
                        ModItems.TIRON_BOOTS.get(),
                        ModItems.TIRON_BOOTS.get(),
                        //Silver
                        ModItems.SILVER_HELMET.get(),
                        ModItems.SILVER_BOOTS.get(),
                        ModItems.SILVER_BOOTS.get(),
                        ModItems.SILVER_BOOTS.get(),
                        //Tungsten
                        ModItems.TUNGSTEN_HELMET.get(),
                        ModItems.TUNGSTEN_BOOTS.get(),
                        ModItems.TUNGSTEN_BOOTS.get(),
                        ModItems.TUNGSTEN_BOOTS.get(),
                        //Terraria Gold
                        ModItems.TGOLD_HELMET.get(),
                        ModItems.TGOLD_BOOTS.get(),
                        ModItems.TGOLD_BOOTS.get(),
                        ModItems.TGOLD_BOOTS.get(),
                        //Platinum
                        ModItems.PLATINUM_HELMET.get(),
                        ModItems.PLATINUM_BOOTS.get(),
                        ModItems.PLATINUM_BOOTS.get(),
                        ModItems.PLATINUM_BOOTS.get(),
                        //Meteorite
                        ModItems.METEORITE_HELMET.get(),
                        ModItems.METEORITE_BOOTS.get(),
                        ModItems.METEORITE_BOOTS.get(),
                        ModItems.METEORITE_BOOTS.get(),
                        //Demonite
                        ModItems.SHADOW_HELMET.get(),
                        ModItems.SHADOW_BOOTS.get(),
                        ModItems.SHADOW_BOOTS.get(),
                        ModItems.SHADOW_BOOTS.get(),
                        //Crimtane
                        ModItems.CRIMSON_HELMET.get(),
                        ModItems.CRIMSON_BOOTS.get(),
                        ModItems.CRIMSON_BOOTS.get(),
                        ModItems.CRIMSON_BOOTS.get(),
                        //Hellstone
                        ModItems.MOLTEN_HELMET.get(),
                        ModItems.MOLTEN_BOOTS.get(),
                        ModItems.MOLTEN_BOOTS.get(),
                        ModItems.MOLTEN_BOOTS.get(),
                        //Cobalt
                        ModItems.COBALT_HELMET.get(),
                        ModItems.COBALT_BOOTS.get(),
                        ModItems.COBALT_BOOTS.get(),
                        ModItems.COBALT_BOOTS.get(),
                        //Palladium
                        ModItems.PALLADIUM_HELMET.get(),
                        ModItems.PALLADIUM_BOOTS.get(),
                        ModItems.PALLADIUM_BOOTS.get(),
                        ModItems.PALLADIUM_BOOTS.get(),
                        //Mythril
                        ModItems.MYTHRIL_HELMET.get(),
                        ModItems.MYTHRIL_BOOTS.get(),
                        ModItems.MYTHRIL_BOOTS.get(),
                        ModItems.MYTHRIL_BOOTS.get(),
                        //Orichalcum
                        ModItems.ORICHALCUM_HELMET.get(),
                        ModItems.ORICHALCUM_BOOTS.get(),
                        ModItems.ORICHALCUM_BOOTS.get(),
                        ModItems.ORICHALCUM_BOOTS.get(),
                        //Adamantite
                        ModItems.ADAMANTITE_HELMET.get(),
                        ModItems.ADAMANTITE_BOOTS.get(),
                        ModItems.ADAMANTITE_BOOTS.get(),
                        ModItems.ADAMANTITE_BOOTS.get(),
                        //Titanium
                        ModItems.TITANIUM_HELMET.get(),
                        ModItems.TITANIUM_BOOTS.get(),
                        ModItems.TITANIUM_BOOTS.get(),
                        ModItems.TITANIUM_BOOTS.get(),
                        //Chlorophyte
                        ModItems.CHLOROPHYTE_HELMET.get(),
                        ModItems.CHLOROPHYTE_BOOTS.get(),
                        ModItems.CHLOROPHYTE_BOOTS.get(),
                        ModItems.CHLOROPHYTE_BOOTS.get());



        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.BOREAL_LOG.get().asItem())
                .add(ModBlocks.BOREAL_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_BOREAL_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_BOREAL_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.BOREAL_PLANKS.get().asItem());
    }
}
