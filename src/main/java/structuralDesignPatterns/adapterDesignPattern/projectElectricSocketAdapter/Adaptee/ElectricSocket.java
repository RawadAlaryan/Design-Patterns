package structuralDesignPatterns.adapterDesignPattern.projectElectricSocketAdapter.Adaptee;

import structuralDesignPatterns.adapterDesignPattern.projectElectricSocketAdapter.InterfaceAdapter.Volts;

public class ElectricSocket {
    public Volts provideFixed220Voltage() { return new Volts(220); }
}
