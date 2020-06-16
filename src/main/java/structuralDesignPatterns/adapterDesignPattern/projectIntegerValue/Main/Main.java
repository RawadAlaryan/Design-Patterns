package structuralDesignPatterns.adapterDesignPattern.projectIntegerValue.Main;

import structuralDesignPatterns.adapterDesignPattern.projectIntegerValue.ConcreteAdapter.ClassAdapter;

//Adapter Design Pattern Integer Value. (Using Class Adapter with multiple-Interfaces).
public class Main {
    public static void main(String[] args) {
        System.out.println("Adapter Design Pattern Integer Value. (Using Class Adapter with multiple-Interfaces).");
        
        ClassAdapter adapter =new ClassAdapter();
        System.out.println("Class Adapter is returning :\t" + adapter.getInteger());
    }
}
