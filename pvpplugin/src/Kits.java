package src;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import static src.Misc.prefix;
import static src.OnPlayerInteract.kitSelector;

public class Kits implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();
        ItemStack stack = e.getCurrentItem();
        Inventory inv = e.getInventory();

        if (inv.getName().equals(kitSelector.getName())) {
            if (stack.getType() == Material.IRON_CHESTPLATE && stack.getAmount() == 1) {
                misc(e);
                player.sendMessage(prefix + ChatColor.GREEN + "You have recived the " + ChatColor.AQUA + "Warrior " + ChatColor.GREEN + "kit.");

                ItemStack ironsword = new ItemStack(Material.IRON_SWORD);
                ItemStack ironhelm = new ItemStack(Material.IRON_HELMET);
                ItemStack ironchestplate = new ItemStack(Material.IRON_CHESTPLATE);
                ItemStack ironleggings = new ItemStack(Material.IRON_LEGGINGS);
                ItemStack ironboots = new ItemStack(Material.IRON_BOOTS);
                ItemStack bow = new ItemStack(Material.BOW);
                ItemStack FNS = new ItemStack(Material.FIREBALL);
                ItemStack fishingrod = new ItemStack(Material.FISHING_ROD);
                ItemStack arrow = new ItemStack(Material.ARROW, 1);

                ItemMeta s = ironsword.getItemMeta();
                ItemMeta b = bow.getItemMeta();

                s.setDisplayName(ChatColor.AQUA + "Warrior Sword");
                b.setDisplayName(ChatColor.AQUA + "Warrior Bow");

                ironsword.setItemMeta(s);
                bow.setItemMeta(b);

                bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);

                player.getInventory().setHelmet(ironhelm);
                player.getInventory().setChestplate(ironchestplate);
                player.getInventory().setLeggings(ironleggings);
                player.getInventory().setBoots(ironboots);
                player.getInventory().setItem(0, ironsword);
                player.getInventory().setItem(1, bow);
                player.getInventory().setItem(2, FNS);
                player.getInventory().setItem(8, fishingrod);
                player.getInventory().setItem(9, arrow);

            }
            if (stack.getType() == Material.DIAMOND_HELMET && stack.getAmount() == 1) {
                misc(e);
                player.sendMessage(prefix + ChatColor.GREEN + "You have recived the " + ChatColor.AQUA + "Hulk " + ChatColor.GREEN + "kit.");

                ItemStack stonesword = new ItemStack(Material.STONE_SWORD);
                ItemStack ironhelm = new ItemStack(Material.IRON_HELMET);
                ItemStack diachestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
                ItemStack ironleggings = new ItemStack(Material.IRON_LEGGINGS);
                ItemStack ironboots = new ItemStack(Material.IRON_BOOTS);
                ItemStack bow = new ItemStack(Material.BOW);
                ItemStack FNS = new ItemStack(Material.FIREBALL);
                ItemStack fishingrod = new ItemStack(Material.FISHING_ROD);
                ItemStack arrow = new ItemStack(Material.ARROW);

                ItemMeta s = stonesword.getItemMeta();
                ItemMeta b = bow.getItemMeta();

                s.setDisplayName(ChatColor.AQUA + "Hulk Sword");
                b.setDisplayName(ChatColor.AQUA + "Hulk Bow");

                stonesword.setItemMeta(s);
                bow.setItemMeta(b);

                bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);

                player.getInventory().setHelmet(ironhelm);
                player.getInventory().setChestplate(diachestplate);
                player.getInventory().setLeggings(ironleggings);
                player.getInventory().setBoots(ironboots);
                player.getInventory().setItem(0, stonesword);
                player.getInventory().setItem(1, bow);
                player.getInventory().setItem(2, FNS);
                player.getInventory().setItem(8, fishingrod);
                player.getInventory().setItem(9, arrow);
            }
            if (stack.getType() == Material.IRON_SWORD && stack.getAmount() == 1) {
                misc(e);
                player.sendMessage(prefix + ChatColor.GREEN + "You have recived the " + ChatColor.AQUA + "Ninja " + ChatColor.GREEN + "kit.");

                ItemStack ironsword = new ItemStack(Material.IRON_SWORD);
                ItemStack chainhelm = new ItemStack(Material.CHAINMAIL_HELMET);
                ItemStack chainchestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
                ItemStack chainleggings = new ItemStack(Material.CHAINMAIL_LEGGINGS);
                ItemStack chainboots = new ItemStack(Material.CHAINMAIL_BOOTS);
                ItemStack bow = new ItemStack(Material.BOW);
                ItemStack FNS = new ItemStack(Material.FIREBALL);
                ItemStack fishingrod = new ItemStack(Material.FISHING_ROD);
                ItemStack arrow = new ItemStack(Material.ARROW);

                ItemMeta s = ironsword.getItemMeta();
                ItemMeta b = bow.getItemMeta();

                s.setDisplayName(ChatColor.AQUA + "Ninja Sword");
                b.setDisplayName(ChatColor.AQUA + "Ninja Bow");

                ironsword.setItemMeta(s);
                bow.setItemMeta(b);

                bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);
                chainhelm.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
                chainchestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
                chainleggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
                chainboots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
                player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 1));

                player.getInventory().setHelmet(chainhelm);
                player.getInventory().setChestplate(chainchestplate);
                player.getInventory().setLeggings(chainleggings);
                player.getInventory().setBoots(chainboots);
                player.getInventory().setItem(0, ironsword);
                player.getInventory().setItem(1, bow);
                player.getInventory().setItem(2, FNS);
                player.getInventory().setItem(8, fishingrod);
                player.getInventory().setItem(9, arrow);
            }
            if (stack.getType() == Material.BOW && stack.getAmount() == 1) {
                misc(e);
                player.sendMessage(prefix + ChatColor.GREEN + "You have recived the " + ChatColor.AQUA + "Archer " + ChatColor.GREEN + "kit.");

                ItemStack stonesword = new ItemStack(Material.STONE_SWORD);
                ItemStack chainhelm = new ItemStack(Material.CHAINMAIL_HELMET);
                ItemStack chainchestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
                ItemStack chainleggings = new ItemStack(Material.CHAINMAIL_LEGGINGS);
                ItemStack chainboots = new ItemStack(Material.CHAINMAIL_BOOTS);
                ItemStack bow = new ItemStack(Material.BOW);
                ItemStack FNS = new ItemStack(Material.FIREBALL);
                ItemStack fishingrod = new ItemStack(Material.FISHING_ROD);
                ItemStack arrow = new ItemStack(Material.ARROW, 1);

                ItemMeta s = stonesword.getItemMeta();
                ItemMeta b = bow.getItemMeta();

                s.setDisplayName(ChatColor.AQUA + "Archer Sword");
                b.setDisplayName(ChatColor.AQUA + "Archer Bow");

                stonesword.setItemMeta(s);
                bow.setItemMeta(b);

                bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);
                bow.addEnchantment(Enchantment.ARROW_DAMAGE, 1);
                bow.addEnchantment(Enchantment.ARROW_KNOCKBACK, 1);

                player.getInventory().setHelmet(chainhelm);
                player.getInventory().setChestplate(chainchestplate);
                player.getInventory().setLeggings(chainleggings);
                player.getInventory().setBoots(chainboots);
                player.getInventory().setItem(0, stonesword);
                player.getInventory().setItem(1, bow);
                player.getInventory().setItem(2, FNS);
                player.getInventory().setItem(8, fishingrod);
                player.getInventory().setItem(9, arrow);
            }
        }

    }

    private void misc(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();

        e.setCancelled(true);
        player.closeInventory();
        player.playSound(player.getLocation(), Sound.NOTE_PLING, 10, 1);
        player.getInventory().clear();
        for (PotionEffect pe : player.getActivePotionEffects()) {
            player.removePotionEffect(pe.getType());
        }
    }
}
