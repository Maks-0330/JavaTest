package hw7;

public class DiscountedProduct extends Product {
    private double dicount;

    public DiscountedProduct(String name, double price, boolean availabe, double dicount) {
        super(name, price, availabe);
        this.dicount = dicount;
    }

    public double getDicount() {
        return dicount;
    }

    public void setDicount(double dicount) {
        this.dicount = dicount;
    }

    // метод ціну зі знижкою
    public double getPriceWitcDiscount() {
        return getPrice() - (getPrice() * dicount / 100);
    }

    // перевизначення методу
    @Override
    public void printProductInfo() {
        super.printProductInfo();
        System.out.println("Знижка: " + dicount + "%");
        System.out.println("Ціна зі знижкою: " + getPriceWitcDiscount());
        System.out.println("----------------------------------");
    }
}
