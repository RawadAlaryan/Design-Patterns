package creationalDesignPatterns.builderDesignPattern.projectPizzaBuilder.Builder;

public class MexicanPizzaBuilder extends PizzaBuilder {
    public void buildDough() { pizza.setDough("pan baked"); }

    public void buildSauce() { pizza.setSauce("mexican"); }

    public void buildTopping() { pizza.setTopping("ground beef and jalapeno"); }
}
