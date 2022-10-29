package home_works_platform;

import java.util.Scanner;

public class HW_28_Loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number (Table to be calculated): ");
        int num1 = sc.nextInt();
        System.out.print("Input number of terms: ");
        int num2 = sc.nextInt();

        for (int i = 0; i <= num2; i++) {
            System.out.println(num1 + " * " + i + " = " + i * num1);
        }
    }
}
