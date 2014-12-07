package src;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Kitpvp extends JavaPlugin {
    
    public static Plugin plugin;
    
    @Override
    public void onEnable() {
        plugin = this;
        getLogger().info("Plugin Initialized");
        Bukkit.getPluginManager().registerEvents(new OnDeath(), this);
        Bukkit.getPluginManager().registerEvents(new Killstreak3(), this);
        Bukkit.getPluginManager().registerEvents(new Killstreak5(), this);
        Bukkit.getPluginManager().registerEvents(new Killstreak7(), this);
        Bukkit.getPluginManager().registerEvents(new Killstreak9(), this);
        Bukkit.getPluginManager().registerEvents(new Killstreak15(), this);
        Bukkit.getPluginManager().registerEvents(new OnLogout(), this);
        Bukkit.getPluginManager().registerEvents(new OnPlayerInteract(), this);
        Bukkit.getPluginManager().registerEvents(new Misc(), this);
        Bukkit.getPluginManager().registerEvents(new Kits(), this);
        
        CommandKitPVP cmds = new CommandKitPVP();
        
        getCommand("Kits").setExecutor(cmds);
        getCommand("Gamemaster").setExecutor(cmds);
        getCommand("Ratchet").setExecutor(cmds);
    }
    
    public static Plugin getInstance() {
        return plugin;
    }
    
}
