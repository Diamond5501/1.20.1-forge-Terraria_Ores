package net.diamond_5501.terraria_ores.util;

import net.diamond_5501.terraria_ores.TerrariaOres;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_TCOPPER_TOOL = tag("needs_tcopper_tool");
        public static final TagKey<Block> NEEDS_TIN_TOOL = tag("needs_tin_tool");
        public static final TagKey<Block> NEEDS_TIRON_TOOL = tag("needs_tiron_tool");
        public static final TagKey<Block> NEEDS_LEAD_TOOL = tag("needs_lead_tool");
        public static final TagKey<Block> NEEDS_SILVER_TOOL = tag("needs_silver_tool");
        public static final TagKey<Block> NEEDS_TUNGSTEN_TOOL = tag("needs_tungsten_tool");
        public static final TagKey<Block> NEEDS_TGOLD_TOOL = tag("needs_tgold_tool");
        public static final TagKey<Block> NEEDS_PLATINUM_TOOL = tag("needs_platinum_tool");
        public static final TagKey<Block> NEEDS_METEORITE_TOOL = tag("needs_meteorite_tool");
        public static final TagKey<Block> NEEDS_DEMONITE_TOOL = tag("needs_demonite_tool");
        public static final TagKey<Block> NEEDS_CRIMTANE_TOOL = tag("needs_crimtane_tool");
        public static final TagKey<Block> NEEDS_HELLSTONE_TOOL = tag("needs_hellstone_tool");
        public static final TagKey<Block> NEEDS_COBALT_TOOL = tag("needs_cobalt_tool");
        public static final TagKey<Block> NEEDS_PALLADIUM_TOOL = tag("needs_palladium_tool");
        public static final TagKey<Block> NEEDS_MYTHRIL_TOOL = tag("needs_mythril_tool");
        public static final TagKey<Block> NEEDS_ORICHALCUM_TOOL = tag("needs_orichalcum_tool");
        public static final TagKey<Block> NEEDS_ADAMANTITE_TOOL = tag("needs_adamantite_tool");
        public static final TagKey<Block> NEEDS_TITANIUM_TOOL = tag("needs_titanium_tool");
        public static final TagKey<Block> NEEDS_CHLOROPHYTE_TOOL = tag("needs_chlorophyte_tool");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(TerrariaOres.MOD_ID, name));
        }
    }

    public static class Items {



        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(TerrariaOres.MOD_ID, name));
        }
    }
}
