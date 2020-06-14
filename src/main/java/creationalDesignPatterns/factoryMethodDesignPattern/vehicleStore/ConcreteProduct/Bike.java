package creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.ConcreteProduct;

import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.Product.Vehicle;
import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.Product.VehicleType;

public class Bike implements Vehicle {
	private VehicleType type = VehicleType.BIKE;
	
	public String getType() { return type.name(); }
	
	@Override
	public void getServiced() { System.out.println("Servicing a Bike Order"); }

	@Override
	public void polish() { System.out.println("\tPolishing a Bike"); }

	@Override
	public void provideClearance() { System.out.println("\tProviding Clearance for a Bike"); }
}
