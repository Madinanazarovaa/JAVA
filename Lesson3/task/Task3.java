package Lesson3.task;

import java.lang.reflect.Array;
import java.util.ArrayList;

// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

public class Task3 {
    public static void delIntFromList() {
        ArrayList ourArray= new ArrayList<String>();
        ourArray.add("Ура!");
        ourArray.add(1);
        ourArray.add("Привет");
        ourArray.add(158);

        for (int i = 0; i < ourArray.size(); i++) {
            if(ourArray.get(i) instanceof Integer) {
                ourArray.remove(i);
            i--;
        }
        }
        System.out.println(ourArray);
    }
}
