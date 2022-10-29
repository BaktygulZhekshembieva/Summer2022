package home_works_platform;

import java.util.Scanner;

public class HW_22_TwoIntegers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int n1 = scan.nextInt();
        System.out.println("Введите второе число");
        int n2 = scan.nextInt();

        int sum = n1 + n2;
        int dif = n1 - n2;
        int prod = n1 * n2;
        int aver = (n1 + n2) / 2;
        int dis = Math.abs(n1-n2);
        int max = Math.max(n1, n2);
        int min = Math.min(n1, n2);

        System.out.println("Sum of two integers: " + sum);
        System.out.println("Difference of two integers: " + dif);
        System.out.println("Product of two integers: " + prod);
        System.out.println("Average of two integers: " + aver);
        System.out.println("Distance of two integers: " + dis);
        System.out.println("Max integer: " + max);
        System.out.println("Min integer: " + min);
    }
}
