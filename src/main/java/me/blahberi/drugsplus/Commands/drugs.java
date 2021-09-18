package me.blahberi.drugsplus.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.blahberi.drugsplus.Utils.Utils;

public class drugs implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Bukkit.broadcastMessage(Utils.color("&red hello world"));
        return true;
    }
}
