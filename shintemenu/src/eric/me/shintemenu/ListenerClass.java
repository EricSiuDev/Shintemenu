package eric.me.shintemenu;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ListenerClass implements Listener {
    @EventHandler
    public void invDragEvent(InventoryDragEvent e){
        Inventory inv = e.getInventory();
        String name = inv.getName();
        if(name.equals("伺服器選單")){
            e.setCancelled(true);
            return;
        }
    }
    @EventHandler
    public void invClickEvent(InventoryClickEvent e){
        Inventory inv = e.getInventory();
        Player p = (Player) e.getWhoClicked();
        String name = inv.getName();
        if(name.equals("伺服器選單")){
            e.setCancelled(true);
            int slot = e.getSlot();
            switch(slot){
                case 0:
                    p.performCommand("spawn");
                    p.closeInventory();
                    break;
                case 1:
                    p.performCommand("home");
                    p.closeInventory();
                    break;
                case 2:
                    p.closeInventory();
                    p.performCommand("res rt");
                    break;
                case 4:
                    p.performCommand("kit tools");
                    p.closeInventory();
                    break;
                case 5:
                    p.closeInventory();
                    p.performCommand("enderchest");
                    break;
                case 7:
                    p.performCommand("sethome");
                    p.closeInventory();
                    break;
                case 8:
                    p.closeInventory();
                    break;
            }
            return;
        }
    }
}
