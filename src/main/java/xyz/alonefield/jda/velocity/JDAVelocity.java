package xyz.alonefield.jda.velocity;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.proxy.ProxyShutdownEvent;
import com.velocitypowered.api.plugin.Plugin;
import org.slf4j.Logger;
import xyz.alonefield.jda.JDACommon;

@Plugin(
    id = "jda",
    name = "JDA",
    version = "1.0.0",
    authors = {"YourName"}
)
public class JDAVelocity {

    private final Logger logger;
    private JDACommon common;

    @Inject
    public JDAVelocity(Logger logger) {
        this.logger = logger;
    }

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        this.common = new JDACommon(this) {
            @Override
            protected java.util.logging.Logger getLogger() {
                return java.util.logging.Logger.getLogger("JDAVelocity");
            }
        };
        common.onEnable();
    }

    @Subscribe
    public void onProxyShutdown(ProxyShutdownEvent event) {
        common.onDisable();
    }
}
