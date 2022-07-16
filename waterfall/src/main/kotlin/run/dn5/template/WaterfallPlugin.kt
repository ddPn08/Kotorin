package run.dn5.template

import net.md_5.bungee.api.plugin.Plugin

class WaterfallPlugin : Plugin() {
    companion object {
        lateinit var instance: WaterfallPlugin
    }

    override fun onEnable() {
        instance = this
    }
}