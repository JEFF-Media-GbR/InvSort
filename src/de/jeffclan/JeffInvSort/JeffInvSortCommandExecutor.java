package de.jeffclan.JeffInvSort;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class JeffInvSortCommandExecutor implements CommandExecutor {
	
	JeffInvSortPlugin plugin;

	public JeffInvSortCommandExecutor(JeffInvSortPlugin plugin) {
		this.plugin=plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(!command.getName().equalsIgnoreCase("invsort")) {
			plugin.getLogger().warning("The CommandExecutor has been assigned to a command it cannot handle!");
			return false;
		}

		if(!(sender instanceof Player)) {
			sender.sendMessage("This message is meant to run by players only.");
			return true;
		}
		
		Player player = (Player) sender;
		
		if(!player.hasPermission("invsort.use")) {
			player.sendMessage(plugin.getCommand("invsort").getPermissionMessage());
			return true;
		}
		
		for(int test=0;test<99;test++) {
		 System.out.println(String.format("%d %s", test, player.getInventory().getItem(test)));
			
			
		}
		
		plugin.sortPlayerInventory(player);
		player.sendMessage(plugin.messages.MSG_INVENTORY_SORTED);
		
		return true;
	}

}
