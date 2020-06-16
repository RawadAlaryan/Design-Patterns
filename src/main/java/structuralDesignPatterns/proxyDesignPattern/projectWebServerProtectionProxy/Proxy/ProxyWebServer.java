package structuralDesignPatterns.proxyDesignPattern.projectWebServerProtectionProxy.Proxy;

import java.util.ArrayList;
import java.util.List;

import structuralDesignPatterns.proxyDesignPattern.projectWebServerProtectionProxy.RealSubject.ConcreteWebServer;
import structuralDesignPatterns.proxyDesignPattern.projectWebServerProtectionProxy.Subject.WebServer;

public class ProxyWebServer implements WebServer {
    private ConcreteWebServer concreteWebServer;
    private List<String> blockedWebSites = new ArrayList<String>();

    public ProxyWebServer() { this.concreteWebServer = new ConcreteWebServer(); }

    public void blockWebsite(String url) { this.blockedWebSites.add(url); }

    @Override
    public void makeRequest(String url) {
        if(!blockedWebSites.contains(url)) { 
        	System.out.println("\tRequest is being made by the Proxy Server.");
        	this.concreteWebServer.makeRequest(url); }
        else { System.out.println("\tThis website is blocked by the Proxy Server.\n\tContact your administrator."); }
    }
}