package net.xlmods.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xlmods.XLmods;
import net.xlmods.item.custom.Tutor_bookItem;

public class ModItems {
    public static final Item TUTOR_BOOK = registerItem("tutor_book", new Tutor_bookItem(new Item.Settings().maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(XLmods.MOD_ID, name), item);
    }

    public static void registerModItems() {
        XLmods.LOGGER.info("Registering Mod Items for " + XLmods.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TUTOR_BOOK);
        });
    }
}


