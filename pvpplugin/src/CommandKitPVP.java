package src;

import static src.Kitpvp.getInstance;
import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import static src.OnPlayerInteract.kitSelector;

public class CommandKitPVP implements CommandExecutor {


    public boolean onCommand(CommandSender sender, Command cmd, String label,
            String[] args) {
        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("Kits")) {
            player.openInventory(kitSelector);
            return true;
        }

        if (cmd.getName().equalsIgnoreCase("Ratchet")) {
            player.playSound(player.getLocation(), Sound.ANVIL_LAND, 10, 1);
            player.playEffect(player.getLocation(), Effect.MOBSPAWNER_FLAMES, 0);
            return true;
        }

        if (cmd.getName().equalsIgnoreCase("GameMaster") && player.hasPermission("pvp.moderation") || player.isOp()) {

            if (player.getGameMode() == GameMode.SURVIVAL) {
                player.setGameMode(GameMode.ADVENTURE);
                player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 999999999, 0));
                player.setAllowFlight(true);
                player.setFlying(true);
                player.getInventory().clear();
                player.setTotalExperience(0);
                player.setFoodLevel(20);
                player.setHealth(20.0);
                player.getInventory().clear();
                player.getInventory().setArmorContents(null);
                return true;

            } else {

                if (player.getGameMode() == GameMode.ADVENTURE) {
                    player.setGameMode(GameMode.SURVIVAL);
                    player.removePotionEffect(PotionEffectType.INVISIBILITY);
                    player.setAllowFlight(false);
                    player.setFlying(false);
                    return true;

                }
            }

        }

        return false;
    }
}
