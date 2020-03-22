package com.toke1597.main

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import java.lang.Compiler.command

class Main():JavaPlugin(){

    override fun onEnable() {
        logger.info("Hello from Gradle Kotlin~!")
        setupCommands()
        Bukkit.getPluginManager().registerEvents(HelloJoin(), this)
    }

    private fun setupCommands() {
        command("test")
    }
}