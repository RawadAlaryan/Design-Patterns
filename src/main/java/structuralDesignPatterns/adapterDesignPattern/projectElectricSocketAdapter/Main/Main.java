package structuralDesignPatterns.adapterDesignPattern.projectElectricSocketAdapter.Main;

import structuralDesignPatterns.adapterDesignPattern.projectElectricSocketAdapter.Client.ElectricDevice;
import structuralDesignPatterns.adapterDesignPattern.projectElectricSocketAdapter.InterfaceAdapter.Volts;

//Adapter Design Pattern Socket Adapter.
//Electric Devices Clients uses a Concrete Electric Socket Adapter from the ElectricSocket Interface instead of using an old ElectricSocket Adaptee.
public class Main {
    public static void main(String[] args) {
    	System.out.println("Adapter Design Pattern Socket Adapter.");
    	System.out.println("Client uses a Concrete Electric Socket Adapter from the ElectricSocket Interface instead of using an old ElectricSocket:\n");

    	//Creating some Electric Devices:
    	System.out.println("Creating some Electric Devices:");
    	ElectricDevice fridge = new ElectricDevice("Fridge", new Volts(120));
    	ElectricDevice laptop = new ElectricDevice("Laptop", new Volts(12));
    	ElectricDevice cellphone = new ElectricDevice("Cellphone", new Volts(5));
    	
    	//Plugging In the Electric Devices:
    	System.out.println("\n\nPlugging In the Electric Devices:");
    	fridge.pluginElectricalDevice();
    	laptop.pluginElectricalDevice();
    	cellphone.pluginElectricalDevice();
    	
    	//Unplugging In the Electric Devices:
    	System.out.println("\n\nUnplugging In the Electric Devices:");
    	fridge.unplugElectricalDevice();
    	laptop.unplugElectricalDevice();
    	cellphone.unplugElectricalDevice();
    }

}
