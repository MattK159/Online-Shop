import java.util.Random; 

public abstract class Product {
	//Variables 
	String name, desc;
	Double price; 
	int PID, orders;
	
	
	Random rand = new Random(); 
	
	public Product(String name, String desc, Double price) {
		super();
		this.name = name;
		this.desc = desc;
		this.price = price;
		PID = rand.nextInt(9999)+100; 
	}
	
	//Getters/Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getPID() {
		return PID;
	}
	public void setPID(int pID) {
		PID = pID;
	}
	public void setOrders(int i) {
		orders += 1; 
	}
	public void getOrders() {
		System.out.println("Number of orders: " + orders);
	}
	
	//print method
	public abstract void print();
	
}
