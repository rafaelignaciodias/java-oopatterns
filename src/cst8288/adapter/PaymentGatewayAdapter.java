package cst8288.adapter;

//Adapter to make use of OldPaymentGateway  - Adapter

public class PaymentGatewayAdapter implements PaymentGateway {

	private OldPaymentGateway oldPaymentGateway;

	public PaymentGatewayAdapter(OldPaymentGateway oldPaymentGateway) {
		this.oldPaymentGateway = oldPaymentGateway;
	}

	@Override
	public void makePayment(double amount) {
		oldPaymentGateway.makePayment(amount);
	}

	@Override
	public boolean checkPaymentStatus(String transactionId) {
		return oldPaymentGateway.checkPaymentStatus(transactionId);
	}
}

