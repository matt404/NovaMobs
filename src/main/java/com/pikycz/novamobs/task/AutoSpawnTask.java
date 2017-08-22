package com.pikycz.novamobs.task;

import cn.nukkit.plugin.Plugin;
import cn.nukkit.scheduler.PluginTask;
import com.pikycz.novamobs.configsection.PluginConfiguration;

/**
 *
 * @author PikyCZ
 */
public class AutoSpawnTask extends PluginTask {

    public AutoSpawnTask(Plugin plugin) {
        super(plugin);
        this.prepareSpawnerClasses();
    }

    @Override
    public void onRun(int currentTick) {//WIP °-°
    }
    
    private void prepareSpawnerClasses() {
        if (PluginConfiguration.spawnAnimals) {
        /*entitySpawners.add(new BatSpawner(this, this.pluginConfig));
        entitySpawners.add(new ChickenSpawner(this, this.pluginConfig));
        entitySpawners.add(new CowSpawner(this, this.pluginConfig));
        entitySpawners.add(new OcelotSpawner(this, this.pluginConfig));
        entitySpawners.add(new PigSpawner(this, this.pluginConfig));
        Spawner.add(new LlamaSpawner(this, this.pluginCofig));
        entitySpawners.add(new RabbitSpawner(this, this.pluginConfig));
        entitySpawners.add(new SheepSpawner(this, this.pluginConfig));*/
        }
        
        if (PluginConfiguration.spawnMonsters) {
            /*entitySpawners.add(new CreeperSpawner(this, this.pluginConfig));
        entitySpawners.add(new EndermanSpawner(this, this.pluginConfig));
        entitySpawners.add(new SkeletonSpawner(this, this.pluginConfig));
        entitySpawners.add(new SpiderSpawner(this, this.pluginConfig));
        entitySpawners.add(new WolfSpawner(this, this.pluginConfig));
        entitySpawners.add(new ZombieSpawner(this, this.pluginConfig));*/
        }
    }
    
}
