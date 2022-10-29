package home_works_online;

import java.util.Scanner;

public class HW15_1 {
    public static void main(String[] args) {

        System.out.println(strin());
    }

    public static String strin (){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = str1.trim();
        return str2;
    }
}
