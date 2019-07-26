package com.phoenixorigins.launchpure;

import org.bukkit.plugin.java.JavaPlugin;

public class Launchpure extends JavaPlugin
{
	public boolean enabled;

	@Override
	public void onEnable()
	{
		enabled = false;

		getCommand("launchpure").setExecutor(new LaunchpureCmd(this));
		getCommand("togglelaunchpure").setExecutor(new TogglelaunchpureCmd(this));
	}

	@Override
	public void onDisable() { }
}