package me.sfclog.candylandcore.util;

import me.sfclog.candylandcore.lang.Lang;
import org.bukkit.entity.Player;

public class Send {

    public static void send(Player p , String s) {
        p.sendMessage(Lang.getlang("Plugin.Prefix") + Color.tran(s));
    }
}
