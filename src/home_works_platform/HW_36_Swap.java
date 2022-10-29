package home_works_platform;

import java.util.Scanner;

public class HW_36_Swap {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int first = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter second integer: ");
        int second = scanner2.nextInt();

        first = first + second;
        second = first - second;
        first = first - second;

        System.out.println("After the swap, first integer is: " + first + ", "
                            + "second integer is: " + second);

    }
}
