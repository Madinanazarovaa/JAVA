package Lesson3.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа

public class HW2 {
    public static void removeEvenNumbers() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        int listSize = 10;

        for (int i = 0; i < listSize; i++) {
            list.add(random.nextInt(11));
        }
        System.out.println(list);

        for (int i = 0; i < list.size();) {
            if (list.get(i) % 2 == 0){
                list.remove(list.get(i));
            } else {
                i++;
            }
            
        }
        System.out.println(list);
    }  
}
