package home_works_platform;

import java.util.Scanner;

public class HW_27_Loop {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("Number is: " + i + " and cube of " + i + " is: " + i * i * i);
        }

    }
}
