package kr.kro.habaek.virtualinventory.events

import kr.kro.habaek.virtualinventory.Main.Companion.pl
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

object AlwaysEvent : Listener {

    @EventHandler
    fun join(e: PlayerJoinEvent) {
        pl.registerInventories(e.player)
    }
}
