package com.phoenixorigins.launchpure;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TogglelaunchpureCmd implements CommandExecutor
{
	private Launchpure plugin;

	public TogglelaunchpureCmd(Launchpure plugin)
	{
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if (sender.hasPermission("launchpure.toggle"))
		{
			plugin.enabled = !plugin.enabled;
			if (plugin.enabled)
			{
				sender.sendMessage("/launchpure is now accessible to all players.");
			}
			else
			{
				sender.sendMessage("/launchpure is now disabled for all players.");
			}
		}
		else
		{
			sender.sendMessage("You do not have permission to do this.");
		}
		return true;
	}
}