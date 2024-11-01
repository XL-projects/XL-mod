package net.xlmods.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class Tutor_bookItem extends Item {
    public Tutor_bookItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.tutorialmod.tutor_book.shift_down"));
        } else {
            tooltip.add(Text.translatable("tooltip.tutorialmod.tutor_book"));
        }

        super.appendTooltip(stack, context, tooltip, type);
    }
}
