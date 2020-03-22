package com.toke1597.main

import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class HelloJoin() : Listener {

    @EventHandler
    fun onJoin(e:PlayerJoinEvent){
        val p: Player = e.player
        p.sendMessage("Hello~! ${p.name}")
    }
}
