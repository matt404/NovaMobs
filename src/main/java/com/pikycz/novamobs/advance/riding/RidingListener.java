package com.pikycz.novamobs.advance.riding;

import cn.nukkit.event.Listener;
import cn.nukkit.event.server.DataPacketReceiveEvent;
import cn.nukkit.math.Vector3;
import cn.nukkit.network.protocol.PlayerInputPacket;

/**
 * @author PikyCZ
 */
public class RidingListener implements Rideable, Listener {
    
    public void Ride(DataPacketReceiveEvent event, PlayerInputPacket packet){
        
    }

    @Override
    public Vector3 getRidePosition() {
        return null;
    }
    
}
