package home_works_platform;

import java.util.Scanner;

public class HW_15_SumInt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer of two numbers");
        int integer = scan.nextInt();

        int sum = (integer / 10) + (integer % 10);
        System.out.println(sum);
    }
}
