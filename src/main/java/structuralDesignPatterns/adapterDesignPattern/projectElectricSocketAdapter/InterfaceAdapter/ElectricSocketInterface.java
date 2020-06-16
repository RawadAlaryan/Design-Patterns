package structuralDesignPatterns.adapterDesignPattern.projectElectricSocketAdapter.InterfaceAdapter;

public interface ElectricSocketInterface {
	public Volts provide120Volts();

	public Volts provide12Volts();

	public Volts provide5Volts();
}
