package home_works_platform;

import java.util.Scanner;

public class HW_24_ThreeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Input the 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Input the 3rd number: ");
        int num3 = sc.nextInt();

        System.out.println("The greatest: " + Math.max(Math.max(num1, num2), num3));
    }
}
