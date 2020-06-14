package creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.ConcreteProduct;

import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.Product.Vehicle;
import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.Product.VehicleType;

public class Crane implements Vehicle {
	private VehicleType type = VehicleType.CRANE;
	
	public String getType() { return type.name(); }
	
	@Override
	public void getServiced() { System.out.println("Servicing a Crane Order"); }

	@Override
	public void polish() { System.out.println("\tPolishing a Crane"); }

	@Override
	public void provideClearance() { System.out.println("\tProviding Clearance for a Crane"); }
}
