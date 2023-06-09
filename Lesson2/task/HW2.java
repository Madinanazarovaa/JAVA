package Lesson2.task;

// Дана строка json:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class HW2 {
    public static void printString() {
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        
        json = json.replaceAll("\"}", "");
        json = json.replaceAll(",", "");
        json = json.replaceAll(":", "");
        json = json.replaceAll("\"\""," ");
        json = json.replaceAll("]"," ");
        
        String[] str = json.split(" ");
        
        StringBuilder result = new StringBuilder();
        
        String[] a = {"Студент ", ""," получил ", "", " по предмету ", "", "\nСтудент ", "", " получил ", "", " по предмету ", "", "\nСтудент ", "", " получил ", "", " по предмету "};
        
        for(int i = 0; i < str.length; i++){
            if (i % 2 == 0){
                result.append(a[i]);
            }
            if (i % 2 != 0){
                result.append(str[i]);
            }
            }
            System.out.println(result);
        }
        
}
