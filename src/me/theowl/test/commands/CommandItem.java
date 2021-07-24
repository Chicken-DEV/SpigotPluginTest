package me.theowl.test.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandItem implements CommandExecutor {

	/**
	 * 
	 * The method onCommand() will be used, when the console or a
	 * player executes a command.
	 * 
	 * In this case we're using this method for a few ifs and a
	 * method to add a specific item.
	 * 
	 * @author Chicken-Dev
	 * @contributor PlugDev
	 * @version 1.0
	 * 
	 */
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§4Only players can use this command!");
			return true;
		}
		if (args.length != 1) {
			sender.sendMessage("§4Wrong syntax: /giveitem");
			return true;
		}
		
		Material item = Material.getMaterial(args[0].toUpperCase());
		if (item == null) {
			sender.sendMessage("§4Item not available.");
			return true;
		}
		((Player) sender).getInventory().addItem(new ItemStack(item));
		return true;
	}

}
