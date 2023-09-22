import java.text.*;

public class Product {
    private String name;
    private int stock;
    private double price;

    public Product(String name, int stock, double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public boolean isEmpty() {
        return this.stock == 0;
    }

    public boolean has(int n) {
        return this.stock >= n;
    }

    public double sell(int n) {
        if (has(n)) {
            this.stock -= n;
            return n * this.price;
        } else {
            return 0.0;
        }
    }

    public void restock(int n) {
        this.stock += n;
    }

    @Override
    public String toString() {
        return name + " - " + stock + " at $" + formatted(price); 
    }

    private String formatted(double money) {
        return new DecimalFormat("###,##0.00").format(money);
    }
}

