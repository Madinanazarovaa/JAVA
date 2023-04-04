package Lesson2.task;

// Дано четное число N (>0) и символы c1 и c2. 
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

public class Task1 {
    public static String printString(int n, char a, char b) {
        StringBuilder str = new StringBuilder();
        for (int index = 0; index < n / 2; index++) {
            str.append(a);
            str.append(b);
        } 
        return str.toString();
    }
    
}
