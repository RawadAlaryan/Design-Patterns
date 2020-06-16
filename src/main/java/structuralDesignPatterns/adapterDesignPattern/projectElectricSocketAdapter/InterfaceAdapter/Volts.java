package structuralDesignPatterns.adapterDesignPattern.projectElectricSocketAdapter.InterfaceAdapter;

public class Volts {
    private int volts;

    public Volts(int volts) { this.volts = volts; }

    public int getVolts() { return volts; }

    public void setVolts(int volts) { this.volts = volts; }
}
