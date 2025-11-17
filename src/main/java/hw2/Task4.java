package hw2;

public class Task4 {
    public static void divide(int a,int b){
        try {
            int result = a / b;
            System.out.println("Результат ділення: " + result);
        } catch (ArithmeticException e){
            System.out.println("На нуль ділити не можна!");
        }
    }
     public static void main(String[] args){
        divide(10,0);// тут буде помилка, але повинен catch зловити
         divide(20,4);
     }
}
