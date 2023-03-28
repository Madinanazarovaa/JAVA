package Lesson1.Task;

//Вычислить n-ое треугольного число(сумма чисел от 1 до n)

public class HW1 {
    public static void calculateTriangularNumber() {
        int n = 8;
        if (n > 0){
            int triangularNumber = (n * (n + 1) / 2);
            System.out.println(triangularNumber);
        } else{
            System.out.println("n == 0");
        }
    }
    
}
