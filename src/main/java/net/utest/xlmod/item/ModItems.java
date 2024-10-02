package net.utest.xlmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.utest.xlmod.Xlmod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Xlmod.MODID);

    public static final RegistryObject<Item> TEST1 = ITEMS.register("test1",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> XL_CRISTAL = ITEMS.register("xl_cristal",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
