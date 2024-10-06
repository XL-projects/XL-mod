package net.utest.xlmod.imgui

import imgui.ImGui
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
import java.awt.event.InputEvent
import com.mojang.blaze3d.platform.InputConstants

class Imgui :Screen(Component.empty()) {
    override fun render(poseStack: PoseStack, mouseX: Int, mouseY: Int, partialTick: Float) {
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

