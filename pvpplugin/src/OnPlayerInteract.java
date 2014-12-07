package src;

import java.util.ArrayList;
import java.util.List;
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
import org.bukkit.plugin.Plugin;

public class OnPlayerInteract implements Listener {

    private static final Plugin plugin = Kitpvp.getInstance();

    public static Inventory kitSelector = Bukkit.createInventory(null, 9, ChatColor.GREEN + "" + ChatColor.BOLD + "Kit Selector");
    public static List<String> arenas = plugin.getConfig().getStringList("Arenas");

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        List<String> arenas = plugin.getConfig().getStringList("Arenas");
        Boolean a = e.getAction().equals(Action.RIGHT_CLICK_BLOCK) || (e.getAction().equals(Action.RIGHT_CLICK_AIR));
        Material i = e.getPlayer().getItemInHand().getType();

        if (e.getAction() == Action.PHYSICAL) {
            if (e.getClickedBlock().getType() == Material.STONE_PLATE) {
                if (e.getClickedBlock().getRelative(BlockFace.DOWN).getType() == Material.OBSIDIAN) {
                    player.openInventory(kitSelector);

                }

            }

        }

    }

    static {
        ItemStack warrior = new ItemStack(Material.IRON_CHESTPLATE, 1);
        ItemStack hulk = new ItemStack(Material.DIAMOND_HELMET, 1);
        ItemStack ninja = new ItemStack(Material.IRON_SWORD, 1);
        ItemStack archer = new ItemStack(Material.BOW, 1);

        ItemMeta w = warrior.getItemMeta();
        ItemMeta h = hulk.getItemMeta();
        ItemMeta n = ninja.getItemMeta();
        ItemMeta a = archer.getItemMeta();

        ArrayList<String> lore = new ArrayList<>();

        w.setDisplayName(ChatColor.RED + "Warrior");
        h.setDisplayName(ChatColor.RED + "Hulk");
        n.setDisplayName(ChatColor.RED + "Ninja");
        a.setDisplayName(ChatColor.RED + "Archer");
        lore.add(ChatColor.AQUA + "Left click to select kit.");

        w.setLore(lore);
        h.setLore(lore);
        n.setLore(lore);
        a.setLore(lore);

        warrior.setItemMeta(w);
        hulk.setItemMeta(h);
        ninja.setItemMeta(n);
        archer.setItemMeta(a);

        kitSelector.setItem(1, warrior);
        kitSelector.setItem(3, hulk);
        kitSelector.setItem(5, ninja);
        kitSelector.setItem(7, archer);
    }
}
