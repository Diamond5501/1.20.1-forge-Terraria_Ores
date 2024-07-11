package net.diamond_5501.terraria_ores.block;

import com.google.common.base.Supplier;
import net.diamond_5501.terraria_ores.TerrariaOres;
import net.diamond_5501.terraria_ores.block.custom.*;
import net.diamond_5501.terraria_ores.item.ModItems;
import net.diamond_5501.terraria_ores.util.ModWoodTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TerrariaOres.MOD_ID);
    //Terraria Copper
    public static final RegistryObject<Block> TCOPPER_ORE = registerBlock("tcopper_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(1,3)));
    //Tin
    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(1,3)));
    //Terraria Iron
    public static final RegistryObject<Block> TIRON_ORE = registerBlock("tiron_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(1,3)));
    //Lead
    public static final RegistryObject<Block> LEAD_ORE = registerBlock("lead_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(1,3)));
    //Silver
    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(1,3)));
    //Tungsten
    public static final RegistryObject<Block> TUNGSTEN_ORE = registerBlock("tungsten_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(1,3)));
    //Terraria Gold
    public static final RegistryObject<Block> TGOLD_ORE = registerBlock("tgold_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(1,3)));
    //Platinum
    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("platinum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(1,3)));
    //Meteorite
    public static final RegistryObject<Block> METEORITE = registerBlock("meteorite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(1,3)));
    //Demonite
    public static final RegistryObject<Block> DEMONITE_ORE = registerBlock("demonite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(1,3)));
    //Crimtane
    public static final RegistryObject<Block> CRIMTANE_ORE = registerBlock("crimtane_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(1,3)));
    //Hellstone
    public static final RegistryObject<Block> HELLSTONE_ORE = registerBlock("hellstone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3,5)));
    //Cobalt
    public static final RegistryObject<Block> COBALT_ORE = registerBlock("cobalt_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3,5)));
    //Palladium
    public static final RegistryObject<Block> PALLADIUM_ORE = registerBlock("palladium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3,5)));
    //Mythril
    public static final RegistryObject<Block> MYTHRIL_ORE = registerBlock("mythril_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3,5)));
    //Orichalcum
    public static final RegistryObject<Block> ORICHALCUM_ORE = registerBlock("orichalcum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3,5)));
    //Adamantite
    public static final RegistryObject<Block> ADAMANTITE_ORE = registerBlock("adamantite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3,5)));
    //Titanium
    public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3,5)));
    //Chlorophyte
    public static final RegistryObject<Block> CHLOROPHYTE_ORE = registerBlock("chlorophyte_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3,7)));

    //Boreal Wood
    public static final RegistryObject<Block> BOREAL_LOG = registerBlock("boreal_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).strength(3f)));
    public static final RegistryObject<Block> BOREAL_WOOD = registerBlock("boreal_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_BOREAL_LOG = registerBlock("stripped_boreal_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_BOREAL_WOOD = registerBlock("stripped_boreal_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_WOOD).strength(3f)));

    public static final RegistryObject<Block> BOREAL_SIGN = BLOCKS.register("boreal_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SIGN), ModWoodTypes.BOREAL));
    public static final RegistryObject<Block> BOREAL_WALL_SIGN = BLOCKS.register("boreal_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WALL_SIGN), ModWoodTypes.BOREAL));

    public static final RegistryObject<Block> BOREAL_HANGING_SIGN = BLOCKS.register("boreal_hanging_sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_HANGING_SIGN), ModWoodTypes.BOREAL));
    public static final RegistryObject<Block> BOREAL_WALL_HANGING_SIGN = BLOCKS.register("boreal_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WALL_HANGING_SIGN), ModWoodTypes.BOREAL));


    public static final RegistryObject<Block> BOREAL_PLANKS = registerBlock("boreal_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });
    public static final RegistryObject<Block> BOREAL_LEAVES = registerBlock("boreal_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });






    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
