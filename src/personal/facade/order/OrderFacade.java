package personal.facade.order;

class OrderFacade {
    private Inventory inventory;
    private Payment payment;
    private Shipping shipping;

    public OrderFacade() {
        this.inventory = new Inventory();
        this.payment = new Payment();
        this.shipping = new Shipping();
    }

    public void placeOrder(String item, double amount) {
        if (inventory.checkStock(item)) {
            payment.processPayment(amount);
            shipping.shipOrder(item);
            System.out.println("Order placed successfully for " + item);
        } else {
            System.out.println("Item is out of stock.");
        }
    }
}
