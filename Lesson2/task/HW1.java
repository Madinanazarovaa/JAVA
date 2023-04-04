package Lesson2.task;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.management.RuntimeErrorException;

//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

public class HW1 {
    private static final Logger LOG = Log.log(HW1.class.getName());

    public static int[] bubbleSort() {
        int[] array = {2, 5, 7, 6, 9, 0, 10};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] > array[j]){
                    int b = array[i];
                    array[i] = array[j];
                    array[j] = b;
                }
            }
            System.out.print(array[i] + " ");
            LOG.log(Level.INFO, Arrays.toString(array));
            
        }
        return array;
    }
}
