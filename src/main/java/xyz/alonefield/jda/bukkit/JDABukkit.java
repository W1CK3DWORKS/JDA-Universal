package xyz.alonefield.jda.bukkit;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.alonefield.jda.JDACommon;

public class JDABukkit extends JavaPlugin {

    private JDACommon common;

    @Override
    public void onEnable() {
        this.common = new JDACommon(this) {
            @Override
            protected java.util.logging.Logger getLogger() {
                return getJavaPlugin().getLogger();
            }
        };
        common.onEnable();
    }

    @Override
    public void onDisable() {
        common.onDisable();
    }
}
