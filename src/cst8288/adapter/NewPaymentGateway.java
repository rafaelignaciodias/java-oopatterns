package cst8288.adapter;

//New Payment Gateway Class 

public class NewPaymentGateway implements PaymentGateway{
	
	
	public void makePayment(double amount) {
		// Implementation for initiating payment
		System.out.println("Payment initiated with NewPaymentGateway: " + amount);
	}

	public boolean checkPaymentStatus(String transactionId) {
		// Implementation for verifying payment
		System.out.println("Verifying payment with NewPaymentGateway: " + transactionId);
		return true;
	}

	
}

