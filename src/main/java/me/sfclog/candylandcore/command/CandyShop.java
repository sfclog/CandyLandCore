package me.sfclog.candylandcore.command;

import me.sfclog.candylandcore.lang.Lang;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class CandyShop implements CommandExecutor  {

    @Override
    public boolean onCommand(CommandSender arg0, org.bukkit.command.Command arg1, String arg2, String[] arg3) {
        if (arg0 instanceof Player) {
            Player p = (Player) arg0;
            if(p != null) {
                p.playSound(p.getLocation(), Sound.BLOCK_ENDER_CHEST_OPEN,100,1);
                Inventory inv = Bukkit.createInventory(null,45, Lang.getlang("CandyLand.CandyShop.Title"));
                p.openInventory(inv);
            }
        }
       return false;
    }
}
