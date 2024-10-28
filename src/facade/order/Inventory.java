package facade.order;

class Inventory {
    public boolean checkStock(String item) {
        System.out.println("Checking stock for " + item);
        return true; // Assume stock is available
    }
}
