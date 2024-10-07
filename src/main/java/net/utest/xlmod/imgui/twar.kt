package net.utest.xlmod.imgui

import imgui.ImGui
import com.mojang.blaze3d.systems.RenderSystem
import com.mojang.blaze3d.vertex.PoseStack
import net.minecraft.client.KeyMapping
import net.minecraft.client.gui.screens.Screen
import net.minecraft.network.chat.Component
import net.minecraftforge.client.event.RegisterKeyMappingsEvent
import net.utest.xlmod.Xlmod.MODID
import org.lwjgl.glfw.GLFW
import ru.hollowhorizon.hc.client.imgui.ImGuiHandler
import ru.hollowhorizon.hc.common.events.SubscribeEvent
import javax.swing.KeyStroke
import javax.swing.text.JTextComponent.KeyBinding
import com.mojang.blaze3d.platform.InputConstants
import net.minecraft.client.gui.GuiGraphics
import thedarkcolour.kotlinforforge.forge.MOD_BUS
import net.minecraftforge.client.event.InputEvent

class Imgui :Screen(Component.empty()) {
    override fun render(p_281549_: GuiGraphics, p_281550_: Int, p_282878_: Int, p_282465_: Float) {
        super.render(p_281549_, p_281550_, p_282878_, p_282465_)

        ImGuiHandler.drawFrame() {
            centredWindow("win1", 0) {
                // Тут содержимое окна
                button("Hi") {
                    // Тут действие при нажатии
                }
            }
        }
    }
}
object KeyBinds {
    const val KOTLOUDRON_CATEGORY = "key.categories.$MODID.keys"

    val KEYBIND_CONFIG = KeyMapping("key.$MODID.open_config", GLFW.GLFW_KEY_H, KOTLOUDRON_CATEGORY)
    val KEYBIND_THEME_SELECT = KeyMapping("key.$MODID.open_theme_select", GLFW.GLFW_KEY_RIGHT_BRACKET, KOTLOUDRON_CATEGORY)

    fun initKeys() {
        MOD_BUS.addListener { e: RegisterKeyMappingsEvent ->
            e.register(KEYBIND_CONFIG)
            e.register(KEYBIND_THEME_SELECT)
        }
    }

    @SubscribeEvent
    fun onKeyPressed(event: InputEvent.Key) {
        val key = InputConstants.getKey(
            event.key,
            event.scanCode
        )

        if(KEYBIND_CONFIG.isActiveAndMatches(key)) {}
        if(KEYBIND_THEME_SELECT.isActiveAndMatches(key)) {}
    }
}