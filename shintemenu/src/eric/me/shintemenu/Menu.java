package eric.me.shintemenu;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static void openMain(Player p){
        Inventory inv = Bukkit.createInventory(null, 9, "伺服器選單");
        ItemStack spawn = new ItemStack(Material.OAK_PLANKS, 1);
        ItemMeta spawnmeta = spawn.getItemMeta();
        List<String> spawnlore = new ArrayList<>();
        spawnlore.add("點我回到重生點@@");
        spawnmeta.setLore(spawnlore);
        spawnmeta.setDisplayName(ChatColor.GOLD+"回到重生點");
        spawn.setItemMeta(spawnmeta);
        inv.setItem(0, spawn);
        ItemStack home = new ItemStack(Material.RED_BED, 1);
        ItemMeta homemeta = home.getItemMeta();
        List<String> homelore = new ArrayList<>();
        homelore.add("點我回到溫暖的家OuO");
        homemeta.setLore(homelore);
        homemeta.setDisplayName(ChatColor.BLUE+"回家");
        home.setItemMeta(homemeta);
        ItemStack sethome = new ItemStack(Material.OAK_LOG, 1);
        ItemMeta sethomemeta = sethome.getItemMeta();
        List<String> sethomelore = new ArrayList<>();
        sethomelore.add("點我在當前位置設置家");
        sethomemeta.setLore(sethomelore);
        sethomemeta.setDisplayName(ChatColor.YELLOW+"在當前位置設置家");
        sethome.setItemMeta(sethomemeta);
        inv.setItem(1, home);
        inv.setItem(7, sethome);
        ItemStack rt = new ItemStack(Material.COMPASS, 1);
        ItemMeta rtmeta = rt.getItemMeta();
        rtmeta.setDisplayName(ChatColor.BLUE+"隨機傳送");
        List<String> rtlore = new ArrayList<>();
        rtlore.add("點我使用隨機傳送");
        rtmeta.setLore(rtlore);
        rt.setItemMeta(rtmeta);
        inv.setItem(2, rt);
        ItemStack tools = new ItemStack(Material.STONE_PICKAXE, 1);
        ItemMeta toolsmeta = tools.getItemMeta();
        toolsmeta.setDisplayName(ChatColor.GOLD+"領取工具包");
        List<String> toolslore = new ArrayList<>();
        toolslore.add("點我領取工具包");
        toolsmeta.setLore(toolslore);
        tools.setItemMeta(toolsmeta);
        inv.setItem(4, tools);
        ItemStack enderchest = new ItemStack(Material.ENDER_CHEST, 1);
        ItemMeta enderchestmeta = enderchest.getItemMeta();
        enderchestmeta.setDisplayName(ChatColor.DARK_GREEN+"隨身終界箱");
        List<String> enderchestlore = new ArrayList<>();
        enderchestlore.add("點我打開隨身的終界箱");
        enderchestmeta.setLore(enderchestlore);
        enderchest.setItemMeta(enderchestmeta);
        inv.setItem(5, enderchest);
        ItemStack stick = new ItemStack(Material.STICK, 1);
        ItemMeta stickmeta = stick.getItemMeta();
        stickmeta.setDisplayName(ChatColor.GOLD+"如何設置領地");
        List<String> sticklore = new ArrayList<>();
        sticklore.add("拿著一根木棒");
        sticklore.add("左鍵範圍的左下角");
        sticklore.add("右鍵範圍的右上角");
        sticklore.add("輸入/res create <領地名字>");
        stickmeta.setLore(sticklore);
        stick.setItemMeta(stickmeta);
        inv.setItem(8, stick);
        p.openInventory(inv);
    }
}

