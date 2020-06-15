package creationalDesignPatterns.builderDesignPattern.projectVehicleBuilder.Builder;

public class MotorCycle implements VehicleBuilderInterface {
    private Product product = new Product();

    @Override
    public void buildBody() { product.add("\tThis is a body of a Motorcycle."); }

    @Override
    public void insertWheels() { product.add("\t2 wheels are added."); }

    @Override
    public void addHeadlights()  { product.add("\t1 Headlight has been added."); }

    @Override
    public Product getVehicle() { return product; }
}
