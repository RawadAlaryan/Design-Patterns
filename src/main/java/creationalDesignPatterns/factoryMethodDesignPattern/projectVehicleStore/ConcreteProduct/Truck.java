package creationalDesignPatterns.factoryMethodDesignPattern.projectVehicleStore.ConcreteProduct;

import creationalDesignPatterns.factoryMethodDesignPattern.projectVehicleStore.Product.Vehicle;
import creationalDesignPatterns.factoryMethodDesignPattern.projectVehicleStore.Product.VehicleType;

public class Truck implements Vehicle {
	private VehicleType type = VehicleType.TRUCK;
	
	public String getType() { return type.name(); }
	
	@Override
	public void getServiced() { System.out.println("Servicing a Truck Order"); }

	@Override
	public void polish() { System.out.println("\tPolishing a Truck"); }

	@Override
	public void provideClearance() { System.out.println("\tProviding Clearance for a Truck"); }
}
