package src;

import java.util.ArrayList;
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
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

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
    static {
        ItemStack warrior = new ItemStack(Material.IRON_CHESTPLATE, 1);
        ItemStack hulk = new ItemStack(Material.DIAMOND_HELMET, 1);
        
        ItemMeta w = warrior.getItemMeta();
        ItemMeta h = hulk.getItemMeta();
        
        ArrayList<String> lore = new ArrayList<>();
        
        w.setDisplayName(ChatColor.RED + "Warrior");
        h.setDisplayName(ChatColor.RED + "Hulk");
        lore.add(ChatColor.AQUA + "Left click to select kit.");
        
        
        w.setLore(lore);
        h.setLore(lore);
        
        warrior.setItemMeta(w);
        hulk.setItemMeta(h);
        
        kitSelector.setItem(0, warrior);
        kitSelector.setItem(2, hulk);
    }
}
