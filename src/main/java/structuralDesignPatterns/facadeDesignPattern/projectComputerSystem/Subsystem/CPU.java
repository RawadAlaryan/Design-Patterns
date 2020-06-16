package structuralDesignPatterns.facadeDesignPattern.projectComputerSystem.Subsystem;

public class CPU {
    public void startCPU() { System.out.println("\tCPU is up and running and waiting for instructions."); }
    
    public void jumpToMemoryLocation(long location) { System.out.println("\tCPU is jumping to memory location: " + location); }
    
    public void executeInstruction(String instruction) { System.out.println("\tCPU is executing the instruction: " + instruction); }
}
