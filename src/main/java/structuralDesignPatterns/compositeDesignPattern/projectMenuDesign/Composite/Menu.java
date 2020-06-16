package structuralDesignPatterns.compositeDesignPattern.projectMenuDesign.Composite;

import java.util.ArrayList;
import java.util.List;

import structuralDesignPatterns.compositeDesignPattern.projectMenuDesign.Component.MenuComponent;

public class Menu extends MenuComponent {
    private List<MenuComponent> subMenus = new ArrayList<MenuComponent>();

    public Menu(String name, String url) { super(name, url); }
    
    @Override
    public void add(MenuComponent menuComponent) {
        this.subMenus.add(menuComponent);
    }

    @Override
    public void displayMenu() {
        System.out.println(getName() + " : " + getUrl());
        this.subMenus.forEach(MenuComponent::displayMenu);
    }
}
