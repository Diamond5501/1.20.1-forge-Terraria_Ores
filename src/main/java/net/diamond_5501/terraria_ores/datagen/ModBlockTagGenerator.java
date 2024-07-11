package net.diamond_5501.terraria_ores.datagen;

import net.diamond_5501.terraria_ores.TerrariaOres;
import net.diamond_5501.terraria_ores.block.ModBlocks;
import net.diamond_5501.terraria_ores.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TerrariaOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_AXE);

        this.tag(BlockTags.MINEABLE_WITH_HOE);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.TCOPPER_ORE.get(),
                        ModBlocks.TIN_ORE.get(),
                        ModBlocks.TIRON_ORE.get(),
                        ModBlocks.LEAD_ORE.get(),
                        ModBlocks.SILVER_ORE.get(),
                        ModBlocks.TUNGSTEN_ORE.get(),
                        ModBlocks.TGOLD_ORE.get(),
                        ModBlocks.PLATINUM_ORE.get(),
                        ModBlocks.METEORITE.get(),
                        ModBlocks.DEMONITE_ORE.get(),
                        ModBlocks.CRIMTANE_ORE.get(),
                        ModBlocks.HELLSTONE_ORE.get(),
                        ModBlocks.COBALT_ORE.get(),
                        ModBlocks.PALLADIUM_ORE.get(),
                        ModBlocks.MYTHRIL_ORE.get(),
                        ModBlocks.ORICHALCUM_ORE.get(),
                        ModBlocks.ADAMANTITE_ORE.get(),
                        ModBlocks.TITANIUM_ORE.get(),
                        ModBlocks.CHLOROPHYTE_ORE.get());

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL);


        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.TCOPPER_ORE.get(),
                        ModBlocks.TIN_ORE.get(),
                        ModBlocks.TIRON_ORE.get(),
                        ModBlocks.LEAD_ORE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SILVER_ORE.get(),
                        ModBlocks.TUNGSTEN_ORE.get(),
                        ModBlocks.TGOLD_ORE.get(),
                        ModBlocks.PLATINUM_ORE.get(),
                        ModBlocks.METEORITE.get(),
                        ModBlocks.DEMONITE_ORE.get(),
                        ModBlocks.CRIMTANE_ORE.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.HELLSTONE_ORE.get(),
                        ModBlocks.COBALT_ORE.get(),
                        ModBlocks.PALLADIUM_ORE.get(),
                        ModBlocks.MYTHRIL_ORE.get(),
                        ModBlocks.ORICHALCUM_ORE.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.ADAMANTITE_ORE.get(),
                        ModBlocks.TITANIUM_ORE.get(),
                        ModBlocks.CHLOROPHYTE_ORE.get());

        this.tag(ModTags.Blocks.NEEDS_TCOPPER_TOOL);

        this.tag(ModTags.Blocks.NEEDS_TIN_TOOL);

        this.tag(ModTags.Blocks.NEEDS_TIRON_TOOL);

        this.tag(ModTags.Blocks.NEEDS_LEAD_TOOL);

        this.tag(ModTags.Blocks.NEEDS_SILVER_TOOL);

        this.tag(ModTags.Blocks.NEEDS_TUNGSTEN_TOOL);

        this.tag(ModTags.Blocks.NEEDS_TGOLD_TOOL);

        this.tag(ModTags.Blocks.NEEDS_PLATINUM_TOOL);

        this.tag(ModTags.Blocks.NEEDS_DEMONITE_TOOL);

        this.tag(ModTags.Blocks.NEEDS_CRIMTANE_TOOL);

        this.tag(ModTags.Blocks.NEEDS_HELLSTONE_TOOL);

        this.tag(ModTags.Blocks.NEEDS_COBALT_TOOL);

        this.tag(ModTags.Blocks.NEEDS_PALLADIUM_TOOL);

        this.tag(ModTags.Blocks.NEEDS_MYTHRIL_TOOL);

        this.tag(ModTags.Blocks.NEEDS_ORICHALCUM_TOOL);

        this.tag(ModTags.Blocks.NEEDS_ADAMANTITE_TOOL);

        this.tag(ModTags.Blocks.NEEDS_TITANIUM_TOOL);

        this.tag(ModTags.Blocks.NEEDS_CHLOROPHYTE_TOOL);


        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.BOREAL_LOG.get())
                .add(ModBlocks.BOREAL_WOOD.get())
                .add(ModBlocks.STRIPPED_BOREAL_LOG.get())
                .add(ModBlocks.STRIPPED_BOREAL_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.BOREAL_PLANKS.get());
    }
}
