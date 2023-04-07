package Lesson5.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

public class HW2 {
    private static List<String> names = new ArrayList<String>();
    private static HashMap<String, Integer> result = new HashMap<>();

    public static void listOfNames() {
        names.add("Иван Иванов");
        names.add("Светлана Петрова");
        names.add("Кристина Белова");
        names.add("Анна Мусина");
        names.add("Иван Юрин");
        names.add("Петр Лыков");
        names.add("Павел Чернов");
        names.add("Петр Чернышов");
        names.add("Павел Чернов");
        names.add("Иван Иванов");
        names.add("Петр Чернышов");
        names.add("Мария Федорова");
        names.add("Марина Светлова");
        names.add("Мария Савина");
        names.add("Иван Иванов");
        names.add("Мария Рыкова");
        names.add("Анна Крутова");
        names.add("Марина Лугова");
        names.add("Анна Владимирова");
        names.add("Петр Лыков");
        names.add("Анна Крутова");
        names.add("Иван Мечников");
        names.add("Петр Лыков");
        names.add("Иван Ежов");
        System.out.println(names);
        System.out.println();
        
    }

    public static void searchForDuplicateNames() {
        Set<String> unique = new HashSet<String>(names);
        for (String key : unique) {
            result.put(key, Collections.frequency(names, key));
        }
        System.out.println(result);
        System.out.println();
    }

    public static void sortedByPopularity() {
        result.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) 
        .forEach(System.out::println);
    }
}
