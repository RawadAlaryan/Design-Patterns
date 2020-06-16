package structuralDesignPatterns.facadeDesignPattern.projectComputerSystem.Main;

import structuralDesignPatterns.facadeDesignPattern.projectComputerSystem.Facade.ComputerFacade;
import structuralDesignPatterns.facadeDesignPattern.projectComputerSystem.Subsystem.CPU;
import structuralDesignPatterns.facadeDesignPattern.projectComputerSystem.Subsystem.HardDrive;
import structuralDesignPatterns.facadeDesignPattern.projectComputerSystem.Subsystem.Memory;

//Facade Design Pattern Computer System.
//Using a Computer Facade to execute a Computer System with Subsystems (CPU, Memory, HardDrive) to perform computations.
public class Main {
    public static void main(String[] args) {
        System.out.println("Facade Design Pattern Computer System");
        System.out.println("Using a Computer Facade to execute a Computer System with Subsystems (CPU, Memory, HardDrive) to perform computations:\n");
        
    	CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();
        
        System.out.println("Creating a Computer System using Facade:");
        ComputerFacade computerFacade = new ComputerFacade(cpu, memory, hardDrive);
        System.out.println("Starting the Computer System and Performing Computations:");
        computerFacade.startComputerSystem();
    }
}
