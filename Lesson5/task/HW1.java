package Lesson5.task;

import java.util.HashMap;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

public class HW1 {

    private static HashMap<Integer, String> numbersAndNames = new HashMap<>();

    public static void phoneBook() {
        numbersAndNames.put(41212, "Гарри Поттер");
        numbersAndNames.put(22279, "Гермиона Грейнджер");
        numbersAndNames.put(46298, "Рон Уизли");
        numbersAndNames.put(47895, "Драко Малфой");
        numbersAndNames.put(47689, "Гарри Поттер");
        numbersAndNames.put(26745, "Волан-де-Морт");
        numbersAndNames.put(25694, "Северус Снегг");
        numbersAndNames.put(23367, "Альбус Дамблдор");
        numbersAndNames.put(46699, "Полумна Лавгуд");
        numbersAndNames.put(49696, "Рубеус Хагрид");

        System.out.println(numbersAndNames);
        
    }
    
}
