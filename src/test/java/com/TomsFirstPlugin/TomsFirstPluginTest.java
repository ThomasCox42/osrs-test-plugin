package com.TomsFirstPlugin;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class TomsFirstPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(TomsFirstPlugin.class);
		RuneLite.main(args);
	}
}