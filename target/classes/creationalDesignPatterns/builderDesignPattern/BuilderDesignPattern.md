### Builder Design Pattern:
- It is a Creational Design Pattern. 
- It separates object complex construction from its representation.
- The construction process can create different representations.
- In Java JDK, The class StringBuilder uses the Builder Design Pattern.


### Builder Design Pattern Class has the following elements:
1. Builder
2. Client   


### Advantages Builder Design Pattern:
- Encapsulates the way a complex object is constructed.
- Allows object construction in multi step and varying process.
- Hides internal representation of product from client. 


### Disadvantages Builder Design Pattern:
- Used for building composite structures.
- Constructing an object requires domain knowledge of the client.
- Requires some amount of code duplication.


#### Examples and Projects:
- Project:	[The User Builder.](/src/main/java/creationalDesignPatterns/abstractFactoryDesignPattern/projectUserBuilder/Main/Main.java)
- Project:	[The Pizza Builder.](/src/main/java/creationalDesignPatterns/abstractFactoryDesignPattern/projectPizzaBuilder/Main/Main.java)
- Project:	[The Vehicle Builder.](/src/main/java/creationalDesignPatterns/abstractFactoryDesignPattern/projectVehicleBuilder/Main/Main.java)
- Project:	[The Meal Builder.](/src/main/java/creationalDesignPatterns/abstractFactoryDesignPattern/projectMealBuilder/Main/Main.java)
