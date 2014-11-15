package pvpplugin;

import static pvpplugin.Kitpvp.getInstance;
import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class CommandKitPVP implements CommandExecutor {

	private final Plugin plugin = getInstance();

	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		Player player = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("KitPVP")) {
			player.playSound(player.getLocation(), Sound.NOTE_PLING, 10, 1);
			player.getInventory().clear();

			ItemStack ironsword = new ItemStack(Material.IRON_SWORD);
			ItemStack ironhelm = new ItemStack(Material.IRON_HELMET);
			ItemStack ironchestplate = new ItemStack(Material.IRON_CHESTPLATE);
			ItemStack ironleggings = new ItemStack(Material.IRON_LEGGINGS);
			ItemStack ironboots = new ItemStack(Material.IRON_BOOTS);
			ItemStack bow = new ItemStack(Material.BOW);
			ItemStack FNS = new ItemStack(Material.FLINT_AND_STEEL);
			ItemStack fishingrod = new ItemStack(Material.FISHING_ROD);
			ItemStack food = new ItemStack(Material.COOKED_BEEF, 64);
			ItemStack arrow = new ItemStack(Material.ARROW, 1);

			bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);
			FNS.setDurability((short) 64);

			player.getInventory().setHelmet(ironhelm);
			player.getInventory().setChestplate(ironchestplate);
			player.getInventory().setLeggings(ironleggings);
			player.getInventory().setBoots(ironboots);
			player.getInventory().addItem(ironsword);
			player.getInventory().addItem(bow);
			player.getInventory().addItem(FNS);
			player.getInventory().addItem(fishingrod);
			player.getInventory().addItem(food);
			player.getInventory().addItem(arrow);

		}

		
			if (cmd.getName().equalsIgnoreCase("GameMaster")) {

				if (player.isOp()){
				
				if (player.getGameMode() == GameMode.SURVIVAL) {
					player.setGameMode(GameMode.ADVENTURE);
					player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 999999999, 0));
					player.setAllowFlight(true);
					player.setFlying(true);
					player.getInventory().clear();
					player.setTotalExperience(0);
					player.setFoodLevel(20);
					player.setHealth(20);
					player.getInventory().clear();
					player.getInventory().setArmorContents(null);
					

				} else {

					if (player.getGameMode() == GameMode.ADVENTURE) {
						player.setGameMode(GameMode.SURVIVAL);
						player.removePotionEffect(PotionEffectType.INVISIBILITY);
						player.setAllowFlight(false);
						player.setFlying(false);

					}
				}
			}
		}

			{
				if (cmd.getName().equalsIgnoreCase("Ratchet")){
					player.playSound(player.getLocation(), Sound.ANVIL_LAND, 10, 1);
					player.playEffect(player.getLocation(), Effect.MOBSPAWNER_FLAMES, 0);
				}
			}
			
			return false;
	}
}
