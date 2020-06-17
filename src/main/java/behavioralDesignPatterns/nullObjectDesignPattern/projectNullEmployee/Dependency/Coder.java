package behavioralDesignPatterns.nullObjectDesignPattern.projectNullEmployee.Dependency;

import behavioralDesignPatterns.nullObjectDesignPattern.projectNullEmployee.DependencyBase.Employee;

public class Coder extends Employee {
    public Coder(String name) { this.name = name; } 
    
    @Override
    public String getName() { return "\t" + name; } 
    
    @Override
    public boolean isNull() { return false; } 
}
