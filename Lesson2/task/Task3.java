package Lesson2.task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.management.RuntimeErrorException;

// Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
// Напишите метод, который запишет массив, возвращенный предыдущим методом в файл. 
// Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.

public class Task3 {
    private static final Logger LOG = Log.log(Task3.class.getName());
    
    public static void write(String path) {
        try(FileWriter in = new FileWriter("Task3.txt")) {
            String[] data = getFileInFolder(path);
            for(String datum : data){
                in.append(datum);
            }
            System.out.println("Recorded");
            //throw new IOException("Error");

        } catch (IOException e) {
            LOG.log(Level.INFO, e.getMessage());
            throw new RuntimeErrorException(null);
        }
    }

    public static String[] getFileInFolder(String path) {
        File dir = new File(path);
        String[] result = new String[0];
        File[] files;
        if (dir.isDirectory()){
            files = dir.listFiles();

            if (files != null){
                result = new String[files.length];
                for (int i = 0; i < files.length; i++) {
                    String name = files[i].getName();

                    if (files[i].isFile()){
                        System.out.println("\tFile - " + name);
                    }

                    else{
                        System.out.println("Directory - " + name);
                    }
                    result[i] = name;
                }
            }
            
        } else{
            System.out.println(dir.getName() + "Не является папкой");
        }
        return result;
    }
}
