### Proxy Design Pattern:
- It is a Structural Design Pattern.
- A Proxy is a person authorized to act for another person.
- A Proxy Object is an object representing/wrapping another object. It uses an extra level of indirection to support distributed, controlled, or intelligent access.
- Proxy objects or Surrogates provide a surrogate or placeholder for another object to control access to that object. 
- A Proxy acts as a lightweight intermediary (between client and target object) or the simplified version of the original object. It supports the same operations as the original object but may delegate those requests to the original object to achieve them.
- In Java JDK; Proxy Design Pattern is used in Java Remote Method Invocation package java.rmi.*.


### Proxy Design Pattern has the following elements:
1. <b>Subject:</b> Interface defining the contract for the real subject.
2. <b>Real Subject:</b> Class we want to have a proxy for.
3. <b>Proxy:</b> Proxy class for the real subject. Both Proxy and RealSubject classes implement the Subject interface.
4. <b>Client:</b> Class that interacts with the proxy via the Subject interface.

	
### Proxy Variations:
There are many types of Proxies:
1. <b>Virtual Proxy:</b> It controls access to a resource Object that is expensive to create. We use it when the subject is pretty resource-intensive to instantiate. It allows the creation of a memory-intensive-object on demand just when it is needed.
	Example: Loading High-resolution images on a web page. The idea is to delay the creation of an expensive resource until the time it is needed.
2. <b>Protection Proxy:</b> It controls access to a resource object based on access rights. We use it when we want to control access to our real subject class. 
	Example: Allowing users to access a website based on their specific user roles.
3. <b>Remote Proxy:</b> It controls access to a remote object. It manages interaction between client and a remote object. It provides a reference to an object located in a different address space.
	Example: Google Docs, the web browser holds the proxy objects locally which are then synced with the objects at the remote server.
4. <b>Copy-On-Write Proxy:</b> It defers copying (cloning) a target object until required by client actions. It is a form of Virtual Proxy.
5. <b>Protection Access Proxy:</b> It provides different clients with different levels of access to a target object.
6. <b>Cache Proxy:</b> It provides temporary storage of the results of expensive target operations so that multiple clients can share the results.
7. <b>Firewall Proxy:</b> It protects targets from bad clients or vice versa.
8. <b>Synchronization Proxy:</b> It provides multiple accesses to a target object.
9. <b>Smart Reference Proxy:</b> It provides additional actions whenever a target object is referenced; such as counting number of references to the object.

	
### Proxy Design Pattern vs Decorator Design Pattern:
- Both describe how to provide a level of indirection to an object.
- Both keep a reference to another object to which they forward requests.
- Decorator adds behavior to an object that has only part of the functionality.
- Proxy controls access to an object when it is inconvenient or undesirable to access the object directly.


### Advantages of Proxy Design Pattern:
- Provides security by accessing through a proxy.
- Avoids duplication of objects.
- Increases performance of the application.
	
	
### Disadvantages of Proxy Design Pattern:
- Increase the number of classes and objects in the design.
	

### Examples and Projects:
- Project:	[Web Server - Protection Proxy.](/src/main/java/structuralDesignPatterns/proxyDesignPattern/projectWebServerProtectionProxy/Main/Main.java)
- Project:	[Bank Services - Remote Proxy.](/src/main/java/structuralDesignPatterns/proxyDesignPattern/projectBankServicesRemoteProxy/Main/Main.java)
- Project:	[Image Displaying.](/src/main/java/structuralDesignPatterns/proxyDesignPattern/projectImageDisplaying/Main/Main.java)