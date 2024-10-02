package net.utest.xlmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.utest.xlmod.Xlmod;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Xlmod.MODID);

    public static final RegistryObject<CreativeModeTab> XL_MOD_TAB = CREATIVE_MODE_TABS.register("xl_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.XL_CRISTAL.get()))
                    .title(Component.translatable("creativetab.xl_mod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.XL_CRISTAL.get());
                        output.accept(ModItems.TEST1.get());

                        output.accept(Items.REPEATING_COMMAND_BLOCK);


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
