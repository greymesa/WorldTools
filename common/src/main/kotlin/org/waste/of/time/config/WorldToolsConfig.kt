package org.waste.of.time.config

import me.shedaniel.autoconfig.ConfigData
import me.shedaniel.autoconfig.annotation.Config
import me.shedaniel.autoconfig.annotation.ConfigEntry
import net.minecraft.entity.boss.BossBar

/**
 * See [Cloth Config Documentation](https://shedaniel.gitbook.io/cloth-config/auto-config/creating-a-config-class)
 * for more information on how to create a config class
 */
@Config(name = "worldtools")
class WorldToolsConfig : ConfigData {
    // Categories
    @ConfigEntry.Gui.CollapsibleObject
    val capture = Capture()

    @ConfigEntry.Gui.CollapsibleObject
    val world = World()

    @ConfigEntry.Gui.CollapsibleObject
    val entity = Entity()

    @ConfigEntry.Gui.CollapsibleObject
    val advanced = Advanced()

    class Capture {
        var chunks = true
        var entities = true
        var players = true
        var statistics = true
        var metadata = true
    }

    class World {
//        var modifyWorldGenerator = true
        var modifyGameRules = true

        var doWardenSpawning = false
        var doFireTick = false
        var doVinesSpread = false
        var doMobSpawning = false
        var doDaylightCycle = false
        var doWeatherCycle = false
        var keepInventory = true
        var doMobGriefing = false
        var doTraderSpawning = false
        var doPatrolSpawning = false
    }

    class Entity {
        var modifyNBT = true

        var noAI = true
        var noGravity = true
        var invulnerable = true
        var silent = true
    }

    class Advanced {
        var autoDownload = true
        var anonymousMode = false
        var showToasts = true
        var showChatMessages = true
        var accentColor = 0xA2FF4C
        var captureBarColor = BossBar.Color.PINK
        var captureBarStyle = BossBar.Style.NOTCHED_10
        var progressBarColor = BossBar.Color.GREEN
        var progressBarStyle = BossBar.Style.PROGRESS
        var progressBarTimeout = 3000L
        var renderNotYetCachedContainers = true
    }
}