package net.xlmods.screen.custom;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import net.xlmods.item.custom.widgets.CustomWidget;

public class TBook {
    public static class CustomScreen extends Screen {
        public CustomScreen(Text title) {
            super(title);
        }

        @Override
        protected void init() {
            CustomWidget customWidget = new CustomWidget(70, 0, 5, 300);
            this.addDrawableChild(customWidget);

            super.init();
        }

        @Override
        public void render(DrawContext context, int mouseX, int mouseY, float delta) {
            super.render(context, mouseX, mouseY, delta);

            // Minecraft doesn't have a "label" widget, so we'll have to draw our own text.
            // We'll subtract the font height from the Y position to make the text appear above the button.
            // Subtracting an extra 10 pixels will give the text some padding.
            // textRenderer, text, x, y, color, hasShadow
            context.drawText(this.textRenderer, "bla-bla", 150, 120 - this.textRenderer.fontHeight - 10, 0xFFFFFFFF, true);
        }
    }
}