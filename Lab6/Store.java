import java.util.*;

public class Store {
    private CashRegister cashRegister;
    private LinkedList<Product> products = new LinkedList<Product>();

    public Store() {
        cashRegister = new CashRegister();
        products.add(new Product("Whiteboard Marker", 85, 1.50));
        products.add(new Product("Whiteboard Eraser", 45, 5.00));
        products.add(new Product("Black Pen", 100, 1.50));
        products.add(new Product("Red Pen", 100, 1.50));
        products.add(new Product("Blue Pen", 100, 1.50));
    }

    private char readChoice() {
        return In.nextChar();
    }

    private void sell() {
        // Implementation of sell method
    }

    private void restock() {
        // Implementation of restock method
    }

    private void viewStock() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private void viewCash() {
        System.out.println(cashRegister);
    }

    private void pruneProducts() {
        products.removeIf(Product::isEmpty);
    }

    private String readName() {
        return In.nextLine();
    }

    private double readPrice() {
        return In.nextDouble();
    }

    private int readNumber() {
        return In.nextInt();
    }

    private void help() {
        System.out.println("Menu options");
        System.out.println("s = sell");
        System.out.println("r = restock");
        System.out.println("v = view stock");
        System.out.println("c = view cash");
        System.out.println("p = prune products");
        System.out.println("x = exit");
    }

    public static void main(String[] args) {
        // Main implementation
    }
}
