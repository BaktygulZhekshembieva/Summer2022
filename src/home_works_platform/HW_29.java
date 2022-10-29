package home_works_platform;

import java.util.Scanner;

public class HW_29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of terms is: ");
        int num = sc.nextInt();

        int i;
        int sum = 0;
        for (i = 1; i <= num * 2; i += 2) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("The Sum of odd Natural Number up to 5 terms is: " + sum);
    }
}
