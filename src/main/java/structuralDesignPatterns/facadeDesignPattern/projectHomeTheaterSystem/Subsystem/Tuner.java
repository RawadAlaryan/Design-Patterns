package structuralDesignPatterns.facadeDesignPattern.projectHomeTheaterSystem.Subsystem;

public class Tuner {
	private String description;
	private Amplifier amplifier;
	private double frequency;

	public Tuner(String description, Amplifier amplifier) {
		this.description = description;
	}
	
	public Amplifier getAmplifier() { 	return amplifier; }

	public double getFrequency() { return frequency; }

	public void on() { System.out.println(description + " on"); }

	public void off() { System.out.println(description + " off"); }

	public void setFrequency(double frequency) {
		System.out.println(description + " setting frequency to " + frequency);
		this.frequency = frequency;
	}

	public void setAm() {
		System.out.println(description + " setting AM mode");
	}

	public void setFm() {
		System.out.println(description + " setting FM mode");
	}

	public String toString() {
		return description;
	}
}
