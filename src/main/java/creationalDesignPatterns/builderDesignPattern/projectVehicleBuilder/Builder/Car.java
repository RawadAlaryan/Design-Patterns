package creationalDesignPatterns.builderDesignPattern.projectVehicleBuilder.Builder;

public class Car implements VehicleBuilderInterface {
    private Product product = new Product();

    @Override
    public void buildBody() { product.add("\tThis is a body of a car."); }

    @Override
    public void insertWheels() { product.add("\t4 wheels are added."); }

    @Override
    public void addHeadlights() { product.add("\t2 headlights are added."); }

    @Override
    public Product getVehicle() { return product; }
}
