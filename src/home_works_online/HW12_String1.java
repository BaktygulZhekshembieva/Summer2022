package home_works_online;

import java.util.Scanner;

public class HW12_String1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = scan.nextLine();
        String name1 = name.toLowerCase();


        if (name.equals(name1)){
            System.out.println("Ваше имя " + "\"" + name.substring(0,1).toUpperCase() + name.substring(1) + "\"");
        } else {
            System.out.println("Ваше имя " + "\"" + name +"\"");
        }
    }
}
