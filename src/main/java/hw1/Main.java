public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Змінні різних типів
        String name = "Максим";
        int age = 19;
        double height = 1.83;
        boolean isStudent = true;

        // Вивід значень змінних
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
        System.out.println("Зріст: " + height + " m");
        System.out.println("Студент: " + isStudent);

        // Умова if / else
        if (age < 18) {
            System.out.println("Доступ заборонено");
        } else {
            System.out.println("Доступ дозволено");
        }

        // Конструкція switch
        String day = "Monday";
        switch (day) {
            case "Saturday":
            case "Sunday":
                System.out.println("Вихідний день");
                break;
            default:
                System.out.println("Робочий день");
                break;
        }

        // Цикл for
        for (int i = 1; i <= 5; i++) {
            System.out.println("Число: " + i);
        }

        // Пошук елемента
        int[] numbers = {3, 7, 2, 9, 5};
        int target = 3;
        int index = linearSearch(numbers, target);

        if (index != -1) {
            System.out.println("Елемент знайдено на позиції: " + index);
        } else {
            System.out.println("Елемент не знайдено");
        }
    }

    // Пошук елемента в масиві
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
