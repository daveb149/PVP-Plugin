package pvpplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.event.player.*;

public class Killstreak9 implements Listener {

	@EventHandler
	public boolean PlayerLevelChangeEvent(PlayerLevelChangeEvent event) {

		Player player = event.getPlayer();

		int reqlevel = event.getNewLevel();
		if (reqlevel == 9){

            ItemStack diamchestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
            player.getInventory().setChestplate(diamchestplate);
			Bukkit.broadcastMessage(ChatColor.BLUE + player.getDisplayName()
					+ ChatColor.GRAY + " is on a 9 killing-spree!");
					return true;

		}
		return false;
	}
}
