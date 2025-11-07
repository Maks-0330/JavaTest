package hw7;

public class Main {
    public static void main(String[] args){
         // створюю товари
        Product phone = new Product("Телефон", 15000, true);
        Product laptop = new Product("Ноутбук", 32000, false);


        phone.printProductInfo();
        laptop.printProductInfo();

        //Товар зі знижкою
        DiscountedProduct table = new DiscountedProduct("Планшет", 20000, true,10);
        table.printProductInfo();

        //користовачі
         User admin = new Admin("Стас");
         User customer = new Customer("Оксана");

         checkUser(admin);
         checkUser(customer);
    }

    public static void checkUser(User user){
        System.out.println(user.name + " - роль: " + user.getRole());

        if (user instanceof Admin) {
            System.out.println("Допуск дозволено до адміністрування.");
        }else if (user instanceof Customer){
            System.out.println("Допуск лише до перегляду товарів. ");
        }
        System.out.println("----------------------------------");
    }
}
