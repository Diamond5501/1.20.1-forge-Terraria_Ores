package net.diamond_5501.terraria_ores.datagen.loot;

import net.diamond_5501.terraria_ores.block.ModBlocks;
import net.diamond_5501.terraria_ores.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        //Boreal Wood
        this.dropSelf(ModBlocks.BOREAL_LOG.get());
        this.dropSelf(ModBlocks.BOREAL_WOOD.get());
        this.dropSelf(ModBlocks.BOREAL_PLANKS.get());
        this.dropSelf(ModBlocks.STRIPPED_BOREAL_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_BOREAL_WOOD.get());

        this.add(ModBlocks.BOREAL_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.BOREAL_LOG.get(), NORMAL_LEAVES_SAPLING_CHANCES)); //TODO: change to sapling

        this.add(ModBlocks.BOREAL_SIGN.get(), block ->
                createSingleItemTable(ModItems.BOREAL_SIGN.get()));
        this.add(ModBlocks.BOREAL_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.BOREAL_SIGN.get()));
        this.add(ModBlocks.BOREAL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.BOREAL_HANGING_SIGN.get()));
        this.add(ModBlocks.BOREAL_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.BOREAL_HANGING_SIGN.get()));

        //Terraria Copper
        this.add(ModBlocks.TCOPPER_ORE.get(),
                block -> createTerrariaOreDrops(ModBlocks.TCOPPER_ORE.get(), ModItems.RAW_TCOPPER.get()));
        //Tin
        this.add(ModBlocks.TIN_ORE.get(),
                block -> createTerrariaOreDrops(ModBlocks.TIN_ORE.get(), ModItems.RAW_TIN.get()));
        //Terraria Iron
        this.add(ModBlocks.TIRON_ORE.get(),
                block -> createTerrariaOreDrops(ModBlocks.TIRON_ORE.get(), ModItems.RAW_TIRON.get()));
        //Lead
        this.add(ModBlocks.LEAD_ORE.get(),
                block -> createTerrariaOreDrops(ModBlocks.LEAD_ORE.get(), ModItems.RAW_LEAD.get()));
        //Silver
        this.add(ModBlocks.SILVER_ORE.get(),
                block -> createTerrariaOreDrops(ModBlocks.SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
        //Tungsten
        this.add(ModBlocks.TUNGSTEN_ORE.get(),
                block -> createTerrariaOreDrops(ModBlocks.TUNGSTEN_ORE.get(), ModItems.RAW_TUNGSTEN.get()));
        //Terraria Gold
        this.add(ModBlocks.TGOLD_ORE.get(),
                block -> createTerrariaOreDrops(ModBlocks.TGOLD_ORE.get(), ModItems.RAW_TGOLD.get()));
        //Platinum
        this.add(ModBlocks.PLATINUM_ORE.get(),
                block -> createTerrariaOreDrops(ModBlocks.PLATINUM_ORE.get(), ModItems.RAW_PLATINUM.get()));
        //Meteorite
        this.add(ModBlocks.METEORITE.get(),
                block -> createTerrariaOreDrops(ModBlocks.METEORITE.get(), ModItems.RAW_METEORITE.get()));
        //Demonite
        this.add(ModBlocks.DEMONITE_ORE.get(),
                block -> createTerrariaOreDrops(ModBlocks.DEMONITE_ORE.get(), ModItems.RAW_DEMONITE.get()));
        //Crimtane
        this.add(ModBlocks.CRIMTANE_ORE.get(),
                block -> createTerrariaOreDrops(ModBlocks.CRIMTANE_ORE.get(), ModItems.RAW_CRIMTANE.get()));
        //Hellstone
        this.add(ModBlocks.HELLSTONE_ORE.get(),
                block -> createTerrariaOreDrops(ModBlocks.HELLSTONE_ORE.get(), ModItems.RAW_HELLSTONE.get()));
        //Cobalt
        this.add(ModBlocks.COBALT_ORE.get(),
                block -> createTerrariaOreDrops(ModBlocks.COBALT_ORE.get(), ModItems.RAW_COBALT.get()));
        //Palladium
        this.add(ModBlocks.PALLADIUM_ORE.get(),
                block -> createTerrariaOreDrops(ModBlocks.PALLADIUM_ORE.get(), ModItems.RAW_PALLADIUM.get()));
        //Mythril
        this.add(ModBlocks.MYTHRIL_ORE.get(),
                block -> createTerrariaOreDrops(ModBlocks.MYTHRIL_ORE.get(), ModItems.RAW_MYTHRIL.get()));
        //Orichalcum
        this.add(ModBlocks.ORICHALCUM_ORE.get(),
                block -> createTerrariaOreDrops(ModBlocks.ORICHALCUM_ORE.get(), ModItems.RAW_ORICHALCUM.get()));
        //Adamantite
        this.add(ModBlocks.ADAMANTITE_ORE.get(),
                block -> createTerrariaOreDrops(ModBlocks.ADAMANTITE_ORE.get(), ModItems.RAW_ADAMANTITE.get()));
        //Titanium
        this.add(ModBlocks.TITANIUM_ORE.get(),
                block -> createTerrariaOreDrops(ModBlocks.TITANIUM_ORE.get(), ModItems.RAW_TITANIUM.get()));
        //Chlorophyte
        this.add(ModBlocks.CHLOROPHYTE_ORE.get(),
                block -> createTerrariaOreDrops(ModBlocks.CHLOROPHYTE_ORE.get(), ModItems.RAW_CHLOROPHYTE.get()));

    }

    protected LootTable.Builder createTerrariaOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                (LootPoolEntryContainer.Builder)this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
