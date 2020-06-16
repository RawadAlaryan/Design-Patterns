package structuralDesignPatterns.privateClassDataDesignPattern.projectStewMaking.MainClass;

public class Stew {
	private int numPotatoes;
	private int numCarrots;
	private int numMeat;
	private int numPeppers;

	//Constructor:
	public Stew(int numPotatoes, int numCarrots, int numMeat, int numPeppers) {
		this.numPotatoes = numPotatoes;
		this.numCarrots = numCarrots;
		this.numMeat = numMeat;
	    this.numPeppers = numPeppers;
	}

	public void mix() {
		System.out.printf("\tMixing the Stew: \n\t\t%d potatoes, %d carrots, %d meat and %d peppers.\n", 
				numPotatoes, numCarrots, numMeat, numPeppers);
	}

	public void taste() {
		System.out.println("\tTasting the Stew");
	    if (numPotatoes > 0) { numPotatoes--; }
	    if (numCarrots > 0) { numCarrots--; }
	    if (numMeat > 0) { numMeat--; }
	    if (numPeppers > 0) { numPeppers--; }
	}
}
