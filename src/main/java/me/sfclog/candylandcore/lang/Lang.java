package me.sfclog.candylandcore.lang;

import me.sfclog.candylandcore.Main;
import me.sfclog.candylandcore.util.Color;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Lang {

    public static File locate = new File("plugins/CandyLandCore/", "config.yml");
    public static FileConfiguration DataFile = (FileConfiguration)YamlConfiguration.loadConfiguration(locate);




    public static void loadlang() {

        addlang("Plugin.Prefix","&7[&dCandyLand&7] ");
        addlang("Plugin.Msg.Seller","&2Bạn đã bán kẹo và nhận được &f<money>$ &2!");
        addlang("Plugin.Msg.Blank","&4Chú định bán AIR cho anh à ?!!");
        addlang("CandyLand.MobDrop.CustomItemDrop.Name","&d&l⬤ &dCandy &4Kandy &bDrop");


        ArrayList<String> lore = new ArrayList<>();
        lore.add(" ");
        lore.add(" &7Candy Kandy Drop là vật phẩm nhận");
        lore.add(" &7được khi giết quái tại &dCandyLand");
        lore.add(" &7với độ hiếm ngẫu nhiên !");
        lore.add(" ");
        lore.add(" &fĐộ Hiếm: <rate>");
        lore.add(" ");
        lore.add(" &8(Dùng để trao đổi sưu tầm");
        lore.add(" &8hoặc dùng để mua bán)");
        lore.add(" ");
        addlang("CandyLand.MobDrop.CustomItemDrop.Lore",lore);


        addlang("CandyLand.MobDrop.CustomItemDrop.Rate.1","&2Thường");
        addlang("CandyLand.MobDrop.CustomItemDrop.Rate.2","&eHiếm");
        addlang("CandyLand.MobDrop.CustomItemDrop.Rate.3","&5Siêu Hiếm");

        addlang("CandyLand.MobDrop.CustomItemDrop.Rate.1M",100.0);
        addlang("CandyLand.MobDrop.CustomItemDrop.Rate.2M",300.0);
        addlang("CandyLand.MobDrop.CustomItemDrop.Rate.3M",800.0);

        addlang("CandyLand.CandyShop.Title","&aCửa Hàng &4&lKandy &d&lCandy");


        try {
            DataFile.save(locate);
            Main.sendlog("§e[Lang] §2Load config !");
        } catch (IOException e) {
            Main.sendlog("§e[Lang] §4Fail to load config !");
            e.printStackTrace();
        }

    }
    public static void save() {
        try {
            DataFile.save(locate);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<String> getarray(String s) {
        if(DataFile.contains(s)) {
            List<String> ss = new ArrayList<String>();
            for(String ok : DataFile.getStringList(s)) {
                ss.add(Color.tran(ok));
            }
            return ss;
        }
        return null;
    }
    public static int getint(String s) {
        if(DataFile.contains(s)) {
            return DataFile.getInt(s);
        }
        return 0;
    }
    public static double getdoubl(String s) {
        if(DataFile.contains(s)) {
            return DataFile.getDouble(s);
        }
        return 0;
    }
    public static boolean getb(String s) {
        if(DataFile.contains(s)) {
            return DataFile.getBoolean(s);
        }
        return false;
    }
    public static String getlang(String s) {
        if(DataFile.contains(s)) {
            return Color.tran(DataFile.getString(s));
        }
        return s;
    }

    public static String getlang_nocolor(String s) {
        if(DataFile.contains(s)) {
            return DataFile.getString(s);
        }
        return null;
    }

    public static void addlang(String s , double s2) {
        if(!DataFile.contains(s)) {
            DataFile.set(s, s2);
        }
    }
    public static void addlang(String s , Boolean s2) {
        if(!DataFile.contains(s)) {
            DataFile.set(s, s2);
        }
    }
    public static void addlang(String s , List<String> s2) {
        if(!DataFile.contains(s)) {
            DataFile.set(s, s2);
        }
    }
    public static void setforcelang(String s , String s2) {
        DataFile.set(s, s2);
    }
    public static void setforcelang(String s, double x) {
        DataFile.set(s, x);
    }
    public static void addlang(String s , String s2) {
        if(!DataFile.contains(s)) {
            DataFile.set(s, s2);
        }
    }
    public static void addlang(String s , int s2) {
        if(!DataFile.contains(s)) {
            DataFile.set(s, s2);
        }
    }


}
