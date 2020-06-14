package creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.ConcreteProduct;

import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.Product.Vehicle;
import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.Product.VehicleType;

public class Car implements Vehicle {
	private VehicleType type = VehicleType.CAR;
	
	public String getType() { return type.name(); }
	
	@Override
	public void getServiced() { System.out.println("Servicing a Car Order"); }

	@Override
	public void polish() { System.out.println("\tPolishing a Car"); }

	@Override
	public void provideClearance() { System.out.println("\tProviding Clearance for a Car"); }
}
