package run.dn5.template

import org.bukkit.plugin.java.JavaPlugin

class PaperPlugin: JavaPlugin() {
    companion object {
        lateinit var instance: PaperPlugin
    }

    override fun onEnable() {
        instance = this
    }
}