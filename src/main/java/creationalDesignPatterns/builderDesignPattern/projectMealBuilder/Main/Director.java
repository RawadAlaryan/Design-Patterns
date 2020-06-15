package creationalDesignPatterns.builderDesignPattern.projectMealBuilder.Main;

import creationalDesignPatterns.builderDesignPattern.projectMealBuilder.Builder.MealBuilderInterface;

class Director {
    MealBuilderInterface myBuilder;

    public void construct(MealBuilderInterface builder) {
        myBuilder = builder;
        myBuilder.buildBurger();
        myBuilder.buildDrink();
    }
}
