package hw8;

public class Product {
    private final String name;
    private final double price;
    private final boolean available;

    public Product(String name, double price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void printProductInfo() {
        System.out.println("Назва:" + name + ", Ціна:" + ", Наявність:" + available);
    }
}
