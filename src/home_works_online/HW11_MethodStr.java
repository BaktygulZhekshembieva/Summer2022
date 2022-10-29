package home_works_online;

import java.util.Scanner;

public class HW11_MethodStr {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Вветиде слово");
        String str1 = scan.nextLine();
        System.out.println("Введите 2 цифры в диапазоне длины прежде введённого слово");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        String str2 = str1.substring(num1,num2);
        System.out.println(str2);

        String str3 = str2.concat(" люблю Java");
        System.out.println(str3);

        int str4 = str3.length();
        System.out.println(str4);
    }
}
