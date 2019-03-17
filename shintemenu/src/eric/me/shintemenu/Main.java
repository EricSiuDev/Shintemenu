package eric.me.shintemenu;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class Main extends JavaPlugin {
    FileConfiguration config = getConfig();
    @Override
    public void onEnable(){
        getLogger().info("Menu plugin has been enabled.");
        getServer().getPluginManager().registerEvents(new ListenerClass(), this);
    }
    @Override
    public void onDisable(){
        getLogger().info("Menu plugin has been disabled.");
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(sender instanceof Player){
            Player p = (Player) sender;
            if((cmd.getName().equalsIgnoreCase("shinte"))||(cmd.getName().equalsIgnoreCase("menu"))||(cmd.getName().equalsIgnoreCase("servermenu"))){
                    Menu.openMain(p);
                return true;
            }
        }
        return false;
    }
}