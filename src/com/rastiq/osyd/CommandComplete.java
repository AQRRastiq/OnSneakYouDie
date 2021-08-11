package com.rastiq.osyd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

public class CommandComplete implements TabCompleter {
   public List onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
      ArrayList nothing;
      if (args.length == 1) {
         nothing = new ArrayList();
         List actuallist = new ArrayList();
         nothing.add("start");
         nothing.add("stop");
         if (args[0].length() == 0) {
            return nothing;
         } else {
            return actuallist;
         }
      } else if (args.length >= 2) {
         nothing = new ArrayList();
         return nothing;
      } else {
         return null;
      }
   }
}
