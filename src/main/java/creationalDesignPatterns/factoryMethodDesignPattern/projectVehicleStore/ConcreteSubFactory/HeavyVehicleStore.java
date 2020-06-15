package creationalDesignPatterns.factoryMethodDesignPattern.projectVehicleStore.ConcreteSubFactory;

import creationalDesignPatterns.factoryMethodDesignPattern.projectVehicleStore.ConcreteProduct.Crane;
import creationalDesignPatterns.factoryMethodDesignPattern.projectVehicleStore.ConcreteProduct.Truck;
import creationalDesignPatterns.factoryMethodDesignPattern.projectVehicleStore.Factory.VehicleStore;
import creationalDesignPatterns.factoryMethodDesignPattern.projectVehicleStore.Product.Vehicle;
import creationalDesignPatterns.factoryMethodDesignPattern.projectVehicleStore.Product.VehicleType;

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
