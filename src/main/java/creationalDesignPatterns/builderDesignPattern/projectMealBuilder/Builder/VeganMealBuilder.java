package creationalDesignPatterns.builderDesignPattern.projectMealBuilder.Builder;

public class VeganMealBuilder implements MealBuilderInterface {
    private Meal veganMeal = new Meal();

    @Override
    public void buildBurger() { veganMeal.addItem(new VeganBurger()); }

    @Override
    public void buildDrink() { veganMeal.addItem(new Coke()); }

    @Override
    public Meal getMeal() { return veganMeal; }
}
