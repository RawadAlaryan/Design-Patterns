package structuralDesignPatterns.proxyDesignPattern.projectWebServerProtectionProxy.Main;

import structuralDesignPatterns.proxyDesignPattern.projectWebServerProtectionProxy.Proxy.ProxyWebServer;
import structuralDesignPatterns.proxyDesignPattern.projectWebServerProtectionProxy.Subject.WebServer;

//Proxy Design Pattern Web Server  - Protection Proxy Type.
//Using a ProxyWebServer instead of Concrete Web Server to manage web requests.
public class Main {
	public static void main(String[] args) {
		System.out.println("Proxy Design Pattern Web Server  - Protection Proxy Type.");
		System.out.println("Using a ProxyWebServer instead of Concrete Web Server to manage web requests.\n");
		
		WebServer server = new ProxyWebServer();
		System.out.println("Making a Request to\t\twww.concordia.ca");
		server.makeRequest("www.concordia.ca");
	
		//Using Proxy Server to block a website:
		((ProxyWebServer) server).blockWebsite("www.facebook.com");
		
		System.out.println("\nMaking a Request to\t\twww.facebook.com");
		server.makeRequest("www.facebook.com"); 
	}
}
