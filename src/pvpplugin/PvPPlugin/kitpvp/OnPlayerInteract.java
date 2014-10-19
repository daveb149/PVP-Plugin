package pvpplugin.PvPPlugin.kitpvp;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

public class OnPlayerInteract implements Listener {
    
    
    
    public static Inventory kitSelector = Bukkit.createInventory(null, 9, ChatColor.GREEN + "" + ChatColor.BOLD + "Kit Selector");
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e) {

        if (e.getAction() == Action.PHYSICAL) {
            if (e.getClickedBlock().getType() == Material.STONE_PLATE) {
                if (e.getClickedBlock().getRelative(BlockFace.DOWN).getType() == Material.OBSIDIAN) {
                    Player player = e.getPlayer();
                    player.openInventory(kitSelector);

                }

            }

        }

    }
}
