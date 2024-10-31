package net.xlmods.item.custom;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.xlmods.XLmods;
import net.xlmods.screen.custom.TBook.CustomScreen;

import java.util.List;

public class TutorBook extends Item {
    public TutorBook(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.xlmods.tutor_book.shift_down"));
        } else {
            tooltip.add(Text.translatable("tooltip.xlmods.tutor_book"));
        }

        super.appendTooltip(stack, context, tooltip, type);
    }
}
