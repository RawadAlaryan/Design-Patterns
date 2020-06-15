package creationalDesignPatterns.builderDesignPattern.projectVehicleBuilder.Builder;

public interface VehicleBuilderInterface {
    void buildBody();
    void insertWheels();
    void addHeadlights();
    Product getVehicle();
}





