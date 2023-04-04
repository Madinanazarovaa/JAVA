package Lesson1.task;

// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

public class Task2 {
    public static int run(int[] array) {
        int count = 0;
        int maxCount = 0;
        for (int item : array) {
            if (item == 1) {
                count++;
            } else {
                if (maxCount < count) {
                    maxCount = count;
                }
                count = 0;
            }
        }
        if (count > maxCount){
            maxCount = count;
        }
        return maxCount;
    }

}