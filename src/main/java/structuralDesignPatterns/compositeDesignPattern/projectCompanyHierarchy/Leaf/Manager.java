package structuralDesignPatterns.compositeDesignPattern.projectCompanyHierarchy.Leaf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import structuralDesignPatterns.compositeDesignPattern.projectCompanyHierarchy.Component.Employee;

public class Manager implements Employee {
    private String name;
    private long empId;
    private String position;
    
    private List<Employee> employeeList = new ArrayList<Employee>();
    private double salary;
    
    public Manager(long empId, String name, String position)  {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }
    
    public Manager(long empId, String name, String position, double salary) {
    	this.empId = empId;
    	this.name = name;
    	this.position = position;
        this.salary = salary;
    }

    @Override
    public void showEmployeeDetails()   {
    	System.out.println("\tID: " + empId + "\tName: " + name + "\tPosition: " + position);

        Iterator<Employee> employeeIterator = employeeList.iterator();
        while(employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            employee.showEmployeeDetails();
        }
    }
    
    public Employee getChild(int i) { return employeeList.get(i); }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public void addEmployee(Employee emp) { employeeList.add(emp); }
    public void removeEmployee(Employee emp) { employeeList.remove(emp); }
}
