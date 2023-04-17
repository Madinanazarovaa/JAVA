package Lesson6.hw;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class View {

    public static Scanner scanner = new Scanner(System.in);
    public static Set<Laptop> result = new HashSet<>();

    public static void run(Set<Map.Entry<Integer, Laptop>> entries) {
        while(true){
            System.out.println("1 - brand, 2 - color");
            String str = scanner.nextLine();
            switch(str){
                case "1":
                System.out.println("enter brand: ");
                String strBrand = scanner.nextLine();
                if(strBrand.isEmpty()){
                    System.out.println("brand cannot be empty");
                    break;
                }
                result.clear();
                for (Map.Entry<Integer, Laptop> entry: entries){
                    if (strBrand.equalsIgnoreCase(entry.getValue().getBrand().toString())){
                        result.add(entry.getValue());
                    }
                }
                if(result.isEmpty()){
                    System.out.println("no laptops found for the given brand");
                } else{
                    for(Laptop laptop : result){
                        System.out.println(result.toString());
                    }
                }
                break;

                case "2":
                System.out.println("enter color: ");
                String strColor = scanner.nextLine();
                if(strColor.isEmpty()){
                    System.out.println("color cannot be empty");
                    break;
                }
                result.clear();
                for (Map.Entry<Integer, Laptop> entry: entries){
                    if (strColor.equalsIgnoreCase(entry.getValue().getColor().toString())){
                        result.add(entry.getValue());
                    }
                }
                if(result.isEmpty()){
                    System.out.println("no laptops found for the given color");
                } else{
                    for(Laptop laptop : result){
                        System.out.println(result.toString());
                    }
                }
                break;
            }
        }
    }
} 

    