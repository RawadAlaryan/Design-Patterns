package structuralDesignPatterns.privateClassDataDesignPattern.projectStewMaking.MainClass;

import structuralDesignPatterns.privateClassDataDesignPattern.projectStewMaking.DataClass.StewData;

public class ImmutableStew {
	private StewData stewData;

	  public ImmutableStew(int numPotatoes, int numCarrots, int numMeat, int numPeppers) {
		  stewData = new StewData(numPotatoes, numCarrots, numMeat, numPeppers);
	  }

	  public void mix() {
		  System.out.printf("\tMixing the Immutable Stew: \n\t\t%d potatoes, %d carrots, %d meat and %d peppers.\n", 
				  stewData.getNumPotatoes(), stewData.getNumCarrots(), stewData.getNumMeat(), stewData.getNumPeppers());
	  }
}
