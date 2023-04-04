package Lesson2.task;

import java.io.FileWriter;
import java.io.IOException;

import javax.management.RuntimeErrorException;

// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, 
// который запишет эту строку в простой текстовый файл, обработайте исключения.

public class Task2 {
    public static void writeInFile() {
        try(FileWriter in = new FileWriter("Test.txt")) {
            in.append(buildString());

        } catch (IOException e) {
            throw new RuntimeErrorException(null);
        }
    }
    public static String buildString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append("TEST");
        }
        return builder.toString(); 

        // return "TEST".repeat(100); короткая запись
    } 
}
