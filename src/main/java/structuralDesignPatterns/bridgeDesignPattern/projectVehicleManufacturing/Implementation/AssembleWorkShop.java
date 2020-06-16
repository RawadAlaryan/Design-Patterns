package structuralDesignPatterns.bridgeDesignPattern.projectVehicleManufacturing.Implementation;

import structuralDesignPatterns.bridgeDesignPattern.projectVehicleManufacturing.Abstraction.Vehicle;
import structuralDesignPatterns.bridgeDesignPattern.projectVehicleManufacturing.Abstraction.WorkShop;

public class AssembleWorkShop  implements WorkShop{
    @Override
    public void doWorkInWorkShop(Vehicle vehicle) {
    	System.out.println("\tAssembling a " + vehicle.type + "in AssembleWorkShop.");
    }
}
