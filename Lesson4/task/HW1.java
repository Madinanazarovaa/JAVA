package Lesson4.task;

import java.util.Collections;
import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.

public class HW1 {
    private static LinkedList<Integer> list = new LinkedList<>();
    public static void fillList() {
        list.add(1);  
        list.add(2);  
        list.add(3);  
        list.add(4); 
        list.add(4);
        System.out.println(list);
    }

    public static void flipTheList() {
        Collections.reverse(list);
        System.out.println(list);
    }
}
