package creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.Main;

import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.ConcreteProduct.Bike;
import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.ConcreteProduct.Car;
import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.ConcreteProduct.Crane;
import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.ConcreteProduct.Truck;
import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.ConcreteSubFactory.HeavyVehicleStore;
import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.ConcreteSubFactory.LightVehicleStore;
import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.Factory.VehicleStore;
import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.Product.Vehicle;
import creationalDesignPatterns.factoryMethodDesignPattern.vehicleStore.Product.VehicleType;

//Factory Method Design Pattern Vehicle Store.
//Vehicle Store defines a Factory Method for creating different vehicles (Bike, Car, Truck, Crane) in its Specialized-Stores (LightVeihcleStore, HeavyVehicleStore).
public class Main {
	
	public static void main(String[] args) {
		System.out.println("Factory Method Design Pattern Vehicle Store.");
		System.out.println("Vehicle Store defines a Factory Method for creating different vehicles (Bike, Car, Truck, Crane) in its Specialized-Stores (LightVeihcleStore, HeavyVehicleStore):\n");
        VehicleStore lightVehicleStore = new LightVehicleStore();
        System.out.println("The Light Vehicle Store is Ready for Orders!");
        VehicleStore heavyVehicleStore = new HeavyVehicleStore();
        System.out.println("The Heavy Vehicle Store is Ready for Orders!\n");
        		
        //Let's take some orders from our light vehicles clients:
        System.out.println("Placing an Order for a Bike:");
        Vehicle bike = lightVehicleStore.orderVehicle(VehicleType.BIKE);
        System.out.println("\tOrder for " + ((Bike)bike).getType() + " is ready!\n" );
        System.out.println("Placing an Order for a Car:");
        Vehicle car = lightVehicleStore.orderVehicle(VehicleType.CAR);
        System.out.println("\tOrder for " + ((Car)car).getType() + " is ready!\n" );
        
        //Let's take some orders from our heavy vehicles clients:
        System.out.println("Placing an Order for a Truck:");
        Vehicle truck = heavyVehicleStore.orderVehicle(VehicleType.TRUCK);
        System.out.println("\tOrder for " + ((Truck)truck).getType() + " is ready!\n" );
        System.out.println("Placing an Order for a Crane:");
        Vehicle crane = heavyVehicleStore.orderVehicle(VehicleType.CRANE);
        System.out.println("\tOrder for " + ((Crane)crane).getType() + " is ready!\n" );
    }
	
}
