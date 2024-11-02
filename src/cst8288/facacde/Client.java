package cst8288.facacde;

public class Client {

	public static void main(String[] args) {
		
		Order order = new Order("101", 99.99);
		
		Facade  facade = new Facade();
		boolean sent = facade.sentOrderEmail(order);
		
		
		System.out.println("Order Email Sent: " + sent);
		
	}

	
	
}
