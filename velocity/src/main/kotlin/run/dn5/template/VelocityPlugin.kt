package run.dn5.template

import com.google.inject.Inject
import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.plugin.Plugin
import com.velocitypowered.api.plugin.annotation.DataDirectory
import com.velocitypowered.api.proxy.ProxyServer
import org.slf4j.Logger
import java.nio.file.Path

@Plugin(id = "", name = "", version = "", authors = [""])
class VelocityPlugin @Inject constructor(
    val server: ProxyServer,
    val logger: Logger,
    @DataDirectory
    val dataFolder: Path
) {
    companion object {
        lateinit var instance: VelocityPlugin
    }

    @Subscribe
    fun onEnable(e: ProxyInitializeEvent) {
        instance = this
    }
}