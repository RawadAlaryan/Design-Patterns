package creationalDesignPatterns.factoryMethodDesignPattern.projectVehicleStore.Factory;

import creationalDesignPatterns.factoryMethodDesignPattern.projectVehicleStore.Product.Vehicle;
import creationalDesignPatterns.factoryMethodDesignPattern.projectVehicleStore.Product.VehicleType;

public abstract class VehicleStore {
    public Vehicle orderVehicle(VehicleType type) {
        Vehicle vehicle = createVehicle(type);
        vehicle.getServiced();
        vehicle.polish();
        vehicle.provideClearance();
        return vehicle;
    }

    public abstract Vehicle createVehicle(VehicleType type);
}