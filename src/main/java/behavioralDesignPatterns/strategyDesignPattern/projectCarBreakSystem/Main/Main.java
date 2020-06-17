package behavioralDesignPatterns.strategyDesignPattern.projectCarBreakSystem.Main;

import behavioralDesignPatterns.strategyDesignPattern.projectCarBreakSystem.Context.Car;
import behavioralDesignPatterns.strategyDesignPattern.projectCarBreakSystem.Context.SUV;
import behavioralDesignPatterns.strategyDesignPattern.projectCarBreakSystem.Context.Sedan;

//Strategy Design Pattern Car Break System.
//BrakeSystem is a generalized Strategy that is implemented by different types of Concrete BrakeSystems used by Contexts of Cars.
public class Main {

	public static void main(String[] args) {
        System.out.println("Strategy Design Pattern Car Break System:");
        System.out.println("BrakeSystem is a generalized Strategy that is implemented by different types of Concrete BrakeSystems used by Contexts of Cars.\n");
		Car sedanCar = new Sedan();
        sedanCar.applyBrake();  // This will invoke class "Brake"

        Car suvCar = new SUV();
        suvCar.applyBrake();    // This will invoke class "BrakeWithABS"
	}
}
