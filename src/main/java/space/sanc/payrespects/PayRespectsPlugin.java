package space.sanc.payrespects;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class PayRespectsPlugin extends JavaPlugin {

	@Override
	public void onEnable() {
		this.getCommand("f").setExecutor(new FCommand());
	}

}
