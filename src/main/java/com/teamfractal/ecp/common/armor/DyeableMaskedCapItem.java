package com.teamfractal.ecp.common.armor;


import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.extensions.IForgeItem;

import javax.annotation.Nonnull;
import java.text.MessageFormat;
import java.util.List;

public class DyeableMaskedCapItem extends ArmorItem implements DyeableLeatherItem, IForgeItem {
    public DyeableMaskedCapItem(ArmorMaterial a, EquipmentSlot s, Item.Properties p) {
        super(a, s, p);
    }

    @Override
    public boolean isEnderMask(ItemStack stack, Player player, EnderMan endermanEntity)
    {
        return true;
    }

    @Override
    public void appendHoverText(@Nonnull ItemStack itemstack, Level world, @Nonnull List<Component> list, @Nonnull TooltipFlag flag) {
        list.add(new TextComponent(MessageFormat.format
                (new TranslatableComponent("tooltip.ecp.masked_armor").getString()
                        , new TranslatableComponent("types.ecp.cap").getString())).withStyle(ChatFormatting.AQUA));
        super.appendHoverText(itemstack, world, list, flag);
    }
}
