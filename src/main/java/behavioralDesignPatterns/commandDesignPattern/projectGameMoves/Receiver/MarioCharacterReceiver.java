package behavioralDesignPatterns.commandDesignPattern.projectGameMoves.Receiver;

public class MarioCharacterReceiver {

	private String name;

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void moveUp() { System.out.println("\t" + getName() + " moving up!"); }
    public void moveLeft() { System.out.println("\t" + getName() + " moving Left!"); }
    public void moveRight() { System.out.println("\t" + getName() + " moving Right!"); }
    public void moveDown() { System.out.println("\t" + getName() + " moving Down!"); }
}
