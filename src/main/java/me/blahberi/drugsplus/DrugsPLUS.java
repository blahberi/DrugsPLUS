package me.blahberi.drugsplus;

import me.blahberi.drugsplus.Commands.drugs;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class DrugsPLUS extends JavaPlugin {
    @Override
    public void onEnable() {
        this.saveDefaultConfig();

        this.getCommand("drugs").setExecutor(new drugs());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
