package cst8288.adapter;


//Interface required by the client - Target

public interface PaymentGateway {
	
	void makePayment(double amount);
	
	boolean checkPaymentStatus(String transactionId);
}

