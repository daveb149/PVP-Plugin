package src;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.potion.PotionEffect;

public class OnLogout implements Listener {

    @EventHandler
    public void onLogout(PlayerQuitEvent event) {
        Player player = event.getPlayer();

        player.getInventory().clear();
        player.giveExpLevels(-999);
        player.setHealth(20.0);

        for (PotionEffect pe : player.getActivePotionEffects()) {
            player.removePotionEffect(pe.getType());
        }

    }

    @EventHandler
    public void onKick(PlayerKickEvent event) {
        Player player = event.getPlayer();

        player.getInventory().clear();
        player.giveExpLevels(-999);
        player.setHealth(20.0);

        for (PotionEffect pe : player.getActivePotionEffects()) {
            player.removePotionEffect(pe.getType());
        }
    }
}
