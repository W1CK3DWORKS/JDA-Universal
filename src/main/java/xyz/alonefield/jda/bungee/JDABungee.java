package xyz.alonefield.jda.bungee;

import net.md_5.bungee.api.plugin.Plugin;
import xyz.alonefield.jda.JDACommon;

public class JDABungee extends Plugin {

    private JDACommon common;

    @Override
    public void onEnable() {
        this.common = new JDACommon(this) {
            @Override
            protected java.util.logging.Logger getLogger() {
                return getPlugin().getLogger();
            }
        };
        common.onEnable();
    }

    @Override
    public void onDisable() {
        common.onDisable();
    }
}
