package com.teamfractal.ecp.common.armor;

import com.teamfractal.ecp.common.util.ECPRegistryHandler;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fmllegacy.RegistryObject;

public class ECPArmorItems {

    public static RegistryObject<Item> leatherMaskedHelmet;
    public static RegistryObject<Item> chainMaskedHelmet;
    public static RegistryObject<Item> ironMaskedHelmet;
    public static RegistryObject<Item> goldMaskedHelmet;
    public static RegistryObject<Item> diamondMaskedHelmet;
    public static RegistryObject<Item> turtleMaskedHelmet;
    public static RegistryObject<Item> netheriteMaskedHelmet;

    public static void register(){
        leatherMaskedHelmet = ECPRegistryHandler.Items.register("leather_masked_helmet",
                () -> new DyeableMaskedCapItem(ECPArmorMaterials.LEATHER_MASKED, EquipmentSlot.HEAD
                        , (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
        chainMaskedHelmet = ECPRegistryHandler.Items.register("chain_masked_helmet",
                () -> new MaskedHelmetItem(ECPArmorMaterials.CHAIN_MASKED, EquipmentSlot.HEAD
                        , (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
        ironMaskedHelmet = ECPRegistryHandler.Items.register("iron_masked_helmet",
                () -> new MaskedHelmetItem(ECPArmorMaterials.IRON_MASKED, EquipmentSlot.HEAD
                        , (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
        goldMaskedHelmet = ECPRegistryHandler.Items.register("golden_masked_helmet",
                () -> new MaskedHelmetItem(ECPArmorMaterials.GOLD_MASKED, EquipmentSlot.HEAD
                        , (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)){
                    @Override
                    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer)
                    {
                        return true;
                    }
                });
        diamondMaskedHelmet = ECPRegistryHandler.Items.register("diamond_masked_helmet",
                () -> new MaskedHelmetItem(ECPArmorMaterials.DIAMOND_MASKED, EquipmentSlot.HEAD
                        , (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
        turtleMaskedHelmet = ECPRegistryHandler.Items.register("turtle_masked_helmet",
                () -> new MaskedHelmetItem(ECPArmorMaterials.TURTLE_MASKED, EquipmentSlot.HEAD
                        , (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
        netheriteMaskedHelmet = ECPRegistryHandler.Items.register("netherite_masked_helmet",
                () -> new MaskedHelmetItem(ECPArmorMaterials.NETHERITE_MASKED, EquipmentSlot.HEAD
                        , (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT).fireResistant()));
    }
}
