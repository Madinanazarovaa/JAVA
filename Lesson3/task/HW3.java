package Lesson3.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.

public class HW3 {
    public static void findValues() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        int listSize = 5;

        for (int i = 0; i < listSize; i++) {
            list.add(random.nextInt(11));
        }
        double sum = 0;
        double arithmeticalMean = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size()){
                sum =  sum + list.get(i);
            }
            arithmeticalMean = sum / listSize;
        }
        
        System.out.println(list);
        System.out.println("Минимальное значение: " + Collections.min(list));
        System.out.println("Максимальное значение: " + Collections.max(list));
        System.out.println("Среднее арифметическое: " + arithmeticalMean);

        
    }
    
}
