package net.diamond_5501.terraria_ores.item;

import com.google.common.base.Supplier;
import net.diamond_5501.terraria_ores.TerrariaOres;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModArmorMaterials implements ArmorMaterial {
    //Terraria Copper
    TCOPPER("tcopper", 26, new int[]{ 5, 7, 5, 4 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(ModItems.TCOPPER_INGOT.get())),
    //Tin
    TIN("tin", 26, new int[]{ 5, 7, 5, 4 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(ModItems.TIN_INGOT.get())),
    //Tiron
    TIRON("tiron", 26, new int[]{ 5, 7, 5, 4 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(ModItems.TIRON_INGOT.get())),
    //Lead
    LEAD("lead", 26, new int[]{ 5, 7, 5, 4 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(ModItems.LEAD_INGOT.get())),
    //Silver
    SILVER("silver", 26, new int[]{ 5, 7, 5, 4 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(ModItems.SILVER_INGOT.get())),
    //Tungsten
    TUNGSTEN("tungsten", 26, new int[]{ 5, 7, 5, 4 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(ModItems.TUNGSTEN_INGOT.get())),
    //Terraria Gold
    TGOLD("tgold", 26, new int[]{ 5, 7, 5, 4 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(ModItems.TGOLD_INGOT.get())),
    //Platinum
    PLATINUM("platinum", 26, new int[]{ 5, 7, 5, 4 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(ModItems.PLATINUM_INGOT.get())),
    //Meteorite
    METEORITE("meteorite", 26, new int[]{ 5, 7, 5, 4 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(ModItems.METEORITE_INGOT.get())),
    //Demonite
    DEMONITE("demonite", 26, new int[]{ 5, 7, 5, 4 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(ModItems.DEMONITE_INGOT.get())),
    //Crimtane
    CRIMTANE("crimtane", 26, new int[]{ 5, 7, 5, 4 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(ModItems.CRIMTANE_INGOT.get())),
    //Hellstone
    HELLSTONE("hellstone", 26, new int[]{ 5, 7, 5, 4 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(ModItems.HELLSTONE_INGOT.get())),
    //Cobalt
    COBALT("cobalt", 26, new int[]{ 5, 7, 5, 4 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(ModItems.COBALT_INGOT.get())),
    //Palladium
    PALLADIUM("palladium", 26, new int[]{ 5, 7, 5, 4 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(ModItems.PALLADIUM_INGOT.get())),
    //Mythril
    MYTHRIL("mythril", 26, new int[]{ 5, 7, 5, 4 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(ModItems.MYTHRIL_INGOT.get())),
    //Orichalcum
    ORICHALCUM("orichalcum", 26, new int[]{ 5, 7, 5, 4 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(ModItems.ORICHALCUM_INGOT.get())),
    //Adamantite
    ADAMANTITE("adamantite", 26, new int[]{ 5, 7, 5, 4 }, 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 1f, 0f, () -> Ingredient.of(ModItems.ADAMANTITE_INGOT.get())),
    //Titanium
    TITANIUM("titanium", 26, new int[]{ 5, 7, 5, 4 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(ModItems.TITANIUM_INGOT.get())),
    //Chlorophyte
    CHLOROPHYTE("chlorophyte", 26, new int[]{ 5, 7, 5, 4 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(ModItems.CHLOROPHYTE_INGOT.get()));


    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int [] BASE_DURABILITY = { 11, 16, 15, 13 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return TerrariaOres.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
