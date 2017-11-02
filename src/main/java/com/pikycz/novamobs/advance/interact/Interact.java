package com.pikycz.novamobs.advance.interact;

import cn.nukkit.Player;
import cn.nukkit.entity.EntityInteractable;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;
import com.pikycz.novamobs.entities.BaseEntity;

/**
 * @author PikyCZ
 */
public abstract class Interact extends EntityInteractable {

    public Interact(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }
    
    public boolean interact(Player player, BaseEntity bentity) {
        return true;
    }
    
}
