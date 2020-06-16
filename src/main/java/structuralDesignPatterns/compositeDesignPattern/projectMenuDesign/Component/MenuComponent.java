package structuralDesignPatterns.compositeDesignPattern.projectMenuDesign.Component;

public abstract class MenuComponent {
    private String name;
    private String url;

    //Constructor:   
    public MenuComponent(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}
    
	//Getters and Setters:
    public String getName() { return name; }
  	public void setName(String name) { this.name = name; }
  	public String getUrl() { return url; }
  	public void setUrl(String url) { this.url = url; }    
    
    public void add(MenuComponent component) { throw new UnsupportedOperationException(); }
  
	public abstract void displayMenu();  
}
