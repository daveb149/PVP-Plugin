package src;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;
import org.bukkit.inventory.ItemStack;
import static src.Misc.prefix;

public class Killstreak7 implements Listener {

    @EventHandler
    public boolean PlayerLevelChangeEvent(PlayerLevelChangeEvent event) {

        Player player = event.getPlayer();

        int reqlevel = event.getNewLevel();
        if (reqlevel == 7) {

            player.getInventory().remove(new ItemStack(Material.IRON_SWORD));
            player.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD));
            Bukkit.broadcastMessage(prefix + ChatColor.BLUE + player.getDisplayName() + ChatColor.GRAY + " is on a 7 killstreak!");
            return true;

        }
        return false;
    }
}
