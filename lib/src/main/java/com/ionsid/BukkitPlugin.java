package com.ionsid;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class BukkitPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("ENABLED TEST PLUGIN");
    }

    @Override
    public void onDisable() {
        getLogger().info("DISABLED TEST PLUGIN");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("pray")) { // If the player typed /basic then do the following, note: If you only registered this executor for one command, you don't need this
            if (sender instanceof Player player) {
                player.sendMessage(ChatColor.LIGHT_PURPLE + "Your prayer has been heard! And ignored.");
            }
            return true;
        } //If this has happened the function will return true.
        // If this hasn't happened the value of false will be returned.
        return false;
    }
}
