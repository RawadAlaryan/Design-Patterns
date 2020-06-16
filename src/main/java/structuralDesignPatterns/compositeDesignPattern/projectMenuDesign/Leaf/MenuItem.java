package structuralDesignPatterns.compositeDesignPattern.projectMenuDesign.Leaf;

import structuralDesignPatterns.compositeDesignPattern.projectMenuDesign.Component.MenuComponent;

public class MenuItem extends MenuComponent {

    public MenuItem(String name, String url) { super(name, url); }

    @Override
    public void displayMenu() {
        System.out.println("\t" + getName() + " : " + getUrl());
    }       
}
