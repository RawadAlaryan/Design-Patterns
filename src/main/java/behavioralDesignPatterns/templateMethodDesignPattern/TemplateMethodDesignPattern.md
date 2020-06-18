### Template Method Design Pattern:
- It is a Behavioral Design Pattern.
- It defines the skeleton of an algorithm and it defers the implementation of the algorithm to a subclass.
- Template Algorithm is like a 'placeholder', and derived Sub classes will implement this placeholder.
- It lets sub-classes redefine certain steps of an algorithm without changing the algorithms structure. 
- Template Method is used prominently in frameworks.
- In Java JDK: methods in InputStream, OutputStream, Reader, Writer classes. the JFrame class use the Template Design Pattern.

	
### Template Method Design Pattern has the following elements:
1. <b>Abstract Class (Template):</b> It contains the Template method that defines the skeleton of an algorithm.
2. <b>Concrete SubClass:</b> One or many classes that implement the abstract operations that are called when the template method needs.


Methods Comparison:
1. Concrete Methods: Standard complete methods.
2. Abstract Methods: Methods that contain no implementation. They must be implemented in sub-classes.
3. Hook Methods: Methods that may contain a default implementation, may be overwritten in some sub-classes. 
4. Template Method: A method that calls any other methods in order to describe the algorithm. template method should be final to avoid overwriting it. 


### Examples and Projects:
- Project:	[Essay Writing Template.](/src/main/java/behavioralDesignPatterns/templateMethodDesignPattern/projectEssayWritingTemplate/Main/Main.java)
- Project:	[Game Play Template.](/src/main/java/behavioralDesignPatterns/templateMethodDesignPattern/projectGamePlayTemplate/Main/Main.java)
- Project:	[House Building Template.](/src/main/java/behavioralDesignPatterns/templateMethodDesignPattern/projectHouseBuildingTemplate/Main/Main.java)
- Project:	[Order Process Template.](/src/main/java/behavioralDesignPatterns/templateMethodDesignPattern/projectOrderProcessTemplate/Main/Main.java)