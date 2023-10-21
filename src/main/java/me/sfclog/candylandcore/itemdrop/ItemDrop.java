package me.sfclog.candylandcore.itemdrop;

import me.sfclog.candylandcore.candyitem.CandyDataItem;
import me.sfclog.candylandcore.lang.Lang;
import me.sfclog.candylandcore.util.Random;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.print.DocFlavor;
import java.util.List;

public class ItemDrop {



    public static int check_rate(ItemStack i) {
        if(i.getItemMeta() != null && i.getItemMeta().getLore() != null) {
           for(String s : i.getItemMeta().getLore()) {
               if(s != null) {
                   if(s.contains(Lang.getlang("CandyLand.MobDrop.CustomItemDrop.Rate.1"))) {
                       return 1;
                   }
                   if(s.contains(Lang.getlang("CandyLand.MobDrop.CustomItemDrop.Rate.2"))) {
                       return 2;
                   }
                   if(s.contains(Lang.getlang("CandyLand.MobDrop.CustomItemDrop.Rate.3"))) {
                       return 3;
                   }
               }
           }
        }
        return 0;
    }

    public static double getmoney(int rate) {
        if(rate == 1 ) {
            return  Lang.getdoubl("CandyLand.MobDrop.CustomItemDrop.Rate.1M");
        }
        if(rate == 2 ) {
            return  Lang.getdoubl("CandyLand.MobDrop.CustomItemDrop.Rate.2M");
        }
        if(rate == 3 ) {
            return  Lang.getdoubl("CandyLand.MobDrop.CustomItemDrop.Rate.3M");
        }
        return 0;
    }
    public static void drop_random_rate(Location loc) {
        ItemStack it = CandyDataItem.getRandom();
        ItemMeta meta = it.getItemMeta();
        meta.setDisplayName(Lang.getlang("CandyLand.MobDrop.CustomItemDrop.Name"));
        List<String> s = Lang.getarray("CandyLand.MobDrop.CustomItemDrop.Lore");
        s.replaceAll(ss -> ss.replace("<rate>",getRandomRate()));
        meta.setLore(s);
        it.setItemMeta(meta);

        loc.getWorld().dropItem(loc,it);
    }

    private static CharSequence getRandomRate() {
        int i = Random.getRandomNumber(0,10);
        if(i == 10) {
            return  Lang.getlang("CandyLand.MobDrop.CustomItemDrop.Rate.3");
        }
        if(i == 5) {
            return  Lang.getlang("CandyLand.MobDrop.CustomItemDrop.Rate.2");
        }
        return Lang.getlang("CandyLand.MobDrop.CustomItemDrop.Rate.1");
    }
}
