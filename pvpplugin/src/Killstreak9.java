package src;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import static src.Misc.prefix;

public class Killstreak9 implements Listener {

    @EventHandler
    public boolean PlayerLevelChangeEvent(PlayerLevelChangeEvent event) {

        Player player = event.getPlayer();

        int reqlevel = event.getNewLevel();
        if (reqlevel == 9) {

            player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 500, 1));
            Bukkit.broadcastMessage(prefix + ChatColor.BLUE + player.getDisplayName() + ChatColor.GRAY + " is on a 9 killing-spree!");
            return true;

        }
        return false;
    }
}
