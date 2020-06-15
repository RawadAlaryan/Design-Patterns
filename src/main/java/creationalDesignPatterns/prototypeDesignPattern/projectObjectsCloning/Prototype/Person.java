package creationalDesignPatterns.prototypeDesignPattern.projectObjectsCloning.Prototype;

public class Person implements Prototype {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    @Override
    public Prototype clone() { return new Person(name, age); }

    @Override
    public String toString() { return "\n\tPerson name: " + name + "\t\tage: " + age + "\t\thashcode: " + this.hashCode(); }
    
    /**
    public class Person implements Cloneable {
	   @Override
	    public Person clone() {
	        System.out.println("Creating Clone Person.");
	        Person person = null; 
	        try { person = (Person) super.clone(); } 
	        catch (CloneNotSupportedException e) { e.printStackTrace(); }
		    return person;
	    }
	} 
    */
}
