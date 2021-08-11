package com.rastiq.osyd;

import java.util.HashMap;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public final class OSYD extends JavaPlugin {
   HashMap storedblock = new HashMap();
   boolean gamestarted = false;

   public void onEnable() {
      this.getServer().getPluginManager().registerEvents(new OSYDListener(this), this);
      BukkitTask task = (new OSYDRunnable(this)).runTaskTimer(this, 1L, 1L);
      this.getCommand("osyd").setExecutor(new StartCommand(this));
      this.getCommand("osyd").setTabCompleter(new CommandComplete());
   }

   public void onDisable() {
   }
}
