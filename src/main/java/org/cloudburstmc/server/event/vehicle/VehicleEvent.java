package org.cloudburstmc.server.event.vehicle;

import org.cloudburstmc.server.entity.Entity;
import org.cloudburstmc.server.event.Event;

/**
 * Created by larryTheCoder at 7/5/2017.
 * <p>
 * Nukkit Project
 */
public abstract class VehicleEvent extends Event {

    private final Entity vehicle;

    public VehicleEvent(Entity vehicle) {
        this.vehicle = vehicle;
    }

    public Entity getVehicle() {
        return vehicle;
    }
}
