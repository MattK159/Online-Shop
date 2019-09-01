import java.util.Scanner; 
import java.util.ArrayList; 

public class myMain {
	static Scanner sc = new Scanner(System.in); 
	static ArrayList<Customer> customers = new ArrayList<Customer>(50); 

	public static void print(String s) {
		System.out.println(s);
	}

	public static void main (String[]args) {
		//Creating phone/tv objects
		Phone p1 = new Phone("Phone", "2018", 445.50, "Samsung", "S8", "5gb");
		Phone p2 = new Phone("Phone", "2017", 200.50, "HTC", "A5", "2gb"); 
		Phone p3 = new Phone("Phone", "2018", 699.00, "Apple", "Iphone", "5gb"); 
		TV tv1 = new TV("TV", "2016", 250.00, "LG", "LCD", true, 32);
		TV tv2 = new TV("TV", "2017", 350.99, "LG", "LCD", false, 27); 
		TV tv3 = new TV("TV", "2016", 1500.00, "Samsung", "OLED", true, 52); 

		//Create product database object
		ProductDB plist = new ProductDB(); 

		//Populating database
		plist.addProduct(p1);
		plist.addProduct(p2);
		plist.addProduct(p3);
		plist.addProduct(tv1);
		plist.addProduct(tv2);
		plist.addProduct(tv3);

		/* Testing productdb functions
		plist.findProudct(tv2.getPID());
		plist.displayAll();
		 */ 

		//Orders
		Order o1 = new Order();
		Order o2 = new Order(); 
		Order o3 = new Order(); 
		o1.addProduct(tv1, 2);
		o2.addProduct(p1, 3); 
		o3.addProduct(p3, 1);
		o3.addProduct(tv3, 1);


		//Creating customer objects
		Customer Joe = new Customer("Joe Murphy", "Cork");
		Customer mary = new Customer("Mary Murphy", "Dublin"); 
		customers.add(Joe);
		customers.add(mary); 


		//Adding orders
		Joe.addOrder(o1);
		Joe.addOrder(o2);

		mary.addOrder(o3);

		/* Testing customer functions
		Joe.showCart();
		mary.showCart(); 
		 */ 

		plist.displayAll();
		//Menu
		boolean running = true; 
		print("_________________WELCOME_________________"); 
		while(running == true) {
			int option; 
			Customer newcust = new Customer(); 
			print("Choose an option below"); 
			print("1. Create a Phone");
			print("2. Create a Customer");
			print("3. Search Products by ID"); 
			print("4. Display all Products");
			print("5. Order a Product"); 
			print("6. Show Cart for Customer");
			print("7. Show Orders for Product"); 
			print("8. Exit"); 
			print("Choose an option 1-8"); 
			try {
				option = sc.nextInt(); 
				if(option >= 1 && option <= 8) {

					switch(option) {
					//Create phone
					case 1: 
						print("Create Phone");
						print("Enter Description");
						String desc = sc.next(); 
						print("Enter Price"); 
						Double price = sc.nextDouble();
						print("Enter Make"); 
						String mk = sc.next();
						print("Enter Model"); 
						String model = sc.next();
						print("Enter Storage Cap");
						String storage = sc.next(); 

						print("Creating Phone"); 
						Phone newphone = new Phone("Phone", desc, price, mk, model, storage); 
						plist.addProduct(newphone);
						break;
						//Create Customer
					case 2:
						/*
						print("Create Customer"); 
						print("Enter Full Name");
						String name = sc.next();
	
						print("Enter address");
						String add = sc.next(); 
	
						print("Creating customer");
						newcust = new Customer(name, add); 
						customers.add(newcust); 

						 *Generates error with scanner when displaying menu after customer created
						at myMain.main(myMain.java:81)
						 */ 
						break;

						//Search by ID
					case 3: 
						print("Search by ID");
						print("Enter Product ID(scroll up)"); 
						int id = sc.nextInt(); 
						try {
							plist.findProudct(id);
						}
						catch(Exception e) {
							print("Error: ID not found"); 
						}
						break;
						//Display all
					case 4: 
						plist.displayAll();
						break;

						//Order product
					case 5: 
						print("Order product");
						int i = 1; 
						print("Choose a customer");
						for(Customer c : customers) {
							print(i + ": "  + c.getDetails());
							i++; 
						}
						int choice = sc.nextInt();
						Customer cust = customers.get(choice - 1); 

						print("Choose product");
						plist.displayAll();
						print("Enter product ID");
						id = sc.nextInt();
						print("Enter Amount");
						int amount = sc.nextInt(); 
						Order no = new Order(); 
						no.addProduct(plist.findProudct(id), amount);
						cust.addOrder(no); 
						break;

						//Show Cart
					case 6: 
						i = 1; 
						print("Choose a customer");
						for(Customer c : customers) {
							print(i + ": "  + c.getDetails());
							i++; 
						}
						choice = sc.nextInt();
						customers.get(choice - 1).showCart(); 
						break;

						//SHow orders
					case 7: 
						print("Enter Product ID");
						id = sc.nextInt();
						try {
							plist.findProudct(id).getOrders();
						}
						catch(Exception e) {
							print("Error: ID not found"); 
						}
						break;
						//Exit
					case 8: 
						print("Goodbye");
						running = false; 
						break;
					}
				}
				else {
					print("Invalid input"); 
				}
			}
			catch(Exception e) {
				print("Invalid input"); 
			}
			finally {
				sc.nextLine();
			}
		}

	}
}
