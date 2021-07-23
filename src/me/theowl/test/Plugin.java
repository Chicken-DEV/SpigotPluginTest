package me.theowl.test;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import me.theowl.test.commands.CommandItem;

public class Plugin extends JavaPlugin {

	
	/**
	 * 
	 * The method onEnable() will be used in cases like reloading or plugin
	 * <b>enabling</b>. This method is for registration or displaying
	 * some text in console with an enable-message or something like this.
	 * 
	 * In this case we're using this method for registrate a "/giveitem"-command
	 * and for an enable-message.
	 * 
	 * @author Chicken-Dev
	 * @contributor PlugDev
	 * @version 1.0
	 * 
	 */
	
    @Override
    public void onEnable(){
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "=================================");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "\nThe Test-Plugin has been enabled.");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "=================================");
        getCommand("giveitem").setExecutor(new CommandItem());

    }
    
    /**
	 * 
	 * The method onDisable() will be used in cases like reloading or plugin
	 * <b>disabling</b>. This method is for deregistration or displaying
	 * some text in console with an disable-message or something like this.
	 * 
	 * In this case we're using only for a disable message.
	 * 
	 * @author Chicken-Dev
	 * @contributor PlugDev
	 * @version 1.0
	 * 
	 */

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "=================================");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "\nThe Test Plugin has been disabled.");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "=================================");

    }
}
