### Builder Design Pattern:
- It is a Creational Design Pattern. 
- It separates object complex construction from its representation.
- The construction process can create different representations.
- In Java JDK, The class StringBuilder uses the Builder Design Pattern.


### Builder Design Pattern Class has the following elements:
1. Builder
2. Client as Main Method.  


### Advantages Builder Design Pattern:
- Encapsulates the way a complex object is constructed.
- Allows object construction in multi step and varying process.
- Hides internal representation of product from client. 


### Disadvantages Builder Design Pattern:
- Used for building composite structures.
- Constructing an object requires domain knowledge of the client.
- Requires some amount of code duplication.


#### Examples and Projects:
- Project:	[User Builder.](/src/main/java/creationalDesignPatterns/builderDesignPattern/projectUserBuilder/Main/Main.java)
- Project:	[Pizza Builder.](/src/main/java/creationalDesignPatterns/builderDesignPattern/projectPizzaBuilder/Main/Main.java)
- Project:	[Vehicle Builder.](/src/main/java/creationalDesignPatterns/builderDesignPattern/projectVehicleBuilder/Main/Main.java)
- Project:	[Meal Builder.](/src/main/java/creationalDesignPatterns/builderDesignPattern/projectMealBuilder/Main/Main.java)
