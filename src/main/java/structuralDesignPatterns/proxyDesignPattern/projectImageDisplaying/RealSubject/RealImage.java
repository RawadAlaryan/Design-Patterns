package structuralDesignPatterns.proxyDesignPattern.projectImageDisplaying.RealSubject;

import structuralDesignPatterns.proxyDesignPattern.projectImageDisplaying.Subject.Image;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(this.fileName);
    }

    private void loadFromDisk(String fileName) { System.out.println("\tLoading " + fileName); }
    
    @Override
    public void display() { System.out.println("\tDisplaying " + fileName); }
}
