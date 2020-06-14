package creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.ConcreteSubFactory;

import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.ConcreteProduct.Bike;
import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.ConcreteProduct.Car;
import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.Factory.VehicleStore;
import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.Product.Vehicle;
import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.Product.VehicleType;

public class LightVehicleStore extends VehicleStore {
    @Override
    public Vehicle createVehicle(VehicleType type) {
        switch(type) {
        	case BIKE : return new Bike();	
            case CAR : return new Car();	
            default: System.out.println("Item not available!");	return null;
        }
    }
}
