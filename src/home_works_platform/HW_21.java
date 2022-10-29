package home_works_platform;

import java.util.Scanner;

public class HW_21 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int n1 = scan.nextInt();
        System.out.println("Введите второе число");
        int n2 = scan.nextInt();

        if (n1 > n2){
            System.out.println(n1);
        }else {
            System.out.println(n2);
        }
    }
}
