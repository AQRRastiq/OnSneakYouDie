package com.rastiq.osyd;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class OSYDListener implements Listener {
   OSYD plugin;

   public OSYDListener(OSYD plugin) {
      this.plugin = plugin;
   }

   @EventHandler
   public void onPlayerToggleSneak(PlayerToggleSneakEvent e) {
      Player player = e.getPlayer();

      if (this.plugin.gamestarted) {
         if (!player.isSneaking()) {
            player.setHealth(0.0D);
         }
      }
   }
}
