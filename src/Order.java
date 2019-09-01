import java.util.ArrayList; 

public class Order {
	private ArrayList<Product> products = new ArrayList<Product>(50); 
	private ArrayList<Integer> amounts = new ArrayList<Integer>(50); 

	//Parallel array for product amounts
	public void addProduct(Product p, int i) {
		products.add(p); 
		amounts.add(i); 
		p.setOrders(1);
	}

	//Show order details
	public void print() {
		int c = 0; 

		for(Product p : products) {
			System.out.println("Order details: \n");
			p.print(); //calls print method of the product
			System.out.print("x" + amounts.get(c));
			System.out.println(" Total: " + p.getPrice()*amounts.get(c));
			c++; 
		}
	}
}
