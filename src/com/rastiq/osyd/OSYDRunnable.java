package com.rastiq.osyd;

import java.util.Iterator;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.BlockIterator;

public class OSYDRunnable extends BukkitRunnable {
   OSYD plugin;

   public OSYDRunnable(OSYD plugin) {
      this.plugin = plugin;
   }

   public void run() {
      if (this.plugin.gamestarted) {

      }
   }
}
