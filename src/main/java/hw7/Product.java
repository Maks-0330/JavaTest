package hw7;

public class Product {
    private String name;
    private double price;
    private boolean available;

    //конструктор
    public Product(String name, double price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;

    }

    // геттери
    public String getName() {
        return name;
    }

    //сеттери
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // метод вивод інформації
    public void printProductInfo() {
        System.out.println("Назва: " + name);
        System.out.println("Ціна: " + price);
        System.out.println("Наявність: " + (available ? "Є" : "Немає"));
        System.out.println("-----------------------------------");
    }
}

