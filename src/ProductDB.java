import java.util.ArrayList; 

public class ProductDB {
	private ArrayList<Product> pList = new ArrayList<Product>(50); 
	
	public void addProduct(Product p) {
		pList.add(p); 
		System.out.println("Product: " + p.getPID() + " has been added");
	}
	public void removeProduct(int id) {
		for(Product p : pList) {
			if(p.getPID() == id) {
				pList.remove(p); 
			}
		}
	}
	public Product findProudct(int id) {
		Product res = null; 
		for(Product p : pList) {
			if(p.getPID() == id) {
				p.print();
				res = p; 
				break; 
			}
			else {
				System.out.println("Searching...");
			}
		}
		return res; 
	}
	
	public void displayAll() {
		int c = 0; 
		for(Product p : pList) {
			System.out.println("Entry: " + c);
			p.print();
			c++; 
		}
	}
}
