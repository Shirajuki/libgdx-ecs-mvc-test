package group16.project.game.desktop

import kotlin.jvm.JvmStatic
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import group16.project.game.Configuration
import group16.project.game.StarBattle

object DesktopLauncher {
    @JvmStatic
    fun main(arg: Array<String>) {
        LwjglApplication(StarBattle(), LwjglApplicationConfiguration().apply {
            title = Configuration.gameTitle
            width = Configuration.gameWidth.toInt()
            height = Configuration.gameHeight.toInt()
        })
    }
}