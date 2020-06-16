package structuralDesignPatterns.adapterDesignPattern.projectElectricSocketAdapter.Client;

import structuralDesignPatterns.adapterDesignPattern.projectElectricSocketAdapter.ConcreteAdapter.ElectricSocketAdapter;
import structuralDesignPatterns.adapterDesignPattern.projectElectricSocketAdapter.InterfaceAdapter.ElectricSocketInterface;
import structuralDesignPatterns.adapterDesignPattern.projectElectricSocketAdapter.InterfaceAdapter.Volts;

public class ElectricDevice {
	private ElectricSocketInterface electricSocket;
	private String deviceType;
	private Volts deviceVolts;
	
	public ElectricDevice(String deviceType, Volts deviceVolts) {
		this.deviceType = deviceType;
		this.deviceVolts = deviceVolts;
	}
	
	public void pluginElectricalDevice() {
		System.out.println("\tThe Electrical Device " + deviceType + " runs on " + deviceVolts.getVolts() + " volts.");
		useVoltsFromElectricSocket();
		System.out.println("\tThe Electrical Device " + deviceType + " is now PLUGGED-IN !\n");
	}
	
	public void useVoltsFromElectricSocket() {
		electricSocket = new ElectricSocketAdapter();
		
		if(this.deviceVolts.getVolts() == 120) { 
			System.out.println("\tThe Electrical Device " + deviceType + " needs an Electrical Adapter.");
			electricSocket.provide120Volts(); 		
			return; 
		}
		if(this.deviceVolts.getVolts() == 12) { 
			System.out.println("\tThe Electrical Device " + deviceType + " needs an Electrical Adapter.");
			electricSocket.provide12Volts(); 		
			return; 
		}
		if(this.deviceVolts.getVolts() == 5) { 
			System.out.println("\tThe Electrical Device " + deviceType + " needs an Electrical Adapter.");
			electricSocket.provide5Volts(); 		
			return; 
		}
	}
	
	public void unplugElectricalDevice() {
		electricSocket = null;
		System.out.println("\tThe Electrical Device " + deviceType + " is now UNPLUGGED !");
	}
}
