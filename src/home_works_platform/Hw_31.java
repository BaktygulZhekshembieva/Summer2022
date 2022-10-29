package home_works_platform;

import java.util.Scanner;

public class Hw_31 {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int first = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Input the second number: ");
        int second = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Input the third number: ");
        int third = scanner3.nextInt();

        boolean b = (first + second) == third;

        System.out.println("The result is: " + b);
    }
}
