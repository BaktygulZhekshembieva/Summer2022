package home_works_platform;

import java.util.Scanner;

public class HW_26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the 5 numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();

        System.out.println("The sum of 5 no is: " + (num1 + num2 + num3 + num4 + num5));
        System.out.println("The Average is: " + (double)(num1 + num2 + num3 + num4 + num5) / 5);

    }
}
