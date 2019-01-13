package me.theowl.test;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){

    }


    public void OnDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "=================================");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "\nThe Test Plugin has been enabled.\n");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "=================================");

    }
}
