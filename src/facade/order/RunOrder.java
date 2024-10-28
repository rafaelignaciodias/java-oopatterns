package facade.order;

public class RunOrder {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("Laptop", 1200.00);
    }
}
