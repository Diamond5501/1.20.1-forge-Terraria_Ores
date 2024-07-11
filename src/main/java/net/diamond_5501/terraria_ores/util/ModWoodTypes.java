package net.diamond_5501.terraria_ores.util;

import net.diamond_5501.terraria_ores.TerrariaOres;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType BOREAL = WoodType.register(new WoodType(TerrariaOres.MOD_ID + ":boreal", BlockSetType.SPRUCE));
}
