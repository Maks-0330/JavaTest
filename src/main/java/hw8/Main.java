package hw8;

import java.util.*;

public class Main {
    static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Годинник", 4500, true));
        products.add(new Product("Книга", 350, true));
        products.add(new Product("Кросівки", 3200, false));

        System.out.println("Список продуктів");
        for (Product p : products) {
            p.printProductInfo();
        }
        System.out.println("\n-----------------------");

        Set<String> categories = new HashSet<>();
        categories.add("Аксесуари");
        categories.add("Література");
        categories.add("Взуття");

        String checkCategory = "Література";
        if (categories.contains(checkCategory)) {
            System.out.println("Категорія \" " + checkCategory + "\" є в наборі");
        } else {
            System.out.println("Категорія \"" + checkCategory + "\" немає в наборі ");
        }
        System.out.println("\n--------------------");

        Map<String, Double> productPrices = new HashMap<>();
        for (Product p : products) {
            productPrices.put(p.getName(), p.getPrice());
        }
        System.out.println("Словник продуктів і цін:");
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            System.out.println("Продукт: " + entry.getKey() + ", Ціна: " + entry.getValue());
        }
    }
}
