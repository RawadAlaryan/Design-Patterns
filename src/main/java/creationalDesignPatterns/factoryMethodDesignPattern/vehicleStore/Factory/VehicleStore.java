package creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.Factory;

import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.Product.Vehicle;
import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.Product.VehicleType;

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