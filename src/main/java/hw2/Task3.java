package hw2;
import java.util.ArrayList;
public class Task3 {
    public static void main(String[] args){
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Київ");
        cities.add("Харків");
        cities.add("Полтава");

        cities.add("Дніпро"); //додав нове місто

        System.out.println("Список міст: " + cities);
    }
}
