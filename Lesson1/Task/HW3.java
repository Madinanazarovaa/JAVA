package Lesson1.task;
import java.util.Scanner;

//Реализовать простой калькулятор
public class HW3 {
    public static void calculator() {
        double result = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите число: ");
        double number1 = reader.nextDouble();
        System.out.println("Введите оператор: ");
        char operator = reader.next().charAt(0);
        System.out.println("Введите число: ");
        double number2 = reader.nextDouble();

        if (operator == '+'){
            result = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + result);
        }

        
        if (operator == '-'){
            result = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + result);
        }

        
        if (operator == '*'){
            result = number1 * number2;
            System.out.println(number1 + " * " + number2 + " = " + result);
        }

        
        if (operator == '/'){
            result = number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + result);
        }
        
    }


}
