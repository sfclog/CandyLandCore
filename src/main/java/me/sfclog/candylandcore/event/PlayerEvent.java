package me.sfclog.candylandcore.event;

import me.sfclog.candylandcore.Main;
import me.sfclog.candylandcore.candyitem.CandyDataItem;
import me.sfclog.candylandcore.itemdrop.ItemDrop;
import me.sfclog.candylandcore.lang.Lang;
import me.sfclog.candylandcore.util.RainBowLeather;
import me.sfclog.candylandcore.util.Send;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class PlayerEvent implements Listener {



    public static boolean is_ore(Block b) {
        return b != null && b.getType() != null && b.getType().name().contains("_ORE");
    }

    @EventHandler
    public void onblockbreak(BlockBreakEvent e) {
        Player p =e.getPlayer();
        Block b = e.getBlock();
        if (is_ore(b) && shouldDrop() && p.getGameMode() == GameMode.SURVIVAL) {
            ItemDrop.drop_random_rate(b.getLocation());
        }
    }

    // Phương thức kiểm tra xem có nên rơi ra hay không với tỷ lệ 20%
    private boolean shouldDrop() {
        Random random = new Random();
        int chance = random.nextInt(100); // Sinh số ngẫu nhiên từ 0 đến 99
        return chance < 5; // Trả về true nếu số ngẫu nhiên nhỏ hơn 20 (20%)
    }
    @EventHandler
    public void onclose(InventoryCloseEvent e) {
        Player p = (Player) e.getPlayer();
        if(e.getInventory() != null && e.getView().getTitle() != null && e.getView().getTitle().equals(Lang.getlang("CandyLand.CandyShop.Title"))) {
            double money = 0.0;
            for(ItemStack i : e.getInventory().getContents()) {
                if(i != null && i.getType() != null) {
                    if(i.getType() == Material.PLAYER_HEAD) {
                        int rate = ItemDrop.check_rate(i);
                        if(!(rate <= 0)) {
                            double m = ItemDrop.getmoney(rate);
                            if(!(m <= 0)) {
                                money = money + m;
                            }
                        }
                      } else {
                      p.getWorld().dropItem(p.getLocation(),i);
                    }
                }
            }
            if(!(money <= 0)) {
                Main.econ.depositPlayer(p,money);
                p.playSound(p.getLocation(),Sound.BLOCK_BELL_USE,100,1);
                Send.send(p, Lang.getlang("Plugin.Msg.Seller").replace("<money>",String.valueOf(money)));
            } else {
                p.playSound(p.getLocation(),Sound.ENTITY_VILLAGER_NO,100,1);
                Send.send(p,Lang.getlang("Plugin.Msg.Blank"));
            }
        }
    }


    @EventHandler
    public void dead(EntityDeathEvent e) {
     if(e.getEntity() instanceof LivingEntity && !(e.getEntity() instanceof Player)) {
         Entity livi = e.getEntity();
         if(livi.getCustomName() == null) {
             ItemDrop.drop_random_rate(livi.getLocation());
             e.getDrops().clear();
          }
       }
    }

    @EventHandler
    public void conSpawn(CreatureSpawnEvent e) {
        if(e.getSpawnReason() != null) {
            LivingEntity entity = e.getEntity();
            if(entity != null && entity.getCustomName() == null && entity instanceof LivingEntity) {
                if(entity.getType() != null && entity.getType() != EntityType.ARMOR_STAND) {
                    entity.getEquipment().setHelmet(CandyDataItem.getRandom());
                    entity.getEquipment().setChestplate(RainBowLeather.getChest());
                    entity.getEquipment().setLeggings(RainBowLeather.getLeg());
                    entity.getEquipment().setBoots(RainBowLeather.getBoot());
                    entity.getEquipment().setHelmetDropChance(0f);
                    entity.getEquipment().setChestplateDropChance(0f);
                    entity.getEquipment().setLeggingsDropChance(0f);
                    entity.getEquipment().setBootsDropChance(0f);
                }
            }
        }
    }
}
