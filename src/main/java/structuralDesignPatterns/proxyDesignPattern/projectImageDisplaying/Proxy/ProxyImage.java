package structuralDesignPatterns.proxyDesignPattern.projectImageDisplaying.Proxy;

import structuralDesignPatterns.proxyDesignPattern.projectImageDisplaying.RealSubject.RealImage;
import structuralDesignPatterns.proxyDesignPattern.projectImageDisplaying.Subject.Image;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) { this.fileName = fileName; }

    @Override
    public void display() {
        if (realImage == null) { realImage = new RealImage(fileName); }
        realImage.display();
    }
}
