package practice;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        System.out.println(str());

        Palindrom obj = new Palindrom();
        System.out.println(obj.bool());
    }

    static String str(){
        System.out.println("Enter word");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        String str1 = sb.reverse().toString();
        if (str.equals(str1)){
            return "Вы ввели палиндром";
        }return "Это не палиндром";
    }

    Boolean bool(){
        System.out.println("Enter word");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        String str1 = sb.reverse().toString();
        if (str.equals(str1)){
            return true;
        }return false;
    }
}
