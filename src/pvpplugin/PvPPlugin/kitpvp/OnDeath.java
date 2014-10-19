package pvpplugin.PvPPlugin.kitpvp;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;

public class OnDeath implements Listener {
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent event) {
		Player dead = event.getEntity().getPlayer();
		Player killer = dead.getKiller();

		
		event.getDrops().clear();
		event.setDroppedExp(0);

                dead.sendMessage(ChatColor.GREEN + "You were killed by " + ChatColor.DARK_RED + killer);

		ItemStack goldenapple = new ItemStack(Material.GOLDEN_APPLE);

		killer.getInventory().addItem(goldenapple);

		killer.giveExpLevels(1);
		killer.playSound(killer.getLocation(), Sound.BAT_HURT, 10, 1);
	}

}
