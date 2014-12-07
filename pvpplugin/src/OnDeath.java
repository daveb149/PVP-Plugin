package src;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import static src.Misc.prefix;

public class OnDeath implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player dead = event.getEntity().getPlayer();
        Player killer = dead.getKiller();
        
        event.setDeathMessage("");
       

        event.getDrops().clear();
        event.setDroppedExp(0);

        dead.sendMessage(prefix + ChatColor.GREEN + "You were killed by " + ChatColor.DARK_RED + killer.getDisplayName());

        ItemStack goldenapple = new ItemStack(Material.GOLDEN_APPLE);
        ItemStack firecharge = new ItemStack(Material.FIREBALL);

        killer.getInventory().setItem(3, goldenapple);
        killer.getInventory().setItem(2, firecharge);

        killer.giveExpLevels(1);
        killer.playSound(killer.getLocation(), Sound.BAT_HURT, 10, 1);

        for (PotionEffect pe : dead.getActivePotionEffects()) {
            dead.removePotionEffect(pe.getType());
        }
    }

}
