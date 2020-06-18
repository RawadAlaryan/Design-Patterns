package behavioralDesignPatterns.templateMethodDesignPattern.projectGamePlayTemplate.Template;

public abstract class GamePlayTemplate {
    //Template Method:
    public final void play() {
        loadGameAssets();
        initialize();
        startPlay();
        if (isPlayerWantsNewCharacter()) { 
        	addNewCharacterToTheGame(); 
        	System.out.println("\tPlaying the Game.");
        	endPlay();
        }
        else { endPlay(); } 
    }

    public void loadGameAssets() { System.out.println("\tLoading Game Assets."); }

	public abstract void initialize();
	
    public abstract void startPlay();
    
    //Hooked on Template Method:
    public abstract boolean isPlayerWantsNewCharacter();
    protected abstract void addNewCharacterToTheGame();
        
    public abstract void endPlay();    
}
