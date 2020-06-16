package structuralDesignPatterns.adapterDesignPattern.projectElectricSocketAdapter.ConcreteAdapter;

import structuralDesignPatterns.adapterDesignPattern.projectElectricSocketAdapter.Adaptee.ElectricSocket;
import structuralDesignPatterns.adapterDesignPattern.projectElectricSocketAdapter.InterfaceAdapter.ElectricSocketInterface;
import structuralDesignPatterns.adapterDesignPattern.projectElectricSocketAdapter.InterfaceAdapter.Volts;

public class ElectricSocketAdapter extends ElectricSocket implements ElectricSocketInterface {
    /**
	We can use Composition for Adapter Design Pattern. 
	We use an Object from ElectricSocket inside this Adapter Class instead of extending ElectricSocket Class.
    private ElectricSocket socket = new ElectricSocket();
	*/
	
	@Override
    public Volts provide120Volts() { 
        Volts v = provideFixed220Voltage();
        System.out.println("\tVoltage from Socket is: " + v.getVolts() + " volts.");
        Volts convertedVoltage = convertVoltage(v, 1.8333); 
        System.out.println("\tVoltage is converted from " + v.getVolts() + " volts to " + convertedVoltage.getVolts() + " volts.");
        return convertedVoltage;
	}

    @Override
    public Volts provide12Volts() {
        Volts v = provideFixed220Voltage();
        System.out.println("\tVoltage from Socket is: " + v.getVolts() + " volts.");
        Volts convertedVoltage = convertVoltage(v, 18.3333); 
        System.out.println("\tVoltage is converted from " + v.getVolts() + " volts to " + convertedVoltage.getVolts() + " volts.");
        return convertedVoltage;
    }

    @Override
    public Volts provide5Volts() { 
        Volts v = provideFixed220Voltage();
        System.out.println("\tVoltage from Socket is: " + v.getVolts() + " volts.");
        Volts convertedVoltage = convertVoltage(v, 44); 
        System.out.println("\tVoltage is converted from " + v.getVolts() + " volts to " + convertedVoltage.getVolts() + " volts.");
        return convertedVoltage;
    }

    private Volts convertVoltage(Volts v, double d) { return new Volts( (int) (v.getVolts() / d) ); }
}
