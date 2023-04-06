package Lesson3.task;

// Реализовать алгоритм сортировки слиянием

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HW1 { 
    public static List<Integer> fillList() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        int listSize = 8; 

        for (int i = 0; i < listSize; i++) {
            list.add(random.nextInt(11));
        }
        System.out.println(list);
        return list;
    }

    public static List<Integer> mergeSort1(List<Integer> list) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i+=2) {
            if(list.get(i) > list.get(i + 1)){
                list1.add(list.get(i + 1));
                list1.add(list.get(i));
            } else{
                list1.add(list.get(i));
                list1.add(list.get(i + 1));
            }      
        }
        System.out.println(list1);
        return list1;  
    }

    public static List<Integer> mergeSort2(List<Integer> list1) {
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list1.size() / 2; i++) {
            if (i <= list1.size()){
                list2.add(list1.get(i));
            }
        }

        for (int i = 0; i < list2.size(); i++) {
            for (int j = i + 1; j < list2.size() - 1; j++) {
                if (list2.get(i) > list2.get(j)){
                    int b = list2.get(i);
                    list2.set(i, list2.get(j));
                    list2.set(j, b);
                }
            }
        }

        System.out.println(list2);
        return list2;    
    }
    
    public static List<Integer> mergeSort3(List<Integer> list1) {
        List<Integer> list3 = new ArrayList<>();
        for (int i = list1.size() / 2; i < list1.size(); i++) {
            if (list1.size() % 2 == 0){
                if (i >= list1.size() / 2){
                    list3.add(list1.get(i));
                }
            } else{
                if (i >= list1.size() / 2){
                    list3.add(list1.get(i));
                }
            }
        }

        for (int i = 0; i < list3.size(); i++) {
            for (int j = i + 1; j < list3.size() - 1; j++) {
                if (list3.get(i) > list3.get(j)){
                    int b = list3.get(i);
                    list3.set(i, list3.get(j));
                    list3.set(j, b);
                }
            }
        }

        System.out.println(list3);
        return list3;
    }

    public static void mergeSort4(List<Integer> list2, List<Integer> list3) {
        list2.addAll(list3);
        for (int i = 0; i < list2.size(); i++) {
            for (int j = i + 1; j < list2.size() - 1; j++) {
                if (list2.get(i) > list2.get(j)){
                    int b = list2.get(i);
                    list2.set(i, list2.get(j));
                    list2.set(j, b);
                }
            }
        }
        System.out.println(list2);
    }



}