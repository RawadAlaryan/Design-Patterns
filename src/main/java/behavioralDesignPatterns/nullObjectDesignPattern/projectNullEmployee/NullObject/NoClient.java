package behavioralDesignPatterns.nullObjectDesignPattern.projectNullEmployee.NullObject;

import behavioralDesignPatterns.nullObjectDesignPattern.projectNullEmployee.DependencyBase.Employee;

public class NoClient extends Employee {
    @Override
    public String getName() { return "\tNot Available"; } 
  
    @Override
    public boolean isNull() { return true; }
}
