package net.diamond_5501.terraria_ores.datagen;

import net.diamond_5501.terraria_ores.TerrariaOres;
import net.diamond_5501.terraria_ores.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TerrariaOres.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //Ores
        blockWithItem(ModBlocks.TCOPPER_ORE);
        blockWithItem(ModBlocks.TIN_ORE);
        blockWithItem(ModBlocks.TIRON_ORE);
        blockWithItem(ModBlocks.LEAD_ORE);
        blockWithItem(ModBlocks.SILVER_ORE);
        blockWithItem(ModBlocks.TUNGSTEN_ORE);
        blockWithItem(ModBlocks.TGOLD_ORE);
        blockWithItem(ModBlocks.PLATINUM_ORE);
        blockWithItem(ModBlocks.METEORITE);
        blockWithItem(ModBlocks.DEMONITE_ORE);
        blockWithItem(ModBlocks.CRIMTANE_ORE);
        blockWithItem(ModBlocks.HELLSTONE_ORE);
        blockWithItem(ModBlocks.COBALT_ORE);
        blockWithItem(ModBlocks.PALLADIUM_ORE);
        blockWithItem(ModBlocks.MYTHRIL_ORE);
        blockWithItem(ModBlocks.ORICHALCUM_ORE);
        blockWithItem(ModBlocks.ADAMANTITE_ORE);
        blockWithItem(ModBlocks.TITANIUM_ORE);
        blockWithItem(ModBlocks.CHLOROPHYTE_ORE);

        //Boreal Wood
        logBlock(((RotatedPillarBlock) ModBlocks.BOREAL_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.BOREAL_WOOD.get()), blockTexture(ModBlocks.BOREAL_LOG.get()), blockTexture(ModBlocks.BOREAL_LOG.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BOREAL_LOG.get()), blockTexture(ModBlocks.STRIPPED_BOREAL_LOG.get()),
                new ResourceLocation(TerrariaOres.MOD_ID, "block/stripped_boreal_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BOREAL_WOOD.get()), blockTexture(ModBlocks.STRIPPED_BOREAL_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_BOREAL_LOG.get()));

        blockItem(ModBlocks.BOREAL_LOG);
        blockItem(ModBlocks.BOREAL_WOOD);
        blockItem(ModBlocks.STRIPPED_BOREAL_LOG);
        blockItem(ModBlocks.STRIPPED_BOREAL_WOOD);

        blockWithItem(ModBlocks.BOREAL_PLANKS);

        leavesBlock(ModBlocks.BOREAL_LEAVES);

        signBlock(((StandingSignBlock) ModBlocks.BOREAL_SIGN.get()), ((WallSignBlock) ModBlocks.BOREAL_WALL_SIGN.get()),
                blockTexture(ModBlocks.BOREAL_PLANKS.get()));

        hangingSignBlock(ModBlocks.BOREAL_HANGING_SIGN.get(), ModBlocks.BOREAL_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.BOREAL_PLANKS.get()));
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(TerrariaOres.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
