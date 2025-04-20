package xyz.alonefield.jda;

public abstract class JDACommon {

    protected final Object plugin;

    public JDACommon(Object plugin) {
        this.plugin = plugin;
    }

    public void onEnable() {
        getLogger().info("JDA Plugin Enabled");
    }

    public void onDisable() {
        getLogger().info("JDA Plugin Disabled");
    }

    protected abstract java.util.logging.Logger getLogger();
}
