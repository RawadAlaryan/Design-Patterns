package structuralDesignPatterns.proxyDesignPattern.projectWebServerProtectionProxy.RealSubject;

import structuralDesignPatterns.proxyDesignPattern.projectWebServerProtectionProxy.Subject.WebServer;

public class ConcreteWebServer implements WebServer {
    @Override
    public void makeRequest(String url) { System.out.println("\tMaking a Request to\t" + url); }
}
