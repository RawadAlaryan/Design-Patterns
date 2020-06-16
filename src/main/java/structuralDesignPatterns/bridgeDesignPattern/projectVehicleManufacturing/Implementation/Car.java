package structuralDesignPatterns.bridgeDesignPattern.projectVehicleManufacturing.Implementation;

import structuralDesignPatterns.bridgeDesignPattern.projectVehicleManufacturing.Abstraction.Vehicle;
import structuralDesignPatterns.bridgeDesignPattern.projectVehicleManufacturing.Abstraction.WorkShop;

public class Car extends Vehicle{
	public String type = "Car";
	
    public Car(WorkShop makeWorkShop, WorkShop assembleWorkShop) {
        super("Car", makeWorkShop, assembleWorkShop);
    }

    @Override
    public void manufacture() {
        makeWorkShop.doWorkInWorkShop(this);
        assembleWorkShop.doWorkInWorkShop(this);
    }
}
