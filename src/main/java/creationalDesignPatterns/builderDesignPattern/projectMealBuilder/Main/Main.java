package creationalDesignPatterns.builderDesignPattern.projectMealBuilder.Main;

import creationalDesignPatterns.builderDesignPattern.projectMealBuilder.Builder.Meal;
import creationalDesignPatterns.builderDesignPattern.projectMealBuilder.Builder.MealBuilderInterface;
import creationalDesignPatterns.builderDesignPattern.projectMealBuilder.Builder.NonVeganMealBuilder;
import creationalDesignPatterns.builderDesignPattern.projectMealBuilder.Builder.VeganMealBuilder;

//Builder Design Pattern Meal Builder.
//Building a customized Meal (Burger, Drink) by using the MealBuilder Class.
public class Main {
    public static void main(String [] args) {
    	System.out.println("Builder Design Pattern Meal Builder.");
    	System.out.println("Building a customized Meal (Burger, Drink) by using the MealBuilder Class:\n");
		
        Director director = new Director();

        MealBuilderInterface vegMealBuilder = new VeganMealBuilder();
        MealBuilderInterface nonVegMealBuilder = new NonVeganMealBuilder();

        //Making a Vegan Meal:
        director.construct(vegMealBuilder);
        Meal vegMeal = vegMealBuilder.getMeal();

        System.out.println("Vegan Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        //Making Non-Vegan Meal:
        director.construct(nonVegMealBuilder);
        Meal nonVegMeal = nonVegMealBuilder.getMeal();

        System.out.println("\n\nNon-Vegan Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
