package committee.nova.ecp.common.util;

import committee.nova.ecp.common.EyeContactProhibited;
import committee.nova.ecp.common.armor.ECPArmorItems;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ECPRegistryHandler {
    public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, EyeContactProhibited.MODID);

    public static void register(){
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ECPArmorItems.register();

        Items.register(eventBus);
    }
}
