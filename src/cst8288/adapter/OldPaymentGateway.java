package cst8288.adapter;

//Existing Payment Gateway Implementation - Adaptee (Client cannot make changes to this legacy code)

public class OldPaymentGateway {


	public void makePayment(double amount) {
		
		System.out.println("Payment made with OldPaymentGateway: " + amount);
	}

	
	public boolean checkPaymentStatus(String transactionId) {
		
		System.out.println("Checking payment status with OldPaymentGateway: " + transactionId);
		return true;
	}
}
