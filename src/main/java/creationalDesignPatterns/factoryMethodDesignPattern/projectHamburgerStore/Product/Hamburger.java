package creationalDesignPatterns.factoryMethodDesignPattern.projectHamburgerStore.Product;

public abstract class Hamburger {
    public String type;
    public String sauce;
    public String buns;

    public String getType() { return type; }
    public String getSauce() { return sauce; }
    public String getBuns() { return buns; }
    
    public void prepare(){
        System.out.println("Preparing the " + type);
        System.out.println("\tAdding sauce ... " + sauce);
        System.out.println("\tAdding buns ... " + buns);
    }
    
    public void cook() { System.out.println("\tCooking The Hamburger."); }
    
    public void box() { System.out.println("\tBoxing The Hamburger."); }
}
