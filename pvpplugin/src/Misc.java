package src;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Chest;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import static src.OnPlayerInteract.arenas;

public class Misc implements Listener {

    @EventHandler
    public void hungerFreeze(FoodLevelChangeEvent e) {

        e.setFoodLevel(19);
        e.setCancelled(true);
    }

    @EventHandler
    public void playerDropItem(PlayerDropItemEvent e) {
        e.setCancelled(true);
    }
    public static String prefix = ChatColor.RED + "Noxious" + " " + ChatColor.DARK_GRAY + "»" + " ";

    @EventHandler
    public boolean PlayerLevelChangeEvent(PlayerLevelChangeEvent e) {
        int reqlevel = e.getNewLevel();
        Player player = e.getPlayer();
        if (reqlevel == 20) {
            Bukkit.broadcastMessage(prefix + ChatColor.BLUE + player.getDisplayName() + ChatColor.GRAY + " is on a 20 killing-rampage!");

        }
        if (reqlevel == 25) {
            Bukkit.broadcastMessage(prefix + ChatColor.BLUE + player.getDisplayName() + ChatColor.GRAY + " is on a 25 killing-rampage!");

        }
        if (reqlevel == 30) {
            Bukkit.broadcastMessage(prefix + ChatColor.BLUE + player.getDisplayName() + ChatColor.GRAY + " is on a 30 killing-rampage!");

        }
        return false;

    }
}
