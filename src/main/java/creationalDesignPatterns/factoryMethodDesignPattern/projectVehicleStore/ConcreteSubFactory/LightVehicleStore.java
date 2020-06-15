package creationalDesignPatterns.factoryMethodDesignPattern.projectVehicleStore.ConcreteSubFactory;

import creationalDesignPatterns.factoryMethodDesignPattern.projectVehicleStore.ConcreteProduct.Bike;
import creationalDesignPatterns.factoryMethodDesignPattern.projectVehicleStore.ConcreteProduct.Car;
import creationalDesignPatterns.factoryMethodDesignPattern.projectVehicleStore.Factory.VehicleStore;
import creationalDesignPatterns.factoryMethodDesignPattern.projectVehicleStore.Product.Vehicle;
import creationalDesignPatterns.factoryMethodDesignPattern.projectVehicleStore.Product.VehicleType;

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
