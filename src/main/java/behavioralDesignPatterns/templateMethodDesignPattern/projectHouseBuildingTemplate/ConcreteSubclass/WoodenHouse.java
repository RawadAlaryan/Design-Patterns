package behavioralDesignPatterns.templateMethodDesignPattern.projectHouseBuildingTemplate.ConcreteSubclass;

import behavioralDesignPatterns.templateMethodDesignPattern.projectHouseBuildingTemplate.Template.HouseTemplate;

public class WoodenHouse extends HouseTemplate {
    @Override
    public void buildWalls() { System.out.println("Building Wooden Walls"); }

    @Override
    public void buildPillars() { System.out.println("Building Pillars with Wood coating"); }
}
