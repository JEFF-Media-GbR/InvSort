package de.jeffclan.JeffInvSort;


// We do not use listeners because THERE IS NO FUCKING PlayerOpenedHisInv event...
// This is really retarded. I don't wanna mess with NMS because people will complain after every update
// If someone knows how to get a PlayerOpenedHisInv event, please let me know :)

/*package de.jeffclan.JeffInvSort;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerBucketEvent;
import org.bukkit.event.player.PlayerBucketFillEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemBreakEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.PlayerInventory;
*/

public class JeffInvSortListener {

}
	/*
	JeffInvSortPlugin plugin;
	
	JeffInvSortListener(JeffInvSortPlugin plugin) {
		this.plugin=plugin;
	}
	
	private void sort(Inventory inv) {
		long time_1 = System.currentTimeMillis();
		plugin.chestSort.sortInventory(inv,9,36);
		long time_2 = System.currentTimeMillis();
		System.out.println(time_1-time_2);
	}
	
	@EventHandler
	public void onEntityPickupItem(EntityPickupItemEvent e) {
		
		if(e.getEntityType()!=EntityType.PLAYER) {
			return;
		}
		
		Player p = (Player) e.getEntity();
		
		
		sort(p.getInventory());
		
		
		
	}
	
	@EventHandler
	public void onDropItem(PlayerDropItemEvent e) {
		if(e.isCancelled()) return;
		sort(e.getPlayer().getInventory());
	}
	
	@EventHandler
	public void onPlayerBucketEmpty(PlayerBucketEmptyEvent e) {
		if(e.isCancelled()) return;
		sort(e.getPlayer().getInventory());
	}
	
	@EventHandler
	public void onPlayerBucketFill(PlayerBucketFillEvent e) {
		if(e.isCancelled()) return;
		sort(e.getPlayer().getInventory());
	}

	@EventHandler
	public void onPlayerEggThrow(PlayerEggThrowEvent e) {
		sort(e.getPlayer().getInventory());
	}
	
	@EventHandler
	public void onPlayerFish(PlayerFishEvent e) {
		if(e.isCancelled()) return;
		sort(e.getPlayer().getInventory());
	}
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {
		if(e.isCancelled()) return;
		sort(e.getPlayer().getInventory());
	}
	
	@EventHandler
	public void onPlayerItemBreak(PlayerItemBreakEvent e) {
		sort(e.getPlayer().getInventory());
	}
	
	@EventHandler
	public void onPlayerItemConsume(PlayerItemConsumeEvent e) {
		if(e.isCancelled()) return;
		sort(e.getPlayer().getInventory());
	}
	
	@EventHandler
	public void onPlayerShearEntity(PlayerShearEntityEvent e) {
		if(e.isCancelled()) return;
		sort(e.getPlayer().getInventory());
	}
	
	@EventHandler
	public void onInventoryInteract(InventoryInteractEvent e) {
		if(e.isCancelled()) return;
		
		if(!(e.getInventory() instanceof PlayerInventory)) {
			return;
		}

		
		sort(e.getInventory());
	}
	
	
}
*/