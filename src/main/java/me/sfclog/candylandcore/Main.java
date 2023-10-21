package me.sfclog.candylandcore;

import me.sfclog.candylandcore.candyitem.CandyDataItem;
import me.sfclog.candylandcore.command.CandyShop;
import me.sfclog.candylandcore.event.PlayerEvent;
import me.sfclog.candylandcore.lang.Lang;
import me.sfclog.candylandcore.util.Color;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Economy econ = null;

    public static String candy_world;

    @Override
    public void onEnable() {
        setupEconomy();
        Lang.loadlang();
        candy_world = Lang.getlang("CandyLandWorld");
        CandyDataItem.load();
        Bukkit.getPluginManager().registerEvents(new PlayerEvent() , this);
        this.getCommand("candyshop").setExecutor(new CandyShop());
    }

    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }


    public static void sendlog(String s) {
        Bukkit.getConsoleSender().sendMessage(Color.tran(s));
    }

}
