package me.buildcarter8.FreedomOpMod.Commands;

import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import me.buildcarter8.FreedomOpMod.Main;

public class Command_fopm extends FOPM_Command
{
    private final Main plugin;

    public Command_fopm(Main plugin) {
        super("fopm", "fopm", "The main FOPM command.", PERM_MESSAGE, Arrays.asList("fom"));
        this.plugin = plugin;
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        sender.sendMessage(ChatColor.AQUA + "======" + ChatColor.GREEN + "FreedomOpMod" + ChatColor.AQUA + "======");
        sender.sendMessage(ChatColor.GREEN + "Version " + Main.VERSION);
        sender.sendMessage(ChatColor.GREEN + "Created by buildcarter8 - Chief Dev FreedomOP");
        sender.sendMessage(ChatColor.AQUA + "========================================================");

        return true;
    }

}
