package creationalDesignPatterns.prototypeDesignPattern.projectObjectsCloning.Main;

import creationalDesignPatterns.prototypeDesignPattern.projectObjectsCloning.Prototype.Person;

//Prototype Design Pattern Cloning Objects.
//Using a Prototype object to clone other similar objects.
public class Main {
    public static void main(String[] args) {
    	System.out.println("Prototype Design Pattern Cloning Objects.");
    	System.out.println("Using a Prototype object to clone other similar objects:\n");
    	
        Person person = new Person("Rawad", 35);
        System.out.println("Person: " + person);

        Person clonedPerson = (Person) person.clone();
        clonedPerson.setName("RawadClone");
        System.out.println("\nPerson cloned: " + clonedPerson);
    }
}
