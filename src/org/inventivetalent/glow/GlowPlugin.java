package org.inventivetalent.glow;

import org.bukkit.plugin.java.JavaPlugin;
import org.inventivetalent.apihelper.APIManager;

public class GlowPlugin extends JavaPlugin {

	static GlowPlugin instance;
	GlowAPI glowAPI = new GlowAPI();

	@Override
	public void onLoad() {
		instance = this;
		//Register this API if the plugin got loaded
		APIManager.registerAPI(glowAPI, this);
	}

	@Override
	public void onEnable() {
		//Initialize this API of the plugin got loaded
		APIManager.initAPI(GlowAPI.class);
	}

}
