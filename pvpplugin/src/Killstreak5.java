package src;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Killstreak5 implements Listener {

	@EventHandler
	public boolean PlayerLevelChangeEvent(PlayerLevelChangeEvent event) {

		Player player = event.getPlayer();

		int reqlevel = event.getNewLevel();
		if (reqlevel == 5){

			
                        player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 2));
			Bukkit.broadcastMessage(ChatColor.BLUE + player.getDisplayName()
					+ ChatColor.GRAY + " is on a 5 killstreak!");
					return true;

		}
		return false;
	}
}
