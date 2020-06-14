package creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.ConcreteSubFactory;

import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.ConcreteProduct.Crane;
import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.ConcreteProduct.Truck;
import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.Factory.VehicleStore;
import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.Product.Vehicle;
import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.Product.VehicleType;

public class HeavyVehicleStore extends VehicleStore {
	@Override
	public Vehicle createVehicle(VehicleType type) {
		switch(type) {
			case TRUCK : return new Truck();
			case CRANE : return new Crane();
			default: System.out.println("Item not available!");	return null;
		}
	}
}
