package structuralDesignPatterns.bridgeDesignPattern.projectVehicleManufacturing.Main;

import structuralDesignPatterns.bridgeDesignPattern.projectVehicleManufacturing.Abstraction.Vehicle;
import structuralDesignPatterns.bridgeDesignPattern.projectVehicleManufacturing.Implementation.AssembleWorkShop;
import structuralDesignPatterns.bridgeDesignPattern.projectVehicleManufacturing.Implementation.Bike;
import structuralDesignPatterns.bridgeDesignPattern.projectVehicleManufacturing.Implementation.Car;
import structuralDesignPatterns.bridgeDesignPattern.projectVehicleManufacturing.Implementation.MakeWorkShop;

//Bridge Design Pattern Vehicle Manufacturing.
//Vehicle Manufacturing using a Bridge between Vehicles and different Workshops.
public class Main {
    public static void main(String[] args) {
    	System.out.println("Bridge Design Pattern Vehicle Manufacturing.");
    	System.out.println("Vehicle Manufacturing using a Bridge between Vehicles and different Workshops:\n");

    	System.out.println("Manufacturing a BMW Car:");
    	Vehicle bmw = new Car(new MakeWorkShop(), new AssembleWorkShop());
        bmw.manufacture();

        System.out.println("\nManufacturing a BMX Bike:");
        Vehicle bmx = new Bike(new MakeWorkShop(), new AssembleWorkShop());
        bmx.manufacture();
    }
}
