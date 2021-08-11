package com.rastiq.osyd;

import java.util.Iterator;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StartCommand implements CommandExecutor {
   OSYD plugin;

   public StartCommand(OSYD plugin) {
      this.plugin = plugin;
   }

   public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
      if (sender instanceof Player) {
         if (sender.hasPermission("osyd.toggle")) {
            Player p = (Player)sender;
            if (args.length == 1) {

               if (args[0].equals("start")) {
                  Bukkit.broadcastMessage(ChatColor.GREEN + "OnSneakYouDie challenge has started!");
                  this.plugin.gamestarted = true;
               }

               if (args[0].equals("stop")) {
                  Bukkit.broadcastMessage(ChatColor.GREEN + "OnSneakYouDie challenge has ended!");
                  this.plugin.gamestarted = false;
               }
            } else {
               p.sendMessage(ChatColor.RED + "/osyd <start/stop>");
            }
         } else {
            sender.sendMessage(ChatColor.RED + "You dont have the permission needed to run this command.");
         }
      } else {
         sender.sendMessage(ChatColor.RED + "This command is for players only!");
      }

      return true;
   }
}
