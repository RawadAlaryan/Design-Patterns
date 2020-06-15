package creationalDesignPatterns.builderDesignPattern.projectVehicleBuilder.Main;

import creationalDesignPatterns.builderDesignPattern.projectVehicleBuilder.Builder.VehicleBuilderInterface;

public class Director {
    VehicleBuilderInterface myBuilder;

    public void construct(VehicleBuilderInterface builder) {
        myBuilder = builder;
        myBuilder.buildBody();
        myBuilder.insertWheels();
        myBuilder.addHeadlights();
    }
}
