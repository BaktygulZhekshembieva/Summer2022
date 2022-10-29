package home_works_platform;

import java.util.Scanner;

public class HW_20_IfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scan.nextInt();

        if (num >= 0){
            System.out.println("Это положительное число ");
        }else {
            System.out.println("Это отрицательное число");
        }
    }
}
