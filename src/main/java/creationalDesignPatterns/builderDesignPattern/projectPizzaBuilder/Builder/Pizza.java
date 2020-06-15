package creationalDesignPatterns.builderDesignPattern.projectPizzaBuilder.Builder;

public class Pizza {
    private String dough = "";
    private String sauce = "";
    private String topping = "";
    
    public String getDough() { return dough; }
	public String getSauce() { return sauce; }
	public String getTopping() { return topping; }

	public void setDough(String dough) { this.dough = dough; }
    public void setSauce(String sauce) { this.sauce = sauce; }
    public void setTopping(String topping) { this.topping = topping; }
    
    @Override
    public String toString() {
    	return "\tThe Pizza has:\n" + "\t" + dough + " dough\n"
    			+ "\t" + sauce + " sauce\n"
    			+ "\t" + topping + " topping\n";
    }
}
