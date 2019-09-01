
public class TV extends Product {
	private String make, type, strTD; 
	private boolean TD;
	private int screen;
	
	//Constructor 
	public TV(String name, String desc, Double price, String mk, String type, boolean TD, int screen) {
		super(name, desc, price);
		this.make = mk;
		this.type = type;
		this.TD = TD; 
		this.screen = screen;
		
		if(TD == true) {
			strTD = "3D Capable"; 
		}
		else {
			strTD = "Not 3D Capable"; 
		}
	}
	
	//Getters/setters
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isTD() {
		return TD;
	}

	public void setTD(boolean tD) {
		TD = tD;
	}

	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	} 
	
	//Overridden print function
	public void print() {
		System.out.println("Product ID: " + PID);
		System.out.println("Type: " + name);
		System.out.println("Make" + "\t" + "Type" + "\t" + "Inch" + "\t" + "3D");
		System.out.println(make + "\t " + type + "\t " + screen + "\t " + strTD);
		System.out.print("Price: " + price);
		System.out.println("\n");
	}
	
	
}
