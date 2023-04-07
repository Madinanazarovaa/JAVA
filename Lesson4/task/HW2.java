package Lesson4.task;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// • enqueue() — помещает элемент в конец очереди,
// • dequeue() — возвращает первый элемент из очереди и удаляет его,
// • first() — возвращает первый элемент из очереди, не удаляя.

public class HW2 {

    private static LinkedList<Integer> list = new LinkedList<>();
    private static Scanner scaner = new Scanner(System.in);
    private static Random random = new Random();

    public static void fillList() {
        int size = 6;
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(11));
        }
        System.out.println(list);
    }

    public static void enqueue(){
        System.out.println("Input: ");
        list.addLast(scaner.nextInt());
        System.out.println("enqueue: " + list);
    }

    public static void dequeue() {
        list.removeFirst();
        System.out.println("dequeue: " + list);     
    }

    public static void first() {
        list.getFirst();
        System.out.println("first: " + list);
        
    }
}
