package me.theadminhammer.disableop;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class DisableOP extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Hello");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent event) {
        String command = event.getMessage().toLowerCase();

        if (command.startsWith("/op ") || command.startsWith("/minecraft:op ")) {
            event.setCancelled(true);
            event.getPlayer().sendMessage("§cThis command is disabled!");
        }

        if (command.startsWith("/deop ") || command.startsWith("/minecraft:deop ")) {
            event.setCancelled(true);
            event.getPlayer().sendMessage("§cThis command is disabled!");
        }

        if (command.equals("/op") || command.equals("/minecraft:op")) {
            event.setCancelled(true);
            event.getPlayer().sendMessage("§cThis command is disabled!");
        }

        if (command.equals("/deop") || command.equals("/minecraft:deop")) {
            event.setCancelled(true);
            event.getPlayer().sendMessage("§cThis command is disabled!");
        }
    }
}
