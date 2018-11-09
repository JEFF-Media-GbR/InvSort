package de.jeffclan.JeffInvSort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class JeffInvSortUpdateChecker {

	private JeffInvSortPlugin plugin;

	JeffInvSortUpdateChecker(JeffInvSortPlugin plugin) {
		this.plugin = plugin;
	}

	String latestVersionLink = "https://api.jeff-media.de/invsort/invsort-latest-version.txt";
	String downloadLink = "<no link yet>";
	private String currentVersion = "undefined";
	private String latestVersion = "undefined";

	void sendUpdateMessage(Player p) {
		if(!latestVersion.equals("undefined")) {
		if (!currentVersion.equals(latestVersion)) {
			p.sendMessage(ChatColor.GRAY + "There is a new version of " + ChatColor.GOLD + "InvSort" + ChatColor.GRAY
					+ " available.");
					p.sendMessage(ChatColor.GRAY + "Please download at " + downloadLink);
		}
		}
	}

	void checkForUpdate() {
		
		plugin.getLogger().info("Checking for available updates...");

		try {

			HttpURLConnection httpcon = (HttpURLConnection) new URL(latestVersionLink).openConnection();
			httpcon.addRequestProperty("User-Agent", "InvSort/"+plugin.getDescription().getVersion());

			BufferedReader reader = new BufferedReader(new InputStreamReader(httpcon.getInputStream()));

			String inputLine = reader.readLine().trim();

			latestVersion = inputLine;
			currentVersion = plugin.getDescription().getVersion().trim();

			
			if (latestVersion.equals(currentVersion)) {
				plugin.getLogger().info("You are using the latest version of InvSort.");
			} else {
				plugin.getLogger().warning("========================================================");
				plugin.getLogger().warning("There is a new version of InvSort available!");
				plugin.getLogger().warning("Latest : " + inputLine);
				plugin.getLogger().warning("Current: " + currentVersion);
				plugin.getLogger().warning("Please update to the newest version. Download:");
				plugin.getLogger().warning(downloadLink);
				plugin.getLogger().warning("========================================================");
			}

			reader.close();
		} catch (Exception e) {
			plugin.getLogger().warning("Could not check for updates.");
		}

	}

}
