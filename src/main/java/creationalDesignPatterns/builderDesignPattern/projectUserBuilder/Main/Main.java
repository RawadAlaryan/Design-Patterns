package creationalDesignPatterns.builderDesignPattern.projectUserBuilder.Main;

import creationalDesignPatterns.builderDesignPattern.projectUserBuilder.Builder.User;

//Builder Design Pattern User Builder.
//Building a customized User by using the UserBuilder Class.
public class Main {
	  public static void main(String[] args) {
		  System.out.println("Builder Design Pattern User Builder.");
		  System.out.println("Building a customized User by using the UserBuilder Class:\n");
		  
		  User James = new User.UserBuilder("James", "Bond")
	               					.phoneNumber("007")
	               					.age(40)
	               					.address("London, Britain")
	               					.build();
		  
		  System.out.println(James);
	  }
}
