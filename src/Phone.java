
public class Phone extends Product {
	private String make, model, storage;
	
	
	public Phone(String name, String desc, double price, String mk, String model, String storage) {
		super(name, desc, price);
		this.make = mk;
		this.model = model;
		this.storage = storage; 
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	} 
	//Overridden print function
	public void print() {
		System.out.println("Product ID: " + PID);
		System.out.println("Type: " + name);
		System.out.println("Make" + "\t" + "Model" + "\t" + "Storage");
		System.out.println(make + "\t " + model + "\t" + storage);
		System.out.print("Price: " + price);
		System.out.println("\n");
	}
	
}
