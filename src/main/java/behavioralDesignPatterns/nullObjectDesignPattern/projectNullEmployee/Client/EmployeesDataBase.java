package behavioralDesignPatterns.nullObjectDesignPattern.projectNullEmployee.Client;

import behavioralDesignPatterns.nullObjectDesignPattern.projectNullEmployee.Dependency.Coder;
import behavioralDesignPatterns.nullObjectDesignPattern.projectNullEmployee.DependencyBase.Employee;
import behavioralDesignPatterns.nullObjectDesignPattern.projectNullEmployee.NullObject.NoClient;

public class EmployeesDataBase {
    public static final String[] names = {"Edward", "Mary", "Carla"};
    
    public static Employee getClient(String name) { 
        for (int i = 0; i < names.length; i++) { 
            if (names[i].equalsIgnoreCase(name)) { return new Coder(name); } 
        } 
        return new NoClient(); 
    }
}
