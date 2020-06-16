package structuralDesignPatterns.adapterDesignPattern.projectInventorySystem.Adaptee;

public class OutsiderItem {
	private String itemName;
    private int costPerUnit;
	
    public OutsiderItem(String itemName, int costPerUnit) {
		super();
		this.itemName = itemName;
		this.costPerUnit = costPerUnit;
	}

	public String getItemName() { return itemName; }

	public void setItemName(String itemName) { this.itemName = itemName; }

	public int getCostPerUnit() { return costPerUnit; }

	public void setCostPerUnit(int costPerUnit) { this.costPerUnit = costPerUnit; }
}
