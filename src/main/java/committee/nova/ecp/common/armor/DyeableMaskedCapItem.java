package committee.nova.ecp.common.armor;


import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.extensions.IForgeItem;

import javax.annotation.Nonnull;
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
        list.add(Component.translatable("tooltip.ecp.masked_armor", Component.translatable("types.ecp.cap")).withStyle(ChatFormatting.AQUA));
        super.appendHoverText(itemstack, world, list, flag);
    }
}
