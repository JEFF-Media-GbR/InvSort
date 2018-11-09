package de.jeffclan.JeffInvSort;

import org.bukkit.ChatColor;

public class JeffInvSortMessages {

	JeffInvSortPlugin plugin;

	final String MSG_INVENTORY_SORTED;

	JeffInvSortMessages(JeffInvSortPlugin plugin) {
		this.plugin = plugin;

		MSG_INVENTORY_SORTED = ChatColor.translateAlternateColorCodes('&', plugin.getConfig()
				.getString("message-inventory-sorted", "&aYour inventory has been sorted."));

		
	}

}
