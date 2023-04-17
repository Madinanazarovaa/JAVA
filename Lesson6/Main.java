package Lesson6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import Lesson6.hw.Brand;
import Lesson6.hw.Color;
import Lesson6.hw.Laptop;
import Lesson6.hw.View;
import Lesson6.task.Cat;
import Lesson6.task.Owner;

public class Main {
    public static void main(String[] args) {
    //     Owner owner = new Owner("Вася", "+43256");
    //     Cat cat = new Cat("Барсик", 1, false, "Простуда", owner);
    //     Cat cat2 = new Cat("Барсик", 1, false, "Простуда", owner);
    //     Cat cat3 = new Cat("Барсик", 1, false, "Простуда", owner);
    //     System.out.println(cat);
    //     Set<Cat> cats = new HashSet<>();
    //     cats.add(cat);
    //     cats.add(cat2);
    //     cats.add(cat3);
    //     System.out.println(cats);
    // 

    Laptop laptop1 = new Laptop(Brand.ACER, Color.BLACK);
    Laptop laptop2 = new Laptop(Brand.MAC, Color.GRAY);
    Laptop laptop3 = new Laptop(Brand.SONY, Color.WHITE);
    Laptop laptop4 = new Laptop(Brand.ACER, Color.BLACK);
    // System.out.println(laptop);

    Set<Laptop> laptops = new HashSet<>();
    laptops.add(laptop1);
    laptops.add(laptop2);
    laptops.add(laptop3);
    laptops.add(laptop4);
    // System.out.println(laptops);

    Map<Integer, Laptop> laptopList = new HashMap<>();
    laptopList.put(1, laptop1);
    laptopList.put(2, laptop2);
    laptopList.put(3, laptop3);
    laptopList.put(4, laptop4);
    // System.out.println(laptops);

    Set<Map.Entry<Integer, Laptop>> entries = laptopList.entrySet();
    View.run(entries);
    }
}