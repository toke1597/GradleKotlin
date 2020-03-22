package com.toke1597.main

import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.event.Listener

class HelloCommand(): Listener, CommandExecutor{
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if(sender is Player){
            val p: Player = sender
            if(label.equals("test", ignoreCase = true)){
                p.sendMessage("${ChatColor.GOLD}Hello from Gradle Kotlin!@@@@@ -$\n|test")
                return true
            }
        }
        return false
    }

}