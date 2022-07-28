package space.sanc.payrespects;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class FCommand implements CommandExecutor {

	@Override
	public boolean onCommand(@NotNull CommandSender sender,
	                         @NotNull  Command command,
	                         @NotNull  String label,
	                         @NotNull  String[] args) {
		if (sender instanceof Player) {
			String player = sender.getName();
			Bukkit.getServer().broadcastMessage(player + " has paid respects.");
		} else {
			sender.sendMessage("This command is for players only.");
		}
		return true;
	}

}
