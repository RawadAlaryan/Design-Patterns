package structuralDesignPatterns.adapterDesignPattern.projectInventorySystem.ConcreteAdapter;

import structuralDesignPatterns.adapterDesignPattern.projectInventorySystem.Adaptee.OutsiderItem;
import structuralDesignPatterns.adapterDesignPattern.projectInventorySystem.InterfaceAdapter.ItemInterface;

//We use Composition for Adapter Design Pattern. 
//We use an Object from OutsiderItem Adaptee inside this Adapter Class.
public class ItemAdapter implements ItemInterface {
     private OutsiderItem outsiderItem;
 
    public ItemAdapter(OutsiderItem outsiderItem) { this.outsiderItem = outsiderItem; }
 
    
    public OutsiderItem getOutsiderItem() { return outsiderItem; }


	@Override
    public String getItemName() { return outsiderItem.getItemName(); }
 
    @Override
    public double getItemPrice() { return outsiderItem.getCostPerUnit(); }
}
