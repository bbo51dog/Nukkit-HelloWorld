package net.bbo51dog.helloworld;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.PluginLogger;

public class Main extends PluginBase{
    public void onEnable(){
        PluginLogger logger = this.getLogger();
        logger.info("Plugin loaded");
        logger.info("--------------");
        logger.info("Hello, World!");
    }
}
