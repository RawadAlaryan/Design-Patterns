package creationalDesignPatterns.builderDesignPattern.projectVehicleBuilder.Main;

import creationalDesignPatterns.builderDesignPattern.projectVehicleBuilder.Builder.Car;
import creationalDesignPatterns.builderDesignPattern.projectVehicleBuilder.Builder.MotorCycle;
import creationalDesignPatterns.builderDesignPattern.projectVehicleBuilder.Builder.Product;
import creationalDesignPatterns.builderDesignPattern.projectVehicleBuilder.Builder.VehicleBuilderInterface;

//Builder Design Pattern Vehicle Builder.
//Building a customized Vehicle (Car, MotorCycle) by using the VehicleBuilder Class.
public class Main {
    public static void main(String [] args) {
    	System.out.println("Builder Design Pattern Vehicle Builder.");
    	System.out.println("Building a customized Vehicle (Car, MotorCycle) by using the VehicleBuilder Class:\n");
		  
    	Director director = new Director();

        VehicleBuilderInterface carBuilder = new Car();
        VehicleBuilderInterface motorBuilder = new MotorCycle();

        // making a car
        director.construct(carBuilder);
        Product car = carBuilder.getVehicle();
        car.show();

        // making a motorcycle
        director.construct(motorBuilder);
        Product motorCycle = motorBuilder.getVehicle();
        motorCycle.show();
    }
}
