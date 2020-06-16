package structuralDesignPatterns.facadeDesignPattern.projectComputerSystem.Facade;

import structuralDesignPatterns.facadeDesignPattern.projectComputerSystem.Subsystem.CPU;
import structuralDesignPatterns.facadeDesignPattern.projectComputerSystem.Subsystem.HardDrive;
import structuralDesignPatterns.facadeDesignPattern.projectComputerSystem.Subsystem.Memory;

public class ComputerFacade {
	//Using Composition to access Subsystem Classes.
    private CPU processor;
    private Memory ram;
    private HardDrive harddisk;

    public ComputerFacade(CPU processor, Memory ram, HardDrive harddisk) {
        this.processor = processor;
        this.ram = ram;
        this.harddisk = harddisk;
    }

    public void startComputerSystem() {
    	processor.startCPU();
    	ram.loadDataToLocation(132, harddisk.read(3456, 89));
        processor.jumpToMemoryLocation(132);
        processor.executeInstruction("ADD R1, R2");
    }
}
