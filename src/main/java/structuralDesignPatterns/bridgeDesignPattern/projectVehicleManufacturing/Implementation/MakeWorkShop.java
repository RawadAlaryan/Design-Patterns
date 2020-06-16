package structuralDesignPatterns.bridgeDesignPattern.projectVehicleManufacturing.Implementation;

import structuralDesignPatterns.bridgeDesignPattern.projectVehicleManufacturing.Abstraction.Vehicle;
import structuralDesignPatterns.bridgeDesignPattern.projectVehicleManufacturing.Abstraction.WorkShop;

public class MakeWorkShop implements WorkShop {
    @Override
    public void doWorkInWorkShop(Vehicle vehicle) {
        System.out.println("\tMaking a " + vehicle.type + " in MakeWorkShop.");
    }
}
