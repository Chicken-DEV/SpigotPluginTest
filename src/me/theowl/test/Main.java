package me.theowl.test;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private me.theowl.test.command.commands.Fly commands = new me.theowl.test.command.commands.Fly();

    @Override
    public void onEnable(){


        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "=================================");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "\nThe Test Plugin has been disabled.\n");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "=================================");

        getCommand(commands.cmd1).setExecutor(commands);
        getCommand(commands.cmd2).setExecutor(commands);

    }


    public void OnDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "=================================");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "\nThe Test Plugin has been disabled.\n");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "=================================");

    }
}
