package me.sfclog.candylandcore.util;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class RainBowLeather {


    public static ItemStack getHelmet() {
        ItemStack item = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        meta.setColor(Color.fromBGR(Random.getRandomNumber(0,255), Random.getRandomNumber(0,255),Random.getRandomNumber(0,255)));
        meta.addEnchant(Enchantment.DURABILITY,10,true);
        item.setItemMeta(meta);
        return item;
    }
    public static ItemStack getChest() {
        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        meta.setColor(Color.fromBGR(Random.getRandomNumber(0,255), Random.getRandomNumber(0,255),Random.getRandomNumber(0,255)));
        meta.addEnchant(Enchantment.DURABILITY,10,true);
        item.setItemMeta(meta);
        return item;
    }
    public static ItemStack getLeg() {
        ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        meta.setColor(Color.fromBGR(Random.getRandomNumber(0,255), Random.getRandomNumber(0,255),Random.getRandomNumber(0,255)));
        meta.addEnchant(Enchantment.DURABILITY,10,true);
        item.setItemMeta(meta);
        return item;
    }
    public static ItemStack getBoot() {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        meta.setColor(Color.fromBGR(Random.getRandomNumber(0,255), Random.getRandomNumber(0,255),Random.getRandomNumber(0,255)));
        meta.addEnchant(Enchantment.DURABILITY,10,true);
        item.setItemMeta(meta);
        return item;
    }
}
