package structuralDesignPatterns.bridgeDesignPattern.projectVehicleManufacturing.Abstraction;

public abstract class Vehicle {
    protected WorkShop makeWorkShop;
    protected WorkShop assembleWorkShop;
    public String type;
    
    public Vehicle(String type, WorkShop makeWorkShop, WorkShop assembleWorkShop) {
        this.makeWorkShop = makeWorkShop;
        this.assembleWorkShop = assembleWorkShop;
        this.type = type;
    }

    abstract public void manufacture();
}
