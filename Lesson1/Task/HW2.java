package Lesson1.task;

//Вывести все простые числа от 1 до 1000

public class HW2 {
    public static void outputOfPrimeNumbers() {
        int number = 2;
        int maxNumber = 1000;
        int count = 0;
        for (int i = 1; i <=number && maxNumber >= number; i++) {
            int temp = number % i;
            if(temp == 0){
                count +=1;
                if (number == i && count == 2){
                    System.out.println(number);
                    number += 1;
                    count = 0;
                    i = 0;
                }

                if (number == i && count >= 3){
                    number += 1;
                    count = 0;
                    i = 0;
                }

            }
        }
    }
        
}
