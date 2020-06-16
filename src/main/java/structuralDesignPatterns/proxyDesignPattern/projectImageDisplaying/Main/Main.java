package structuralDesignPatterns.proxyDesignPattern.projectImageDisplaying.Main;

import structuralDesignPatterns.proxyDesignPattern.projectImageDisplaying.Proxy.ProxyImage;
import structuralDesignPatterns.proxyDesignPattern.projectImageDisplaying.Subject.Image;

//Proxy Design Pattern Image Displaying.
//Using a ProxyImage instead of RealImage to be loaded from Disk and displayed.
public class Main {
	public static void main(String[] args) {
		System.out.println("Proxy Design Pattern Image Displaying.");
		System.out.println("Using a ProxyImage instead of RealImage to be loaded from Disk and displayed:\n");

        System.out.println("Loading and Displaying image for the first time..");
        Image image  = new ProxyImage("image.jpg");
        //Image will be loaded from disk
        image.display();
        
        System.out.println("Displaying the cached pre-loaded image.");
        image.display();
	}
}
