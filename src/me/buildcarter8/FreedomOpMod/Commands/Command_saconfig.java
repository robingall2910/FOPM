package me.buildcarter8.FreedomOpMod.Commands;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.buildcarter8.FreedomOpMod.FOPM_AdministratorList;
import me.buildcarter8.FreedomOpMod.Main;

public class Command_saconfig extends FOPM_Command
{
    private final Main plugin;

    public Command_saconfig(Main plugin)
    {
        super("saconfig", "saconfig [add] [player]", "SA Command - Super Admin Management", PERM_MESSAGE, Arrays.asList("admin"));
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (args.length == 0)
        {
            return false;
        }
        else if (args.length == 2)
        {
            if (!isConsoleSender(sender))
            {
                msgNoPerms(sender);
                return true;
            }
            
            if (args[0].equalsIgnoreCase("add"))
            {
                Player p = getPlayer(args[1]);

                if (p == null)
                {
                    notFound(sender);
                    return true;
                }

                FOPM_AdministratorList.addSuperadmin(p);
                Bukkit.broadcastMessage(ChatColor.RED + "Adding " + p + " to the super admin list");
            }
        }
        return true;
    }
}
