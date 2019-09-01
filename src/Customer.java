import java.util.ArrayList; 
public class Customer {
	private String name, address; 
	private ArrayList<Order> orders = new ArrayList<Order>(50); 
	
	//Constructor
	public Customer(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Customer() {
		
	}

	public void addOrder(Order o) {
		orders.add(o); 
	}
	
	public void showCart() {
		System.out.println("Your Cart");
		System.out.println(name + " " + address);
		for(Order o : orders) {
			o.print(); //calls print function of the order class
		}
	}
	
	public String getDetails() {
		return name; 
	}
}
