package structuralDesignPatterns.bridgeDesignPattern.projectVehicleManufacturing.Implementation;

import structuralDesignPatterns.bridgeDesignPattern.projectVehicleManufacturing.Abstraction.Vehicle;
import structuralDesignPatterns.bridgeDesignPattern.projectVehicleManufacturing.Abstraction.WorkShop;

public class Bike extends Vehicle {
	public String type = "Bike";
	
	public Bike(WorkShop makeWorkShop, WorkShop assembleWorkShop) {
        super("Bike", makeWorkShop, assembleWorkShop);
    }

    @Override
    public void manufacture() {
        makeWorkShop.doWorkInWorkShop(this);
        assembleWorkShop.doWorkInWorkShop(this);
    }
}
