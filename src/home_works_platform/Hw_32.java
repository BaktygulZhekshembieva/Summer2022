package home_works_platform;

import java.util.Scanner;

public class Hw_32 {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int first = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Input second integer: ");
        int second = scanner2.nextInt();

        System.out.println(first + " < " + second);

    }
}
