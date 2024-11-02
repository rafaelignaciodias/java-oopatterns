package cst8288.adapter;


// Client - can only work with PaymenGateway Interface
public class Client {
	

	public static void main(String[] args) {
		
		PaymentGateway newPaymentGateway = new NewPaymentGateway();
		processPayment(newPaymentGateway, 100, "XYC123");
		
		
		PaymentGateway oldPaymentGateway = new PaymentGatewayAdapter(new OldPaymentGateway());
		processPayment(oldPaymentGateway, 200, "YXZ353");
	}
	
	
	private static void processPayment(PaymentGateway paymentGateway, int amount, String confirmationNumber ) {
		
		paymentGateway.makePayment(amount);
		boolean status = paymentGateway.checkPaymentStatus(confirmationNumber);
		System.out.println("Payment status: " + status + "\n\n");
	}
	
	
}
